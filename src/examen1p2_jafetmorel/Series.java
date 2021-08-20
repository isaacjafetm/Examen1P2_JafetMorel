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
public class Series extends Productos{
    private int temporada;
    private String clasificacion;
    private Date estreno;
    private int actores;

    public Series() {
        super();
    }

    public Series(int temporada, String clasificacion, Date estreno, int actores, String nombre) {
        super(nombre);
        this.temporada = temporada;
        this.clasificacion = clasificacion;
        this.estreno = estreno;
        this.actores = actores;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Date getEstreno() {
        return estreno;
    }

    public void setEstreno(Date estreno) {
        this.estreno = estreno;
    }

    public int getActores() {
        return actores;
    }

    public void setActores(int actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Series{" + "temporada=" + temporada + ", clasificacion=" + clasificacion + ", estreno=" + estreno + ", actores=" + actores + '}';
    }
    
    
}
