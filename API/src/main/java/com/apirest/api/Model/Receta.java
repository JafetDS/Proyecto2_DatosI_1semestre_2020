package com.apirest.api.Model;

import java.util.LinkedList;

public class Receta {
    private String nombre;
    private String autor;
    private Integer pocion;
    private Integer precio;
    private LinkedList<String> pasos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPocion() {
        return pocion;
    }

    public void setPocion(Integer pocion) {
        this.pocion = pocion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public LinkedList<String> getPasos() {
        return pasos;
    }

    public void setPasos(LinkedList<String> pasos) {
        this.pasos = pasos;
    }
}
