package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    public static void main(String[] args) {
            MyCircle c1 = new MyCircle();
            assertEquals(1, c1.getRadius());
            assertEquals(0, c1.getCenterX());

            MyCircle c2 = new MyCircle(3, 4, 5);
            assertEquals(5, c2.getRadius());
            assertEquals(3, c2.getCenterX());
            assertEquals(4, c2.getCenterY());

            MyPoint p1 = new MyPoint(1, 2);
            c2.setCenter(p1);
            c2.setRadius(10);
            assertEquals(p1, c2.getCenter());
            assertEquals(10, c2.getRadius());

            c2.setCenterXY(0, 0);
            assertArrayEquals(new int[]{0, 0}, c2.getCenterXY());

            assertEquals(Math.PI * 100, c2.getArea(), 0.001);
            assertEquals(2 * Math.PI * 10, c2.getCircumference(), 0.001);

            MyCircle c3 = new MyCircle(3, 4, 2);
            assertEquals(5.0, c2.distance(c3), 0.001);
            assertNotNull(c2.toString());
        }
    }

