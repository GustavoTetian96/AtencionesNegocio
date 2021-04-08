/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opciones;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Negocio {
    ArrayList<Empleado> empleados;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private String horaInicioAtencion;
    private String horaFinAtencion;
    private Empleado Administrador;
    public Negocio(){
    }
    public Negocio(String nombre,String telefono,String mail,String direccion){
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=mail;
        this.direccion=direccion;
        empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("192837429324",true,"Barry","0982742311","barryallen@hotmail.com"));
        //AsignarAdministrador();
        
    }
    public Empleado AsignarAdministrador(){ //para asignar administrador aleatoriamente
        boolean bandera=true;
        int aleatorio = (int)(Math.random()*empleados.size());
        Empleado e = empleados.get(aleatorio);
        while(e.isEsActivo() && bandera){
            bandera=false;
            Administrador = e;
        }
        return Administrador;
    }
    
    public ArrayList<Empleado> getEmpleados() {
        AsignarAdministrador();
        return empleados;
    }

    public void setAdministrador(Empleado empleado) { //para asignar administrador manualmente
        this.Administrador = empleado;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHoraInicioAtencion(String horaInicioAtencion) {
        this.horaInicioAtencion = horaInicioAtencion;
    }

    public void setHoraFinAtencion(String horaFinAtencion) {
        this.horaFinAtencion = horaFinAtencion;
    }
    
    @Override
    public String toString() {
        return "Negocio{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + ", horaInicioAtencion=" + horaInicioAtencion + ", horaFinAtencion=" + horaFinAtencion + ", Administrador=" + Administrador + '}';
    }
    
}
