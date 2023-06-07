
package Modelo;

import java.time.LocalDate;


public class Compra {
    
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;
    private int cantidad;
    private double precioCosto;
    private Producto producto;

    public Compra() {
    }

    public Compra(Proveedor proveedor, LocalDate fecha, int cantidad, double precioCosto, Producto producto) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.producto = producto;
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha, int cantidad, double precioCosto, Producto producto) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.producto = producto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", producto=" + producto + '}';
    }

    
}
