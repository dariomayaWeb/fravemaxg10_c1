
package Controlador;

import Modelo.DetalleVenta;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DetalleVentaData {
    
    private ProductoData productoData;
    private VentaData ventaData;
    private Connection con = null;
    private String msjeError = "Error al acceder a la tabla";

    public DetalleVentaData() {

        con = Conexion.getConexion();
        ventaData = new VentaData();
        productoData = new ProductoData();
    }
    
    public void guardarDetalleVenta(DetalleVenta detalleVenta) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO detalleventa (cantidad,precioVenta,idVenta,idProducto) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setDouble(2, detalleVenta.getPrecioVenta());
            ps.setInt(3, detalleVenta.getVenta().getIdVenta());
            ps.setInt(4, detalleVenta.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en guardar VentaData, " + ex.getMessage());
        }
    }

    public DetalleVenta buscarDetalleVenta(int idDetalleVenta) {
        VentaData ventaData = new VentaData();
        ProductoData productoData = new ProductoData();
        DetalleVenta detalleVenta = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM detalleventa WHERE idDetalleVenta=?;");
            ps.setInt(1, idDetalleVenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                detalleVenta = new DetalleVenta();
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                detalleVenta.setVenta(ventaData.buscarVenta(rs.getInt("idVenta")));
                detalleVenta.setProducto(productoData.buscarProductoId(rs.getInt("idProducto")));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return detalleVenta;
    }

    public void modificarDetalleVenta(DetalleVenta detalleVenta) {

        String sql = "UPDATE detalleventa SET cantidad=?,precioVenta=?,idVenta=?,idProducto=? WHERE idDetalleVenta=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setDouble(2, detalleVenta.getPrecioVenta());
            ps.setInt(3, detalleVenta.getVenta().getIdVenta());
            ps.setInt(4, detalleVenta.getProducto().getIdProducto());
            ps.setInt(5, detalleVenta.getIdDetalleVenta());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El detalle de venta no existe.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + "detalle de venta" + ex.getMessage());
        }
    }

    public List<DetalleVenta> listaDetalleVentas(int idVenta) {
        ArrayList<DetalleVenta> listaDetalleVentas = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from detalleventa WHERE idVenta=?");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleVenta detalleVenta = new DetalleVenta();
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                detalleVenta.setVenta(ventaData.buscarVenta(idVenta));
                detalleVenta.setProducto(productoData.buscarProductoId(rs.getInt("idProducto")));
                listaDetalleVentas.add(detalleVenta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar el detalle de Compras, " + ex.getMessage());
        }
        return listaDetalleVentas;
    }

}
