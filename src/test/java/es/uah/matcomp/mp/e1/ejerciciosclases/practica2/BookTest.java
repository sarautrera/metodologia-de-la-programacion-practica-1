package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.Test
    void getIsbn() {
        Author a1 = new Author("Isaac Asimov", "asimov@example.com");
        Book b1 = new Book("123-456", "Foundation", a1, 19.99, 5);
        System.out.println("ISBN del libro: " + b1.getIsbn());
        assertEquals("123-456", b1.getIsbn());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Author a1 = new Author("J. K. Rowling", "jkrowling@example.com");
        Book b1 = new Book("978-0-7475-3269-9", "Harry Potter", a1, 29.99);
        System.out.println("Nombre del libro: " + b1.getName());
        assertEquals("Harry Potter", b1.getName());
    }

    @org.junit.jupiter.api.Test
    void getAuthor() {
        Author a1 = new Author("Gabriel García Márquez", "ggmarquez@example.com");
        Book b1 = new Book("111-222", "Cien Años de Soledad", a1, 25.5);
        System.out.println("Autor del libro: " + b1.getAuthor());
        assertEquals(a1, b1.getAuthor());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        Author a1 = new Author("George Orwell", "orwell@example.com");
        Book b1 = new Book("333-444", "1984", a1, 18.99);
        System.out.println("Precio del libro: " + b1.getPrice());
        assertEquals(18.99, b1.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getQty() {
        Author a1 = new Author("Arthur C. Clarke", "clarke@example.com");
        Book b1 = new Book("555-666", "2001: A Space Odyssey", a1, 22.99, 12);
        System.out.println("Cantidad del libro: " + b1.getQty());
        assertEquals(12, b1.getQty());
    }

    @org.junit.jupiter.api.Test
    void setPrice() {
        Author a1 = new Author("Julio Verne", "verne@example.com");
        Book b1 = new Book("777-888", "Viaje al Centro de la Tierra", a1, 15.5);
        b1.setPrice(20.0);
        System.out.println("Nuevo precio: " + b1.getPrice());
        assertEquals(20.0, b1.getPrice());
    }

    @org.junit.jupiter.api.Test
    void setQty() {
        Author a1 = new Author("H. G. Wells", "wells@example.com");
        Book b1 = new Book("999-000", "La Máquina del Tiempo", a1, 12.75, 3);
        b1.setQty(10);
        System.out.println("Nueva cantidad: " + b1.getQty());
        assertEquals(10, b1.getQty());
    }

    @org.junit.jupiter.api.Test
    void getAuthorName() {
        Author a1 = new Author("Jane Austen", "jausten@example.com");
        Book b1 = new Book("321-654", "Orgullo y Prejuicio", a1, 17.5, 7);
        System.out.println("Nombre del autor: " + b1.getAuthorName());
        assertEquals("Jane Austen", b1.getAuthorName());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Author a1 = new Author("Miguel de Cervantes", "mcervantes@example.com");
        Book b1 = new Book("ESP-001", "Don Quijote", a1, 30.0, 4);
        String expected = "Book[isbn=ESP-001, name=Don Quijote, author=Author[name=Miguel de Cervantes, email=mcervantes@example.com], price=30.0, qty=4]";
        System.out.println("Salida toString: " + b1.toString());
        assertEquals(expected, b1.toString());
    }
}
