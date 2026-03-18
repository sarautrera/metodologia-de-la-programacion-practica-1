package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        // Usamos Circle para probar los métodos de Shape
        Shape s1 = new Circle(5.5, "blue", false);
        // Nota: En tu constructor de Shape el color está forzado a "red"
        assertEquals("red", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Circle(5.5, "red", false);
        // Nota: En tu constructor de Shape filled está forzado a true
        assertTrue(s1.isFilled());
    }

    @Test
    void setColor() {
        Shape s1 = new Rectangle(1.0, 2.0);
        s1.setColor("green");
        assertEquals("green", s1.getColor());
    }

    @Test
    void setFilled() {
        Shape s1 = new Rectangle(1.0, 2.0);
        s1.setFilled(false);
        assertFalse(s1.isFilled());
    }

    @Test
    void getArea() {
        // Probamos el método abstracto a través de una instancia de Circle
        Shape s1 = new Circle(2.0); // Radio 2
        double expectedArea = Math.PI * 2.0 * 2.0;
        assertEquals(expectedArea, s1.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        // Probamos el método abstracto a través de una instancia de Rectangle
        Shape s3 = new Rectangle(1.0, 2.0); // Ancho 1, Largo 2
        // Perímetro = 2*1 + 2*2 = 6
        assertEquals(6.0, s3.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Shape s4 = new Square(6.6);
        String result = s4.toString();
        // Verificamos que contenga la información base de Shape
        assertTrue(result.contains("Shape[color="));
        assertTrue(result.contains("filled="));
    }
}