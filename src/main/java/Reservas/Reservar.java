/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservas;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;

import Funcionalidades.ModuloPago;
import Ventanas.VentanaPrincipal.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ricar
 */
public class Reservar extends javax.swing.JFrame {

    /**
     * Creates new form Reservar
     */
    private int xmouse, ymouse;

    private final Usuario user;
    private Reserva reserva;
    double total;
    double precioComida;
    double precioEntretenimiento;
    private final Vuelos vuelo;

    double precioBoletos;
    double precioClase;

    public Reservar(Usuario user, Vuelos vuelo, Reserva reserva) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.vuelo = vuelo;
        this.reserva = reserva;

        lbl_origenreserva.setText("");
        lbl_destinoreserva.setText("");
        lbl_fechasalidareserva.setText("");
        lbl_aerolineareserva.setText("");
        lbl_horasalidareserva.setText("");
        lbl_horallegadareserva.setText("");
        lbl_duracionreserva.setText("");
        lbl_precioreserva.setText("");
        lbl_clasecosto.setText("");
        lbl_asientosdisponiblesreserva.setText("");

        lbl_total.setText("$ " + calcularTotal());
        lbl_comidaCosto.setText("$ " + precioComida);
        lbl_entretenimientoCosto.setText("$ " + precioEntretenimiento);
        lbl_numBoletos.setText("$ " + vuelo.getPrecioBoleto() + " x " + cbx_cantboletos.getSelectedItem().toString() + " = $ " + precioBoletos);

        mostrarDetalles(vuelo);

