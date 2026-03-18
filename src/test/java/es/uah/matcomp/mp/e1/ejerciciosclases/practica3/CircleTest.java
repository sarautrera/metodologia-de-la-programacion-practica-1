package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c1 = new Circle(3.5);
        System.out.println("===== TEST getRadius() =====");
        System.out.println("Radio: " + c1.getRadius());
        assertEquals(3.5, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        System.out.println("===== TEST setRadius() =====");
        System.out.println("Nuevo radio: " + c1.getRadius());
        assertEquals(2.5, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c1 = new Circle(2.0);
        double expected = Math.PI * 2.0 * 2.0;
        System.out.println("===== TEST getArea() =====");
        System.out.println("Área esperada: " + expected);
        System.out.println("Área obtenida: " + c1.getArea());
        assertEquals(expected, c1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Circle c1 = new Circle(2.0);
        double expected = 2 * Math.PI * 2.0;
        System.out.println("===== TEST getPerimeter() =====");
        System.out.println("Perímetro esperado: " + expected);
        System.out.println("Perímetro obtenido: " + c1.getPerimeter());
        assertEquals(expected, c1.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c1 = new Circle(2.0, "red", true);
        String expected = "Circle[Shape[color=red, filled=true], radius=2.0]";
        System.out.println("===== TEST toString() =====");
        System.out.println("Esperado: " + expected);
        System.out.println("Obtenido: " + c1);
        assertEquals(expected, c1.toString());
    }
}
