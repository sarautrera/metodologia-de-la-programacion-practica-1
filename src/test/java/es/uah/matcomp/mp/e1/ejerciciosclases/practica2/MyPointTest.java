package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @org.junit.jupiter.api.Test
    void getX() {
        MyPoint p1 = new MyPoint(3, 5);
        System.out.println("X: " + p1.getX());
        assertEquals(3, p1.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        MyPoint p1 = new MyPoint(3, 5);
        System.out.println("Y: " + p1.getY());
        assertEquals(5, p1.getY());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        MyPoint p1 = new MyPoint();
        p1.setX(8);
        System.out.println("Nuevo X: " + p1.getX());
        assertEquals(8, p1.getX());
    }

    @org.junit.jupiter.api.Test
    void setY() {
        MyPoint p1 = new MyPoint();
        p1.setY(9);
        System.out.println("Nuevo Y: " + p1.getY());
        assertEquals(9, p1.getY());
    }

    @org.junit.jupiter.api.Test
    void getXY() {
        MyPoint p1 = new MyPoint(8, 9);
        int[] expected = {8, 9};
        System.out.println("X: " + p1.getXY()[0]);
        System.out.println("Y: " + p1.getXY()[1]);
        assertArrayEquals(expected, p1.getXY());
    }

    @org.junit.jupiter.api.Test
    void setXY() {
        MyPoint p1 = new MyPoint();
        p1.setXY(4, 5);
        int[] expected = {4, 5};
        System.out.println("Coordenadas después de setXY: x=" + p1.getXY()[0] + ", y=" + p1.getXY()[1]);
        assertArrayEquals(expected, p1.getXY());
    }

    @org.junit.jupiter.api.Test
    void distance() {
        MyPoint p1 = new MyPoint(3, 4);
        double expected = 5.0; // Distancia hasta (0,0)
        System.out.println("Distancia hasta (0,0): " + p1.distance());
        assertEquals(expected, p1.distance());
    }

    @org.junit.jupiter.api.Test
    void testDistanceXY() {
        MyPoint p1 = new MyPoint(3, 4);
        double expected = Math.sqrt(Math.pow(3 - 0, 2) + Math.pow(4 - 0, 2));
        System.out.println("Distancia hasta (0,0) usando parámetros: " + p1.distance(0, 0));
        assertEquals(expected, p1.distance(0, 0));
    }

    @org.junit.jupiter.api.Test
    void testDistanceMyPoint() {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);
        double expected = Math.sqrt(Math.pow(6 - 3, 2) + Math.pow(8 - 4, 2));
        System.out.printf("Distancia entre %s y %s: %.2f%n", p1, p2, p1.distance(p2));
        assertEquals(expected, p1.distance(p2));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MyPoint p1 = new MyPoint(1, 2);
        String expected = "(1,2)";
        System.out.println("Salida toString: " + p1);
        assertEquals(expected, p1.toString());
    }
}
