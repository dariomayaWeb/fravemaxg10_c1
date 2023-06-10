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

    public void guardarProducto(Producto producto)  {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO producto(nombre,descripcion,categoria,precioActual,stock,estado) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + "producto " + ex.getMessage());
        }
    }

    public Producto buscarProductoId(int id) {
        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE id=?;");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " buscar producto, " + ex.getMessage());
        }
        return producto;

    }

    public List<Producto> listar() {
        ArrayList<Producto> lista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE estado = 1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                lista.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " de la lista de producto, " + ex.getMessage());
        }
        return lista;
    }
    
    public List<Producto> listaProductosEliminados() {
        ArrayList<Producto> lista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE estado = 0");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                lista.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " de la lista de producto, " + ex.getMessage());
        }
        return lista;
    }

    public void eliminarProducto(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE producto SET estado=0 WHERE idProducto=?");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
        }
    }
    
    public void activarProducto(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE producto SET estado=1 WHERE idProducto=?");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
        }
    }

    public List<Producto> buscarProductoCategoria(String categoria) {
        ArrayList<Producto> lista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE categoria =? AND estado=1");
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString(categoria));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                lista.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + " buscar en producto, " + ex.getMessage());
        }
        return lista;
    }

    public void modificarProducto(Producto producto) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE producto SET nombre=?,descripcion=?,precioActual=?, stock=?, estado=? WHERE id=?");
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            ps.executeUpdate();
            ps.close();
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msjeError + "producto" + ex.getMessage());
        }
    }

}
