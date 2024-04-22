/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas.Auxiliares;

import Clases.Reserva;
import Clases.Usuario;
import Clases.Vuelos;
import Funcionalidades.PreferenciasUsuario;
import MiPerfil.InformacionPersonal;
import MiPerfil.MiPerfil;
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
public class Hilo_DatosActualizados extends Thread {

    private Usuario user;
    private Reserva reserva;
    private Vuelos vuelo;

    private JFrame ventanaAmostrar;

    public Hilo_DatosActualizados(Usuario user, Vuelos vuelo, Reserva reserva) {
        this.user = user;
        this.reserva = reserva;
        this.vuelo = vuelo;
    }

    public Hilo_DatosActualizados(JFrame ventanaAmostrar, Usuario user, Vuelos vuelo, Reserva reserva) {
        this.user = user;
        this.reserva = reserva;
        this.vuelo = vuelo;
        this.ventanaAmostrar = ventanaAmostrar;
    }

    public Hilo_DatosActualizados(JFrame ventanaAmostrar) {
        this.ventanaAmostrar = ventanaAmostrar;
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
            Hilo_DatosActualizados.sleep(4000);
            ventanaAmostrar.dispose();

            InformacionPersonal info = new InformacionPersonal(user, vuelo, reserva);
            info.setVisible(true);

        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_DatosActualizados.class.getName()).log(Level.SEVERE, null, ex);
        }

        VentanaPrincipal principal = new VentanaPrincipal(user, null, null);
        principal.setVisible(false);
    }

}
