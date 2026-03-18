package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("El radio es " + c4.getRadius());
        assertEquals(5.5, c4.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Circle c4 = new Circle();
        c4.setColor("verde");
        System.out.println("El color es " + c4.getColor());
        assertEquals("verde", c4.getColor());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        assertEquals(5.5, c4.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Circle c4 = new Circle();
        c4.setColor("verde");
        assertEquals("verde", c4.getColor());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        // Declarar una instancia de la clase circulo llamada c1
        Circle c1 = new Circle();
        // Invocar los metodos publicos en la instancia c1
        System.out.println("El circulo tiene un radio de "
                + c1.getRadius() + " y un area de " + c1.getArea());

        Circle c2 = new Circle(2.0);
        // Invocar los metodos publicos en la instancia c2
        System.out.println("El circulo tiene un radio de "
                + c2.getRadius() + " y un area de " + c2.getArea());

        // Verificación de seguridad
        assertTrue(c1.getArea() > 0);
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c1 = new Circle(1.0);
        // 2 * PI * 1 = 6.28...
        assertEquals(2 * Math.PI, c1.getCircumference(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        // De manera explicita
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        // De manera implicita
        Circle c6 = new Circle(6.6);
        System.out.println(c6); // Aquí Java llama a toString() automáticamente

        assertNotNull(c5.toString());
        assertTrue(c6.toString().contains("6.6"));
    }
}