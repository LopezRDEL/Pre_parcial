
package com.mycompany.poo;

/**
 *
 * @author Diego Lopez
 */
public class Profesor extends Persona {
    
    private String materia;
    private String facultad;

    public Profesor(String nombre, int edad, String direccion,String materia, String facultad) {
        super(nombre, edad, direccion);
        this.materia = materia;
        this.facultad = facultad;
    }
    
    public void mostrarInfoprofesor(){
        super.mostrarInfo();
        System.out.println("Calculo");
        System.out.println("Ingenierias");
       
    }
    
}
