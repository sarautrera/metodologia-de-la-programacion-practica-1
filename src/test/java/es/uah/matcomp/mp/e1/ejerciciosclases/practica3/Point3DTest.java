package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @org.junit.jupiter.api.Test
    void getZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);
        assertEquals(3.0f, p.getZ());
    }

    @org.junit.jupiter.api.Test
    void setZ() {
        Point3D p = new Point3D();
        p.setZ(5.5f);
        assertEquals(5.5f, p.getZ());
    }

    @org.junit.jupiter.api.Test
    void getXYZ() {
        Point3D p = new Point3D(2.0f, 3.0f, 4.0f);
        float[] coords = p.getXYZ();
        assertEquals(3, coords.length);
        assertEquals(2.0f, coords[0]);
        assertEquals(3.0f, coords[1]);
        assertEquals(4.0f, coords[2]);
    }

    @org.junit.jupiter.api.Test
    void setXYZ() {
        Point3D p = new Point3D();
        p.setXYZ(7.0f, 8.0f, 9.0f);
        assertEquals(7.0f, p.getX());
        assertEquals(8.0f, p.getY());
        assertEquals(9.0f, p.getZ());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Point3D p = new Point3D(1.5f, 2.5f, 3.5f);
        assertEquals("(1.5,2.5,3.5)", p.toString());
    }
}
