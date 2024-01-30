/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author ricar
 */
public class Usuario implements Serializable {

    private String nombre;
    private String apellidos;
    private String edad;
    private String correoelectronico;
    private String password;
    private String aerolineaspreferidas;
    private String clasepreferida;
    private String comida;
    private String entretenimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String edad, String correoelectronico, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correoelectronico = correoelectronico;
        this.password = password;
    }

    public Usuario(String aerolineaspreferidas, String clasepreferida, String comida, String entretenimiento) {
        this.aerolineaspreferidas = aerolineaspreferidas;
        this.clasepreferida = clasepreferida;
        this.comida = comida;
        this.entretenimiento = entretenimiento;
    }

    public Usuario(String nombre, String apellidos, String edad, String correoelectronico, String password, String aerolineaspreferidas, String clasepreferida, String comida, String entretenimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correoelectronico = correoelectronico;
        this.password = password;
        this.aerolineaspreferidas = aerolineaspreferidas;
        this.clasepreferida = clasepreferida;
        this.comida = comida;
        this.entretenimiento = entretenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAerolineaspreferidas() {
        return aerolineaspreferidas;
    }

    public void setAerolineaspreferidas(String aerolineaspreferidas) {
        this.aerolineaspreferidas = aerolineaspreferidas;
    }

    public String getClasepreferida() {
        return clasepreferida;
    }

    public void setClasepreferida(String clasepreferida) {
        this.clasepreferida = clasepreferida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getEntretenimiento() {
        return entretenimiento;
    }

    public void setEntretenimiento(String entretenimiento) {
        this.entretenimiento = entretenimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", correoelectronico=" + correoelectronico + ", password=" + password + ", aerolineaspreferidas=" + aerolineaspreferidas + ", clasepreferida=" + clasepreferida + ", comida=" + comida + ", entretenimiento=" + entretenimiento + '}';
    }
    
    
    
    
    
    
}
