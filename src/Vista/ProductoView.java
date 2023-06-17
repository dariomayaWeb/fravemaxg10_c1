/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ProductoData;
import Modelo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ProductoView extends javax.swing.JInternalFrame {

    private ProductoData productoData;

    /**
     * Creates new form Productos
     */
    public ProductoView() {
        initComponents();
        productoData = new ProductoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textProductoId = new javax.swing.JTextField();
        textProductoNombre = new javax.swing.JTextField();
        textProductoPrecio = new javax.swing.JTextField();
        textProductoStock = new javax.swing.JTextField();
        btnBuscarIdProducto = new javax.swing.JButton();
        btnGuardarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnLimpiarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        lbelProductoEstado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Activar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        textProductoCategoria = new javax.swing.JTextField();
        textProductoDescripcion = new javax.swing.JTextField();
        lbelProductoEst = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Precio actual:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Categoria:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Stock:");

        textProductoId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProductoIdKeyTyped(evt);
            }
        });

        textProductoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProductoNombreKeyTyped(evt);
            }
        });

        textProductoPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProductoPrecioKeyTyped(evt);
            }
        });

        textProductoStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProductoStockKeyTyped(evt);
            }
        });

        btnBuscarIdProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.jpg"))); // NOI18N
        btnBuscarIdProducto.setText("Buscar por ID");
        btnBuscarIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdProductoActionPerformed(evt);
            }
        });

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.jpg"))); // NOI18N
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnLimpiarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarProducto.setText("Limpiar");
        btnLimpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        jLabel9.setText("PRODUCTO");

        Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Activar.jpg"))); // NOI18N
        Activar.setText("Activar");
        Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        textProductoDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProductoDescripcionKeyTyped(evt);
            }
        });

        lbelProductoEst.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbelProductoEst.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbelProductoEst)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbelProductoEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Activar)
                                        .addGap(92, 92, 92)
                                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textProductoStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(textProductoCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textProductoPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textProductoDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textProductoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textProductoId, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarIdProducto)
                                    .addComponent(btnLimpiarProducto)
                                    .addComponent(btnActualizarProducto)
                                    .addComponent(btnGuardarProducto))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textProductoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdProducto))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizarProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textProductoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnLimpiarProducto)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnGuardarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textProductoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textProductoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbelProductoEst)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Activar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbelProductoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminarProducto)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdProductoActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(textProductoId.getText());
        Producto producto = productoData.buscarProductoId(id);
        if (producto != null) {
            textProductoId.setText(producto.getIdProducto() + "");
            textProductoNombre.setText(producto.getNombre() + "");
            textProductoDescripcion.setText(producto.getDescripcion() + "");
            textProductoPrecio.setText(producto.getPrecioActual() + "");
            textProductoCategoria.setText(producto.getCategoria() + "");
            textProductoStock.setText(producto.getStock() + "");
            if (producto.isEstado() == true) {
                lbelProductoEst.setText("Activo");
            } else if (producto.isEstado() == false) {
                lbelProductoEst.setText("Inactivo");
            }
        }

    }//GEN-LAST:event_btnBuscarIdProductoActionPerformed

    private void ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(textProductoId.getText());
        productoData.activarProducto(id);
        lbelProductoEst.setText("Activo");
    }//GEN-LAST:event_ActivarActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
        if (textProductoId != null) {
            int id = Integer.parseInt(textProductoId.getText());
            String nombre = textProductoNombre.getText();
            String descripcion = textProductoDescripcion.getText();
            String categoria = textProductoCategoria.getText();
            double precioActual = Double.parseDouble(textProductoPrecio.getText());
            int stock = Integer.parseInt(textProductoStock.getText());
            String activo = lbelProductoEst.getText();
            boolean estado;
            if ("Activo".equals(activo)) {
                estado = true;
            } else {
                estado = false;
            }
            Producto producto = new Producto(id, nombre, descripcion, categoria, precioActual, stock, estado);
            productoData.modificarProducto(producto);
        }
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
        // TODO add your handling code here:
        textProductoId.setText("");
        textProductoNombre.setText("");
        textProductoDescripcion.setText("");
        textProductoCategoria.setText("");
        textProductoPrecio.setText("");
        textProductoStock.setText("");
        lbelProductoEst.setText("");
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        // TODO add your handling code here:
        String nombre = textProductoNombre.getText();
        String descripcion = textProductoDescripcion.getText();
        String categoria = textProductoCategoria.getText();
        double precioActual = Double.parseDouble(textProductoPrecio.getText());
        int stock = Integer.parseInt(textProductoStock.getText());
        boolean estado = true;
        Producto producto = new Producto(nombre, descripcion, categoria, precioActual, stock, estado);
        productoData.guardarProducto(producto);
        textProductoId.setText(producto.getIdProducto() + "");
        lbelProductoEst.setText("Activo");
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        int Id = Integer.parseInt(textProductoId.getText());
        productoData.eliminarProducto(Id);
        lbelProductoEst.setText("Inactivo");
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void textProductoIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoIdKeyTyped
        int k = evt.getKeyChar();
        boolean numeros = k >= 48 && k <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            textProductoId.setText("");
            textProductoId.requestFocus();
        }
    }//GEN-LAST:event_textProductoIdKeyTyped

    private void textProductoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoNombreKeyTyped
        int k = evt.getKeyChar();

        boolean mayusculas = k >= 65 && k <= 90;
        boolean minusculas = k >= 97 && k <= 122;
        boolean espacio = k == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
            textProductoNombre.setText("");
            textProductoNombre.requestFocus();
        }
    }//GEN-LAST:event_textProductoNombreKeyTyped

    private void textProductoDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoDescripcionKeyTyped
        int k = evt.getKeyChar();
        boolean numeros = k >= 48 && k <= 57;
        boolean mayusculas = k >= 65 && k <= 90;
        boolean minusculas = k >= 97 && k <= 122;
        boolean espacio = k == 32;
        boolean diagonal = k == 47;
        boolean guion = k == 45;
        if (!(minusculas || mayusculas || espacio || diagonal || guion || numeros)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción del producto");
            textProductoDescripcion.setText("");
            textProductoDescripcion.requestFocus();
        }
    }//GEN-LAST:event_textProductoDescripcionKeyTyped

    private void textProductoPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoPrecioKeyTyped
         int k = evt.getKeyChar();
        boolean numeros = k >= 48 && k <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio del producto");
            textProductoPrecio.setText("");
            textProductoPrecio.requestFocus();
        }
    }//GEN-LAST:event_textProductoPrecioKeyTyped

    private void textProductoStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoStockKeyTyped
         int k = evt.getKeyChar();
        boolean numeros = k >= 48 && k <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el stock");
            textProductoStock.setText("");
            textProductoStock.requestFocus();
        }
    }//GEN-LAST:event_textProductoStockKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnBuscarIdProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnLimpiarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbelProductoEst;
    private javax.swing.JLabel lbelProductoEstado;
    private javax.swing.JTextField textProductoCategoria;
    private javax.swing.JTextField textProductoDescripcion;
    private javax.swing.JTextField textProductoId;
    private javax.swing.JTextField textProductoNombre;
    private javax.swing.JTextField textProductoPrecio;
    private javax.swing.JTextField textProductoStock;
    // End of variables declaration//GEN-END:variables
}
