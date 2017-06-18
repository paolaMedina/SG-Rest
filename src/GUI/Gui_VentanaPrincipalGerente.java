/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Paola
 */
public class Gui_VentanaPrincipalGerente extends javax.swing.JFrame {

    public Gui_login gui_login;
    /**
     * Creates new form Gui_VentanaPrincipal
     */
    public Gui_VentanaPrincipalGerente(Gui_login login) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.gui_login = login;
    
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
        jButtonReportes = new javax.swing.JButton();
        jButtonEmpleados = new javax.swing.JButton();
        jButtonProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal SG_REST");

        jPanel1.setLayout(null);

        jButtonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.png"))); // NOI18N
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReportes);
        jButtonReportes.setBounds(400, 100, 130, 130);

        jButtonEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1 persona.png"))); // NOI18N
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEmpleados);
        jButtonEmpleados.setBounds(40, 100, 130, 130);

        jButtonProductos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1 productos.png"))); // NOI18N
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProductos);
        jButtonProductos.setBounds(210, 100, 140, 130);

        jLabel3.setText("Reportes");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 230, 70, 14);

        jLabel1.setText("Items del Menú");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 230, 110, 14);

        jLabel5.setText("Empleados");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 230, 90, 14);

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Botón_apagar.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir);
        jButtonSalir.setBounds(490, 20, 60, 60);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoPrincipal.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 590, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
        // TODO add your handling code here:
        try{
         Gui_empleado empleado =new Gui_empleado(this);
    
         empleado.setVisible(true);
         this.dispose();
         
       }catch(Exception e){}
      
    }//GEN-LAST:event_jButtonEmpleadosActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        try{
         Gui_producto producto =new Gui_producto(this);
    
         producto.setVisible(true);
         this.dispose();
         
       }catch(Exception e){}
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        try{
         Gui_VerReportes reportes = new Gui_VerReportes(this);
    
         reportes.setVisible(true);
         this.dispose();
         
       }catch(Exception e){
       System.out.println(e);}
        
    }//GEN-LAST:event_jButtonReportesActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false); 
        
        Gui_otros gui_Otros = new Gui_otros(this);
        
        gui_Otros.setVisible(true); 
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_VentanaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_VentanaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_VentanaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_VentanaPrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_VentanaPrincipalGerente(new Gui_login ()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
