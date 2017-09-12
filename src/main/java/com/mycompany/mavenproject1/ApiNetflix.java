
package com.mycompany.mavenproject1;

/**
 * Esta clase contiene los metodos de busqueda y ordenamiento para un proyecto que utliliza la api de netflix
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since FavoritosNetflix 1.0.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class ApiNetflix {
    
    //atributos de la clase ApiNetflix (arrays y contador)
    
    int contador = 0;
    Favoritos lista[]=new Favoritos[3];
    Favoritos aux[]=new Favoritos[1];
    Favoritos lista2[];
    Favoritos listaA[]=new Favoritos[3];
    
    //metodos get y set de la clase
    /**
     * 
     * @return 
     */
    public Favoritos[] getListaA() {
        return listaA;
    }
    /**
     * 
     * @param listaA 
     */
    public void setListaA(Favoritos[] listaA) {
        this.listaA = listaA;
    }
    
    /**
     * 
     * @return 
     */
    public Favoritos[] getLista2() {
        return lista2;
    }

    /**
     * 
     * @param lista2 
     */
    public void setLista2(Favoritos[] lista2) {
        this.lista2 = lista2;
    }

    /**
     * 
     * @return 
     */
    public Favoritos[] getLista() {
        return lista;
    }

    /**
     * 
     * @param lista 
     */
    public void setLista(Favoritos[] lista) {
        this.lista = lista;
    }
   
    
    
    /**
     * metodo Actor que contiene las tres formas de busqueda que contiene el programa
     * @param op
     * @throws Exception 
     */
    public void Actor(int op) throws Exception{
        //ller datos por consola
        Scanner t = new Scanner(System.in);
        
        //condicional para busqueda por actor
        
        if(op == 1){
            System.out.println(" Digite el nombre del actor : ");
            String nombre=t.nextLine();
            String nombre1 = nombre.replace(" ","%20");
            
            //lectura de la url del json
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
        
        //condicional para la busqueda por director
        
        if(op == 2){
            System.out.println(" Digite el nombre del director : ");
            String nombre=t.nextLine();
            String nombre1 = nombre.replace(" ","%20");
            
            //lectura de la url del json de la api
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
        
        //condicional de la busqueda por el titulo de la pelicula
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
    
    /**
     * metodo agregar que recibe el nombre de la pelicula como parametro, lo busca y los envia a la clase Favoritos para la creacion de objetos
     * @param nombre
     * @throws Exception 
     */
    public void Agregar(String nombre) throws Exception{
            
            
            float puntaje=0;
            
            //aqui se reemplaza los espacios por "%20" para evitar algun tipo de error
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
        
        this.setLista(lista);
    }
    
    
    
    //Metodo de ordenamiento del array de objetos
    
    /*
    public void ascendete() {
        
    Favoritos a[] = new Favoritos[3];
    System.arraycopy(a,0, lista, 0,lista.length);
    
    Favoritos aux[]= new Favoritos[1];
    int tamaño=a.length;
    
    for(int i=0;i<tamaño;i++){
        
        for(int j=0;j<tamaño-1;j++){
            if(a[j].getRating() > a[j+1].getRating()){
                    aux[0]=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux[0];

            }
        }
        
        
    }
       
      this.setListaA(a);
    
    }
    */
    
    //-------------------------------------------------------------------------------------
    /**
     * Metodo mostrar que lista las peliculas agregadas al array de objetos favoritos
     */
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
    
    
    
    /*
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
    */
    
    /**
     * metodo que recibe como parametro la direccion de la url y permite que se trabaje con los datos obtenidos de ella.
     * @param urlString
     * @return
     * @throws Exception 
     */
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

    // Fin de la clase ApiNetflix
}

    
    

