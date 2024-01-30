/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas.Auxiliares;

import java.awt.Color;

/**
 *
 * @author ricar
 */
public class RegistroCompleto extends javax.swing.JFrame {

    /**
     * Creates new form RegistroCompleto
     */
    int xmouse, ymouse;

    public RegistroCompleto() {
        initComponents();
        this.setLocationRelativeTo(null);
        Hilo_RegistroCompleto starthilo = new Hilo_RegistroCompleto(this);
        starthilo.start();
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
        lbl_error = new javax.swing.JLabel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_salir = new javax.swing.JLabel();
        pnl_barra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_error.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_error.setText("Registro completo, ahora inicie sesión por favor");
        jPanel1.add(lbl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 60));

        pnl_btn_salir.setBackground(new java.awt.Color(255, 255, 255));

        lbl_btn_salir.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lbl_btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_salir.setText("X");
        lbl_btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_salirLayout = new javax.swing.GroupLayout(pnl_btn_salir);
        pnl_btn_salir.setLayout(pnl_btn_salirLayout);
        pnl_btn_salirLayout.setHorizontalGroup(
            pnl_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btn_salirLayout.createSequentialGroup()
                .addComponent(lbl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_btn_salirLayout.setVerticalGroup(
            pnl_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        pnl_barra.setBackground(new java.awt.Color(255, 255, 255));
        pnl_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barraMouseDragged(evt);
            }
        });
        pnl_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGO azul.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_salirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lbl_btn_salirMouseClicked

    private void lbl_btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_salirMouseEntered
        // TODO add your handling code here:

        pnl_btn_salir.setBackground(Color.blue);
        lbl_btn_salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_btn_salirMouseEntered

    private void lbl_btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_salirMouseExited
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(Color.white);
        lbl_btn_salir.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_btn_salirMouseExited

    private void pnl_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMouseDragged
        // TODO add your handling code here:

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barraMouseDragged

    private void pnl_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barraMousePressed

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
            java.util.logging.Logger.getLogger(RegistroCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCompleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_btn_salir;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JPanel pnl_btn_salir;
    // End of variables declaration//GEN-END:variables
}
