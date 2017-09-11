/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Clint
 */
public class Favoritos {
    
    private int unit;
    private int id;
    private String titulo;
    private String año;
    private float rating;
    private String categoria;
    private String cast;
    private String director;
    private String resumen;
    private String duracion;

    public Favoritos(int unit, int id, String titulo, String año, float rating, String categoria, String cast, String director, String resumen, String duracion) {
        this.unit = unit;
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.rating = rating;
        this.categoria = categoria;
        this.cast = cast;
        this.director = director;
        this.resumen = resumen;
        this.duracion = duracion;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
