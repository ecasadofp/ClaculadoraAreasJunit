package org.example;

public class Triangulo implements Figura{
    private double  base, altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getArea(){
        return base * altura / 2;
    }
}
