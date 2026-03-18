package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Author a1 = new Author("Gabriel García Márquez", "ggmarquez@example.com");
        System.out.println("Nombre del autor: " + a1.getName());
        assertEquals("Gabriel García Márquez", a1.getName());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Author a1 = new Author("Isabel Allende", "isabelallende@example.com");
        System.out.println("Email del autor: " + a1.getEmail());
        assertEquals("isabelallende@example.com", a1.getEmail());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        Author a1 = new Author("Mario Vargas Llosa", "mario@example.com");
        a1.setEmail("vargasllosa@example.com");
        System.out.println("Nuevo email: " + a1.getEmail());
        assertEquals("vargasllosa@example.com", a1.getEmail());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Author a1 = new Author("Miguel de Cervantes", "mcervantes@example.com");
        String expected = "Author[name=Miguel de Cervantes, email=mcervantes@example.com]";
        System.out.println("Salida toString: " + a1.toString());
        assertEquals(expected, a1.toString());
    }
}
