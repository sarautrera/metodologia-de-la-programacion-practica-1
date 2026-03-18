package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio62;

import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {
    public static void main (String[] args) {
            GeometricObject g1 = new Circle(2.0);
            GeometricObject g2 = new Rectangle(2.0, 3.0);

            assertTrue(g1.getArea() > 0);
            assertEquals(6.0, g2.getArea());
            assertTrue(g2.getPerimeter() > 0);
            assertNotNull(g1.toString());
        }
    }