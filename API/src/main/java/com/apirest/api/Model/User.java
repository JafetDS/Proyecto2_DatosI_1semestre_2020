package com.apirest.api.Model;

import java.util.LinkedList;

public class User {
    private  int id;
    private String nombre;
    private String correo;
    private LinkedList<String>seguidores;
    private LinkedList<String>seguidos;
    private LinkedList<String>recetas;

    public User(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.seguidores = new LinkedList();
        this.seguidos = new LinkedList();
        this.recetas = new LinkedList();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LinkedList<String> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(LinkedList<String> seguidores) {
        this.seguidores = seguidores;
    }

    public LinkedList<String> getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(LinkedList<String> seguidos) {
        this.seguidos = seguidos;
    }

    public LinkedList<String> getRecetas() {
        return recetas;
    }

    public void setRecetas(LinkedList<String> recetas) {
        this.recetas = recetas;
    }
}
