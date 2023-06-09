package Controlador;

import Modelo.DetalleCompra;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetalleCompraData {

    private ProductoData productoData;
    private CompraData compraData;
    private Connection con = null;
    private String msjeError = "Error al acceder a la tabla";

    public DetalleCompraData() {

        con = Conexion.getConexion();
        compraData = new CompraData();
        productoData = new ProductoData();
    }

    public void guardarDetalleCompra(DetalleCompra detalleCompra) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into detallecompra (cantidad,precioCosto,idCompra,idProducto) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getCompra().getIdCompra());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en guardar CompraData, " + ex.getMessage());
        }
    }

    public DetalleCompra buscarDetalleCompra(int idDetalle) {
        CompraData compraData = new CompraData();
        ProductoData productoData = new ProductoData();
        DetalleCompra detalleCompra = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM detallecompra WHERE idDetalle=?;");
            ps.setInt(1, idDetalle);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setCompra(compraData.buscarCompra(rs.getInt("idCompra")));
                detalleCompra.setProducto(productoData.buscarProductoId(rs.getInt("idProducto")));
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en buscar el detalle de Compras, " + ex.getMessage());
        }
        return detalleCompra;
    }

    public void modificarDetalleCompra(DetalleCompra detalleCompra) {

        String sql = "UPDATE detallecompra SET cantidad=?,precioCosto=?,idCompra=?,idProducto=? WHERE idDetalle=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getCompra().getIdCompra());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.setInt(5, detalleCompra.getIdDetalle());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El detalle de Compra no existe.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + "detalle de compra" + ex.getMessage());
        }
    }

    public List<DetalleCompra> listaDetalleCompras(int idCompra) {
        ArrayList<DetalleCompra> listaDetalleCompras = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from detallecompra WHERE idCompra=?");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setCompra(compraData.buscarCompra(idCompra));
                detalleCompra.setProducto(productoData.buscarProductoId(rs.getInt("idProducto")));
                listaDetalleCompras.add(detalleCompra);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar el detalle de Compras, " + ex.getMessage());
        }
        return listaDetalleCompras;
    }

}
