
package Controlador;

import Modelo.Cliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteData {
    
        private Connection con = null;
        private String msjeError = "Error al acceder a la tabla ";

        public ClienteData(){
            
            con = Conexion.getConexion();
            
        }
        
        public void guardarCliente(Cliente cliente) {

        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono,  estado) VALUES (?, ?, ?, ?, ? )";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setInt(4, cliente.getTelefono());
            ps.setBoolean(5, cliente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + "cliente" + ex.getMessage());
        }
    }
        
        public Cliente buscarCliente(int id) {
        Cliente cliente = null;
        String sql = "SELECT  apellido, nombre, domicilio, telefono, estado FROM cliente WHERE idCliente=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(id); //tambien se puede poner getInt(num de columna)
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+"cliente" + ex.getMessage());
        }
        return cliente;
    }

        public List<Cliente> listarCliente() {

        List<Cliente> clientes = new ArrayList<>();
        try {
            String sql = " SELECT * FROM cliente WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt("idCliente")); //tambien se puede poner getInt(num de columna)
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+"cliente" + ex.getMessage());
        }
        return clientes;
    }        

        public void modificarCliente(Cliente cliente){
        
        String sql = "UPDATE cliente SET apellido = ? , nombre = ? , domicilio = ?, telefono = ? WHERE idCliente = ? ";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");               
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,msjeError+"cliente"+ex.getMessage());
        }
        
    }
        
        public void eliminarCliente(int id){
        
        try{
            String sql = "UPDATE cliente SET estado = 0 WHERE idCliente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila==1){
                JOptionPane.showMessageDialog(null,"Se elimino al cliente.");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, msjeError+"cliente"+ex.getMessage());
        }
    }

        public void activarCliente(int id){
        
        try{
            String sql = "UPDATE cliente SET estado = 1 WHERE idCliente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila==1){
                JOptionPane.showMessageDialog(null,"Se activó el cliente.");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, msjeError+"cliente"+ex.getMessage());
        }
    }

}
