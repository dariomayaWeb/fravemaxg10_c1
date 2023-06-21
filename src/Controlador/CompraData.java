package Controlador;

import Modelo.Compra;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {

    private Connection con = null;
    private String msjeError = "Error al acceder a la tabla";

    public CompraData() {

        con = Conexion.getConexion();

    }

    public void guardarCompra(Compra compra) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO compra (fecha, idProveedor ,estado) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(compra.getFecha()));
            ps.setInt(2, compra.getProveedor().getIdProveedor());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt("idCompra"));
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Compra guardada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en guardar CompraData, " + ex.getMessage());
        }
    }

    public void cerrarCompra(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE compra SET estado=0 WHERE idCompra=?;");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Compra cerrada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en eliminar CompraData, " + ex.getMessage());
        }
    }

    public void reabrirCompra(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE compra SET estado=1 WHERE idCompra=?;");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Compra reabierta");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en eliminar CompraData, " + ex.getMessage());
        }

    }

    public Compra buscarCompra(int id) {
        ProveedorData proveedorData = new ProveedorData();
        Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM compra WHERE idCompra=?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(id);
                compra.setProveedor(proveedorData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar CompraData, " + ex.getMessage());
        }
        return compra;
    }

    public List<Compra> listaCompras() {
        ProveedorData proveedorData = new ProveedorData();
        ArrayList<Compra> lista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM compra");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedorData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(rs.getBoolean("estado"));
                lista.add(compra);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar CompraData, " + ex.getMessage());
        }
        return lista;
    }

    public void modificarCompra(Compra compra) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE compra SET idProveedor=? ,fecha=? WHERE idCompra=?;");
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.setInt(3, compra.getIdCompra());
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en modificar CompraData, " + ex.getMessage());
        }
    }

    public List<Compra> listarComprasProveedor(int idProveedor) {
        ArrayList<Compra> lista = new ArrayList();
        ProveedorData provData = new ProveedorData();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM compra WHERE estado=1 AND idProveedor=? ORDER BY fecha DESC");
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setEstado(rs.getBoolean("estado"));
                lista.add(compra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en lista compra, " + ex.getMessage());
        }

        return lista;
    }     

    public List<Compra> listarComprasFecha(LocalDate fecha ) {
        ArrayList<Compra> lista = new ArrayList();
        ProveedorData provData = new ProveedorData();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM compra AS C, proveedor AS P WHERE C.idProveedor=P.idProveedor AND C.estado=1 AND fecha=? ORDER BY razonSocial");
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setEstado(rs.getBoolean("C.estado"));
                lista.add(compra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en lista compra, " + ex.getMessage());
        }

        return lista;
    }

    public List<Compra> listarComprasProveedorFecha(int idProveedor, LocalDate fecha ) {
        ArrayList<Compra> lista = new ArrayList();
        ProveedorData provData = new ProveedorData();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM compra AS C, proveedor AS P WHERE C.idProveedor=P.idProveedor AND C.estado=1 AND C.idProveedor=? AND fecha=? ");
            ps.setInt(1, idProveedor);
            ps.setDate(2, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setEstado(rs.getBoolean("C.estado"));
                lista.add(compra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en lista compra, " + ex.getMessage());
        }

        return lista;
    }
}
