
package com.mycompany.mavenproject1;
/**
 * Esta clase contiene los atributos y metodos get y set de la clase favoritos
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since FavoritosNetflix 1.0.0
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
/**
 * Constructor de la clase Favoritos
 * @param unit
 * @param id
 * @param titulo
 * @param año
 * @param rating
 * @param categoria
 * @param cast
 * @param director
 * @param resumen
 * @param duracion 
 */
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
/**
 * 
 * @return 
 */
    public int getUnit() {
        return unit;
    }
/**
 * 
 * @param unit 
 */
    public void setUnit(int unit) {
        this.unit = unit;
    }
/**
 * 
 * @return 
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return 
 */
    public String getTitulo() {
        return titulo;
    }
/**
 * 
 * @param titulo 
 */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
/**
 * 
 * @return 
 */
    public String getAño() {
        return año;
    }
/**
 * 
 * @param año 
 */
    public void setAño(String año) {
        this.año = año;
    }
/**
 * 
 * @return 
 */
    public float getRating() {
        return rating;
    } 
    
/**
 * 
 * @param rating 
 */
    public void setRating(float rating) {
        this.rating = rating;
    }

/**
 * 
 * @return 
 */
    public String getCategoria() {
        return categoria;
    }
/**
 * 
 * @param categoria 
 */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
/**
 * 
 * @return 
 */
    public String getCast() {
        return cast;
    }
/**
 * 
 * @param cast 
 */
    public void setCast(String cast) {
        this.cast = cast;
    }
/**
 * 
 * @return 
 */
    public String getDirector() {
        return director;
    }
/**
 * 
 * @param director 
 */
    public void setDirector(String director) {
        this.director = director;
    }
/**
 * 
 * @return 
 */
    public String getResumen() {
        return resumen;
    }
/**
 * 
 * @param resumen 
 */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
/**
 * 
 * @return 
 */
    public String getDuracion() {
        return duracion;
    }
/**
 * 
 * @param duracion 
 */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }


    
    
    
}
