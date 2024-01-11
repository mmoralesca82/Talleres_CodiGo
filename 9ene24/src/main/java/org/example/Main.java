package org.example;

import org.example.DispositivosElectronicos.ReproductorMusica;
import org.example.DispositivosElectronicos.Televisor;
import org.example.FormasGeometricas.Circulo;
import org.example.FormasGeometricas.Rectangulo;
import org.example.FormasGeometricas.Triangulo;
import org.example.GestionUsuarios.Bot;
import org.example.GestionUsuarios.Estudiante;
import org.example.GestionUsuarios.Profesor;

public class Main {
    public static void main(String[] args) {

        /*Circulo circulo = new Circulo(4);
        System.out.println("el area del circulo es: " + circulo.calcularArea());
        System.out.println("el perimetro del circulo es: " + circulo.calcularPerimetro());

        //----Rectangulo
        Rectangulo rectangulo = new Rectangulo(6, 3);
        System.out.println("el area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("el perimetro del rectangulo  es: " + rectangulo.calcularPerimetro());

        //----Triangulo
        Triangulo triangulo = new Triangulo(6, 3, 4);
        System.out.println("el area del triangulo es: " + triangulo.calcularArea());
        System.out.println("el perimetro del triangulo  es: " + triangulo.calcularPerimetro());*/

        /*Televisor televisor = new Televisor();
        televisor.setCambiarCanal();
        televisor.pausar();

        ReproductorMusica reproductorMusica = new ReproductorMusica();
        reproductorMusica.reproducirCancion();
        reproductorMusica.conectar();*/

        //Crear instancias de profesor estudiante y bot
        Profesor profesor = new Profesor("JAVA", "Gabriel", 27);
        Estudiante estudiante = new Estudiante("Jorge", 20, 17);
        Bot bot = new Bot("yapesito");

        //Probar metodos
        profesor.iniciarSesion();
        estudiante.cerrarSesion();
        bot.realizarAcciones();

    }
}