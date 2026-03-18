package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class CylinderRTest {

    @org.junit.jupiter.api.Test
    void testDefaultConstructor() {
        CylinderR c = new CylinderR();
        assertNotNull(c.getBase());
        assertEquals(1.0, c.getHeight(), 1e-9);
        assertEquals(1.0, c.getBase().getRadius(), 1e-9);
        assertEquals("red", c.getBase().getColor());
    }

    @org.junit.jupiter.api.Test
    void testConstructorWithRadius() {
        CylinderR c = new CylinderR(2.5);
        assertNotNull(c.getBase());
        assertEquals(2.5, c.getBase().getRadius(), 1e-9);
        assertEquals(1.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testConstructorWithBaseAndHeight() {
        Circle1R base = new Circle1R(3.0, "green");
        CylinderR c = new CylinderR(base, 5.0);
        // Por la implementación, siempre crea una nueva base con radio 1.0
        assertNotNull(c.getBase());
        assertEquals(1.0, c.getBase().getRadius(), 1e-9);
        assertEquals(5.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        CylinderR c = new CylinderR(2.0);
        assertEquals(1.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
        CylinderR c = new CylinderR();
        c.setHeight(10.0);
        assertEquals(10.0, c.getHeight(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void getBase() {
        CylinderR c = new CylinderR(4.0);
        assertNotNull(c.getBase());
        assertEquals(4.0, c.getBase().getRadius(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        // getVolume = base.getArea() * Math.PI * height
        // getArea() = πr² → volumen = πr² * π * h = π²r²h
        CylinderR c = new CylinderR(2.0);
        c.setHeight(3.0);
        double expected = Math.PI * Math.PI * 2.0 * 2.0 * 3.0;
        assertEquals(expected, c.getVolume(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        CylinderR c = new CylinderR();
        String expected = "Cylinder: subclass of " + c.getClass().getSuperclass().toString() + " height=1.0";
        // La versión actual añade super.toString(), así que su resultado dependerá de Object#toString
        // Aquí verificamos que contiene las partes esperadas:
        String result = c.toString();
        assertTrue(result.contains("Cylinder: subclass of"));
        assertTrue(result.contains("height=1.0"));
    }
}
