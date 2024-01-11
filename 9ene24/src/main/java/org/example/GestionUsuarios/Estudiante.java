package org.example.GestionUsuarios;

public class Estudiante extends Persona{
    int grado;
    public Estudiante(String nombre, int edad, int grado){
        super(nombre, edad);
        this.grado=grado;
    }
    @Override
    public void realizarAcciones() {
        System.out.println(nombre + " estoy en el grado: " + grado);
    }
}
