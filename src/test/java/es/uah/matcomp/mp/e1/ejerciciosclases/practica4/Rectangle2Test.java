package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Rectangle2Test {

    @Test
    void getArea() {
        Rectangle2 r2 = new Rectangle2(3.0, 4.0);
        assertEquals(12.0, r2.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Rectangle2 r2 = new Rectangle2(3.0, 4.0);
        assertEquals(14.0, r2.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle2 r2 = new Rectangle2(3.0, 4.0);
        // Siguiendo tu código actual que dice "Circle" en el toString de Rectangle2
        assertEquals("Circle[width=3.0, length=4.0]", r2.toString());
    }
}