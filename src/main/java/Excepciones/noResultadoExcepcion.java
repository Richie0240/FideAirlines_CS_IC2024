/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import Ventanas.Errores.NoresultadoExcepcion;

/**
 *
 * @author ricar
 */
public class noResultadoExcepcion extends Exception {

    public noResultadoExcepcion() {
        NoresultadoExcepcion n = new NoresultadoExcepcion();
        n.setVisible(true);
    }



}
