package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RectanguloTest {

    static Rectangulo rectanguloPruebas;
    @BeforeAll
    static void setUp() {
        rectanguloPruebas = new Rectangulo(2, 3);
    }

    @Test
    void getArea() {
        assertEquals(6, rectanguloPruebas.getArea());
    }

    @Test
    void getAreaDouble() {
        Rectangulo rectanguloDouble = new Rectangulo(2,0.1);
        assertEquals(0.2, rectanguloDouble.getArea());
    }

    @Test
    void getPerimetro() {
        assertEquals(10,rectanguloPruebas.getPerimetro());
    }
}