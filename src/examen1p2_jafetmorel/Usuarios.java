/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_jafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Usuarios {
    private String nombre, apellido, email;
    private int telefono;
    private String plan;
    private ArrayList<Streaming> lista = new ArrayList();
    private String usuario, contra;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String email, int telefono, String plan, String usuario, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.plan = plan;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ArrayList<Streaming> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Streaming> lista) {
        this.lista = lista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", plan=" + plan + ", lista=" + lista + ", usuario=" + usuario + ", contra=" + contra + '}';
    }
    
}
