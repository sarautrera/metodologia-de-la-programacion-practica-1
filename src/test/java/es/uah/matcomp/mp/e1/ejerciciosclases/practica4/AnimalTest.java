package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greets() {
        // Usamos una implementación concreta para probar el método abstracto
        Animal animal = new Cat("Firulais");
        assertDoesNotThrow(() -> animal.greets());
    }
}