package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    public static void main(String[] args) {
            MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 3);
            assertTrue(t1.getPerimeter() > 0);
            assertEquals("Isosceles", t1.getType());

            MyPoint v1 = new MyPoint(0, 0);
            MyPoint v2 = new MyPoint(1, 1);
            MyPoint v3 = new MyPoint(5, 0);
            MyTriangle t2 = new MyTriangle(v1, v2, v3);
            assertEquals("Scalene", t2.getType());


            MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, 1);
            assertNotNull(t3.getType());

            assertNotNull(t1.toString());
        }
    }

