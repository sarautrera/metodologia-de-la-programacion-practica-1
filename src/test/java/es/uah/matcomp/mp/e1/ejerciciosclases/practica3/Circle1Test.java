package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle1 c = new Circle1(5.0);
        assertEquals(5.0, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle1 c = new Circle1();
        c.setRadius(3.5);
        assertEquals(3.5, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Circle1 c = new Circle1(2.0, "blue");
        assertEquals("blue", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Circle1 c = new Circle1();
        c.setColor("green");
        assertEquals("green", c.getColor());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle1 c = new Circle1(2.0);
        assertEquals(Math.PI * 4.0, c.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Circle1 c = new Circle1(3.0);
        assertEquals(2 * Math.PI * 3.0, c.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle1 c = new Circle1(1.5, "yellow");
        assertEquals("Circle[radius=1.5, color=yellow]", c.toString());
    }
}
