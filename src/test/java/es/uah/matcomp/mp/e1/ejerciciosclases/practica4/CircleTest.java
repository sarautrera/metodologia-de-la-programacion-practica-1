package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle(5.5);
        assertEquals(5.5, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(10.0);
        assertEquals(10.0, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(2.0);
        // Area = PI * 2^2 = 12.566...
        double expected = 2.0 * 2.0 * Math.PI;
        assertEquals(expected, c1.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(2.0);
        // Perimeter = 2 * PI * 2 = 12.566...
        double expected = 2.0 * 2 * Math.PI;
        assertEquals(expected, c1.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(1.0, "red", true);
        // Nota: asume que Shape.toString() devuelve algo como "Shape[color=red, filled=true]"
        String result = c1.toString();
        assertTrue(result.contains("Circle"));
        assertTrue(result.contains("radius=1.0"));
    }
}