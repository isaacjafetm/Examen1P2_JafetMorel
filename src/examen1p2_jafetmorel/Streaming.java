/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_jafetmorel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 24661
 */
public class Streaming {
    private String nombre;
    private int precio;
    private String calificación;
    private int fecha;
    private String empresas;
    private ArrayList<Productos> productos = new ArrayList();

    public Streaming() {
    }

    public Streaming(String nombre, int precio, String calificación, int fecha, String empresas) {
        this.nombre = nombre;
        this.precio = precio;
        this.calificación = calificación;
        this.fecha = fecha;
        this.empresas = empresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCalificación() {
        return calificación;
    }

    public void setCalificación(String calificación) {
        this.calificación = calificación;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEmpresas() {
        return empresas;
    }

    public void setEmpresas(String empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
