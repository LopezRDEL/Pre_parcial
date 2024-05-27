
package com.mycompany.poo;

/**
 *
 * @author Diego Lopez
 */
public class Persona {
    
    private String nombre; 
    private int edad;
    private String direccion;

    public Persona() {
    }
    
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public void mostrarInfo(){
            System.out.println("Hola mi nombre es"+ nombre);
            System.out.println("mi edad es"+ edad);
            System.out.println("mi direccion es"+ direccion);

}
    
}
