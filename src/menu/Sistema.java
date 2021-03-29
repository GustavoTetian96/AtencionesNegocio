/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import opciones.*;
/**
 *
 * @author Gustavo
 */
public class Sistema {
    
    public static void main(String[]args){
        int opcion;
        boolean salir=true;
        Scanner sw = new Scanner(System.in);
        while(salir){
            
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Opcion 3");
           System.out.println("5. Opcion 3");
           System.out.println("6. Opcion 3");
           System.out.println("7. Salir");
            
           System.out.print("Escribe una de las opciones:\t");
           opcion = sw.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   inicializarSistema();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5");
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6");
                   break;
                case 7:
                   salir=false;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
           }
            
       }
    }
    public static void inicializarSistema(){
        Empleado e1 = new Empleado("1927263829",true,"Alison","0982737282","alisonsn@hotmail.com");
        Empleado e2 = new Empleado("1701827363",true,"Ronald","0892736456","ronaldsol@hotmail.com");
        Empleado e3 = new Empleado("1700827649",false,"Emanuel","0927362892","emanuksd@hotmail.com");
        Negocio negocio = new Negocio("HydroSPA","0994709231","hydrospa@gmail.com","av.quevedo sto dgo");
        negocio.getEmpleados().add(e1);
        negocio.getEmpleados().add(e2);
        negocio.getEmpleados().add(e3);
        negocio.setAdministrador(e2);
        System.out.println(negocio.getEmpleados().size());
        System.out.println(negocio);
       
    }
    
}
