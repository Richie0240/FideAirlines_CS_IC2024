/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Funcionalidades;

import Clases.Usuario;
import Ventanas.Auxiliares.ConfirmarPreferencias;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanpa
 */
public class PreferenciasUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PreferenciasUsuario
     */
    int xmouse, ymouse;

    private String aerolineaSeleccionada;
    private String claseSeleccionada;
    private Boolean quiereComida;
    private Boolean quiereEntretenimiento;
    
    
    private Usuario user;

    public PreferenciasUsuario(Usuario user) {
        initComponents();
        this.user = user;
        this.setLocationRelativeTo(null);
    }

    public PreferenciasUsuario(String aerolineaSeleccionada, String claseSeleccionada, Boolean quiereComida, Boolean quiereEntretenimiento) {
        this.aerolineaSeleccionada = aerolineaSeleccionada;
        this.claseSeleccionada = claseSeleccionada;
        this.quiereComida = quiereComida;
        this.quiereEntretenimiento = quiereEntretenimiento;
    }

    public String getAerolineaSeleccionada() {
        return aerolineaSeleccionada;
    }

    public void setAerolineaSeleccionada(String aerolineaSeleccionada) {
        this.aerolineaSeleccionada = aerolineaSeleccionada;
    }

    public String getClaseSeleccionada() {
        return claseSeleccionada;
    }

    public void setClaseSeleccionada(String claseSeleccionada) {
        this.claseSeleccionada = claseSeleccionada;
    }

    public Boolean getQuiereComida() {
        return quiereComida;
    }

    public void setQuiereComida(Boolean quiereComida) {
        this.quiereComida = quiereComida;
    }

    public Boolean getQuiereEntretenimiento() {
        return quiereEntretenimiento;
    }

    public void setQuiereEntretenimiento(Boolean quiereEntretenimiento) {
        this.quiereEntretenimiento = quiereEntretenimiento;
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
        cbx_clases = new javax.swing.JComboBox<>();
        cbx_aerolineas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ckb_comida = new javax.swing.JCheckBox();
        ckb_entretenimiento = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbl_fideairlines = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnl_barra_salir = new javax.swing.JPanel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_SALIR = new javax.swing.JLabel();
        pnl_btn_confirmar = new javax.swing.JPanel();
        lbl_btn_confirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(43, 51, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_clases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No importa", "Primera clase", "Business", "Economica" }));
        cbx_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_clasesActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 164, 40));

        cbx_aerolineas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No importa", "Avianca", "Aeromexico", "American Airlines", "Volaris", "Delta Airlines" }));
        cbx_aerolineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_aerolineasActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_aerolineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 164, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione sus preferencias de vuelos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 480, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aerolineas: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clases de vuelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Servicios adicionales:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        ckb_comida.setBackground(new java.awt.Color(43, 51, 139));
        ckb_comida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ckb_comida.setForeground(new java.awt.Color(255, 255, 255));
        ckb_comida.setText("Comida");
        ckb_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_comidaActionPerformed(evt);
            }
        });
        jPanel1.add(ckb_comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        ckb_entretenimiento.setBackground(new java.awt.Color(43, 51, 139));
        ckb_entretenimiento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ckb_entretenimiento.setForeground(new java.awt.Color(255, 255, 255));
        ckb_entretenimiento.setText("Entretenimiento");
        ckb_entretenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_entretenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(ckb_entretenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fideairlines.setFont(new java.awt.Font("Roboto Medium", 2, 36)); // NOI18N
        lbl_fideairlines.setForeground(new java.awt.Color(42, 51, 139));
        lbl_fideairlines.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fideairlines.setText("FIDE AIRLINES");
        jPanel2.add(lbl_fideairlines, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 260, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/logo azul 2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 340, 500));

        pnl_barra_salir.setBackground(new java.awt.Color(43, 51, 139));
        pnl_barra_salir.setForeground(new java.awt.Color(43, 51, 139));
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

        pnl_btn_salir.setBackground(new java.awt.Color(43, 51, 139));
        pnl_btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_btn_salirMouseEntered(evt);
            }
        });

        lbl_btn_SALIR.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lbl_btn_SALIR.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(pnl_barra_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnl_btn_confirmar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_confirmar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_confirmar.setText("CONFIRMAR");
        lbl_btn_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_confirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_confirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_confirmarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_confirmarLayout = new javax.swing.GroupLayout(pnl_btn_confirmar);
        pnl_btn_confirmar.setLayout(pnl_btn_confirmarLayout);
        pnl_btn_confirmarLayout.setHorizontalGroup(
            pnl_btn_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnl_btn_confirmarLayout.setVerticalGroup(
            pnl_btn_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckb_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_comidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb_comidaActionPerformed

    private void ckb_entretenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_entretenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb_entretenimientoActionPerformed

    private void lbl_btn_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lbl_btn_SALIRMouseClicked

    private void lbl_btn_SALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseEntered
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(Color.WHITE);
        lbl_btn_SALIR.setForeground(Color.BLUE);
    }//GEN-LAST:event_lbl_btn_SALIRMouseEntered

    private void lbl_btn_SALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseExited
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(new Color(43, 51, 139));
        lbl_btn_SALIR.setForeground(Color.WHITE);
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

    private void lbl_btn_confirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_confirmarMouseEntered
        pnl_btn_confirmar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_confirmarMouseEntered

    private void lbl_btn_confirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_confirmarMouseExited
        pnl_btn_confirmar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_confirmarMouseExited

    private void lbl_btn_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_confirmarMouseClicked

        aerolineaSeleccionada = (String) cbx_aerolineas.getSelectedItem();
        claseSeleccionada = (String) cbx_clases.getSelectedItem();
        quiereComida = ckb_comida.isSelected();
        quiereEntretenimiento = ckb_entretenimiento.isSelected();
        
        
        
        user.setAerolineaspreferidas(aerolineaSeleccionada);
        user.setClasepreferida(claseSeleccionada);
        user.setComida(quiereComida ? "Si" : "No");
        user.setEntretenimiento(quiereEntretenimiento ? "Si" : "No");
        
        
        
        
        


        
        ConfirmarPreferencias n = new ConfirmarPreferencias(user);
        n.setVisible(true);
        
        this.dispose();
        
        


    }//GEN-LAST:event_lbl_btn_confirmarMouseClicked

    private void cbx_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_clasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_clasesActionPerformed

    private void cbx_aerolineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_aerolineasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_aerolineasActionPerformed

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
            java.util.logging.Logger.getLogger(PreferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreferenciasUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_aerolineas;
    private javax.swing.JComboBox<String> cbx_clases;
    private javax.swing.JCheckBox ckb_comida;
    private javax.swing.JCheckBox ckb_entretenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_btn_SALIR;
    private javax.swing.JLabel lbl_btn_confirmar;
    private javax.swing.JLabel lbl_fideairlines;
    private javax.swing.JPanel pnl_barra_salir;
    private javax.swing.JPanel pnl_btn_confirmar;
    private javax.swing.JPanel pnl_btn_salir;
    // End of variables declaration//GEN-END:variables
}
