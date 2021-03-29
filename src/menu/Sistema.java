/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Sistema {
    
    public static void main(String[]args){
        int opcion;
        boolean salir=true;
        Scanner sw = new Scanner(System.in);
        while(!salir){
            
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Opcion 3");
           System.out.println("5. Opcion 3");
           System.out.println("6. Opcion 3");
           System.out.println("7. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sw.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 7:
                   salir=false;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
           }
            
       }
    }
    
}
