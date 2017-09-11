/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author steven.hernandez
 */

public class ReadJson {
    
    public static void main(String[] args) throws Exception{
    
    boolean p=true;    
    do{    
        try{
        Listado l = new Listado();
        }
        catch(InputMismatchException e){
            System.out.println("----------------------------");
            System.out.println(" Error Intentelo Nuevamente ");   
            System.out.println("----------------------------");
        }catch(NullPointerException e){
            System.out.println("----------------------------------");
            System.out.println(" No se encontraron mas datos  ");
            System.out.println("----------------------------------");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("--------------------------------");
            System.out.println("Se supero el limite de la lista ");
            System.out.println("--------------------------------");
        }
        
    }while(p);
    }    
}