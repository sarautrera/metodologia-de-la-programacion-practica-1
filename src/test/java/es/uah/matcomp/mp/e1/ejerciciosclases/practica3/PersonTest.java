package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Person p = new Person("Ana", "Calle Mayor 5");
        assertEquals("Ana", p.getName());
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        Person p = new Person("Luis", "Av. Madrid 10");
        assertEquals("Av. Madrid 10", p.getAddress());
    }

    @org.junit.jupiter.api.Test
    void setAddress() {
        Person p = new Person("Bea", "C/Toledo 3");
        p.setAddress("C/Granada 15");
        assertEquals("C/Granada 15", p.getAddress());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Person p = new Person("Mario", "C/Sevilla 22");
        String result = p.toString();
        assertEquals("Person[name=Mario, address=C/Sevilla 22]", result);
    }
}
