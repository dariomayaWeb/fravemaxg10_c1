
package Controlador;

import java.time.LocalDate;


public class CompraData {
    private int idCompra;
    private int idProveedor;
    private LocalDate fecha;

    public CompraData() {
    }

    public CompraData(int idProveedor, LocalDate fecha) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }
    
    public CompraData(int idCompra, int idProveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }
    
    
    
}
