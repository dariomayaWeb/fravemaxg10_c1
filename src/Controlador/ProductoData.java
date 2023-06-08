package Controlador;

import Modelo.Producto;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;
    private String msjeError = "Error al acceder a la tabla";

    public ProductoData() {

        con = Conexion.getConexion();

    }

    public void guardarProducto(Producto producto) throws SQLException {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO producto(nombre,descripcion,precioActual,stock,estado) values(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError +"producto " + ex.getMessage());
        }
    }

    public Producto buscarProductoId(int id){
        Producto producto=null;
       try{
           PreparedStatement ps=con.prepareStatement("SELECT * FROM producto WHERE id=?;");
           ps.setInt(1,id);
           
           ResultSet rs=ps.executeQuery();
             if(rs.next()){
                producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
               
            }
            ps.close();
            rs.close();
           
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,msjeError+" buscar producto, "+ex.getMessage());
        }
        return producto;
      
    }
    
    public List<Producto> lista(){
        ArrayList<Producto> lista=new ArrayList();
          try {
            PreparedStatement ps=con.prepareStatement("select * from producto;");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Producto producto= new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
            }
            
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, msjeError+" de la lista de producto, "+ex.getMessage());
        }
        
        return lista;
    }
    
    public void eliminarProducto(int id){
        try{
            PreparedStatement ps=con.prepareStatement("DELETE FROM compra WHERE idCompra=?;");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "");
        }
    }
    
    public List<Producto>buscarProductoCategoriaValor(String categoria, String valor){
        ArrayList<Producto> lista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE " +categoria + "=?;");
            ps.setString(1, valor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                lista.add(producto);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+" buscar en producto, " + ex.getMessage());
        }        
        return lista;
    }
    
    public void modificarProducto(Producto producto){
        try {
            PreparedStatement ps = con.prepareStatement("update from producto set nombre=?,descripcion=?,precioActual=?, stock=?, estado=? WHERE id=?");
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError+"  modificar, " + ex.getMessage());
        }
        
        
        
    }
    
    
}
