/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CompraData;
import Controlador.DetalleCompraData;
import Controlador.ProductoData;
import Modelo.Compra;
import Modelo.DetalleCompra;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristina Ferez
 */
public class DetalleCompraView extends javax.swing.JInternalFrame {

    /**
     * Creates new form DetalleCompra
     */
    private ProductoData proData;
    private ArrayList<String> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private DetalleCompraData detCompData;
    private int idDetCompra;
    private CompraData compraData;
    private Compra compra;
    private Producto prodComboBox;
    
    public DetalleCompraView(int idDetCompra) {
        initComponents();
        this.idDetCompra = idDetCompra;
        proData = new ProductoData();
        listaCategorias = (ArrayList)proData.listarCategorias();
        detCompData = new DetalleCompraData();
        prodComboBox = new Producto();
        btnGuardar.setVisible(false);
        cargarDatos(idDetCompra);
        cargarCategorias();
        cargarProductos();        
    }

    public DetalleCompraView(Compra compra) {
        initComponents();
        this.compra = compra;
        proData = new ProductoData();
        listaCategorias = (ArrayList)proData.listarCategorias();
        detCompData = new DetalleCompraData();
        prodComboBox = new Producto();
        btnModificar.setVisible(false);
        cargarCategorias();
        cargarProductos();        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIdDetalleCompra = new javax.swing.JLabel();
        cmbProdCategoria = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        cmbProdNombre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        textPrecioProducto = new javax.swing.JTextField();
        textIdDetalleCompra = new javax.swing.JTextField();
        lblProdDetalle = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        textProdDetalle = new javax.swing.JTextField();
        textProducto = new javax.swing.JTextField();
        btnPrecio = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        textPrecioVenta = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setMinimumSize(new java.awt.Dimension(650, 530));
        setPreferredSize(new java.awt.Dimension(650, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detalleCompra.png"))); // NOI18N

        lblIdDetalleCompra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblIdDetalleCompra.setText("Id Detalle:");

        cmbProdCategoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbProdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdCategoriaActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCantidad.setText("Cantidad");

        cmbProdNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbProdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Precio Venta");

        lblPrecioProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPrecioProducto.setText("Precio:");

        lblProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblProducto.setText("Producto:");

        textPrecioProducto.setEditable(false);
        textPrecioProducto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textPrecioProducto.setMinimumSize(new java.awt.Dimension(50, 26));
        textPrecioProducto.setPreferredSize(new java.awt.Dimension(50, 26));

        textIdDetalleCompra.setEditable(false);
        textIdDetalleCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textIdDetalleCompra.setMinimumSize(new java.awt.Dimension(50, 26));
        textIdDetalleCompra.setPreferredSize(new java.awt.Dimension(50, 26));

        lblProdDetalle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblProdDetalle.setText("Descripción:");

        textCantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textCantidad.setMinimumSize(new java.awt.Dimension(50, 26));
        textCantidad.setPreferredSize(new java.awt.Dimension(50, 26));

        textProdDetalle.setEditable(false);
        textProdDetalle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textProdDetalle.setMinimumSize(new java.awt.Dimension(50, 26));
        textProdDetalle.setPreferredSize(new java.awt.Dimension(50, 26));

        textProducto.setEditable(false);
        textProducto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPrecio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPrecio.setText("Calcular precio");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.jpg"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        textPrecioVenta.setEditable(false);
        textPrecioVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addComponent(textPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecioProducto)
                                .addComponent(lblCantidad))
                            .addGap(63, 63, 63)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblProducto)
                                .addComponent(lblIdDetalleCompra)
                                .addComponent(lblProdDetalle))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbProdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbProdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(textProdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdDetalleCompra)
                    .addComponent(textIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(textProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdDetalle)
                    .addComponent(textProdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioProducto)
                    .addComponent(textPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdCategoriaActionPerformed
        // TODO add your handling code here:
        cargarProductos();
    }//GEN-LAST:event_cmbProdCategoriaActionPerformed

    private void cmbProdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdNombreActionPerformed
        // TODO add your handling code here:
        if(cmbProdNombre.getSelectedItem()!=null){
            Producto producto = (Producto)cmbProdNombre.getSelectedItem();
            prodComboBox = producto;
            if (producto.getIdProducto()>0){
                textProducto.setText(producto.getNombre());
                textProdDetalle.setText(producto.getDescripcion());
                textPrecioProducto.setText(producto.getPrecioActual()+"");
                textCantidad.setText("");
                textPrecioVenta.setText("");
            }else{
                if (!"".equals(textIdDetalleCompra.getText())){
                    cargarDatos(idDetCompra);
                }
            }
        }
    }//GEN-LAST:event_cmbProdNombreActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        // TODO add your handling code here:
        cargarPrecioCompra();
    }//GEN-LAST:event_btnPrecioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int cantidad = Integer.parseInt(textCantidad.getText());
        Compra compraBuscada = detCompData.buscarDetalleCompra(idDetCompra).getCompra();
        if (prodComboBox.getIdProducto()>0){
            DetalleCompra detModificado = new DetalleCompra(idDetCompra, cantidad, compraBuscada, prodComboBox);
            detCompData.modificarDetalleCompra(detModificado);
        }else{
            Producto productoOrig = detCompData.buscarDetalleCompra(idDetCompra).getProducto();
            DetalleCompra detModificado = new DetalleCompra(idDetCompra, cantidad, compraBuscada, productoOrig);
            detCompData.modificarDetalleCompra(detModificado);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String cantTexto = textCantidad.getText();

        if (!"".equals(cantTexto) && prodComboBox.getIdProducto()>0){
            try{
                int cantidad = Integer.parseInt(textCantidad.getText());
                DetalleCompra detCompraNuevo = new DetalleCompra(cantidad, compra, prodComboBox);
                detCompData.guardarDetalleCompra(detCompraNuevo);
                textIdDetalleCompra.setText(detCompraNuevo.getIdDetalle()+"");
            }catch(InputMismatchException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un producto y una cantidad");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un producto y una cantidad");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JComboBox<String> cmbProdCategoria;
    private javax.swing.JComboBox<Producto> cmbProdNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIdDetalleCompra;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProdDetalle;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textIdDetalleCompra;
    private javax.swing.JTextField textPrecioProducto;
    private javax.swing.JTextField textPrecioVenta;
    private javax.swing.JTextField textProdDetalle;
    private javax.swing.JTextField textProducto;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias() {
        for (String categoria : listaCategorias) {
            cmbProdCategoria.addItem(categoria);
        }
    }

    private void cargarProductos() {
        cmbProdNombre.removeAllItems();
        Producto opcionDef = new Producto(0,"Seleccione un producto", "", "", 0.0, 0, isIcon);
        cmbProdNombre.addItem(opcionDef);
        String categ = (String)cmbProdCategoria.getSelectedItem();
        listaProductos = (ArrayList)proData.buscarProductoCategoria(categ);
        for (Producto producto : listaProductos) {
            cmbProdNombre.addItem(producto);
        }
    }
    
    private void cargarPrecioCompra(){
        String cantidadTxt = textCantidad.getText();
        if(!"".equals(cantidadTxt)){
            int cantidad = Integer.parseInt(cantidadTxt);
            double precioActual = Double.parseDouble(textPrecioProducto.getText());
            double precioCompra = cantidad * precioActual;
            textPrecioVenta.setText(precioCompra+"");
        }
    }

    private void cargarDatos(int idDetCompra) {
        DetalleCompra detCompra = detCompData.buscarDetalleCompra(idDetCompra);
        textIdDetalleCompra.setText(idDetCompra+"");
        textProducto.setText(detCompra.getProducto().getNombre());
        textProdDetalle.setText(detCompra.getProducto().getDescripcion());
        textPrecioProducto.setText(detCompra.getProducto().getPrecioActual()+"");
        textCantidad.setText(detCompra.getCantidad()+"");
        textPrecioVenta.setText(detCompra.getPrecioCosto()+"");
    }


}
