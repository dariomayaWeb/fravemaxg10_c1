
package Modelo;

import java.time.LocalDate;


public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private Cliente cliente;
    private int cantidad;
    private double precio;
    private Producto producto;

    public Venta() {
    }

    public Venta(LocalDate fecha, Cliente cliente, int cantidad, double precio, Producto producto) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public Venta(int idVenta, LocalDate fecha, Cliente cliente, int cantidad, double precio, Producto producto) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", cliente=" + cliente + ", cantidad=" + cantidad + ", precio=" + precio + ", producto=" + producto + '}';
    }

    
}
