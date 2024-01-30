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
public class Vuelos implements Serializable {

    private String origen;

    private String destino;

    private String fechaSalida;

    private Double precioBoleto;



    private int totalasientos;

    private String aerolinea;

    private String horaSalida;

    private String horaLlegada;

    private String duracion;

    private String servicioComida;

    private String servicioEntretenimiento;

    private String codigoAsiento;

    public Vuelos() {
    }

    public Vuelos(String origen, String destino, String fechaSalida, Double precioBoleto, int asientosclaseeconomica, int asientosclasebusiness, int asientosprimeraclase, int totalasientos, String aerolinea, String horaSalida, String horaLlegada, String duracion, String servicioComida, String servicioEntretenimiento, String codigoAsiento) {
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.precioBoleto = precioBoleto;

        this.totalasientos = totalasientos;
        this.aerolinea = aerolinea;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
        this.servicioComida = servicioComida;
        this.servicioEntretenimiento = servicioEntretenimiento;
        this.codigoAsiento = codigoAsiento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(Double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }



    public int getTotalasientos() {
        return totalasientos;
    }

    public void setTotalasientos(int totalasientos) {
        this.totalasientos = totalasientos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getServicioComida() {
        return servicioComida;
    }

    public void setServicioComida(String servicioComida) {
        this.servicioComida = servicioComida;
    }

    public String getServicioEntretenimiento() {
        return servicioEntretenimiento;
    }

    public void setServicioEntretenimiento(String servicioEntretenimiento) {
        this.servicioEntretenimiento = servicioEntretenimiento;
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", precioBoleto=" + precioBoleto + ", totalasientos=" + totalasientos + ", aerolinea=" + aerolinea + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", duracion=" + duracion + ", servicioComida=" + servicioComida + ", servicioEntretenimiento=" + servicioEntretenimiento + ", codigoAsiento=" + codigoAsiento + '}';
    }

  
}
