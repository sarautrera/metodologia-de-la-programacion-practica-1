package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Point p = new Point(3.5f, 4.0f);
        assertEquals(3.5f, p.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Point p = new Point(2.5f, 5.5f);
        assertEquals(5.5f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        Point p = new Point();
        p.setX(7.7f);
        assertEquals(7.7f, p.getX());
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Point p = new Point();
        p.setY(9.2f);
        assertEquals(9.2f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void getXY() {
        Point p = new Point(1.0f, 2.0f);
        float[] coords = p.getXY();
        assertEquals(1.0f, coords[0]);
        assertEquals(2.0f, coords[1]);
    }

    @org.junit.jupiter.api.Test
    void setXY() {
        Point p = new Point();
        p.setXY(3.3f, 4.4f);
        assertEquals(3.3f, p.getX());
        assertEquals(4.4f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Point p = new Point(2.0f, 5.0f);
        assertEquals("(2.0,5.0)", p.toString());
    }
}
