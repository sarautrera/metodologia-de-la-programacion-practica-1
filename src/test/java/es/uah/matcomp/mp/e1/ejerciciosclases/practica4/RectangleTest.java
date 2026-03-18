package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r = new Rectangle(2.0, 3.0);
        assertEquals(2.0, r.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(2.0, 3.0);
        assertEquals(3.0, r.getLength());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(5.0);
        assertEquals(5.0, r.getWidth());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(10.0);
        assertEquals(10.0, r.getLength());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(3.0, 4.0);
        assertEquals(12.0, r.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(3.0, 4.0);
        // 3*2 + 4*2 = 14
        assertEquals(14.0, r.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(1.0, 2.0, "blue", false);
        String result = r.toString();
        assertTrue(result.contains("Rectangle"));
        assertTrue(result.contains("width=1.0"));
        assertTrue(result.contains("length=2.0"));
    }
}