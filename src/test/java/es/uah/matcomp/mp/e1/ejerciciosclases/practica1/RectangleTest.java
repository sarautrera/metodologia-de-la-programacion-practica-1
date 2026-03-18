package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @org.junit.jupiter.api.Test
    void getLength() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println("length is: " + r1.getLength());
        assertEquals(1.2f, r1.getLength());
    }

    @org.junit.jupiter.api.Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(5.6f);
        System.out.println("new length is: " + r1.getLength());
        assertEquals(5.6f, r1.getLength());
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println("width is: " + r1.getWidth());
        assertEquals(3.4f, r1.getWidth());
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        r1.setWidth(7.8f);
        System.out.println("new width is: " + r1.getWidth());
        assertEquals(7.8f, r1.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Rectangle r1 = new Rectangle(2.0f, 2.0f);
        System.out.println("area is: " + r1.getArea());
        // 2.0 * 2.0 = 4.0
        assertEquals(4.0, r1.getArea(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(2.0f, 3.0f);
        System.out.println("perimeter is: " + r1.getPerimeter());
        // (2*2.0) + (2*3.0) = 10.0
        assertEquals(10.0, r1.getPerimeter(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1.toString());
        // Nota: He respetado el espacio extra que pusiste en el toString original ("lenght= ")
        String expected = "rectangle [lenght= 1.2, width= 3.4]";
        assertEquals(expected, r1.toString());
    }
}