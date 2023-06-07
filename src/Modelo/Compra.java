
package Modelo;

import java.time.LocalDate;


public class Compra {
    
    private int idCompra;
    private int idProveedor;
    private LocalDate fecha;
    private int cantidad;
    private double precioCosto;
    private int idProducto;

    public Compra() {
    }

    public Compra(int idProveedor, LocalDate fecha, int cantidad, double precioCosto, int idProducto) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProducto = idProducto;
    }

    public Compra(int idCompra, int idProveedor, LocalDate fecha, int cantidad, double precioCosto, int idProducto) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProducto = idProducto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProveedor=" + idProveedor + ", fecha=" + fecha + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", idProducto=" + idProducto + '}';
    }
    

    
}
