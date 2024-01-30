/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas.Auxiliares;

import Clases.Usuario;
import Ventanas.InicioSesion.InicioSesion;
import Ventanas.Registro.Registro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author ricar
 */
public class Hilo_RegistroCompleto extends Thread {

    private JFrame ventanaAmostrar;

    public Hilo_RegistroCompleto(JFrame ventanaAmostrar) {
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
            Hilo_RegistroCompleto.sleep(4000);
            ventanaAmostrar.dispose();
            
            Registro abrirRegistro = new Registro();
            abrirRegistro.dispose();

            InicioSesion abrirInicioSesion = new InicioSesion();
            abrirInicioSesion.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_RegistroCompleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
