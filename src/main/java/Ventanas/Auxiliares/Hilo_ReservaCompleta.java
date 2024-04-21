/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas.Auxiliares;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;
import Ventanas.InicioSesion.InicioSesion;
import Ventanas.Registro.Registro;
import Ventanas.VentanaPrincipal.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author ricar
 */
public class Hilo_ReservaCompleta extends Thread {

    private JFrame ventanaAmostrar;

    private Usuario user;
    private Vuelos vuelo;
    private Reserva reserva;

    public Hilo_ReservaCompleta(JFrame ventanaAmostrar, Usuario user, Vuelos vuelo, Reserva reserva) {
        this.ventanaAmostrar = ventanaAmostrar;
        this.user = user;
        this.vuelo = vuelo;
        this.reserva = reserva;

    }

    public JFrame getVentanaAmostrar() {
        return ventanaAmostrar;
    }

    public void setVentanaAmostrar(JFrame ventanaAmostrar) {
        this.ventanaAmostrar = ventanaAmostrar;
    }

    @Override
    public void run() {

        try {
            ventanaAmostrar.setVisible(true);
            Hilo_ReservaCompleta.sleep(3000);
            ventanaAmostrar.dispose();

            VentanaPrincipal p = new VentanaPrincipal(user, vuelo, reserva);
            p.setVisible(true);

//            Registro abrirRegistro = new Registro();
//            abrirRegistro.dispose();
//
//            InicioSesion abrirInicioSesion = new InicioSesion();
//            abrirInicioSesion.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_ReservaCompleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
