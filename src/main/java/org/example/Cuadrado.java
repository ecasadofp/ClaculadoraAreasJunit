package org.example;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        return Math.pow(lado,2);
    }

    public double getPerimetro(){
        return 4*lado;
    }

    public double getDiagonal(){
        double resultado = Math.sqrt(2*Math.pow(lado,2));
        return resultado;
    }
}
