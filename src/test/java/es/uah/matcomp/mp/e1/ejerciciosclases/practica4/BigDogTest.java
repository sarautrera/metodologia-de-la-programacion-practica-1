package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog b1 = new BigDog("Salchi");
        assertDoesNotThrow(() -> b1.greets());
    }

    @Test
    void testGreets() {
        // Saludo a un Dog normal
        BigDog b1 = new BigDog("Salchi");
        Dog d1 = new Dog("Nugget");
        assertDoesNotThrow(() -> b1.greets(d1));
    }

    @Test
    void testGreets1() {
        // Saludo a otro BigDog
        BigDog b1 = new BigDog("Salchi");
        BigDog b2 = new BigDog("Rex");
        assertDoesNotThrow(() -> b1.greets(b2));
    }
}