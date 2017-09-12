/**
 * Clase main que contiene el llamado a la clase que contiene la logoca del programa junto con sus excepciones
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since FavoritosNetflix 1.0.0
 */
package com.mycompany.mavenproject1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.InputMismatchException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;


public class ReadJson {
    
    public static void main(String[] args) throws Exception{
    
    // Excepciones del proyecto 
    
    boolean p=true;    
    do{    
        try{
        Listado l = new Listado();
        }
        //catch para un dato de entrada erroneo
        catch(InputMismatchException e){
            System.out.println("----------------------------");
            System.out.println(" Error Intentelo Nuevamente ");   
            System.out.println("----------------------------");
        // catch para puntero nulo    
        }catch(NullPointerException e){
            System.out.println("----------------------------------");
            System.out.println(" No se encontraron mas datos  ");
            System.out.println("----------------------------------");
        // catch para el debordamiento del vector    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("--------------------------------");
            System.out.println("Se supero el limite de la lista ");
            System.out.println("--------------------------------");
        }
        
    }while(p);
    }    
}