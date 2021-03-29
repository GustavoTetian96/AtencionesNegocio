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
public class Empleado extends Persona {
    private boolean esActivo;
    public Empleado(String cedula){
        super(cedula);
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }
    
}
