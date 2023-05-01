package org.example;

public class Rectangulo implements Figura{
    private double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){

        return base*altura;
    }

    public double getPerimetro(){
        return 2*(base + altura);
    }
}
