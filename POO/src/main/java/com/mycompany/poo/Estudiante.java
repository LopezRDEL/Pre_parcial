
package com.mycompany.poo;

/**
 *
 * @author Diego Lopez
 */
public class Estudiante extends Persona {
    
    private String matricula;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre,int edad, String direccion, String matricula, String carrera) {
        super(nombre, edad, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("mi matricula es "+ matricula);
        System.out.println("y finalmente mi carrera es "+ carrera);
    }  
    
}
