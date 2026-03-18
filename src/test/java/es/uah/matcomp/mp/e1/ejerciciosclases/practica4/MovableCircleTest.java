package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void moveUp() {
        MovableCircle c = new MovableCircle(2, 1, 2, 2, 5);
        c.moveUp(); // Centro (1,1) -> y = 1 + 2
        assertEquals("(1,3), speed=(1,3), radius=5", c.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c = new MovableCircle(2, 1, 2, 2, 5);
        c.moveDown(); // Centro (1,1) -> y = 1 - 2
        assertEquals("(1,-1), speed=(1,-1), radius=5", c.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle c = new MovableCircle(2, 1, 2, 2, 5);
        c.moveLeft(); // Centro (1,1) -> x = 1 - 2
        assertEquals("(-1,1), speed=(-1,1), radius=5", c.toString());
    }

    @Test
    void moveRight() {
        MovableCircle c = new MovableCircle(2, 1, 2, 2, 5);
        c.moveRight(); // Centro (1,1) -> x = 1 + 2
        assertEquals("(3,1), speed=(3,1), radius=5", c.toString());
    }

    @Test
    void testToString() {
        MovableCircle c = new MovableCircle(2, 1, 2, 2, 5);
        // Según tu código: (centro.x, centro.y), speed=(centro.x, centro.y), radius=radio
        assertEquals("(1,1), speed=(1,1), radius=5", c.toString());
    }
}