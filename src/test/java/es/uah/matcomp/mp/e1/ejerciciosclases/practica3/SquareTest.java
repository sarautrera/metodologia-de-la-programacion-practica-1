package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @org.junit.jupiter.api.Test
    void testDefaultConstructor() {
        Square s = new Square();
        assertEquals(1.0, s.getSide(), 1e-9);
        // también comprueba coherencia entre ancho y largo
        assertEquals(1.0, s.getWidth(), 1e-9);
        assertEquals(1.0, s.getLength(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void getSide() {
        Square s = new Square(5.0);
        assertEquals(5.0, s.getSide(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void setSide() {
        Square s = new Square(2.0);
        s.setSide(7.5);
        assertEquals(7.5, s.getSide(), 1e-9);
        assertEquals(7.5, s.getWidth(), 1e-9);
        assertEquals(7.5, s.getLength(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Square s = new Square(4.0);
        s.setWidth(9.0);
        assertEquals(9.0, s.getWidth(), 1e-9);
        assertEquals(9.0, s.getLength(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void setLength() {
        Square s = new Square(3.0);
        s.setLength(6.0);
        assertEquals(6.0, s.getWidth(), 1e-9);
        assertEquals(6.0, s.getLength(), 1e-9);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Square s = new Square(4.0, "purple", true);
        // Salida esperada de acuerdo con la jerarquía:
        // Square[Rectangle[Shape[color=purple, filled=true], width=4.0, length=4.0], width=4.0, length=4.0]
        String expected = "Square[Rectangle[Shape[color=purple, filled=true], width=4.0, length=4.0], width=4.0, length=4.0]";
        assertEquals(expected, s.toString());
    }
}
