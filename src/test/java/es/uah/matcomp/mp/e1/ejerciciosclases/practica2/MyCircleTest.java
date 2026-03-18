package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        MyCircle c1 = new MyCircle(1, 2, 3);
        System.out.println("Radio del círculo: " + c1.getRadius());
        assertEquals(3, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        MyCircle c1 = new MyCircle(1, 2, 5);
        c1.setRadius(7);
        System.out.println("Nuevo radio: " + c1.getRadius());
        assertEquals(7, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getCenter() {
        MyPoint p1 = new MyPoint(1, 2);
        MyCircle c1 = new MyCircle(p1, 4);
        System.out.println("Centro del círculo: " + c1.getCenter());
        assertEquals(p1, c1.getCenter());
    }

    @org.junit.jupiter.api.Test
    void setCenter() {
        MyPoint p1 = new MyPoint(1, 1);
        MyCircle c1 = new MyCircle(2, 2, 3);
        c1.setCenter(p1);
        System.out.println("Nuevo centro del círculo: " + c1.getCenter());
        assertEquals(p1, c1.getCenter());
    }

    @org.junit.jupiter.api.Test
    void getCenterX() {
        MyCircle c1 = new MyCircle(4, 5, 2);
        System.out.println("Coordenada X del centro: " + c1.getCenterX());
        assertEquals(4, c1.getCenterX());
    }

    @org.junit.jupiter.api.Test
    void getCenterY() {
        MyCircle c1 = new MyCircle(4, 5, 2);
        System.out.println("Coordenada Y del centro: " + c1.getCenterY());
        assertEquals(5, c1.getCenterY());
    }

    @org.junit.jupiter.api.Test
    void setCenterX() {
        MyCircle c1 = new MyCircle();
        c1.setCenterX(10);
        System.out.println("Nueva coordenada X: " + c1.getCenterX());
        assertEquals(10, c1.getCenterX());
    }

    @org.junit.jupiter.api.Test
    void setCenterY() {
        MyCircle c1 = new MyCircle();
        c1.setCenterY(7);
        System.out.println("Nueva coordenada Y: " + c1.getCenterY());
        assertEquals(7, c1.getCenterY());
    }

    @org.junit.jupiter.api.Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle(3, 4, 2);
        int[] expected = {3, 4};
        System.out.println("Coordenadas del centro: x=" + c1.getCenterXY()[0] + " y=" + c1.getCenterXY()[1]);
        assertArrayEquals(expected, c1.getCenterXY());
    }

    @org.junit.jupiter.api.Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle();
        c1.setCenterXY(5, 6);
        int[] expected = {5, 6};
        System.out.println("Centro modificado con setCenterXY: x=" + c1.getCenterXY()[0] + " y=" + c1.getCenterXY()[1]);
        assertArrayEquals(expected, c1.getCenterXY());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        MyCircle c1 = new MyCircle(0, 0, 3);
        double expected = Math.PI * 3 * 3;
        System.out.println("Área del círculo: " + c1.getArea());
        assertEquals(expected, c1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        MyCircle c1 = new MyCircle(0, 0, 4);
        double expected = Math.PI * 2 * 4;
        System.out.println("Circunferencia del círculo: " + c1.getCircumference());
        assertEquals(expected, c1.getCircumference());
    }

    @org.junit.jupiter.api.Test
    void distance() {
        MyCircle c1 = new MyCircle(1, 2, 3);
        MyCircle c2 = new MyCircle(4, 6, 5);
        System.out.println("Distancia entre c1 y c2: " + c1.distance(c2));
        assertEquals(c1.getCenter().distance(c2.getCenter()), c1.distance(c2));
    }

    @org.junit.jupiter.api.Test
    void tostring() {
        MyCircle c1 = new MyCircle(1, 2, 3);
        String expected = "MyCircle[radius=3, center=" + c1.getCenter() + "]";
        System.out.println("Salida toString: " + c1.tostring());
        assertEquals(expected, c1.tostring());
    }
}
