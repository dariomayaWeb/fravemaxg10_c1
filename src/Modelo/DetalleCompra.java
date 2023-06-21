
 
package Modelo;


public class DetalleCompra {
    
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private Producto producto;

    public DetalleCompra() {
    }

    public DetalleCompra(int cantidad, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.compra = compra;
        this.producto = producto;
        this.precioCosto = producto.getPrecioActual()*cantidad;
    }

    public DetalleCompra(int idDetalle, int cantidad, Compra compra, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.compra = compra;
        this.producto = producto;
        this.precioCosto = producto.getPrecioActual()*cantidad;
        
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", compra=" + compra + ", producto=" + producto + '}';
    }
    
}    

        
    
    
    

