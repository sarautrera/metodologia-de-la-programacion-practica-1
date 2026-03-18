package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Point2D p = new Point2D(4.0f, 5.0f);
        assertEquals(4.0f, p.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Point2D p = new Point2D(3.0f, 6.0f);
        assertEquals(6.0f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        Point2D p = new Point2D(1.0f, 2.0f);
        // El método setX() no hace nada en el código original
        p.setX(12);
        assertEquals(1.0f, p.getX());
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Point2D p = new Point2D(1.0f, 2.0f);
        // Igual que en setX(), el método setY() no cambia el valor
        p.setY(12);
        assertEquals(2.0f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void getXY() {
        Point2D p = new Point2D(1.5f, 2.5f);
        float[] coords = p.getXY();
        assertEquals(1.5f, coords[0]);
        assertEquals(2.5f, coords[1]);
    }

    @org.junit.jupiter.api.Test
    void setXY() {
        Point2D p = new Point2D();
        p.setXY(7.0f, 8.0f);
        assertEquals(7.0f, p.getX());
        assertEquals(8.0f, p.getY());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Point2D p = new Point2D(2.0f, 3.0f);
        assertEquals("(2.0,3.0)", p.toString());
    }
}
