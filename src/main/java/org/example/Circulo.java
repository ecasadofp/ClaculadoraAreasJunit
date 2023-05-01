package org.example;

public class Circulo implements Figura{

    private double radio;

    public Circulo (double r){
        this.radio = r;
    }

    public double getArea(){
        return (Math.PI * Math.pow(radio,2));
    }

    public double getPerimetro(){
        return 2*Math.PI*radio;
    }
}
