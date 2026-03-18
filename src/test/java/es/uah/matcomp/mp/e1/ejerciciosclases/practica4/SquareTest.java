package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1 = new Square(5.0);
        // El lado debe ser igual al ancho (width)
        assertEquals(5.0, s1.getSide());
    }

    @Test
    void setSide() {
        Square s1 = new Square();
        s1.setSide(10.0);
        assertEquals(10.0, s1.getSide());
        // Verificamos que tanto ancho como largo en la superclase sean iguales
        assertEquals(10.0, s1.getWidth());
        assertEquals(10.0, s1.getLength());
    }

    @Test
    void setWidth() {
        Square s1 = new Square(4.0);
        s1.setWidth(8.0);
        // Al ser un cuadrado, setWidth debe cambiar también el largo
        assertEquals(8.0, s1.getSide());
        assertEquals(8.0, s1.getLength());
    }

    @Test
    void setLength() {
        Square s1 = new Square(4.0);
        s1.setLength(12.0);
        // Al ser un cuadrado, setLength debe cambiar también el ancho
        assertEquals(12.0, s1.getSide());
        assertEquals(12.0, s1.getWidth());
    }

    @Test
    void testToString() {
        Square s1 = new Square(6.6, "yellow", true);
        String result = s1.toString();

        // Verificamos que la cadena contenga la palabra Square y los valores correctos
        assertTrue(result.contains("Square"));
        assertTrue(result.contains("width=6.6"));
        assertTrue(result.contains("length=6.6"));
    }
}