package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Nugget");
        assertDoesNotThrow(() -> d1.greets());
    }

    @Test
    void testGreets() {
        // Saludo a otro Dog
        Dog d1 = new Dog("Nugget");
        Dog d2 = new Dog("Rayo");
        assertDoesNotThrow(() -> d1.greets(d2));
    }

    @Test
    void testGreets1() {
        // Saludo a un BigDog (que es un Dog)
        Dog d1 = new Dog("Nugget");
        BigDog b1 = new BigDog("Salchi");
        assertDoesNotThrow(() -> d1.greets(b1));
    }
}