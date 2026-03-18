package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setX(80.0f);
        System.out.println("x is: " + ball.getX());
        assertEquals(80.0f, ball.getX());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setX(80.0f);
        assertEquals(80.0f, ball.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setY(35.0f);
        System.out.println("y is: " + ball.getY());
        assertEquals(35.0f, ball.getY());
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setY(35.0f);
        assertEquals(35.0f, ball.getY());
    }

    @org.junit.jupiter.api.Test
    void getRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setRadius(5);
        System.out.println("radius is: " + ball.getRadius());
        assertEquals(5, ball.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setRadius(5);
        assertEquals(5, ball.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setXDelta(4.0f);
        System.out.println("xDelta is: " + ball.getXDelta());
        assertEquals(4.0f, ball.getXDelta());
    }

    @org.junit.jupiter.api.Test
    void setXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setXDelta(4.0f);
        assertEquals(4.0f, ball.getXDelta());
    }

    @org.junit.jupiter.api.Test
    void getYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setYDelta(6.0f);
        System.out.println("yDelta is: " + ball.getYDelta());
        assertEquals(6.0f, ball.getYDelta());
    }

    @org.junit.jupiter.api.Test
    void setYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setYDelta(6.0f);
        assertEquals(6.0f, ball.getYDelta());
    }

    @org.junit.jupiter.api.Test
    void move() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.move();
        System.out.println(ball);
        // Verificamos el movimiento inicial (1.1 + 3.3 = 4.4)
        assertEquals(4.4f, ball.getX(), 0.001f);
        assertEquals(6.6f, ball.getY(), 0.001f);
    }

    @org.junit.jupiter.api.Test
    void reflectHorizontal() {
        Ball ball = new Ball(50.0f, 25.0f, 5, 4.0f, 6.0f);
        ball.reflectHorizontal();
        // El xDelta debe invertirse a -4.0f
        assertEquals(-4.0f, ball.getXDelta());
    }

    @org.junit.jupiter.api.Test
    void reflectVertical() {
        Ball ball = new Ball(50.0f, 25.0f, 5, 4.0f, 6.0f);
        ball.reflectVertical();
        // El yDelta debe invertirse a -6.0f
        assertEquals(-6.0f, ball.getYDelta());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);
        assertNotNull(ball.toString());
        assertEquals("ball[(1.1,2.2), speed=(3.3,4.4)]", ball.toString());
    }
}