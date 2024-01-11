package org.example.GestionUsuarios;

public class Profesor extends Persona{
    String materia;
    public Profesor(String materia, String nombre, int edad){
        super(nombre, edad);
        this.materia=materia;
    }
    @Override
    public void realizarAcciones() {
        System.out.println(nombre + " esta enseñando");
    }
}
