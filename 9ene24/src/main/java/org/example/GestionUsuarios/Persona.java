package org.example.GestionUsuarios;

public  abstract class Persona implements Usuario{
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public void iniciarSesion() {
        System.out.println(nombre + " Has iniciado sesion");
    }

    @Override
    public void cerrarSesion() {
        System.out.println(nombre + " Has cerrado sesion");
    }

    public abstract void realizarAcciones();
}
