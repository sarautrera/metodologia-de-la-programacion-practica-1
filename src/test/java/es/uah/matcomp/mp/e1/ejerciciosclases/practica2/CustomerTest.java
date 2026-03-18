package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        assertEquals(88, c1.getId());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        c1.setDiscount(8);
        System.out.println("name is: " + c1.getName());
        assertEquals("Tan Ah Teck", c1.getName());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        c1.setDiscount(8);
        System.out.println("gender is: " + c1.getGender());
        assertEquals('m', c1.getGender());
    }

    @org.junit.jupiter.api.Test
    void getDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        c1.setDiscount(8);
        System.out.println("discount is: " + c1.getDiscount());
        assertEquals(8, c1.getDiscount());
    }

    @org.junit.jupiter.api.Test
    void setDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        c1.setDiscount(8);
        System.out.println("Nuevo descuento aplicado: " + c1.getDiscount());
        assertEquals(8, c1.getDiscount());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        c1.setDiscount(8);
        String expected = "Tan Ah Teck(88)(8%)";
        System.out.println("Salida toString esperada: " + expected);
        System.out.println("Salida obtenida: " + c1);
        assertEquals(expected, c1.toString());
    }
}
