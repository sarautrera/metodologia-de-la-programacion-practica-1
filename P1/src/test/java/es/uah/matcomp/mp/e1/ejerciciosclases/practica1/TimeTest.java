package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @org.junit.jupiter.api.Test
    void getHour() {
        Time t1 = new Time(1, 2, 3);
        System.out.println("Hour: " + t1.getHour());
        assertEquals(1, t1.getHour());
    }

    @org.junit.jupiter.api.Test
    void getMinute() {
        Time t1 = new Time(1, 2, 3);
        System.out.println("Minute: " + t1.getMinute());
        assertEquals(2, t1.getMinute());
    }

    @org.junit.jupiter.api.Test
    void getSecond() {
        Time t1 = new Time(1, 2, 3);
        System.out.println("Second: " + t1.getSecond());
        assertEquals(3, t1.getSecond());
    }

    @org.junit.jupiter.api.Test
    void setHour() {
        Time t1 = new Time(1, 2, 3);
        t1.setHour(4);
        System.out.println("New hour: " + t1.getHour());
        assertEquals(4, t1.getHour());
    }

    @org.junit.jupiter.api.Test
    void setMinute() {
        Time t1 = new Time(1, 2, 3);
        t1.setMinute(5);
        System.out.println("New minute: " + t1.getMinute());
        assertEquals(5, t1.getMinute());
    }

    @org.junit.jupiter.api.Test
    void setSecond() {
        Time t1 = new Time(1, 2, 3);
        t1.setSecond(6);
        System.out.println("New second: " + t1.getSecond());
        assertEquals(6, t1.getSecond());
    }

    @org.junit.jupiter.api.Test
    void setTime() {
        Time t1 = new Time(1, 2, 3);
        t1.setTime(23, 59, 58);
        System.out.println("Time set to: " + t1);
        assertEquals(23, t1.getHour());
        assertEquals(59, t1.getMinute());
        assertEquals(58, t1.getSecond());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1.toString());
        // El formato %02d asegura que 1:2:3 sea 01:02:03
        assertEquals("01:02:03", t1.toString());
    }

    @org.junit.jupiter.api.Test
    void nextSecond() {
        Time t1 = new Time(23, 59, 59);
        System.out.println("Current: " + t1);
        t1.nextSecond();
        System.out.println("Next second (should wrap to 00:00:00): " + t1);
        assertEquals("00:00:00", t1.toString());

        Time t2 = new Time(10, 10, 10);
        t2.nextSecond();
        assertEquals("10:10:11", t2.toString());
    }

    @org.junit.jupiter.api.Test
    void previousSecond() {
        Time t1 = new Time(0, 0, 0);
        System.out.println("Current: " + t1);
        t1.previousSecond();
        System.out.println("Previous second (should wrap to 23:59:59): " + t1);
        assertEquals("23:59:59", t1.toString());

        Time t2 = new Time(10, 10, 10);
        t2.previousSecond();
        assertEquals("10:10:09", t2.toString());
    }
}