package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    public static void main (String[] args) {

            Shape s1 = new Circle(5.5, "red", false);
            assertEquals("red", s1.getColor());
            assertFalse(s1.isFilled());

            assertTrue(s1.getArea() > 0);
            assertTrue(s1.getPerimeter() > 0);

            Circle c1 = (Circle) s1;
            assertEquals(5.5, c1.getRadius());

            Shape s3 = new Rectangle(1.0, 2.0, "red", false);
            assertEquals(2.0, s3.getArea());

            Shape s4 = new Square(6.6);
            Rectangle r2 = (Rectangle) s4;
            assertEquals(6.6, r2.getWidth());

            Square sq1 = (Square) r2;
            assertEquals(6.6, sq1.getSide());
            assertNotNull(sq1.toString());
        }
    }

