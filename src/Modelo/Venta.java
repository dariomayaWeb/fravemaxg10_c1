
package Modelo;

import java.time.LocalDate;


public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private int idCliente;
    private int cantidad;
    private double precio;
    private int idProducto;

    public Venta() {
    }

    public Venta(LocalDate fecha, int idCliente, int cantidad, double precio, int idProducto) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idProducto = idProducto;
    }

    public Venta(int idVenta, LocalDate fecha, int idCliente, int cantidad, double precio, int idProducto) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idProducto = idProducto;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    @Override
    public String toString() {
        return  + idVenta + ", fecha=" + fecha + ", idCliente=" + idCliente + ", cantidad=" + cantidad + ", precio=" + precio + ", idProducto=" + idProducto + '}';
    }
    
           

    
    
}