        chb_comida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });

        chb_entretenimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });

        cbx_cantboletos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });

        cbx_clases.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });

        chb_comida.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (chb_comida.isSelected()) {
                precioComida = 25;
            } else {
                precioComida = 0;
            }
        });

        chb_entretenimiento.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (chb_entretenimiento.isSelected()) {
                precioEntretenimiento = 50;
            } else {
                precioEntretenimiento = 0;
            }
        });

    }

    public void mostrarDetalles(Vuelos vuelo) {

        lbl_origenreserva.setText(vuelo.getOrigen());
        lbl_destinoreserva.setText(vuelo.getDestino());
        lbl_fechasalidareserva.setText(vuelo.getFechaSalida());
        lbl_aerolineareserva.setText(vuelo.getAerolinea());
        lbl_horasalidareserva.setText(vuelo.getHoraSalida());
        lbl_horallegadareserva.setText(vuelo.getHoraLlegada());
        lbl_duracionreserva.setText(vuelo.getDuracion());
        lbl_precioreserva.setText("$ " + vuelo.getPrecioBoleto());
        lbl_asientosdisponiblesreserva.setText(vuelo.getTotalasientos() + "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        asasd = new javax.swing.JLabel();
        lbl_origenreserva = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_destinoreserva = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_aerolineareserva = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_horasalidareserva = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        lbl_precioreserva = new javax.swing.JLabel();
        lbl_asientosdisponiblesreserva = new javax.swing.JLabel();
        lbl_duracionreserva = new javax.swing.JLabel();
        lbl_horallegadareserva = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_fechasalidareserva = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbx_cantboletos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chb_comida = new javax.swing.JCheckBox();
        chb_entretenimiento = new javax.swing.JCheckBox();
        cbx_clases = new javax.swing.JComboBox<>();
        pnl_barra_salir = new javax.swing.JPanel();
        pnl_btn_salir = new javax.swing.JPanel();
        lbl_btn_SALIR = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_total = new javax.swing.JLabel();
        lbl_entretenimientoCosto = new javax.swing.JLabel();
        lbl_comidaCosto = new javax.swing.JLabel();
        lbl_numBoletos = new javax.swing.JLabel();
        pnl_btn_Reservar = new javax.swing.JPanel();
        lbl_btn_Reservar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_clasecosto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(43, 51, 139));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel2.setLayout(null);

        asasd.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        asasd.setText("Origen:");
        jPanel2.add(asasd);
        asasd.setBounds(6, 88, 50, 17);

        lbl_origenreserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_origenreserva.setText("origen");
        jPanel2.add(lbl_origenreserva);
        lbl_origenreserva.setBounds(71, 88, 375, 17);

        jLabel16.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel16.setText("Destino:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(6, 115, 60, 17);

        lbl_destinoreserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_destinoreserva.setText("destino");
        jPanel2.add(lbl_destinoreserva);
        lbl_destinoreserva.setBounds(76, 115, 370, 17);

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel17.setText("Aerolínea:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(490, 90, 90, 20);

        lbl_aerolineareserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_aerolineareserva.setText("aerolinea");
        jPanel2.add(lbl_aerolineareserva);
        lbl_aerolineareserva.setBounds(640, 90, 170, 20);

        jLabel21.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel21.setText("Hora de salida:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(6, 181, 110, 17);

        lbl_horasalidareserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_horasalidareserva.setText("hora de salida");
        jPanel2.add(lbl_horasalidareserva);
        lbl_horasalidareserva.setBounds(123, 181, 140, 17);

        duracion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        duracion.setText("Duración:");
        jPanel2.add(duracion);
        duracion.setBounds(6, 251, 70, 17);

        jLabel19.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel19.setText("Precio desde: ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(490, 150, 100, 20);

        jlabel12.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jlabel12.setText("Asientos disponibles:");
        jPanel2.add(jlabel12);
        jlabel12.setBounds(490, 120, 150, 20);

        lbl_precioreserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_precioreserva.setText("precio");
        jPanel2.add(lbl_precioreserva);
        lbl_precioreserva.setBounds(640, 150, 90, 20);

        lbl_asientosdisponiblesreserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_asientosdisponiblesreserva.setText("asientos disponibles");
        jPanel2.add(lbl_asientosdisponiblesreserva);
        lbl_asientosdisponiblesreserva.setBounds(640, 120, 140, 20);

        lbl_duracionreserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_duracionreserva.setText("Duracion");
        jPanel2.add(lbl_duracionreserva);
        lbl_duracionreserva.setBounds(116, 251, 160, 17);

        lbl_horallegadareserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_horallegadareserva.setText("Hora de llegada");
        jPanel2.add(lbl_horallegadareserva);
        lbl_horallegadareserva.setBounds(126, 216, 140, 17);

        jLabel18.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel18.setText("Hora de llegada:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(6, 216, 110, 17);

        lbl_fechasalidareserva.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_fechasalidareserva.setText("Fecha de salida");
        jPanel2.add(lbl_fechasalidareserva);
        lbl_fechasalidareserva.setBounds(131, 146, 110, 17);

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de salida:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(6, 146, 110, 17);

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jLabel1.setText(" Detalles de vuelo");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 37);

        cbx_cantboletos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cbx_cantboletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbx_cantboletos.setBorder(null);
        jPanel2.add(cbx_cantboletos);
        cbx_cantboletos.setBounds(640, 200, 60, 19);

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel6.setText("Cantidad de boletos:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(490, 200, 120, 20);

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setText("10 max");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(720, 206, 50, 10);

        chb_comida.setBackground(new java.awt.Color(255, 255, 255));
        chb_comida.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chb_comida.setText("Servicio de comida  + $25");
        chb_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_comidaActionPerformed(evt);
            }
        });
        jPanel2.add(chb_comida);
        chb_comida.setBounds(490, 290, 190, 19);

        chb_entretenimiento.setBackground(new java.awt.Color(255, 255, 255));
        chb_entretenimiento.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        chb_entretenimiento.setText("Servicio de entretenimiento  + $50");
        chb_entretenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_entretenimientoActionPerformed(evt);
            }
        });
        jPanel2.add(chb_entretenimiento);
        chb_entretenimiento.setBounds(490, 310, 240, 19);

        cbx_clases.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        cbx_clases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clase economica +0% por boleto", "Clase Business + 50% por boleto", "Primera Clase + 100% por boleto" }));
        cbx_clases.setBorder(null);
        jPanel2.add(cbx_clases);
        cbx_clases.setBounds(490, 250, 160, 19);

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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_barra_salirLayout.setVerticalGroup(
            pnl_barra_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barra_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Total =");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setText("Servicio de comida: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setText("Servicio de entretenimiento");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setText("Boletos:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, 20));

        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_total.setText("jLabel8");
        jPanel3.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        lbl_entretenimientoCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_entretenimientoCosto.setText("jLabel9");
        jPanel3.add(lbl_entretenimientoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        lbl_comidaCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_comidaCosto.setText("jLabel11");
        jPanel3.add(lbl_comidaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        lbl_numBoletos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numBoletos.setText("jLabel12");
        jPanel3.add(lbl_numBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, -1));

        pnl_btn_Reservar.setBackground(new java.awt.Color(43, 51, 139));

        lbl_btn_Reservar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_btn_Reservar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_btn_Reservar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_btn_Reservar.setText("Reservar");
        lbl_btn_Reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_btn_ReservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_btn_ReservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_btn_ReservarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_btn_ReservarLayout = new javax.swing.GroupLayout(pnl_btn_Reservar);
        pnl_btn_Reservar.setLayout(pnl_btn_ReservarLayout);
        pnl_btn_ReservarLayout.setHorizontalGroup(
            pnl_btn_ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_btn_ReservarLayout.setVerticalGroup(
            pnl_btn_ReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_btn_Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(pnl_btn_Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 40));

        jLabel9.setText("Clase elegida:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lbl_clasecosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_clasecosto.setText("jLabel11");
        jPanel3.add(lbl_clasecosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(pnl_barra_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_barra_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

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

    private void lbl_btn_SALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_SALIRMouseClicked
        // TODO add your handling code here:
        this.dispose();
        VentanaPrincipal n = new VentanaPrincipal(user, vuelo, reserva);
        n.setVisible(true);
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

    private void chb_entretenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_entretenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_entretenimientoActionPerformed

    private void lbl_btn_ReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_ReservarMouseClicked

        Reserva r = new Reserva();

        r.setOrigen(vuelo.getOrigen());
        r.setDestino(vuelo.getDestino());
        r.setFechaVuelo(vuelo.getFechaSalida());

        r.setCantAsientos(Integer.parseInt(cbx_cantboletos.getSelectedItem().toString()));

        String codasiento = "";
        for (int i = 1; i <= r.getCantAsientos(); i++) {
            String codigoAsiento = generarCodigoAsiento();

            String codigo = codigoAsiento + "  ";

            codasiento += codigo;

        }
        r.setAsiento(codasiento);

        ModuloPago p = new ModuloPago(user, vuelo, r, calcularTotal());
        p.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_lbl_btn_ReservarMouseClicked

    public double claseVuelo() {
        double precioClase = 0;

        if (cbx_clases.getSelectedItem().toString().equals("Clase economica +0% por boleto")) {
            precioClase = 0.0;
        } else if (cbx_clases.getSelectedItem().toString().equals("Clase Business + 50% por boleto")) {
            precioClase = 1.50;
        } else if (cbx_clases.getSelectedItem().toString().equals("Primera Clase + 100% por boleto")) {
            precioClase = 2.0;
        }

        return precioClase;
    }

    public double calcularTotal() {

        precioBoletos = (Integer.valueOf(cbx_cantboletos.getSelectedItem().toString()) * vuelo.getPrecioBoleto());
        precioClase = (claseVuelo() * vuelo.getPrecioBoleto()) - vuelo.getPrecioBoleto(); //* Integer.parseInt(cbx_cantboletos.getSelectedItem().toString());
        lbl_numBoletos.setText("$ " + vuelo.getPrecioBoleto() + " x " + cbx_cantboletos.getSelectedItem().toString() + " = $ " + precioBoletos);
        if (precioClase < 0) {
            precioClase = 0;
        }
        lbl_clasecosto.setText(" + $" + precioClase + " /boleto");//+ Integer.valueOf(cbx_cantboletos.getSelectedItem().toString()) + " x " + (claseVuelo() * vuelo.getPrecioBoleto() + " = $ " + precioClase));
        lbl_comidaCosto.setText("+ $ " + precioComida + " /boleto");
        lbl_entretenimientoCosto.setText("+ $ " + precioEntretenimiento + " /boleto");

        total
                = (precioComida * Integer.parseInt(cbx_cantboletos.getSelectedItem().toString()))
                + (precioEntretenimiento * Integer.parseInt(cbx_cantboletos.getSelectedItem().toString()))
                + precioBoletos + (precioClase * Integer.parseInt(cbx_cantboletos.getSelectedItem().toString()));
        lbl_total.setText("$ " + total);
        return total;
    }

    private static String generarCodigoAsiento() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numAleatorio = (int) (Math.random() * 1000) % 26;
        char letraAleatoria = letras.charAt(numAleatorio);
        int numeroAleatorio = (int) (Math.random() * 1000) % 100;
        return letraAleatoria + String.format("%02d", numeroAleatorio);
    }

    private void lbl_btn_ReservarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_ReservarMouseEntered
        // TODO add your handling code here:

        pnl_btn_Reservar.setBackground(new Color(79, 93, 255));
    }//GEN-LAST:event_lbl_btn_ReservarMouseEntered

    private void lbl_btn_ReservarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_btn_ReservarMouseExited
        // TODO add your handling code here:
        pnl_btn_Reservar.setBackground(new Color(43, 51, 139));
    }//GEN-LAST:event_lbl_btn_ReservarMouseExited

    private void chb_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_comidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_comidaActionPerformed

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
            java.util.logging.Logger.getLogger(Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservar(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asasd;
    private javax.swing.JComboBox<String> cbx_cantboletos;
    private javax.swing.JComboBox<String> cbx_clases;
    private javax.swing.JCheckBox chb_comida;
    private javax.swing.JCheckBox chb_entretenimiento;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel lbl_aerolineareserva;
    private javax.swing.JLabel lbl_asientosdisponiblesreserva;
    private javax.swing.JLabel lbl_btn_Reservar;
    private javax.swing.JLabel lbl_btn_SALIR;
    private javax.swing.JLabel lbl_clasecosto;
    private javax.swing.JLabel lbl_comidaCosto;
    private javax.swing.JLabel lbl_destinoreserva;
    private javax.swing.JLabel lbl_duracionreserva;
    private javax.swing.JLabel lbl_entretenimientoCosto;
    private javax.swing.JLabel lbl_fechasalidareserva;
    private javax.swing.JLabel lbl_horallegadareserva;
    private javax.swing.JLabel lbl_horasalidareserva;
    private javax.swing.JLabel lbl_numBoletos;
    private javax.swing.JLabel lbl_origenreserva;
    private javax.swing.JLabel lbl_precioreserva;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel pnl_barra_salir;
    private javax.swing.JPanel pnl_btn_Reservar;
    private javax.swing.JPanel pnl_btn_salir;
    // End of variables declaration//GEN-END:variables
}
