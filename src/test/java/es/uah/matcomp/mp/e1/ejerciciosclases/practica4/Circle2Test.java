package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void getArea() {
        Circle2 c2 = new Circle2(3.0);
        double expected = 3.0 * 3.0 * Math.PI;
        assertEquals(expected, c2.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Circle2 c2 = new Circle2(3.0);
        double expected = 2 * 3.0 * Math.PI;
        assertEquals(expected, c2.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Circle2 c2 = new Circle2(4.5);
        assertEquals("Circle[radius=4.5]", c2.toString());
    }
}