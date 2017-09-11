/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class ApiNetflix  {
    
    int contador = 0;
    Favoritos lista[]=new Favoritos[15];
    Favoritos aux[]=new Favoritos[1];
    Favoritos lista2[]=new Favoritos[15];
    Favoritos listaA[]=new Favoritos[15];

    public Favoritos[] getListaA() {
        return listaA;
    }

    public void setListaA(Favoritos[] listaA) {
        this.listaA = listaA;
    }
    
    public Favoritos[] getLista2() {
        return lista2;
    }

    public void setLista2(Favoritos[] lista2) {
        this.lista2 = lista2;
    }
   
    
    
    
    public void Actor(int op) throws Exception{
        Scanner t = new Scanner(System.in);
        
        if(op == 1){
            System.out.println(" Digite el nombre del actor : ");
            String nombre=t.nextLine();
            String nombre1 = nombre.replace(" ","%20");
            
            String json = ApiNetflix.readUrl("https://netflixroulette.net/api/api.php?actor="+nombre1); //API de netflix
            JSONArray peliculas = new JSONArray(json);
            for(int i=0; i<peliculas.length(); i++){
                System.out.println("----------------------------------------------");
                JSONObject pelicula = (JSONObject)peliculas.get(i);
                System.out.println("ID :"+pelicula.getInt("unit"));
                System.out.println("Nombre :"+pelicula.get("show_title"));
                System.out.println("Año :"+pelicula.getString("release_year"));
                System.out.println("rating :"+pelicula.getString("rating"));
                System.out.println("Categoria :"+pelicula.getString("category"));
                System.out.println("Show Cast :"+pelicula.getString("show_cast"));
                System.out.println("Director :"+pelicula.getString("director"));
                System.out.println("Resumen :"+pelicula.getString("summary"));
                System.out.println("Duracion :"+pelicula.getString("runtime"));
                System.out.println("Categoria :"+pelicula.getString("category"));
            } 
        }
        
        if(op == 2){
            System.out.println(" Digite el nombre del director : ");
            String nombre=t.nextLine();
            String nombre1 = nombre.replace(" ","%20");
            
            String json = ApiNetflix.readUrl("https://netflixroulette.net/api/api.php?director="+nombre1); //API de netflix
            JSONArray peliculas = new JSONArray(json);
            for(int i=0; i<peliculas.length(); i++){
                System.out.println("----------------------------------------------");
                JSONObject pelicula = (JSONObject)peliculas.get(i);
                System.out.println("ID :"+pelicula.getInt("unit"));
                System.out.println("Nombre :"+pelicula.get("show_title"));
                System.out.println("Año :"+pelicula.getString("release_year"));
                System.out.println("rating :"+pelicula.getString("rating"));
                System.out.println("Categoria :"+pelicula.getString("category"));
                System.out.println("Show Cast :"+pelicula.getString("show_cast"));
                System.out.println("Director :"+pelicula.getString("director"));
                System.out.println("Resumen :"+pelicula.getString("summary"));
                System.out.println("Duracion :"+pelicula.getString("runtime"));
                System.out.println("Categoria :"+pelicula.getString("category"));
            } 
        }
        
        if(op == 3){
            System.out.println(" Digite el titulo de la pelicula : ");
            String nombre=t.nextLine();
            String nombre1 = nombre.replace(" ","%20");
            
            String json2 = ApiNetflix.readUrl("https://netflixroulette.net/api/api.php?title="+nombre1);
            JSONObject pelicula2 = new JSONObject(json2);
            
            System.out.println("----------------------------------------------");    
                System.out.println("ID :"+pelicula2.getInt("unit"));
                System.out.println("Nombre :"+pelicula2.get("show_title"));
                System.out.println("Año :"+pelicula2.getString("release_year"));
                System.out.println("rating :"+pelicula2.getString("rating"));
                System.out.println("Categoria :"+pelicula2.getString("category"));
                System.out.println("Show Cast :"+pelicula2.getString("show_cast"));
                System.out.println("Director :"+pelicula2.getString("director"));
                System.out.println("Resumen :"+pelicula2.getString("summary"));
                System.out.println("Duracion :"+pelicula2.getString("runtime"));
                System.out.println("Categoria :"+pelicula2.getString("category"));
            
        }
                
    }
    

    public void Agregar(String nombre) throws Exception{
                           
            float puntaje=0;
            String nombre1 = nombre.replace(" ","%20");
            
            
            String json2 = ApiNetflix.readUrl("https://netflixroulette.net/api/api.php?title="+nombre1);
            JSONObject pelicula2 = new JSONObject(json2);
            
            System.out.println("----------------------------------------------");    
                int unit = pelicula2.getInt("unit");
                int id = pelicula2.getInt("show_id");
                String titulo =  pelicula2.getString("show_title");
                String año = pelicula2.getString("release_year");
                String rating = pelicula2.getString("rating");
                puntaje=Float.parseFloat(rating);
                String categoria = pelicula2.getString("category");
                String cast=pelicula2.getString("show_cast");
                String director = pelicula2.getString("director");
                String resumen= pelicula2.getString("summary");
                String duracion = pelicula2.getString("runtime");
                
                lista[contador]= new Favoritos(unit,id,titulo,año,puntaje,categoria,cast,director,resumen,duracion);
                
           contador = contador +1;
           
           
    }
    
    
    public void ascendete() {
        
    this.lista2=this.lista;           
    
    int tamaño=this.lista2.length;
     
    for(int i=1;i<tamaño;i++){
        for(int j=0;j<tamaño-1;j++){
            if(this.lista2[j].getRating()>this.lista2[j+1].getRating()){
                    this.aux[0]=this.lista2[j];
                    this.lista2[j]=this.lista2[j+1];
                    this.lista2[j+1]=this.aux[1];
                    System.out.println("aux :"+this.aux[j]);
                    System.out.println("lista2 :"+this.lista2[j]);
            }
        }
    }
        this.setListaA(lista2);
        
    }
    
  
    public void mostrar(){
        for(int i=0;i<this.lista.length;i++){           
            System.out.println("----------Pelicula "+(i+1)+"-----------");
            System.out.println("Unidad : :"+this.lista[i].getUnit());
            System.out.println("Id :"+this.lista[i].getId());
            System.out.println("Titulo :"+this.lista[i].getTitulo());
            System.out.println("Año de estreno :"+this.lista[i].getAño());
            System.out.println("Rating :"+this.lista[i].getRating());
            System.out.println("Categoria :"+this.lista[i].getCategoria());
            System.out.println("Cast :"+this.lista[i].getCast());
            System.out.println("Director :"+this.lista[i].getDirector());
            System.out.println("Resumen :"+this.lista[i].getResumen());
            System.out.println("Duracion :"+this.lista[i].getDuracion());
            System.out.println("---------------------------------------");
            
            
            System.out.println("--------------------------------");
            
        }      
    }
    
    
    
    
        public void mostrarA(){
        for(int i=0;i<this.listaA.length;i++){           
            System.out.println("----------Pelicula "+(i+1)+"-----------");
            System.out.println("Unidad : :"+this.listaA[i].getUnit());
            System.out.println("Id :"+this.listaA[i].getId());
            System.out.println("Titulo :"+this.listaA[i].getTitulo());
            System.out.println("Año de estreno :"+this.listaA[i].getAño());
            System.out.println("Rating :"+this.listaA[i].getRating());
            System.out.println("Categoria :"+this.listaA[i].getCategoria());
            System.out.println("Cast :"+this.listaA[i].getCast());
            System.out.println("Director :"+this.listaA[i].getDirector());
            System.out.println("Resumen :"+this.listaA[i].getResumen());
            System.out.println("Duracion :"+this.listaA[i].getDuracion());
            System.out.println("---------------------------------------");
            
            
            System.out.println("--------------------------------");
            
        }      
    }
       
    private static String readUrl(String urlString) throws Exception { 
        BufferedReader reader = null; 
        try { 
            URL url = new URL(urlString); 
            reader = new BufferedReader(new InputStreamReader(url.openStream())); 
            StringBuffer buffer = new StringBuffer(); 
            int read; 
            char[] chars = new char[1024]; 
            
            while ((read = reader.read(chars)) != -1) 
                   buffer.append(chars, 0, read); 
            
            return buffer.toString(); 
        } finally { 
            if (reader != null) 
                reader.close(); 
        } 
    }

    
    
}
