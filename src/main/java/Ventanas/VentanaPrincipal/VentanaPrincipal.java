/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas.VentanaPrincipal;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;
import Excepciones.noResultadoExcepcion;
import Funcionalidades.PreferenciasUsuario;
import MiPerfil.MiPerfil;
import Reservas.Reservar;
import Ventanas.Errores.OcurreError;
import Ventanas.Errores.SeleccioneUnVuelo;
import Ventanas.InicioSesion.InicioSesion;
import com.toedter.calendar.JCalendar;
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
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricar
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    int xmouse, ymouse;

    private Usuario user;
    private Vuelos vuelo;
    private Reserva reserva;
    DefaultTableModel modeloVuelos = new DefaultTableModel();

    public VentanaPrincipal(Usuario user, Vuelos vuelo, Reserva reserva) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.vuelo = vuelo;
        this.reserva = reserva;

        lbl_origen.setText("");
        lbl_destino.setText("");
        lbl_fechasalida.setText("");
        lbl_aerolinea.setText("");
        lbl_horasalida.setText("");
        lbl_horallegada.setText("");
        lbl_duracion.setText("");
        lbl_precio.setText("");
        lbl_asientosdisponibles.setText("");

        llenarOrigenyDestino();

        modeloVuelos.addColumn("Origen");
        modeloVuelos.addColumn("Destino");
        modeloVuelos.addColumn("Fecha salida");
        modeloVuelos.addColumn("Aerolinea");
        modeloVuelos.addColumn("Hora salida");
        modeloVuelos.addColumn("Hora de llegada");

        refrescarTablas();

        tbl_vuelos.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent Mouse_evt) {

                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {

                    elegirVuelo();

                }
            }
        });

    }

    public void elegirVuelo() {

        Double precio = null;
        int total = 0;
        String duracion = null;
        String comida = null;
        String entretenimiento = null;

        vuelo = new Vuelos();

        vuelo.setOrigen(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 0).toString());
        vuelo.setDestino(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 1).toString());
        vuelo.setFechaSalida(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 2).toString());
        vuelo.setAerolinea(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 3).toString());
        vuelo.setHoraSalida(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 4).toString());
        vuelo.setHoraLlegada(tbl_vuelos.getValueAt(tbl_vuelos.getSelectedRow(), 5).toString());

        try {
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                    "root",
                    "Fide123.");

            String detallesVuelo = "SELECT precio, asientos, duracion, serviciocomida, servicioentretenimiento"
                    + " FROM vuelos WHERE origen = ? AND destino = ? AND fechasalida = ? AND horasalida = ?";

            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(detallesVuelo);

            nuevoStatementPreparado.setString(1, vuelo.getOrigen());
            nuevoStatementPreparado.setString(2, vuelo.getDestino());
            nuevoStatementPreparado.setString(3, vuelo.getFechaSalida());
            nuevoStatementPreparado.setString(4, vuelo.getHoraSalida());

            ResultSet Select_vuelo = nuevoStatementPreparado.executeQuery();

            if (Select_vuelo.next()) {
                precio = Double.valueOf(Select_vuelo.getString("precio"));
                total = Select_vuelo.getInt("asientos");
                duracion = Select_vuelo.getString("duracion");
                comida = Select_vuelo.getString("serviciocomida");
                entretenimiento = Select_vuelo.getString("servicioentretenimiento");

            } else {
                System.out.println("Error");
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        vuelo.setPrecioBoleto(precio);

        vuelo.setDuracion(duracion);
        vuelo.setServicioComida(comida);
        vuelo.setServicioEntretenimiento(entretenimiento);

        vuelo.setTotalasientos(total);

        lbl_origen.setText(vuelo.getOrigen());
        lbl_destino.setText(vuelo.getDestino());
        lbl_fechasalida.setText(vuelo.getFechaSalida());
        lbl_aerolinea.setText(vuelo.getAerolinea());
        lbl_horasalida.setText(vuelo.getHoraSalida());
        lbl_horallegada.setText(vuelo.getHoraLlegada());
        lbl_duracion.setText(vuelo.getDuracion());
        lbl_precio.setText("$ " + vuelo.getPrecioBoleto());
        lbl_asientosdisponibles.setText(vuelo.getTotalasientos() + "");

    }

    public void refrescarTablas() {
        tbl_vuelos.setModel(modeloVuelos);

    }

    public void llenarOrigenyDestino() {

        ObtenerOrigenyDestino obtenerVuelos = new ObtenerOrigenyDestino();
        ArrayList<String> listaOrigenyDestino = obtenerVuelos.getOrigenyDestino();

        cbx_origen.removeAllItems();
        cbx_destino.removeAllItems();

        for (int i = 0; i < listaOrigenyDestino.size(); i += 2) {
            String origen = listaOrigenyDestino.get(i);
            String destino = listaOrigenyDestino.get(i + 1);
            cbx_origen.addItem(origen);
            cbx_destino.addItem(destino);
        }
    }

    public void limpiarVuelos() {

        while (modeloVuelos.getRowCount() > 0) {
            modeloVuelos.removeRow(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cbx_destino = new javax.swing.JComboBox<>();
        pnl_btn_buscarvuelos = new javax.swing.JPanel();
        lbl_btn_buscarvuelos = new javax.swing.JLabel();
        cbx_origen = new javax.swing.JComboBox<>();
        jcaln_fecha_partida = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_barra_salir = new javax.swing.JPanel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_SALIR = new javax.swing.JLabel();
        pnl_btn_miperfil = new javax.swing.JPanel();
        lbl_btn_miPerfil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vuelos = new javax.swing.JTable();
        lbl_cantidaddevuelos = new javax.swing.JLabel();
        pnl_btn_reservar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_origen = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_destino = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_horallegada = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        lbl_asientosdisponibles = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_horasalida = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_fechasalida = new javax.swing.JLabel();
        lbl_aerolinea = new javax.swing.JLabel();
        lbl_duracion = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_destino.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cbx_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_destino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbx_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_destinoActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 260, 36));

        pnl_btn_buscarvuelos.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_buscarvuelos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_buscarvuelos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_buscarvuelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_buscarvuelos.setText("Buscar vuelos");
        lbl_btn_buscarvuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_buscarvuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_buscarvuelosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_buscarvuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_buscarvuelosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_buscarvuelosLayout = new javax.swing.GroupLayout(pnl_btn_buscarvuelos);
        pnl_btn_buscarvuelos.setLayout(pnl_btn_buscarvuelosLayout);
        pnl_btn_buscarvuelosLayout.setHorizontalGroup(
            pnl_btn_buscarvuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_buscarvuelos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnl_btn_buscarvuelosLayout.setVerticalGroup(
            pnl_btn_buscarvuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_buscarvuelos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(pnl_btn_buscarvuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 110, 40));

        cbx_origen.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cbx_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_origen.setToolTipText("");
        cbx_origen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbx_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_origenMouseClicked(evt);
            }
        });
        cbx_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_origenActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 270, 36));
        jPanel4.add(jcaln_fecha_partida, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/despegue.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/aterrizaje.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/calendario.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 40, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 1100, 120));

        jPanel3.setBackground(new java.awt.Color(43, 51, 139));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿A dónde quieres ir?");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 106, 180, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGO blanco pequenio 100x47.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FIDE AIRLINES");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        pnl_barra_salir.setBackground(new java.awt.Color(43, 51, 139));
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
                .addGap(0, 1230, Short.MAX_VALUE))
        );
        pnl_barra_salirLayout.setVerticalGroup(
            pnl_barra_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barra_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(pnl_barra_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pnl_btn_miperfil.setBackground(new java.awt.Color(255, 255, 255));

        lbl_btn_miPerfil.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbl_btn_miPerfil.setForeground(new java.awt.Color(43, 51, 139));
        lbl_btn_miPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_miPerfil.setText("Mi perfil");
        lbl_btn_miPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_btn_miPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_miPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_miPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_miPerfilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_miperfilLayout = new javax.swing.GroupLayout(pnl_btn_miperfil);
        pnl_btn_miperfil.setLayout(pnl_btn_miperfilLayout);
        pnl_btn_miperfilLayout.setHorizontalGroup(
            pnl_btn_miperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_miPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_btn_miperfilLayout.setVerticalGroup(
            pnl_btn_miperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_miPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pnl_btn_miperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 200));

        tbl_vuelos.setBackground(new java.awt.Color(43, 51, 139));
        tbl_vuelos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tbl_vuelos.setForeground(new java.awt.Color(255, 255, 255));
        tbl_vuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_vuelos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 810, 290));

        lbl_cantidaddevuelos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_cantidaddevuelos.setText("Cantidad de vuelos encontrados : ");
        jPanel2.add(lbl_cantidaddevuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        pnl_btn_reservar.setBackground(new java.awt.Color(43, 51, 139));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RESERVAR");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_reservarLayout = new javax.swing.GroupLayout(pnl_btn_reservar);
        pnl_btn_reservar.setLayout(pnl_btn_reservarLayout);
        pnl_btn_reservarLayout.setHorizontalGroup(
            pnl_btn_reservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnl_btn_reservarLayout.setVerticalGroup(
            pnl_btn_reservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_btn_reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 130, 40));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel15.setText("Origen:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        lbl_origen.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_origen.setText("origen");
        jPanel2.add(lbl_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 250, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel16.setText("Destino:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, -1, -1));

        lbl_destino.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_destino.setText("destino");
        jPanel2.add(lbl_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 250, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel17.setText("Aerolínea:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, -1));

        duracion.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        duracion.setText("Duración:");
        jPanel2.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 150, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel18.setText("Hora de llegada:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, -1, -1));

        lbl_horallegada.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_horallegada.setText("Hora de llegada");
        jPanel2.add(lbl_horallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 440, 140, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel19.setText("Precio desde: ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, -1));

        lbl_precio.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_precio.setText("precio");
        jPanel2.add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 480, 40, -1));

        jlabel12.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jlabel12.setText("Asientos disponibles:");
        jPanel2.add(jlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        lbl_asientosdisponibles.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_asientosdisponibles.setText("asientos disponibles");
        jPanel2.add(lbl_asientosdisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, 140, 30));

        jLabel21.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel21.setText("Hora de salida:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        lbl_horasalida.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_horasalida.setText("hora de salida");
        jPanel2.add(lbl_horasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 140, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de salida:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, -1, -1));

        lbl_fechasalida.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_fechasalida.setText("Fecha de salida");
        jPanel2.add(lbl_fechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, -1, -1));

        lbl_aerolinea.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_aerolinea.setText("aerolinea");
        jPanel2.add(lbl_aerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, 170, -1));

        lbl_duracion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbl_duracion.setText("Duracion");
        jPanel2.add(lbl_duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_btn_miPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_miPerfilMouseClicked
        MiPerfil abrirMiPerfil = new MiPerfil(user, vuelo, reserva);
        abrirMiPerfil.setVisible(true);
    }//GEN-LAST:event_lbl_btn_miPerfilMouseClicked

    private void pnl_barra_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salirMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barra_salirMousePressed

    private void pnl_barra_salirMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barra_salirMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barra_salirMouseDragged

    private void pnl_btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_btn_salirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_btn_salirMouseEntered

    private void lbl_btn_SALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseExited
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(new Color(43, 51, 139));
        lbl_btn_SALIR.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbl_btn_SALIRMouseExited

    private void lbl_btn_SALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseEntered
        // TODO add your handling code here:
        pnl_btn_salir.setBackground(Color.WHITE);
        lbl_btn_SALIR.setForeground(Color.BLUE);
    }//GEN-LAST:event_lbl_btn_SALIRMouseEntered

    private void lbl_btn_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseClicked
        // TODO add your handling code here:
        this.dispose();
        InicioSesion n = new InicioSesion();
        n.setVisible(true);
    }//GEN-LAST:event_lbl_btn_SALIRMouseClicked

    private void cbx_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_origenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_origenActionPerformed

    private void cbx_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_origenMouseClicked

    }//GEN-LAST:event_cbx_origenMouseClicked

    private void lbl_btn_buscarvuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_buscarvuelosMouseExited
        pnl_btn_buscarvuelos.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_buscarvuelosMouseExited

    private void lbl_btn_buscarvuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_buscarvuelosMouseEntered
        pnl_btn_buscarvuelos.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_buscarvuelosMouseEntered

    private void lbl_btn_buscarvuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_buscarvuelosMouseClicked

        try {
            buscarVuelos();

        } catch (noResultadoExcepcion ex) {

        }
    }//GEN-LAST:event_lbl_btn_buscarvuelosMouseClicked

    private void cbx_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_destinoActionPerformed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        pnl_btn_reservar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        pnl_btn_reservar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        if (lbl_aerolinea.getText().equals("")) {
            SeleccioneUnVuelo n = new SeleccioneUnVuelo();
            n.setVisible(true);
        } else {
            this.setVisible(false);
            Reservar r = new Reservar(user, vuelo, null);
            r.setVisible(true);
        }


    }//GEN-LAST:event_jLabel9MouseClicked

    private void lbl_btn_miPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_miPerfilMouseEntered
        pnl_btn_miperfil.setBackground(new Color(79, 93, 255));
        lbl_btn_miPerfil.setForeground(Color.WHITE);

    }//GEN-LAST:event_lbl_btn_miPerfilMouseEntered

    private void lbl_btn_miPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_miPerfilMouseExited
        pnl_btn_miperfil.setBackground(Color.WHITE);
        lbl_btn_miPerfil.setForeground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_miPerfilMouseExited

    public void buscarVuelos() throws noResultadoExcepcion {
        limpiarVuelos();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        Vuelos v = new Vuelos();

        v.setOrigen(String.valueOf(cbx_origen.getSelectedItem()));
        v.setDestino(String.valueOf(cbx_destino.getSelectedItem()));
        v.setFechaSalida(formatoFecha.format(jcaln_fecha_partida.getCalendar().getTime()));

        if (!v.getOrigen().equals(v.getDestino())) {

            try {
                Connection nuevaConexion = DriverManager.getConnection(
                        "jdbc:mysql://localhost/fideairlines?serverTimezone=UTC",
                        "root",
                        "Fide123.");

                String vSelect_Vuelos = "SELECT origen, destino, fechasalida, aerolinea, horasalida, horallegada"
                        + " FROM vuelos WHERE origen = ? AND destino = ? AND fechasalida = ?";

                PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(vSelect_Vuelos);

                nuevoStatementPreparado.setString(1, v.getOrigen());
                nuevoStatementPreparado.setString(2, v.getDestino());
                nuevoStatementPreparado.setString(3, v.getFechaSalida());

                ResultSet vuelosDisponibles = nuevoStatementPreparado.executeQuery();

                int cantidadVuelos = 0;
                while (vuelosDisponibles.next()) {
                    Object vuelos[] = new Object[6];
                    vuelos[0] = vuelosDisponibles.getString("origen");
                    vuelos[1] = vuelosDisponibles.getString("destino");
                    vuelos[2] = vuelosDisponibles.getString("fechasalida");
                    vuelos[3] = vuelosDisponibles.getString("aerolinea");
                    vuelos[4] = vuelosDisponibles.getString("horasalida");
                    vuelos[5] = vuelosDisponibles.getString("horallegada");

                    modeloVuelos.addRow(vuelos);
                    cantidadVuelos += 1;
                }

                if (cantidadVuelos == 0) {
                    throw new noResultadoExcepcion();
                } else {
                    lbl_cantidaddevuelos.setText("Cantidad de vuelos encontrados: " + cantidadVuelos);
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            throw new noResultadoExcepcion();
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_destino;
    private javax.swing.JComboBox<String> cbx_origen;
    private javax.swing.JLabel duracion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private com.toedter.calendar.JDateChooser jcaln_fecha_partida;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel lbl_aerolinea;
    private javax.swing.JLabel lbl_asientosdisponibles;
    private javax.swing.JLabel lbl_btn_SALIR;
    private javax.swing.JLabel lbl_btn_buscarvuelos;
    private javax.swing.JLabel lbl_btn_miPerfil;
    private javax.swing.JLabel lbl_cantidaddevuelos;
    private javax.swing.JLabel lbl_destino;
    private javax.swing.JLabel lbl_duracion;
    private javax.swing.JLabel lbl_fechasalida;
    private javax.swing.JLabel lbl_horallegada;
    private javax.swing.JLabel lbl_horasalida;
    private javax.swing.JLabel lbl_origen;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JPanel pnl_barra_salir;
    private javax.swing.JPanel pnl_btn_buscarvuelos;
    private javax.swing.JPanel pnl_btn_miperfil;
    private javax.swing.JPanel pnl_btn_reservar;
    private javax.swing.JPanel pnl_btn_salir;
    private javax.swing.JTable tbl_vuelos;
    // End of variables declaration//GEN-END:variables
}
