/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso6;

/**
 *
 * @author asortega
 */
public class ventas {
    
    public String empleado;
    public String ciudad;
    public double ventas;
    
    public ventas(String pEmpleado, String pCiudad, double pVentas){
        this.empleado = pEmpleado;
        this.ciudad = pCiudad;
        this.ventas = pVentas;
    }
    
    
    public void cambiarEmpleado(String pempleado){
        this.empleado = pempleado;
    }
    public void cambiarCiudad(String pciudad){
        this.ciudad = pciudad;
        
    }
    public void cambiarVentas(double pventas){
        this.ventas = pventas;
        
    }
    
    public String obtenerEmpleado(){
        return empleado;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    public double obtenerVentas(){
        return ventas;
    }
    
    
    
}
