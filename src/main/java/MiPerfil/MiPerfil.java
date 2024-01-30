/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MiPerfil;

import Clases.Reserva;
import Clases.Usuario;
import Ventanas.VentanaPrincipal.VentanaPrincipal;
import java.awt.Color;

/**
 *
 * @author ricar
 */
public class MiPerfil extends javax.swing.JFrame {

    private int xmouse, ymouse;

    private Usuario user;
    private Reserva reserva;

    public MiPerfil(Usuario user,Reserva reserva) {
        initComponents();
        
        this.setLocationRelativeTo(null);

        this.user = user;

        this.reserva = reserva;
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
        pnl_btn_informacionpersonal = new javax.swing.JPanel();
        lbl_btn_Informacion_personal = new javax.swing.JLabel();
        pnl_btn_mis_vuelos = new javax.swing.JPanel();
        lbl_btn_misvuelos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnl_btn_chat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_barra_salir = new javax.swing.JPanel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_SALIR = new javax.swing.JLabel();
        pnl_btn_Volver = new javax.swing.JPanel();
        lbl_btn_Volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_btn_informacionpersonal.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_Informacion_personal.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        lbl_btn_Informacion_personal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_Informacion_personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_Informacion_personal.setText("Informacion Personal");
        lbl_btn_Informacion_personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_Informacion_personalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_Informacion_personalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_Informacion_personalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_informacionpersonalLayout = new javax.swing.GroupLayout(pnl_btn_informacionpersonal);
        pnl_btn_informacionpersonal.setLayout(pnl_btn_informacionpersonalLayout);
        pnl_btn_informacionpersonalLayout.setHorizontalGroup(
            pnl_btn_informacionpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Informacion_personal, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        pnl_btn_informacionpersonalLayout.setVerticalGroup(
            pnl_btn_informacionpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Informacion_personal, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_informacionpersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, -1));

        pnl_btn_mis_vuelos.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_misvuelos.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        lbl_btn_misvuelos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_misvuelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_misvuelos.setText("Mis Vuelos");
        lbl_btn_misvuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_misvuelosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_misvuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_misvuelosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_mis_vuelosLayout = new javax.swing.GroupLayout(pnl_btn_mis_vuelos);
        pnl_btn_mis_vuelos.setLayout(pnl_btn_mis_vuelosLayout);
        pnl_btn_mis_vuelosLayout.setHorizontalGroup(
            pnl_btn_mis_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_misvuelos, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        pnl_btn_mis_vuelosLayout.setVerticalGroup(
            pnl_btn_mis_vuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_misvuelos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_mis_vuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 360, -1));

        jPanel5.setBackground(new java.awt.Color(43, 51, 139));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 360, -1));

        pnl_btn_chat.setBackground(new java.awt.Color(43, 51, 139));

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chat de soporte");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_chatLayout = new javax.swing.GroupLayout(pnl_btn_chat);
        pnl_btn_chat.setLayout(pnl_btn_chatLayout);
        pnl_btn_chatLayout.setHorizontalGroup(
            pnl_btn_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        pnl_btn_chatLayout.setVerticalGroup(
            pnl_btn_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 360, -1));

        pnl_barra_salir.setBackground(new java.awt.Color(255, 255, 255));
        pnl_barra_salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barra_salirMouseDragged(evt);
            }
        });
        pnl_barra_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barra_salirMousePressed(evt);
            }
        });

        pnl_btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        pnl_btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_btn_salirMouseEntered(evt);
            }
        });

        lbl_btn_SALIR.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lbl_btn_SALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_SALIR.setText("X");
        lbl_btn_SALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_SALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_salirLayout = new javax.swing.GroupLayout(pnl_btn_salir);
        pnl_btn_salir.setLayout(pnl_btn_salirLayout);
        pnl_btn_salirLayout.setHorizontalGroup(
            pnl_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btn_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_btn_SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_btn_salirLayout.setVerticalGroup(
            pnl_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btn_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_btn_SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_barra_salirLayout = new javax.swing.GroupLayout(pnl_barra_salir);
        pnl_barra_salir.setLayout(pnl_barra_salirLayout);
        pnl_barra_salirLayout.setHorizontalGroup(
            pnl_barra_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barra_salirLayout.createSequentialGroup()
                .addComponent(pnl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );
        pnl_barra_salirLayout.setVerticalGroup(
            pnl_barra_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barra_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnl_barra_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pnl_btn_Volver.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_Volver.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbl_btn_Volver.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_Volver.setText("Volver");
        lbl_btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_VolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_VolverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_VolverLayout = new javax.swing.GroupLayout(pnl_btn_Volver);
        pnl_btn_Volver.setLayout(pnl_btn_VolverLayout);
        pnl_btn_VolverLayout.setHorizontalGroup(
            pnl_btn_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        pnl_btn_VolverLayout.setVerticalGroup(
            pnl_btn_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_btn_Informacion_personalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_Informacion_personalMouseEntered
        pnl_btn_informacionpersonal.setBackground(new Color(79, 93, 255));

    }//GEN-LAST:event_lbl_btn_Informacion_personalMouseEntered

    private void lbl_btn_Informacion_personalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_Informacion_personalMouseExited
        pnl_btn_informacionpersonal.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_Informacion_personalMouseExited

    private void lbl_btn_misvuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_misvuelosMouseClicked
       Historialreservas n = new Historialreservas(user, reserva);
       n.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbl_btn_misvuelosMouseClicked

    private void lbl_btn_misvuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_misvuelosMouseEntered
        pnl_btn_mis_vuelos.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_misvuelosMouseEntered

    private void lbl_btn_misvuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_misvuelosMouseExited
        pnl_btn_mis_vuelos.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_misvuelosMouseExited

    private void lbl_btn_Informacion_personalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_Informacion_personalMouseClicked
        this.setVisible(false);
        InformacionPersonal n = new InformacionPersonal(user,reserva);
        n.setVisible(true);
    }//GEN-LAST:event_lbl_btn_Informacion_personalMouseClicked

    private void lbl_btn_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        VentanaPrincipal n = new VentanaPrincipal(user,null,reserva);

    }//GEN-LAST:event_lbl_btn_SALIRMouseClicked

    private void lbl_btn_SALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseEntered
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(Color.blue);
        lbl_btn_SALIR.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_btn_SALIRMouseEntered

    private void lbl_btn_SALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseExited
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(Color.white);
        lbl_btn_SALIR.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_btn_SALIRMouseExited

    private void pnl_btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_btn_salirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_btn_salirMouseEntered

    private void pnl_barra_salirMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salirMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barra_salirMouseDragged

    private void pnl_barra_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salirMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barra_salirMousePressed

    private void lbl_btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_VolverMouseClicked
        this.dispose();
        
       // TODO add your handling code here:
    }//GEN-LAST:event_lbl_btn_VolverMouseClicked

    private void lbl_btn_VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_VolverMouseEntered
        pnl_btn_Volver.setBackground(new Color(79, 93, 255));// TODO add your handling code here:
    }//GEN-LAST:event_lbl_btn_VolverMouseEntered

    private void lbl_btn_VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_VolverMouseExited
        pnl_btn_Volver.setBackground(new Color(43, 51, 139));        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_btn_VolverMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        
        pnl_btn_chat.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        
        pnl_btn_chat.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPerfil(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_btn_Informacion_personal;
    private javax.swing.JLabel lbl_btn_SALIR;
    private javax.swing.JLabel lbl_btn_Volver;
    private javax.swing.JLabel lbl_btn_misvuelos;
    private javax.swing.JPanel pnl_barra_salir;
    private javax.swing.JPanel pnl_btn_Volver;
    private javax.swing.JPanel pnl_btn_chat;
    private javax.swing.JPanel pnl_btn_informacionpersonal;
    private javax.swing.JPanel pnl_btn_mis_vuelos;
    private javax.swing.JPanel pnl_btn_salir;
    // End of variables declaration//GEN-END:variables
}
