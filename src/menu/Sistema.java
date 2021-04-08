/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import opciones.*;
/**
 *
 * @author Gustavo
 */
public class Sistema {
    public Sistema(){
        System.out.println("***Sistema Inicializado***");    
    }
    public static void main(String[]args){
        int opcion;
        Sistema s = new Sistema();
        boolean salir=true;
        Negocio negocio=s.inicializarSistema();
        while(salir){            
           switch(opcion=opcionMenu()){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   System.out.println(negocio);
                   s.editarInformacionNegocio(negocio);
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
    public Negocio inicializarSistema(){
        Empleado e1 = new Empleado("1927263829",true,"Alison","0982737282","alisonsn@hotmail.com");
        Empleado e2 = new Empleado("1701827363",true,"Ronald","0892736456","ronaldsol@hotmail.com");
        Empleado e3 = new Empleado("1700827649",false,"Emanuel","0927362892","emanuksd@hotmail.com");
        Negocio negocio = new Negocio("HydroSPA","0994709231","hydrospa@gmail.com","av.quevedo sto dgo");
        negocio.getEmpleados().add(e1);
        negocio.getEmpleados().add(e2);
        negocio.getEmpleados().add(e3);
        negocio.setAdministrador(e2);
        //System.out.println(negocio.getEmpleados().size());
        return negocio;
    }
    public static int opcionMenu(){
        Scanner sc= new Scanner(System.in);
        int opc=0;
        System.out.println("-----Welcome Menu----");
        System.out.println("\t1. Negocio");
        System.out.println("\t2. Servicios");
        System.out.println("\t3. Empleados");
        System.out.println("\t4. Clientes");
        System.out.println("\t5. Citas");
        System.out.println("\t6. Atenciones");
        System.out.println("\t7. Salir\n\n");
        do{
            System.out.println("Ingrese opcion [1-7]");
            opc=sc.nextInt();
        }while(opc<0 || opc>7);
        return opc;
    }
    public  void editarInformacionNegocio(Negocio n){
        Scanner ed = new Scanner(System.in);
        int atributo=0;
        String indicacion="\nModificar\n1.Nombre\n2.telefono\n3.email\n4.direccion\n5.horaInicio\n6.horaFin\n7.Administrador\n8.regresar\nIngrese Opcion[1-8]:\t";
        String sn,nombre="",telefono="",email="",direccion="",horainicio="",horafin="",cedula="";
        System.out.println("¿Editar informacion? [S/N]");
        sn=ed.nextLine().toUpperCase();
        if(sn.equals("S")){
            System.out.printf(indicacion);
            atributo=ed.nextInt();
            while(atributo!=8){
                if(atributo>9 || atributo<0){
                    System.out.printf("Ingrese numero opcion [1-8] %s",indicacion);
                    atributo=ed.nextInt();
                }else{
                    if(atributo==1){n.setNombre(ingresoDato(nombre,"Nombre:"));}
                    if(atributo==2){n.setTelefono(ingresoDato(telefono,"Telefono:"));}
                    if(atributo==3){n.setEmail(ingresoDato(email,"Email:"));}
                    if(atributo==4){n.setDireccion(ingresoDato(direccion,"Direccion:"));}
                    if(atributo==5){n.setHoraInicioAtencion(ingresoDato(horainicio,"Hora de inicio"));}
                    if(atributo==6){n.setHoraFinAtencion(ingresoDato(horafin,"Hora fin"));}
                    if(atributo==7){
                        Scanner nn = new Scanner(System.in);
                        System.out.println("Ingrese cedula nuevo Administrador:");
                        cedula=nn.nextLine();
                        Persona empl= new Empleado(cedula);                        
                        for(Empleado e: n.getEmpleados()){
                            if(empl.equals(e)){
                                n.setAdministrador(e);
                                System.out.printf("\nEmployee with ID:%s has been assigned as administrator\n",cedula);
                            }
                        }
                    }
                    System.out.printf("%s",indicacion);
                    atributo=ed.nextInt();//para volver ingresar una opcion para cambio
                    System.out.println(n);
                }
            }
            
        }else{
            if(!sn.equals("N")){
                System.out.println("Solo puede ingresar las letras s o n");
            }
        }
    }
    public String ingresoDato(String dato,String especificaciondato){
        Scanner dc = new Scanner(System.in);
        System.out.printf("\nIngrese nuevo %s\n",especificaciondato);
        dato=dc.nextLine();
        return dato;
    }
    
}
