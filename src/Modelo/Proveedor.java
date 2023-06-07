
package Modelo;


public class Proveedor {
    private int proveedor;
    private String razonSocial;
    private String domicilio;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(String razonSocial, String domicilio, int telefono) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Proveedor(int proveedor, String razonSocial, String domicilio, int telefono) {
        this.proveedor = proveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "proveedor=" + proveedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
    
}
