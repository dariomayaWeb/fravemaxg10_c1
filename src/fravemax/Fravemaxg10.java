package fravemax;

import Controlador.ClienteData;
import Controlador.CompraData;
import Controlador.DetalleCompraData;
import Controlador.DetalleVentaData;
import Controlador.ProductoData;
import Controlador.ProveedorData;
import Controlador.VentaData;
import Modelo.Cliente;
import Modelo.Compra;
import Modelo.DetalleCompra;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Venta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Fravemaxg10 {

    public static void main(String[] args) {
        // *** Proveedor ***
// NOTA: estaría bueno hacer la razon Social UNICA en la BD para no repetir
        //ProveedorData provdata = new ProveedorData();
        //Proveedor prove = new Proveedor("MarianoPuroLaburo","PabloLucero","567456",true);
        // Guardar  OK
        //provdata.guardarProveedor(prove); 
        // Buscar OK
        //System.out.println(provdata.buscarProveedor(4)); // se corrige buscar proveedor
        // Modificar OK
        /*Proveedor prove = new Proveedor(4,"MarianoPuroLaburo","San Luis ","98765465",true);
        provdata.modificarProveedor(prove);
        System.out.println(provdata.buscarProveedor(4));
        */
        // Listar OK 
        /*Proveedor prove2 = new Proveedor("TecnoLavarropas","Merlo","85479",true);
        provdata.guardarProveedor(prove2);         
        Proveedor prove3 = new Proveedor("TelevisoresDeSegunda","Bebedero","549132",true);
        provdata.guardarProveedor(prove3);
        System.out.println(provdata.listarProveedor());
        */
        // Eliminar y activar OK
        //provdata.eliminarProveedor(5);
        //provdata.activarProveedor(5);
        
        // *** Cliente ***
// NOTA: Estaría bueno agregar el DNI y hacerlo UNICO en la DB para evitar repetir clientes
        //ClienteData cldata = new ClienteData();
        //Cliente cliente = new Cliente("Perez", "Juan", "la Quiaca", "4567898", true);
        // Guardar OK
        //cldata.guardarCliente(cliente);
        // Buscar OK
        //System.out.println(cldata.buscarCliente(4));
        // Modificar
        /*Cliente cliente = new Cliente(4, "McLaren", "Juan", "la Quiaca", "777777", true);
        cldata.modificarCliente(cliente);
        System.out.println(cldata.buscarCliente(4));
        */
        // Listar OK
        /*Cliente cliente2 = new Cliente("Fort", "Ricardo", "Miami", "456564", true);
        cldata.guardarCliente(cliente2);
        Cliente cliente3 = new Cliente("Wick", "Jhon", "Italia", "121212", true);
        cldata.guardarCliente(cliente3);
        System.out.println(cldata.listarCliente());
        */
        // Eliminar y activar
        //cldata.eliminarCliente(4);
        //cldata.activarCliente(4);
        
        // *** Producto ***
// NOTA: Vamos a tratar el tema de la categoría de manera dinamica
        // En la vista, a la hora de crear y guardar un producto, vamos a llenar un combobox
        // con las categorias existentes, y si no aparece la categoria deseada, 
        // opcion N/A => habilita caja de texto) lo tomamos de la caja de texto,
        // y una vez guardado el producto, se llena el combobox nuevamente
        // mediante función.
        ProductoData proData = new ProductoData();
        
        Producto prod = new Producto("TV Samsung FHD", "de 100 pulgadas", "Televisor", 120000, 50, true);
        // Guardar OK
        //proData.guardarProducto(prod);
        // Buscar OK
        System.out.println(proData.buscarProductoStock(7));
       // System.out.println(proData.buscarProductoId(7));
        
        // Modificar OK
        /*Producto prod = new Producto(7, "TV Samsung FHD", "de 70 pulgadas", "Televisor", 140000, 25, true);
        proData.modificarProducto(prod);
        System.out.println(proData.buscarProductoId(7));
        */
        // Listar OK
        /*Producto prod2 = new Producto("Lexmark 456", "cone escáner", "Impresora", 80000, 14, true);
        Producto prod3 = new Producto("TV Hitachi", "de 50 pulgadas", "Televisor", 90000, 20, true);
        Producto prod4 = new Producto("Whirpool 7k1400", "hasta 7 kilos, 1400 rpm", "Lavarropas", 18000, 30, true);
        proData.guardarProducto(prod2);
        proData.guardarProducto(prod3);
        proData.guardarProducto(prod4);
        System.out.println(proData.listar());
        */
        // Obtener Categorias OK
        /*System.out.println(proData.listar());
        List listaCategorias = new ArrayList();
        ArrayList<Producto> lista = new ArrayList();
        lista = (ArrayList)proData.listar();
        lista.forEach(System.out::println);
        for (Producto producto : lista) {
            String cat = producto.getCategoria();
            listaCategorias.add(cat);
        }
        */
        //listaCategorias.forEach(System.out::println);
        /* metodo 1 OK
        listaCategorias = (List) listaCategorias.stream().distinct().collect(Collectors.toList());
        listaCategorias.forEach(System.out::println);
        */
        /* metodo 2 OK  ---> Se Añade metodo
        Set miConjunto = new HashSet<>(listaCategorias);
        listaCategorias.clear();
        listaCategorias.addAll(miConjunto);
        listaCategorias.forEach(System.out::println);
        */
        //System.out.println(proData.listarCategorias());
        // Listar por categoría  OK
        /*Producto prod5 = new Producto("HP LJ 1150", "monocromatica", "Impresora", 100000, 10, true);
        Producto prod6 = new Producto("SONY 78-FHD", "78 pulgadas HD", "Televisor", 110000, 15, true);
        proData.guardarProducto(prod5);
        proData.guardarProducto(prod6);        
        */
        /*System.out.println(proData.buscarProductoCategoria("Televisor"));
        System.out.println(proData.buscarProductoCategoria("Impresora"));
        System.out.println(proData.buscarProductoCategoria("Lavarropas"));
        */
        // Eliminar, listar eliminados y activar productos  OK
        /*proData.eliminarProducto(1);
        proData.eliminarProducto(2);
        proData.eliminarProducto(3);
        System.out.println(proData.listaProductosEliminados());
        *//*
        proData.activarProducto(1);
        proData.activarProducto(2);
        proData.activarProducto(3);
        */
        
        // *** Compra ***
        //CompraData compraData = new CompraData();
        //Proveedor prove = new Proveedor(4,"MarianoPuroLaburo","San Luis ","123465",true);
        //Compra compra = new Compra(prove, LocalDate.parse("2023-06-10"), true);
        // Guardar OK
        //compraData.guardarCompra(compra);
        // Buscar
// NOTA: va a ser util crear metodos buscar compras por fecha y por proveedor
        // así como despues poder ver el detalle de cada compra
        //System.out.println(compraData.buscarCompra(5));
        // Modificar OK
        /*Proveedor prove2 = new Proveedor(5,"TecnoLavarropas","Merlo","85479",true);
        Compra compra = new Compra(5, prove2, LocalDate.parse("2022-04-01"), true);
        compraData.modificarCompra(compra);
        System.out.println(compraData.buscarCompra(5));
        */
        // Listar OK
        /*Compra compra2 = new Compra(prove, LocalDate.parse("2017-01-10"), true);
        compraData.guardarCompra(compra2);
        Compra compra3 = new Compra(prove, LocalDate.parse("1999-07-31"), true);
        compraData.guardarCompra(compra3);
        System.out.println(compraData.listaCompras());
        */
        // Eliminar y activar  OK
        //compraData.darDebajaCompra(5);
        //compraData.darDeAltaCompra(5);
// NOTA: Se podria hacer un Listar compras eliminadas
        
        // *** Venta ***
        VentaData ventaData = new VentaData();
        //Cliente cliente = new Cliente(4, "McLaren", "Juan", "la Quiaca", "777777", true);
        //Venta venta = new Venta(LocalDate.parse("2018-09-15"), cliente, true);
        // Guardar OK
        //ventaData.guardarVenta(venta);
        // Buscar OK
        //System.out.println(ventaData.buscarVenta(1));
        // Modificar OK
        /*Cliente cliente2 = new Cliente(5, "Fort", "Ricardo", "Miami", "456564", true);
        Venta venta = new Venta(1,LocalDate.parse("2022-03-25"), cliente2, true);
        ventaData.modificarVenta(venta);
        System.out.println(ventaData.buscarVenta(1));
        */
        // Listar OK
// NOTA: va a ser util crear metodos buscar ventas por fecha y por cliente
        /*Cliente cliente = new Cliente(4, "McLaren", "Juan", "la Quiaca", "777777", true);
        Venta venta = new Venta(LocalDate.parse("2010-09-15"), cliente, true);
        Venta venta2 = new Venta(LocalDate.parse("2015-09-15"), cliente, true);
        Venta venta3 = new Venta(LocalDate.parse("2021-09-15"), cliente, true);
        ventaData.guardarVenta(venta);
        ventaData.guardarVenta(venta2);
        ventaData.guardarVenta(venta3);
        System.out.println(ventaData.lista());
        */
        // Listar Ventas por Cliente OK
        //System.out.println(ventaData.listarVentasCliente(4));
        // Listar ventas por fecha  OK
        /*LocalDate fechaLD = LocalDate.parse("2015-09-15");
        System.out.println(ventaData.listarVentasFecha(fechaLD));
        */
        // Buscar una Venta por Cliente y Fecha  OK
        /*LocalDate fechaLD = LocalDate.parse("2015-09-15");
        Cliente cliente = new Cliente(4,12345, "McLaren", "Juan", "la Quiaca", "777777", true);
        System.out.println(ventaData.buscarVentaClienteFecha(cliente.getIdCliente(), fechaLD));
        */
        // Eliminar y activar
// NOTA: Se podria hacer un Listar ventas eliminadas
        //ventaData.eliminarVenta(1);
        //ventaData.activarVenta(1);
        
        // *** Detalle Venta ***
        //DetalleVentaData detVeData = new DetalleVentaData();
        //Producto prod = new Producto(12, "SONY 78-FHD", "78 pulgadas HD", "Televisor", 110000, 15, true);
        //Cliente cliente2 = new Cliente(5, "Fort", "Ricardo", "Miami", "456564", true);
        //Venta venta = new Venta(1,LocalDate.parse("2022-03-25"), cliente2, true);
        //DetalleVenta detVenta = new DetalleVenta(3, venta, prod);
        // Guardar OK
        //detVeData.guardarDetalleVenta(detVenta);
        // Buscar OK
        //System.out.println(detVeData.buscarDetalleVenta(1));
        // Listar Detalles de Ventas OK
        //System.out.println(detVeData.listaDetalleVentas(venta.getIdVenta()));
        // Modificar OK
        /*Cliente cliente3 = new Cliente(4, "McLaren", "Juan", "la Quiaca", "777777", true);
        Venta venta2 = new Venta(2,LocalDate.parse("2015-09-15"), cliente3, true);
        Producto prod2 = new Producto(8,"Lexmark 456", "cone escáner", "Impresora", 80000, 14, true);
        DetalleVenta detVenta2 = new DetalleVenta(1, 2, 150000, venta2, prod2);
        detVeData.modificarDetalleVenta(detVenta2);
        */
        // Eliminar
        //detVeData.eliminarDetalle(2);
        
        // *** Detalle Compra ***
        //DetalleCompraData detComData = new DetalleCompraData();
        //Producto prod = new Producto(12, "SONY 78-FHD", "78 pulgadas HD", "Televisor", 110000, 15, true);
        //Proveedor prove = new Proveedor(4,"MarianoPuroLaburo","San Luis ","98765465",true);
        //Compra compra = new Compra(6, prove, LocalDate.parse("2017-01-10"), true);
        //DetalleCompra detCompra = new DetalleCompra(10, 400000, compra, prod);
        // Guardar OK
        //detComData.guardarDetalleCompra(detCompra);
        // Buscar OK
        //System.out.println(detComData.buscarDetalleCompra(1));
        // Modificar
        /*Proveedor prove2 = new Proveedor(5,"TecnoLavarropas","Merlo","85479",true);
        Compra compraModif = new Compra(6, prove2, LocalDate.parse("2017-01-10"), true);
        DetalleCompra detCompra2 = new DetalleCompra(1,5, 200000, compraModif, prod);
        detComData.modificarDetalleCompra(detCompra2);
        System.out.println(detComData.buscarDetalleCompra(1));
        */
        // Eliminar OK
        //detComData.eliminarDetalle(2);
        
        
        
        
        
    }

}
