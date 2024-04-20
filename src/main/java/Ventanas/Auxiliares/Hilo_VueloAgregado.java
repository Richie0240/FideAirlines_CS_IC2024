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
public class Hilo_VueloAgregado extends Thread {

    private JFrame ventanaAmostrar;

    public Hilo_VueloAgregado(JFrame ventanaAmostrar) {
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
            Hilo_VueloAgregado.sleep(2000);
            ventanaAmostrar.dispose();
            
//            Registro abrirRegistro = new Registro();
//            abrirRegistro.dispose();
//
//            InicioSesion abrirInicioSesion = new InicioSesion();
//            abrirInicioSesion.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_VueloAgregado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
