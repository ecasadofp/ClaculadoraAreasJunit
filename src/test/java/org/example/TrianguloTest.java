package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    static Triangulo trianguloCero;
    static Triangulo trianguloUno;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        trianguloCero = new Triangulo(0, 4);
        trianguloUno = new Triangulo(1,1);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Triángulo de base 0")
    void getArea1() {
        assertEquals(0, trianguloCero.getArea());
    }

    @Test
    void getArea2(){
        assertEquals(0.5, trianguloUno.getArea());
    }
}