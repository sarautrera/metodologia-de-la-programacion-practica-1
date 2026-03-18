package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Mammal m = new Mammal("Tiger");
        String result = m.toString();
        assertTrue(result.startsWith("Mammal["));
        assertTrue(result.contains("Tiger"));
    }
}
