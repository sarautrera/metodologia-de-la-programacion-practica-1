package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Firulais");
        // Verificamos que el gato puede saludar
        assertDoesNotThrow(() -> cat.greets());
    }
}