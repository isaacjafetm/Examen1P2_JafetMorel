/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_jafetmorel;

import java.util.Date;

/**
 *
 * @author 24661
 */
public class Peliculas extends Productos{
    private int duracion;
    private Date salas, streaming;
    private String plot;

    public Peliculas() {
        super();
    }

    public Peliculas(int duracion, Date salas, Date streaming, String plot, String nombre) {
        super(nombre);
        this.duracion = duracion;
        this.salas = salas;
        this.streaming = streaming;
        this.plot = plot;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getSalas() {
        return salas;
    }

    public void setSalas(Date salas) {
        this.salas = salas;
    }

    public Date getStreaming() {
        return streaming;
    }

    public void setStreaming(Date streaming) {
        this.streaming = streaming;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "duracion=" + duracion + ", salas=" + salas + ", streaming=" + streaming + ", plot=" + plot + '}';
    }
    
}
