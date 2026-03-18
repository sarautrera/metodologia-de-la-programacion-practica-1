package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    public static void main (String[] args) {
            MovablePoint mp = new MovablePoint(0.0f, 0.0f, 1.0f, 2.0f);
            mp.move();
            assertEquals(1.0f, mp.getX());
            assertEquals(2.0f, mp.getY());

            mp.setSpeed(5.0f, 5.0f);
            mp.move();
            assertEquals(6.0f, mp.getX());
            assertEquals(7.0f, mp.getY());

            assertNotNull(mp.toString());
        }
    }

