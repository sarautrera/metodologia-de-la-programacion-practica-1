package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void getColor() {
        Shape s = new Shape();
        assertEquals("red", s.getColor());
    }

    @org.junit.jupiter.api.Test
    void isFilled() {
        Shape s = new Shape();
        assertTrue(s.isFilled());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Shape s = new Shape();
        s.setColor("blue");
        assertEquals("blue", s.getColor());
    }

    @org.junit.jupiter.api.Test
    void setFilled() {
        Shape s = new Shape();
        s.setFilled(false);
        assertFalse(s.isFilled());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Shape s = new Shape();
        String result = s.toString();
        assertEquals("Shape[color=red, filled=true]", result);
    }
}
