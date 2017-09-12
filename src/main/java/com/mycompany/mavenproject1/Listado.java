
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 * Esta clase contiene el menu del proyecto 
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since FavoritosNetflix 1.0.0
 */
public class Listado {

    /**
    * metodo listado vacio sin parametros
    */
    public Listado() throws Exception{
        
        
        
        Scanner t = new Scanner(System.in);
    // Inicio del programa
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("       ***    *** ******* ************ ********** ***     ****  *****      *****            ");
        System.out.println("       ****   *** ******* ************ ********** ***     ****   *****    *****             ");
        System.out.println("       *****  *** ***         ****     ***        ***     ****    *****  *****              ");
        System.out.println("       ****** *** ******      ****     ******     ***     ****     **********               ");
        System.out.println("       ********** ******      ****     ******     ***     ****     *********                ");
        System.out.println("       *** ****** ***         ****     ***        ***     ****     ***** *****              ");
        System.out.println("       ***  ***** ***         ****     ***        ***     ****    *****   *****             ");
        System.out.println("       ***   **** *******     ****     ***        ******* ****   *****     *****            ");
        System.out.println("       ***    *** *******     ****     ***        ******* ****  *****       *****           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
    
        
        ApiNetflix p = new ApiNetflix();
        
    //Meni del programa    
        OUTER:
        while (true) {
               
               System.out.println("----------------Menu----------------------");
               System.out.println("1. Busqueda por Actor o Actriz            ");
               System.out.println("2. Busqueda por Categoria                 ");
               System.out.println("3. Busqueda por Nombre                    ");
               System.out.println("4. Agregar peliculas a lista de favoritos ");
               System.out.println("5. Mostrar Favoritos                      ");
               System.out.println("6. Salir                                  ");
               System.out.println("------------------------------------------");
               System.out.println(" ");
           
               
                int op =t.nextInt();
                
                
               switch(op){
                    case 1:
                           int i=1;
                           p.Actor(i);
                           submenu();                      
                       break;
                       
                    case 2:
                           int j=2;
                           p.Actor(j);

                       break;
                       
                    case 3:
                           int k=3;
                           p.Actor(k);
  
                       break;
                       
                    case 4:
                           submenu();                   
                           int op2=t.nextInt();
                           switch(op2){
                                case 1:
                                    System.out.println("Ingrese el nombre de la pelicula a agregar :");
                                    t.nextLine();
                                    String nombre = t.nextLine();
                                    p.Agregar(nombre);
                                   
                                   break;
                                case 2:
                                    
                                    break;
                           }
                        
                        
                        break ;
                    
                    case 5:
                       p.mostrar();
                        break;
                    
                    case 6:
                        
                        break OUTER;
                }        
    
        }
    }
            
    /**
     * Submenu para agregar peliculas al array de favoitos
     */
    public static void submenu(){
        System.out.println("---------------Favoritos-----------------|");
        System.out.println("1. Agregar una peliculas a Favoritos     |");
        System.out.println("2. Regresar                              |");
        System.out.println("-----------------------------------------|");
    }
       
    
    
//Fin de la clase Listado    
}
    
    
    
    
    

