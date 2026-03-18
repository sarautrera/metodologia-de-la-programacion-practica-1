package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    public static void main (String[] args) {
            Point3D p = new Point3D(1.0f, 2.0f, 3.0f);
            assertEquals(3.0f, p.getZ());

            p.setZ(5.5f);
            assertEquals(5.5f, p.getZ());

            p.setXYZ(10.0f, 11.0f, 12.0f);
            float[] coords = p.getXYZ();
            assertEquals(10.0f, coords[0]);
            assertEquals(11.0f, coords[1]);
            assertEquals(12.0f, coords[2]);

            assertTrue(p.toString().contains("(10.0,11.0,12.0)"));
        }
    }

