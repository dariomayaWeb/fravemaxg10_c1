package Controlador;

import Modelo.Venta;
import Modelo.Compra;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection con = null;
    private String msjeError = "Error al acceder a la tabla ";

    public VentaData() {
        con = Conexion.getConexion();
    }

    public void guardarVenta(Venta venta) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into venta(fecha,idCliente) values(?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setDouble(2, venta.getCliente().getIdCliente());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                venta.setIdVenta(rs.getInt("idVenta"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " guardar venta, " + ex.getMessage());
        }
    }
    
    public Venta buscarId(int id){
        Venta venta=null;
        ClienteData clienteData=new ClienteData();
        try {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM venta WHERE idVenta=?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                venta = new Venta();
                venta.setIdVenta(id);
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                venta.setCliente(clienteData.buscarCliente(rs.getInt("idCliente")));

            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+" en buscar venta, " + ex.getMessage());
        }
        return venta;
    }
    
    public void modificarVenta(Venta venta){
          try {
            PreparedStatement ps = con.prepareStatement("UPDATE FROM venta SET fecha=?,idCliente=? WHERE idVenta=?");
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.setInt(3, venta.getIdVenta());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,msjeError+ " modificar venta, " + ex.getMessage());
        }
    }
    
    public void eliminarVenta(int id){
         try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM venta WHERE idVenta=?;");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,msjeError+ " eliminar venta, " + ex.getMessage());
        }
    }
    
    public List<Compra> lista(){
         ArrayList<Compra> lista = new ArrayList();
         ClienteData clienteData = new ClienteData();
            try {
            PreparedStatement ps = con.prepareStatement("select * from venta;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                venta.setCliente(clienteData.buscarCliente(rs.getInt("idCliente")));
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en lista venta, " + ex.getMessage());
        }
         
         return lista;
    }
    
}
