package org.example.FormasGeometricas;

public class Rectangulo implements FormaGeometrica{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base=base;

    }
    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base + altura);
    }
}
