package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void getArea() {
        Cuadrado cuadrado2 = new Cuadrado(2);
        assertEquals(4,cuadrado2.getArea());
    }

    @Test
    void getPerimetro() {

        Cuadrado cuadrado3 = new Cuadrado(3);
        assertEquals(12, cuadrado3.getPerimetro());

    }

    @Test
    void getDiagonal(){
        Cuadrado cuadrado1 = new Cuadrado(1);
        assertEquals(1.4142, cuadrado1.getDiagonal(),0.001);
    }
}