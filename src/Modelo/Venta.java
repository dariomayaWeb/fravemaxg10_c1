
package Modelo;

import java.time.LocalDate;


public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private int idCliente;

    public Venta() {
    }

    public Venta(LocalDate fecha, int idCliente) {
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public Venta(int idVenta, LocalDate fecha, int idCliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
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

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", idCliente=" + idCliente + '}';
    }
    
    
}
