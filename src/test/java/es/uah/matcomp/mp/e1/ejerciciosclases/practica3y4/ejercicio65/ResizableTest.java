package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio65;

import static org.junit.jupiter.api.Assertions.*;

class ResizableTest {
    public static void main (String[] args) {
            ResizableCircle rc = new ResizableCircle(10.0);
            rc.resize(50); // radius *= 0.5
            // El nuevo radio debería ser 5.0
            assertTrue(rc.toString().contains("radius=5.0"));
        }
    }