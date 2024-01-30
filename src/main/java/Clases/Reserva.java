/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ricar
 */
public class Reserva {

    private String origen;
    private String destino;

    private String fechaVuelo;

    private String asiento;

    private Boolean estado;

    private int cantAsientos;

    private int totalasientos;

    private String horasalida;

    public Reserva() {
    }

    public Reserva(String origen, String destino, String fechaVuelo, String asiento, Boolean estado, int cantAsientos, int totalasientos, String horasalida) {
        this.origen = origen;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.asiento = asiento;
        this.estado = estado;
        this.cantAsientos = cantAsientos;
        this.totalasientos = totalasientos;
        this.horasalida = horasalida;
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

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getTotalasientos() {
        return totalasientos;
    }

    public void setTotalasientos(int totalasientos) {
        this.totalasientos = totalasientos;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    @Override
    public String toString() {
        return "Reserva{" + "origen=" + origen + ", destino=" + destino + ", fechaVuelo=" + fechaVuelo + ", asiento=" + asiento + ", estado=" + estado + ", cantAsientos=" + cantAsientos + ", totalasientos=" + totalasientos + ", horasalida=" + horasalida + '}';
    }

}
