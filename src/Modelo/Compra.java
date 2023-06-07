
package Modelo;

import java.time.LocalDate;


public class Compra {
    
    private int idCompra;
    private int idProveedor;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(int idProveedor, LocalDate fecha) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public Compra(int idCompra, int idProveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProveedor=" + idProveedor + ", fecha=" + fecha + '}';
    }
    
    
    
}
