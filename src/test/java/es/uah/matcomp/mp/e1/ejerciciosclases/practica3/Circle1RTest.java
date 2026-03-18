package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class Circle1RTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle1R c = new Circle1R(4.5);
        assertEquals(4.5, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle1R c = new Circle1R();
        c.setRadius(2.8);
        assertEquals(2.8, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Circle1R c = new Circle1R(3.0, "blue");
        assertEquals("blue", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Circle1R c = new Circle1R();
        c.setColor("green");
        assertEquals("green", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle1R c = new Circle1R(3.0);
        assertEquals(Math.PI * 9.0, c.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Circle1R c = new Circle1R(4.0);
        assertEquals(2 * Math.PI * 4.0, c.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle1R c = new Circle1R(2.5, "yellow");
        assertEquals("Circle[radius=2.5, color=yellow]", c.toString());
    }
}
