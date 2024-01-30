/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas.Auxiliares;

import Clases.Reserva;
import Clases.Usuario;
import Funcionalidades.PreferenciasUsuario;
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
public class Hilo_PreferenciasActualizadas extends Thread {

    private Usuario user;
    private Reserva reserva;
    
    private JFrame ventanaAmostrar;

    public Hilo_PreferenciasActualizadas(Usuario user,Reserva reserva) {
        this.user = user;
        this.reserva = reserva;
    }

    public Hilo_PreferenciasActualizadas(Usuario user, JFrame ventanaAmostrar) {
        this.user = user;
        this.ventanaAmostrar = ventanaAmostrar;
    }
    
    
    

    public Hilo_PreferenciasActualizadas(JFrame ventanaAmostrar) {
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
            Hilo_PreferenciasActualizadas.sleep(4000);
            ventanaAmostrar.dispose();
            
            PreferenciasUsuario abrirPreferenciasUsuario = new PreferenciasUsuario(user);
            abrirPreferenciasUsuario.dispose();
            
            MiPerfil abrirMiPerfil = new MiPerfil(user,reserva);
            abrirMiPerfil.setVisible(true);
            
            

        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_PreferenciasActualizadas.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        VentanaPrincipal principal = new VentanaPrincipal(user,null,null);
            principal.setVisible(false);
    }

}
