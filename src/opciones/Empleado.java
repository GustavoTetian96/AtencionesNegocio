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
    public Empleado(String cedula, boolean activo){
        super(cedula);
        this.esActivo=activo;
    }
    public Empleado(String cedula, boolean activo,String nombre,String telefono,String email){
        super(cedula);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.esActivo=activo;
    }

    public boolean isEsActivo() {
        return this.esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }
    
}
