package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    @org.junit.jupiter.api.Test
    void getDay() {
        Date d1 = new Date(1, 2, 2014);
        System.out.println("Day is: " + d1.getDay());
        assertEquals(1, d1.getDay());
    }

    @org.junit.jupiter.api.Test
    void getMonth() {
        Date d1 = new Date(1, 2, 2014);
        System.out.println("Month is: " + d1.getMonth());
        assertEquals(2, d1.getMonth());
    }

    @org.junit.jupiter.api.Test
    void getYear() {
        Date d1 = new Date(1, 2, 2014);
        System.out.println("Year is: " + d1.getYear());
        assertEquals(2014, d1.getYear());
    }

    @org.junit.jupiter.api.Test
    void setDay() {
        Date d1 = new Date(1, 2, 2014);
        d1.setDay(9);
        System.out.println("New day: " + d1.getDay());
        assertEquals(9, d1.getDay());
    }

    @org.junit.jupiter.api.Test
    void setMonth() {
        Date d1 = new Date(1, 2, 2014);
        d1.setMonth(12);
        System.out.println("New month: " + d1.getMonth());
        assertEquals(12, d1.getMonth());
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        Date d1 = new Date(1, 2, 2014);
        d1.setYear(2099);
        System.out.println("New year: " + d1.getYear());
        assertEquals(2099, d1.getYear());
    }

    @org.junit.jupiter.api.Test
    void setDate() {
        Date d1 = new Date(1, 2, 2014);
        d1.setDate(3, 4, 2016);
        System.out.println(d1);
        assertEquals(3, d1.getDay());
        assertEquals(4, d1.getMonth());
        assertEquals(2016, d1.getYear());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1.toString()); // Salida esperada: 01/02/2014
        assertEquals("01/02/2014", d1.toString());

        // Test adicional para verificar el relleno con ceros (formato %02d)
        Date d2 = new Date(10, 11, 2024);
        assertEquals("10/11/2024", d2.toString());
    }
}