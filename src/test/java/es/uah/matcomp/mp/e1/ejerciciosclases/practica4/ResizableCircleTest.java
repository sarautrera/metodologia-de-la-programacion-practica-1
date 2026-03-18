package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void resize() {
        ResizableCircle rc = new ResizableCircle(100.0);
        // Redimensionar al 10% (según tu código multiplica por 0.1)
        rc.resize(10);
        assertEquals(10.0, rc.getArea() / (rc.getArea() > 0 ? (Math.PI * 10.0) : 1), 10.0);
        // Verificamos directamente el área resultante: PI * 10^2
        assertEquals(Math.PI * 100.0, rc.getArea(), 0.001);
    }

    @Test
    void testToString() {
        ResizableCircle rc = new ResizableCircle(2.0);
        // Formato: ResizableCircle[Circle[radius=2.0]]
        assertEquals("ResizableCircle[Circle[radius=2.0]]", rc.toString());
    }
}