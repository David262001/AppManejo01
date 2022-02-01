
package InterfazPrincipal;

import InterfazAdmin.IniciarAdmin;
import InterfazUsuario.Registro;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class PrincipalEjecutable extends javax.swing.JFrame {

 
    public PrincipalEjecutable() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fondo4.jfif"));
        Image image = icon.getImage();
        jdskPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jbtnAdmin = new javax.swing.JButton();
        jbtnUsuario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnAdmin.setBackground(new java.awt.Color(0, 0, 102));
        jbtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdmin.setText("ADMINISTRADOR");
        jbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminActionPerformed(evt);
            }
        });

        jbtnUsuario.setBackground(new java.awt.Color(0, 0, 102));
        jbtnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUsuario.setText("USUARIO");
        jbtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuarioActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Si usted es un administrador ingrese aqui....");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Si usted es un usuario ingrese aqui....");

        jdskPrincipal.setLayer(jbtnAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdskPrincipal.setLayer(jbtnUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdskPrincipal.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdskPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdskPrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdskPrincipalLayout = new javax.swing.GroupLayout(jdskPrincipal);
        jdskPrincipal.setLayout(jdskPrincipalLayout);
        jdskPrincipalLayout.setHorizontalGroup(
            jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdskPrincipalLayout.createSequentialGroup()
                .addGroup(jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdskPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdskPrincipalLayout.createSequentialGroup()
                        .addGroup(jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdskPrincipalLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(jdskPrincipalLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnAdmin))))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jdskPrincipalLayout.setVerticalGroup(
            jdskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdskPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAdmin)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jMenu1.setText("APLICACION DE GESTION DE USUARIO Y ACTIVIDADES");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdskPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdskPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminActionPerformed
      IniciarAdmin ia = new IniciarAdmin();
       
      ia.setVisible(true);
    }//GEN-LAST:event_jbtnAdminActionPerformed

    private void jbtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuarioActionPerformed
       Registro r =new Registro();
   
       r.setVisible(true);
    }//GEN-LAST:event_jbtnUsuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalEjecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalEjecutable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalEjecutable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbtnAdmin;
    private javax.swing.JButton jbtnUsuario;
    private javax.swing.JDesktopPane jdskPrincipal;
    // End of variables declaration//GEN-END:variables
}
