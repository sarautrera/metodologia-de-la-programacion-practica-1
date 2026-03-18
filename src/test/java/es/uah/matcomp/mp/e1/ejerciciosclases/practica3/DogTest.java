package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void greets() {
        Dog d = new Dog("Rex");
        // capturamos la salida del método greets()
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        d.greets();
        System.setOut(System.out);
        assertTrue(out.toString().trim().contains("Woof"));
    }

    @org.junit.jupiter.api.Test
    void testGreets() {
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Rocky");
        // capturamos la salida del método greets(Dog)
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        d1.greets(d2);
        System.setOut(System.out);
        assertTrue(out.toString().trim().contains("Wooooooof"));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Dog d = new Dog("Luna");
        String result = d.toString();
        assertTrue(result.startsWith("Dog["));
        assertTrue(result.contains("Luna"));
    }
}
