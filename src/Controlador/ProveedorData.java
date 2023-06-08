
package Controlador;

import Modelo.Proveedor;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProveedorData {
    private Connection con = null;
        private String msjeError = "Error al acceder a la tabla ";

        public ProveedorData(){
            
            con = Conexion.getConexion();
            
        }
          public void guardarProveedor(Proveedor proveedor) {

        String sql = "INSERT INTO proveedor (razonSocial,domicilio, telefono,  estado) VALUES (?, ?, ?, ? )";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,proveedor.getRazonSocial());
            ps.setString(2,proveedor.getDomicilio());
            ps.setString(3,proveedor.getTelefono());
            ps.setBoolean(4,proveedor.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor añadido con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " proveedor " + ex.getMessage());
        }
    }
        
        public Proveedor buscarProveedor(int id) {
        Proveedor proveedor = null;
        String sql = "SELECT  razonSocial, domicilio, telefono, estado FROM cliente WHERE idProveedor=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id); //tambien se puede poner getInt(num de columna)
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El proveedor no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+" proveedor " + ex.getMessage());
        }
        return proveedor;
    }

        public List<Proveedor> listarProveedor() {

        List<Proveedor> proveedores = new ArrayList<>();
        try {
            String sql = " SELECT * FROM proveedor WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();

                proveedor.setIdProveedor(rs.getInt("idProveedor")); //tambien se puede poner getInt(num de columna)
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));
                proveedores.add(proveedor);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+" proveedor. " + ex.getMessage());
        }
        return proveedores;
    }        

        public void modificarProveedor(Proveedor proveedor){
        
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ? WHERE idProveedor = ? ";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null, " Modificado Exitosamente.");               
            }else{
                JOptionPane.showMessageDialog(null, " El proveedor no existe.");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,msjeError+" proveedor. "+ex.getMessage());
        }
        
    }
        
        public void eliminarProveedor(int id){
        
        try{
            String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila==1){
                JOptionPane.showMessageDialog(null,"Se eliminó al proveedor");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, msjeError+" proveedor. "+ex.getMessage());
        }
    }

        public void activarProveedor(int id){
        
        try{
            String sql = "UPDATE proveedor SET estado = 1 WHERE idProveedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila==1){
                JOptionPane.showMessageDialog(null," Se activó al proveedor. ");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, msjeError+" proveedor. "+ex.getMessage());
        }
    }
    
}
