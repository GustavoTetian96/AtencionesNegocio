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
public class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;
    public Persona(String ced){
        this.cedula=ced;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
}
