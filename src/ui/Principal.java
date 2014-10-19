
package ui;

import Conexiones.InterfazConexion;
import cifrado.AccCifrado;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cooper15
 */
public class Principal extends javax.swing.JFrame {
     String  nombreUsuario;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuContextual = new javax.swing.JPopupMenu();
        menuContextualEliminar = new javax.swing.JMenuItem();
        menu_contextual_ver_Pass = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        bntNuevoPass = new javax.swing.JButton();
        bntVisualizarActualizar = new javax.swing.JButton();
        refrescar_bnt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPasswords = new javax.swing.JTable();
        jpBarraDeEstado = new javax.swing.JPanel();
        estado_lbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiNuevoUsuario = new javax.swing.JMenuItem();
        jmiEliminarUsuario = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmEditar = new javax.swing.JMenu();

        menuContextual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuContextualMousePressed(evt);
            }
        });

        menuContextualEliminar.setText("Eliminar");
        menuContextualEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuContextualEliminarMousePressed(evt);
            }
        });
        menuContextual.add(menuContextualEliminar);

        menu_contextual_ver_Pass.setText("Ver contraseña");
        menu_contextual_ver_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_contextual_ver_PassActionPerformed(evt);
            }
        });
        menuContextual.add(menu_contextual_ver_Pass);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de contraseñas");
        setName("Principal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);

        bntNuevoPass.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/img/list-add.png")); // NOI18N
        bntNuevoPass.setFocusable(false);
        bntNuevoPass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntNuevoPass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntNuevoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoPassActionPerformed(evt);
            }
        });
        jToolBar1.add(bntNuevoPass);

        bntVisualizarActualizar.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/img/visualization.png")); // NOI18N
        bntVisualizarActualizar.setFocusable(false);
        bntVisualizarActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntVisualizarActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntVisualizarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVisualizarActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(bntVisualizarActualizar);

        refrescar_bnt.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/GestorContraseña/img/view-refresh.png")); // NOI18N
        refrescar_bnt.setFocusable(false);
        refrescar_bnt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refrescar_bnt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refrescar_bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescar_bntActionPerformed(evt);
            }
        });
        jToolBar1.add(refrescar_bnt);

        jtPasswords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtPasswords);

        jpBarraDeEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jpBarraDeEstadoLayout = new javax.swing.GroupLayout(jpBarraDeEstado);
        jpBarraDeEstado.setLayout(jpBarraDeEstadoLayout);
        jpBarraDeEstadoLayout.setHorizontalGroup(
            jpBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraDeEstadoLayout.createSequentialGroup()
                .addComponent(estado_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpBarraDeEstadoLayout.setVerticalGroup(
            jpBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estado_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
        );

        jmArchivo.setText("Archivo");

        jmiNuevoUsuario.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/GestorContraseña/img/contact-new.png")); // NOI18N
        jmiNuevoUsuario.setText("Nuevo Usuario");
        jmiNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoUsuarioActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiNuevoUsuario);

        jmiEliminarUsuario.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/GestorContraseña/img/process-stop.png")); // NOI18N
        jmiEliminarUsuario.setText("Eliminar Usuario");
        jmArchivo.add(jmiEliminarUsuario);

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiSalir.setIcon(new javax.swing.ImageIcon("/home/cooper15/NetBeansProjects/GestorContraseña/img/window-close.png")); // NOI18N
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiSalir);

        jMenuBar1.add(jmArchivo);

        jmEditar.setText("Editar");
        jMenuBar1.add(jmEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpBarraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBarraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void bntNuevoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoPassActionPerformed
        AgregarPass dialogAgregar = new AgregarPass(this, true);
        dialogAgregar.setNombreUsuario(nombreUsuario);
        dialogAgregar.setVisible(true);
    }//GEN-LAST:event_bntNuevoPassActionPerformed

    private void jmiNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoUsuarioActionPerformed
        AgregarUsuario dialogNewUsuario = new AgregarUsuario(this,true);
        dialogNewUsuario.setVisible(true);
    }//GEN-LAST:event_jmiNuevoUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Llenar la tabla con los datos resultantes del ResultSet...
        jtPasswords.setComponentPopupMenu(menuContextual);
        
        refrescar_tabla();
       
    }//GEN-LAST:event_formWindowOpened
    private boolean celdaPresionada(){
        boolean presionada = false;
        int fila = jtPasswords.getSelectedRow();
        int columna = jtPasswords.getSelectedColumn();
            
        if (fila != -1 && columna != -1 )
            presionada = true;
            
        return presionada;
    
    }
    
    private void refrescar_tabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        this.jtPasswords.setModel(modeloTabla);
        
        InterfazConexion nuevaConexion = new InterfazConexion();
        ResultSet resultado = nuevaConexion.ObtieneDatosPassword(nombreUsuario);
        
        String nombreColumnas [] = {"id", "Usuario", "Contraseña", "Nombre sitio", "URL sitio","Vencimiento"};
        for (int i=0; i<=5; i++)
            modeloTabla.addColumn(nombreColumnas[i]);
       
        try{
             while(resultado.next()){
                 Object[] fila = new Object[6];
                 for (int i = 0; i < 6; i++) {
                            fila[i]=resultado.getObject(i+1);
                 }
                 modeloTabla.addRow(fila);
            }
        }
        catch(Exception e){
        }
        // Esconder el campo Id de la tabla password.
       jtPasswords.getColumnModel().getColumn(0).setMaxWidth(0);
       jtPasswords.getColumnModel().getColumn(0).setMinWidth(0);
       jtPasswords.getColumnModel().getColumn(0).setPreferredWidth(0);
       // Esconder el campo password 
       jtPasswords.getColumnModel().getColumn(2).setMaxWidth(0);
       jtPasswords.getColumnModel().getColumn(2).setMinWidth(0);
       jtPasswords.getColumnModel().getColumn(2).setPreferredWidth(0);
    }
    
    
    private void bntVisualizarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVisualizarActualizarActionPerformed
        int fila, columna;
        fila = jtPasswords.getSelectedRow();
        //columna = jtPasswords.getSelectedColumn();
       if (jtPasswords.isRowSelected(fila)){
            EditarPass editar = new EditarPass(this,true);
            
            editar.setNombreUsuario(nombreUsuario);
            editar.setId((int) jtPasswords.getModel().getValueAt(fila, 0));
            editar.setContrasenaUsuario(jtPasswords.getModel().getValueAt(fila, 2).toString());
            editar.setNombreSitio(jtPasswords.getModel().getValueAt(fila, 3).toString());
            editar.setUrlSitio(jtPasswords.getModel().getValueAt(fila, 4).toString());
            editar.setVisible(true);
        }
       else 
           JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila");
        
    }//GEN-LAST:event_bntVisualizarActualizarActionPerformed

    private void menuContextualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuContextualMousePressed
       
    }//GEN-LAST:event_menuContextualMousePressed

    private void menuContextualEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuContextualEliminarMousePressed
        if(!celdaPresionada())
            JOptionPane.showMessageDialog(this, "No selecionó ninguna celda");
        else{
            InterfazConexion inte_con = new InterfazConexion();
            int fila = numero_fila();
            String id = jtPasswords.getModel().getValueAt(fila, 0).toString();
            inte_con.eliminar_password(id);
            estado_lbl.setText("Contraseña eliminada");
        }       
    }//GEN-LAST:event_menuContextualEliminarMousePressed

    private int numero_fila(){
       return jtPasswords.getSelectedRow();
    }
    private void refrescar_bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescar_bntActionPerformed
        refrescar_tabla();
        estado_lbl.setText("");
    }//GEN-LAST:event_refrescar_bntActionPerformed

    private void menu_contextual_ver_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_contextual_ver_PassActionPerformed
        if (celdaPresionada()){
            int fila = numero_fila();
            String pass_a_copiar = jtPasswords.getModel().getValueAt(fila, 2).toString();
            VerPassword ver_password = new VerPassword(this, true);
            AccCifrado descifrar = new AccCifrado();
            pass_a_copiar = descifrar.descifrar_password(pass_a_copiar);
            ver_password.setPassword(pass_a_copiar);
            ver_password.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "No selecionó ninguna celda");
    }//GEN-LAST:event_menu_contextual_ver_PassActionPerformed
    public void setNombreUsuario( String nombreUsuario){
        // Usuario logeado
        this.nombreUsuario = nombreUsuario;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
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
    private javax.swing.JButton bntNuevoPass;
    private javax.swing.JButton bntVisualizarActualizar;
    private javax.swing.JLabel estado_lbl;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenuItem jmiEliminarUsuario;
    private javax.swing.JMenuItem jmiNuevoUsuario;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JPanel jpBarraDeEstado;
    private javax.swing.JTable jtPasswords;
    private javax.swing.JPopupMenu menuContextual;
    private javax.swing.JMenuItem menuContextualEliminar;
    private javax.swing.JMenuItem menu_contextual_ver_Pass;
    private javax.swing.JButton refrescar_bnt;
    // End of variables declaration//GEN-END:variables
}
