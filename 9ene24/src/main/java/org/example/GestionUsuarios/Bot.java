package org.example.GestionUsuarios;

public class Bot implements Usuario{
    String nombreBot;
    public Bot(String nombreBot){
        this.nombreBot=nombreBot;
    }
    @Override
    public void iniciarSesion() {
        System.out.println(nombreBot + " Has iniciado sesion como bot");

    }

    @Override
    public void cerrarSesion() {
        System.out.println(nombreBot + " Has cerrado sesion como bot");
    }

    @Override
    public void realizarAcciones() {
        System.out.println(nombreBot + " estas realizando acciones como bot");
    }
}
