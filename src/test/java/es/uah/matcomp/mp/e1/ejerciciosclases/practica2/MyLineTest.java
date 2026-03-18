package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @org.junit.jupiter.api.Test
    void getBeginAndEnd() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        System.out.println("x1: " + l1.getBeginX());
        System.out.println("y1: " + l1.getBeginY());
        System.out.println("x2: " + l1.getEndX());
        System.out.println("y2: " + l1.getEndY());

        assertEquals(1, l1.getBeginX());
        assertEquals(2, l1.getBeginY());
        assertEquals(3, l1.getEndX());
        assertEquals(4, l1.getEndY());
    }

    @org.junit.jupiter.api.Test
    void getBeginAndEndWithPoints() {
        MyPoint p1 = new MyPoint(4, 5);
        MyPoint p2 = new MyPoint(6, 7);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println("p1: " + l2.getBegin());
        System.out.println("p2: " + l2.getEnd());

        assertEquals(p1, l2.getBegin());
        assertEquals(p2, l2.getEnd());
    }

    @org.junit.jupiter.api.Test
    void setBeginAndEnd() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        MyPoint newBegin = new MyPoint(10, 20);
        MyPoint newEnd = new MyPoint(30, 40);
        l1.setBegin(newBegin);
        l1.setEnd(newEnd);
        System.out.println("Nuevo inicio: " + l1.getBegin());
        System.out.println("Nuevo fin: " + l1.getEnd());

        assertEquals(newBegin, l1.getBegin());
        assertEquals(newEnd, l1.getEnd());
    }

    @org.junit.jupiter.api.Test
    void setBeginAndEndXY() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setBeginXY(5, 6);
        l1.setEndXY(7, 8);
        int[] expectedBegin = {5, 6};
        int[] expectedEnd = {7, 8};
        System.out.println("Inicio modificado con setBeginXY: x=" + l1.getBeginXY()[0] + ", y=" + l1.getBeginXY()[1]);
        System.out.println("Fin modificado con setEndXY: x=" + l1.getEndXY()[0] + ", y=" + l1.getEndXY()[1]);

        assertArrayEquals(expectedBegin, l1.getBeginXY());
        assertArrayEquals(expectedEnd, l1.getEndXY());
    }

    @org.junit.jupiter.api.Test
    void setBeginAndEndX_Y() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setBeginX(10);
        l1.setBeginY(20);
        l1.setEndX(30);
        l1.setEndY(40);
        System.out.println("Nueva coordenada x1: " + l1.getBeginX());
        System.out.println("Nueva coordenada y1: " + l1.getBeginY());
        System.out.println("Nueva coordenada x2: " + l1.getEndX());
        System.out.println("Nueva coordenada y2: " + l1.getEndY());

        assertEquals(10, l1.getBeginX());
        assertEquals(20, l1.getBeginY());
        assertEquals(30, l1.getEndX());
        assertEquals(40, l1.getEndY());
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        MyLine l1 = new MyLine(1, 1, 4, 5);
        double expected = Math.sqrt(Math.pow(4 - 1, 2) + Math.pow(5 - 1, 2)); // debería ser 5.0
        System.out.println("Longitud de la línea: " + l1.getLength());
        assertEquals(expected, l1.getLength());
    }

    @org.junit.jupiter.api.Test
    void getGradient() {
        MyLine l1 = new MyLine(0, 0, 1, 1);
        System.out.println("Ángulo (en radianes): " + l1.getGradient());
        assertEquals(Math.atan2(1, 1), l1.getGradient());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        String expected = "MyLine[begin=(1,2), end=(3,4)]";
        System.out.println("Salida toString: " + l1.toString());
        assertEquals(expected, l1.toString());
    }
}
