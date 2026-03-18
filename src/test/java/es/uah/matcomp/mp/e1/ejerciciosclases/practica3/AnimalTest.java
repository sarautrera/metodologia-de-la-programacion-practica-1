package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Animal a1 = new Animal("Animal");
        System.out.println("===== TEST toString() =====");
        System.out.println(a1); // Muestra la salida real por consola

        String expected = "Animal[name=Animal]";
        System.out.println("Esperado: " + expected);
        System.out.println("Obtenido: " + a1.toString());

        assertEquals(expected, a1.toString());
    }
}
