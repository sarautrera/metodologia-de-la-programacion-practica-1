package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio63;

import static org.junit.jupiter.api.Assertions.*;

class MovableTest {
    public static void main (String[] args){
                MovablePoint p1 = new MovablePoint(0, 0, 5, 10);

                p1.moveUp();    // y -= 10 -> -10
                p1.moveDown();  // y += 10 -> 0
                p1.moveLeft();  // x -= 5  -> -5
                p1.moveRight(); // x += 5  -> 0

                assertEquals("(0, 0) speed=(5, 10)", p1.toString());

                // x=0, y=0, xSpeed=2, ySpeed=2, radius=10
                MovableCircle c1 = new MovableCircle(0, 0, 2, 2, 10);

                c1.moveUp();    // centro y -= 2
                c1.moveRight(); // centro x += 2

                String res = c1.toString();
                // Verificamos que el toString contiene la info del punto y el radio
                assertTrue(res.contains("(2, -2)"));
                assertTrue(res.contains("radius=10"));

                // Probamos las direcciones restantes para cobertura total
                c1.moveDown();
                c1.moveLeft();
                assertNotNull(c1.toString());
            }
        }