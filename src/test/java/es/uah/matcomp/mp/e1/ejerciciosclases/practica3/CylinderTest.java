package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @org.junit.jupiter.api.Test
    void testDefaultConstructor() {
        Cylinder c = new Cylinder();
        assertEquals(1.0, c.getRadius(), 1e-9);
        assertEquals("red", c.getColor());
        assertEquals(1.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testConstructorWithRadius() {
        Cylinder c = new Cylinder(3.0);
        assertEquals(3.0, c.getRadius(), 1e-9);
        // height debe ser el valor por defecto 0.0 si no se inicializa explícitamente en el constructor de un solo parámetro
        assertEquals(0.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testConstructorWithRadiusAndHeight() {
        Cylinder c = new Cylinder(2.0, 4.0);
        assertEquals(2.0, c.getRadius(), 1e-9);
        assertEquals(4.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testConstructorWithRadiusHeightColor() {
        Cylinder c = new Cylinder(2.5, 7.0, "green");
        assertEquals(2.5, c.getRadius(), 1e-9);
        assertEquals(7.0, c.getHeight(), 1e-9);
        assertEquals("green", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Cylinder c = new Cylinder(2.0, 5.0);
        assertEquals(5.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
        Cylinder c = new Cylinder();
        c.setHeight(10.0);
        assertEquals(10.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        Cylinder c = new Cylinder(2.0, 3.0);
        // Según la implementación: volumen = getArea() * Math.PI * height
        double expected = Math.PI * 2.0 * 2.0 * Math.PI * 3.0; // πr² * π * h
        assertEquals(expected, c.getVolume(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testInheritedRadiusAndColorMethods() {
        Cylinder c = new Cylinder();
        c.setRadius(5.0);
        c.setColor("yellow");
        assertEquals(5.0, c.getRadius(), 1e-9);
        assertEquals("yellow", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Cylinder c = new Cylinder(2.0, 3.0, "blue");
        String expected = "Cylinder: subclass of Circle[radius=2.0, color=blue] height=3.0";
        assertEquals(expected, c.toString());
    }
}
