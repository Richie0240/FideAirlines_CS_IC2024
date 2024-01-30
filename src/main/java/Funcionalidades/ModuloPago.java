/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Funcionalidades;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;
import Reservas.Reservar;
import Ventanas.Auxiliares.ReservaCompleta;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricar
 */
public class ModuloPago extends javax.swing.JFrame {

    /**
     * Creates new form ModuloPago
     */
    private Double costo;
    int xmouse, ymouse;

    private Usuario user;
    private Vuelos vuelo;
    private Reserva reserva;

    public ModuloPago(Usuario user, Vuelos vuelo, Reserva reserva, Double costo) {
        initComponents();
        this.user = user;
        this.vuelo = vuelo;
        this.reserva = reserva;
        this.costo = costo;
        this.setLocationRelativeTo(null);
        lbl_costo.setText(costo + "");

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
        pnl_barra_salir15 = new javax.swing.JPanel();
        pnl_btn_salir15 = new javax.swing.JPanel();
        lbl_btn_SALIR15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_btn_cancelar = new javax.swing.JPanel();
        lbl_volvel = new javax.swing.JLabel();
        pnl_btn_Pagar = new javax.swing.JPanel();
        lbl_btn_pagar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_costo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 51, 139));

        pnl_barra_salir15.setBackground(new java.awt.Color(43, 51, 139));
        pnl_barra_salir15.setForeground(new java.awt.Color(43, 51, 139));
        pnl_barra_salir15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barra_salir15MouseDragged(evt);
            }
        });
        pnl_barra_salir15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barra_salir15MousePressed(evt);
            }
        });

        pnl_btn_salir15.setBackground(new java.awt.Color(43, 51, 139));
        pnl_btn_salir15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_btn_salir15MouseEntered(evt);
            }
        });

        lbl_btn_SALIR15.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lbl_btn_SALIR15.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_SALIR15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_SALIR15.setText("X");
        lbl_btn_SALIR15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_SALIR15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIR15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIR15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_SALIR15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_salir15Layout = new javax.swing.GroupLayout(pnl_btn_salir15);
        pnl_btn_salir15.setLayout(pnl_btn_salir15Layout);
        pnl_btn_salir15Layout.setHorizontalGroup(
            pnl_btn_salir15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btn_salir15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_btn_SALIR15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_btn_salir15Layout.setVerticalGroup(
            pnl_btn_salir15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btn_salir15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_btn_SALIR15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_barra_salir15Layout = new javax.swing.GroupLayout(pnl_barra_salir15);
        pnl_barra_salir15.setLayout(pnl_barra_salir15Layout);
        pnl_barra_salir15Layout.setHorizontalGroup(
            pnl_barra_salir15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_barra_salir15Layout.createSequentialGroup()
                .addComponent(pnl_btn_salir15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_barra_salir15Layout.setVerticalGroup(
            pnl_barra_salir15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barra_salir15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_btn_salir15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel1.setText("Confirmar reserva");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, 57));

        pnl_btn_cancelar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_volvel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_volvel.setForeground(new java.awt.Color(255, 255, 255));
        lbl_volvel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_volvel.setText("Volver");
        lbl_volvel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_volvelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_volvelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_volvelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_cancelarLayout = new javax.swing.GroupLayout(pnl_btn_cancelar);
        pnl_btn_cancelar.setLayout(pnl_btn_cancelarLayout);
        pnl_btn_cancelarLayout.setHorizontalGroup(
            pnl_btn_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_volvel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        pnl_btn_cancelarLayout.setVerticalGroup(
            pnl_btn_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_volvel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 237, -1, -1));

        pnl_btn_Pagar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_pagar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_pagar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_pagar.setText("Pagar");
        lbl_btn_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_pagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_pagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_pagarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_PagarLayout = new javax.swing.GroupLayout(pnl_btn_Pagar);
        pnl_btn_Pagar.setLayout(pnl_btn_PagarLayout);
        pnl_btn_PagarLayout.setHorizontalGroup(
            pnl_btn_PagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_btn_PagarLayout.setVerticalGroup(
            pnl_btn_PagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_btn_Pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 237, -1, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/tarjeta200.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setText("Costo: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_costo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_costo.setText("jLabel4");
        jPanel2.add(lbl_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addComponent(pnl_barra_salir15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_barra_salir15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_btn_SALIR15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIR15MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Reservar r = new Reservar(user, vuelo, reserva);
        r.setVisible(true);
    }//GEN-LAST:event_lbl_btn_SALIR15MouseClicked

    private void lbl_btn_SALIR15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIR15MouseEntered
        // TODO add your handling code here:
        pnl_btn_salir15.setBackground(Color.WHITE);
        lbl_btn_SALIR15.setForeground(Color.BLUE);
    }//GEN-LAST:event_lbl_btn_SALIR15MouseEntered

    private void lbl_btn_SALIR15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIR15MouseExited
        // TODO add your handling code here:
        pnl_barra_salir15.setBackground(new Color(43, 51, 139));
        lbl_btn_SALIR15.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_btn_SALIR15MouseExited

    private void pnl_btn_salir15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_btn_salir15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_btn_salir15MouseEntered

    private void pnl_barra_salir15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salir15MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barra_salir15MouseDragged

    private void pnl_barra_salir15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salir15MousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barra_salir15MousePressed

    private void lbl_volvelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_volvelMouseEntered
        // TODO add your handling code here:

        pnl_btn_cancelar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_volvelMouseEntered

    private void lbl_volvelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_volvelMouseExited
        // TODO add your handling code here:
        pnl_btn_cancelar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_volvelMouseExited

    private void lbl_volvelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_volvelMouseClicked
        this.dispose();
        Reservar r = new Reservar(user, vuelo, reserva);
        r.setVisible(true);
    }//GEN-LAST:event_lbl_volvelMouseClicked

    private void lbl_btn_pagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_pagarMouseEntered
        // TODO add your handling code here:
        pnl_btn_Pagar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_pagarMouseEntered

    private void lbl_btn_pagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_pagarMouseExited
        // TODO add your handling code here:

        pnl_btn_Pagar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_pagarMouseExited

    private void lbl_btn_pagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_pagarMouseClicked
        reserva.setEstado(true);
        vuelo.setTotalasientos(150-reserva.getCantAsientos());
        try {
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                    "root",
                    "Fide123.");

            String Insert_Reserva = "INSERT INTO reserva(correo,origen,destino,fechasalida,asientos,estado)"
                    + "VALUES(?,?,?,?,?,?)";
            PreparedStatement nuevoStatementePreparado = nuevaConexion.prepareStatement(Insert_Reserva);
            
            nuevoStatementePreparado.setString(1, user.getCorreoelectronico());
            nuevoStatementePreparado.setString(2, reserva.getOrigen());
            nuevoStatementePreparado.setString(3, reserva.getDestino());
            nuevoStatementePreparado.setString(4, reserva.getFechaVuelo());
            nuevoStatementePreparado.setString(5, reserva.getAsiento());
            nuevoStatementePreparado.setBoolean(6, reserva.getEstado());
            
            nuevoStatementePreparado.execute();
            
            String Updateasientos = "UPDATE vuelos SET asientos = ? WHERE origen = ? AND destino = ? AND fechasalida = ? AND horasalida = ?";
            
            
            PreparedStatement nuevoStatementUpdate = nuevaConexion.prepareStatement(Updateasientos);
            
            nuevoStatementUpdate.setInt(1, vuelo.getTotalasientos());
            
            nuevoStatementUpdate.setString(2, reserva.getOrigen());
            nuevoStatementUpdate.setString(3, reserva.getDestino());
            nuevoStatementUpdate.setString(4, vuelo.getFechaSalida());
            nuevoStatementUpdate.setString(5, vuelo.getHoraSalida());
            
            nuevoStatementUpdate.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ModuloPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        ReservaCompleta rc = new ReservaCompleta(user, vuelo, reserva);
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_btn_pagarMouseClicked

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
            java.util.logging.Logger.getLogger(ModuloPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloPago(null, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_btn_SALIR15;
    private javax.swing.JLabel lbl_btn_pagar;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_volvel;
    private javax.swing.JPanel pnl_barra_salir15;
    private javax.swing.JPanel pnl_btn_Pagar;
    private javax.swing.JPanel pnl_btn_cancelar;
    private javax.swing.JPanel pnl_btn_salir15;
    // End of variables declaration//GEN-END:variables
}
