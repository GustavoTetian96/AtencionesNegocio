/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opciones;

/**
 *
 * @author Gustavo
 */
public class Cliente extends Persona{
    public Cliente(String cedula){
        super(cedula);
    }
    public void usuario(){
         System.out.println("Ejemplo de implementacion metodo abstracto de padre");
     }
}
