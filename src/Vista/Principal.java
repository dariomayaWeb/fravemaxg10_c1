/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        EscritorioPrinc = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenuItem();
        mnuListaClientes = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenu();
        mnuListaVentas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnuProducto = new javax.swing.JMenuItem();
        mnuListaProductos = new javax.swing.JMenuItem();
        pro = new javax.swing.JMenu();
        mnuProveedores = new javax.swing.JMenuItem();
        mnuListaProveedores = new javax.swing.JMenuItem();
        Compras = new javax.swing.JMenu();
        mnuCompras = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        EscritorioPrinc.setMaximumSize(new java.awt.Dimension(800, 600));
        EscritorioPrinc.setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout EscritorioPrincLayout = new javax.swing.GroupLayout(EscritorioPrinc);
        EscritorioPrinc.setLayout(EscritorioPrincLayout);
        EscritorioPrincLayout.setHorizontalGroup(
            EscritorioPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioPrincLayout.setVerticalGroup(
            EscritorioPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu4.setText("Clientes");

        mnuClientes.setText("Administrar clientes");
        mnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientesActionPerformed(evt);
            }
        });
        jMenu4.add(mnuClientes);

        mnuListaClientes.setText("LIsta de clientes");
        mnuListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaClientesActionPerformed(evt);
            }
        });
        jMenu4.add(mnuListaClientes);

        jMenuBar2.add(jMenu4);

        Ventas.setText("Ventas");

        mnuListaVentas.setText("Administrar Ventas");
        mnuListaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaVentasActionPerformed(evt);
            }
        });
        Ventas.add(mnuListaVentas);

        jMenuBar2.add(Ventas);

        jMenu6.setText("Inventario");

        mnuProducto.setText("Registrar producto");
        mnuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductoActionPerformed(evt);
            }
        });
        jMenu6.add(mnuProducto);

        mnuListaProductos.setText("Lista de productos");
        mnuListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaProductosActionPerformed(evt);
            }
        });
        jMenu6.add(mnuListaProductos);

        jMenuBar2.add(jMenu6);

        pro.setText("Proveedor");

        mnuProveedores.setText("Administrar Proveedores");
        mnuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProveedoresActionPerformed(evt);
            }
        });
        pro.add(mnuProveedores);

        mnuListaProveedores.setText("Lista de Proveedores");
        mnuListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaProveedoresActionPerformed(evt);
            }
        });
        pro.add(mnuListaProveedores);

        jMenuBar2.add(pro);

        Compras.setText("Compras");

        mnuCompras.setText("Administrar Compras");
        mnuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuComprasActionPerformed(evt);
            }
        });
        Compras.add(mnuCompras);

        jMenuBar2.add(Compras);

        jMenu9.setText("Salir");

        mnuSalir.setText("Salir del Sistema");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu9.add(mnuSalir);

        jMenuBar2.add(jMenu9);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ClienteView clienteVw = new ClienteView();
        clienteVw.setVisible(true);
        EscritorioPrinc.add(clienteVw);
        EscritorioPrinc.moveToFront(clienteVw);

    }//GEN-LAST:event_mnuClientesActionPerformed

    private void mnuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductoActionPerformed
          // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ProductoView productoVw = new ProductoView();
        productoVw.setVisible(true);
        EscritorioPrinc.add(productoVw);
        EscritorioPrinc.moveToFront(productoVw);
    }//GEN-LAST:event_mnuProductoActionPerformed

    private void mnuListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaClientesActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ListaClientes listaClienteVw = new ListaClientes();
        listaClienteVw.setVisible(true);
        EscritorioPrinc.add(listaClienteVw);
        EscritorioPrinc.moveToFront(listaClienteVw);
    }//GEN-LAST:event_mnuListaClientesActionPerformed

    private void mnuListaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaVentasActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ListaVentas listaVentasView = new ListaVentas();
        listaVentasView.setVisible(true);
        EscritorioPrinc.add(listaVentasView);
        EscritorioPrinc.moveToFront(listaVentasView);
    }//GEN-LAST:event_mnuListaVentasActionPerformed

    private void mnuListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaProveedoresActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ListaProveedores listaProView = new ListaProveedores();
        listaProView.setVisible(true);
        EscritorioPrinc.add(listaProView);
        EscritorioPrinc.moveToFront(listaProView);
    }//GEN-LAST:event_mnuListaProveedoresActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProveedoresActionPerformed
        // TODO add your handling code here:
         EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ProveedorView ProView = new ProveedorView();
        ProView.setVisible(true);
        EscritorioPrinc.add(ProView);
        EscritorioPrinc.moveToFront(ProView);
        
    }//GEN-LAST:event_mnuProveedoresActionPerformed

    private void mnuListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaProductosActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        InventarioProductosView venView = new InventarioProductosView();
        venView.setVisible(true);
        EscritorioPrinc.add(venView);
        EscritorioPrinc.moveToFront(venView);
    }//GEN-LAST:event_mnuListaProductosActionPerformed

    private void mnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuComprasActionPerformed
        // TODO add your handling code here:
        EscritorioPrinc.removeAll();
        EscritorioPrinc.repaint();
        ListaCompras listaComp = new ListaCompras();
        listaComp.setVisible(true);
        EscritorioPrinc.add(listaComp);
        EscritorioPrinc.moveToFront(listaComp);
    }//GEN-LAST:event_mnuComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Compras;
    public static javax.swing.JDesktopPane EscritorioPrinc;
    private javax.swing.JMenu Ventas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenuItem mnuCompras;
    private javax.swing.JMenuItem mnuListaClientes;
    private javax.swing.JMenuItem mnuListaProductos;
    private javax.swing.JMenuItem mnuListaProveedores;
    private javax.swing.JMenuItem mnuListaVentas;
    private javax.swing.JMenuItem mnuProducto;
    private javax.swing.JMenuItem mnuProveedores;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu pro;
    // End of variables declaration//GEN-END:variables
}
