package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void getWidth() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(4.0, r.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(5.0, r.getLength());
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(7.5);
        assertEquals(7.5, r.getWidth());
    }

    @org.junit.jupiter.api.Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(9.0);
        assertEquals(9.0, r.getLength());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Rectangle r = new Rectangle(3.0, 8.0);
        assertEquals(24.0, r.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Rectangle r = new Rectangle(2.0, 6.0);
        assertEquals(16.0, r.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Rectangle r = new Rectangle(2.0, 3.0, "blue", true);
        String result = r.toString();
        assertTrue(result.contains("Rectangle["));
        assertTrue(result.contains("color=blue"));
        assertTrue(result.contains("width=2.0"));
        assertTrue(result.contains("length=3.0"));
    }
}
