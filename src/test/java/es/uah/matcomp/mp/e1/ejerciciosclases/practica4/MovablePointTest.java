package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void moveUp() {
        MovablePoint p = new MovablePoint(1, 1, 2, 2);
        p.moveUp(); // y = 1 + 2
        assertEquals("(1,3), speed=(1,3)", p.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p = new MovablePoint(1, 1, 2, 2);
        p.moveDown(); // y = 1 - 2
        assertEquals("(1,-1), speed=(1,-1)", p.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p = new MovablePoint(1, 1, 2, 2);
        p.moveLeft(); // x = 1 - 2
        assertEquals("(-1,1), speed=(-1,1)", p.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p = new MovablePoint(1, 1, 2, 2);
        p.moveRight(); // x = 1 + 2
        assertEquals("(3,1), speed=(3,1)", p.toString());
    }

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(1, 1, 2, 2);
        assertEquals("(1,1), speed=(1,1)", p.toString());
    }
}