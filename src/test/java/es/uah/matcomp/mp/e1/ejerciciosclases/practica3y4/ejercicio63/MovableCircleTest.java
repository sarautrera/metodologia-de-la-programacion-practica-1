package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio63;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    public static void main (String[] args) {
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