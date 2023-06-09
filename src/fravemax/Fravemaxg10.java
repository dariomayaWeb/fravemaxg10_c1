package fravemax;

import Controlador.ClienteData;
import Controlador.ProveedorData;
import Modelo.Cliente;
import Modelo.Proveedor;

public class Fravemaxg10 {

    public static void main(String[] args) {
        ProveedorData pro = new ProveedorData();
           Proveedor prove = new Proveedor("MarianoPuroLaburo","PabloLucero","567456",true);
        //   pro.guardarProveedor(prov);
        Proveedor prov = new Proveedor();
        pro.buscarProveedor(1);
     //   pro.modificarProveedor(prove);

        /* ClienteData cli =new ClienteData();
        Cliente clien = new Cliente("Moreira","Esteban","VillaMercedes","09876",true);
        cli.guardarCliente(clien);*/
    }

}
