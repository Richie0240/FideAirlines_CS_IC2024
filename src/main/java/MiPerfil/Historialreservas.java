/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MiPerfil;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;
import Excepciones.noResultadoExcepcion;
import Ventanas.Auxiliares.ReservacionCancelada;
import Ventanas.Auxiliares.ReservacionyaCancelada;
import Ventanas.VentanaPrincipal.VentanaPrincipal;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanpa
 */
public class Historialreservas extends javax.swing.JFrame {

    /**
     * Creates new form Historialreservas
     */
    private Usuario user;
    private Reserva reserva;

    int xmouse, ymouse;

    DefaultTableModel modeloHistorial = new DefaultTableModel();

    public Historialreservas(Usuario user, Reserva reserva) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.reserva = reserva;

        modeloHistorial.addColumn("Origen");
        modeloHistorial.addColumn("Destino");
        modeloHistorial.addColumn("Fecha de vuelo");
        modeloHistorial.addColumn("Asientos");
        modeloHistorial.addColumn("Estado");

        refrescarTablas();

        tbl_historial.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent Mouse_evt) {

                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {

                    elegirReserva();

                }
            }
        });

    }

    public void elegirReserva() {

        Reserva reserva = new Reserva();

        String estado = (String) tbl_historial.getValueAt(tbl_historial.getSelectedRow(), 4);

        boolean bestado = estado.equalsIgnoreCase("Activa");

        reserva.setEstado(bestado);

    }

    public void refrescarTablas() {
        tbl_historial.setModel(modeloHistorial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_historial = new javax.swing.JTable();
        pnl_btn_cancelar = new javax.swing.JPanel();
        lbl_btn_cancelar = new javax.swing.JLabel();
        pnl_barra_salir = new javax.swing.JPanel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_SALIR = new javax.swing.JLabel();
        pnl_btn_actualizar = new javax.swing.JPanel();
        lbl_btn_actualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(43, 51, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 51, 139));
        jLabel1.setText("Historial de reservas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tbl_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_historial);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 860, 270));

        pnl_btn_cancelar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_cancelar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_cancelar.setText("Cancelar reserva");
        lbl_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_cancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_cancelarLayout = new javax.swing.GroupLayout(pnl_btn_cancelar);
        pnl_btn_cancelar.setLayout(pnl_btn_cancelarLayout);
        pnl_btn_cancelarLayout.setHorizontalGroup(
            pnl_btn_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnl_btn_cancelarLayout.setVerticalGroup(
            pnl_btn_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 160, 40));

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
                .addGap(0, 910, Short.MAX_VALUE))
        );
        pnl_barra_salirLayout.setVerticalGroup(
            pnl_barra_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barra_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnl_barra_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        pnl_btn_actualizar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_actualizar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_actualizar.setText("Actualizar Reservas");
        lbl_btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_actualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_actualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_actualizarLayout = new javax.swing.GroupLayout(pnl_btn_actualizar);
        pnl_btn_actualizar.setLayout(pnl_btn_actualizarLayout);
        pnl_btn_actualizarLayout.setHorizontalGroup(
            pnl_btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        pnl_btn_actualizarLayout.setVerticalGroup(
            pnl_btn_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btn_actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnl_btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_btn_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseClicked
        // TODO add your handling code here:
        this.dispose();

        MiPerfil n = new MiPerfil(user, reserva);
        n.setVisible(true);
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

    private void lbl_btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_cancelarMouseEntered
        pnl_btn_cancelar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_cancelarMouseEntered

    private void lbl_btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_cancelarMouseExited

        pnl_btn_cancelar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_cancelarMouseExited

    private void lbl_btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_cancelarMouseClicked

        if (tbl_historial.getSelectedRow() != -1) {
            String estado = (String) tbl_historial.getValueAt(tbl_historial.getSelectedRow(), 4);
            boolean esActiva = estado.equalsIgnoreCase("Activa");

            if (esActiva) {

                String origen = (String) tbl_historial.getValueAt(tbl_historial.getSelectedRow(), 0);
                String destino = (String) tbl_historial.getValueAt(tbl_historial.getSelectedRow(), 1);
                String fechaSalida = (String) tbl_historial.getValueAt(tbl_historial.getSelectedRow(), 2);

                try {
                    Connection nuevaConexion = DriverManager.getConnection(
                            "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                            "root",
                            "Fide123.");

                    String UpdateReserva = "UPDATE reserva SET estado = ? WHERE correo = ? AND origen = ? AND destino = ? AND fechasalida = ?";

                    PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(UpdateReserva);

                    nuevoStatementPreparado.setBoolean(1, false);
                    nuevoStatementPreparado.setString(2, user.getCorreoelectronico());
                    nuevoStatementPreparado.setString(3, origen);
                    nuevoStatementPreparado.setString(4, destino);
                    nuevoStatementPreparado.setString(5, fechaSalida);

                    nuevoStatementPreparado.executeUpdate();

                    ReservacionCancelada n = new ReservacionCancelada();
                    n.setVisible(true);

                    buscarReservas();

                } catch (SQLException ex) {
                    Logger.getLogger(Historialreservas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

                ReservacionyaCancelada n = new ReservacionyaCancelada();
                n.setVisible(true);
            }
        } else {

            System.out.println("No hay ninguna seleccionada");
        }
    }//GEN-LAST:event_lbl_btn_cancelarMouseClicked

    private void lbl_btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_actualizarMouseClicked
        buscarReservas();
    }//GEN-LAST:event_lbl_btn_actualizarMouseClicked

    private void lbl_btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_actualizarMouseEntered

        pnl_btn_actualizar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_actualizarMouseEntered

    private void lbl_btn_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_actualizarMouseExited
        // TODO add your handling code here:
        pnl_btn_actualizar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_actualizarMouseExited

    public void buscarReservas() {
        limpiarTabla();

        try {
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                    "root",
                    "Fide123.");

            String vSelect_reservas = "SELECT origen, destino, fechasalida, asientos,estado"
                    + " FROM reserva WHERE correo = ? ";

            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(vSelect_reservas);

            nuevoStatementPreparado.setString(1, user.getCorreoelectronico());

            ResultSet Reservas = nuevoStatementPreparado.executeQuery();

            while (Reservas.next()) {

                Object reserva[] = new Object[5];

                reserva[0] = Reservas.getString("origen");
                reserva[1] = Reservas.getString("destino");
                reserva[2] = Reservas.getString("fechasalida");
                reserva[3] = Reservas.getString("asientos");

                boolean estado = Reservas.getBoolean("estado");

                reserva[4] = estado ? "Activa" : "Inactiva";

                modeloHistorial.addRow(reserva);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void limpiarTabla() {
        while (modeloHistorial.getRowCount() > 0) {
            modeloHistorial.removeRow(0);
        }
    }

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
            java.util.logging.Logger.getLogger(Historialreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historialreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historialreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historialreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historialreservas(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_btn_SALIR;
    private javax.swing.JLabel lbl_btn_actualizar;
    private javax.swing.JLabel lbl_btn_cancelar;
    private javax.swing.JPanel pnl_barra_salir;
    private javax.swing.JPanel pnl_btn_actualizar;
    private javax.swing.JPanel pnl_btn_cancelar;
    private javax.swing.JPanel pnl_btn_salir;
    private javax.swing.JTable tbl_historial;
    // End of variables declaration//GEN-END:variables
}
