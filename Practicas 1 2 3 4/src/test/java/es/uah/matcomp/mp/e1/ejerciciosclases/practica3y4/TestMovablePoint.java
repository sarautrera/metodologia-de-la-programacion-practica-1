package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Point;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.MovablePoint;
public class TestMovablePoint {
    public static void main(String[] args) {
        // 1. Probar Point básico
        Point s1 = new Point(1.0f, 2.0f);
        System.out.println("--- Prueba Point ---");
        System.out.println("Punto base: " + s1.toString());

        // 2. Probar MovablePoint
        System.out.println("\n--- Prueba MovablePoint ---");
        MovablePoint p1 = new MovablePoint(1.0f, 3.0f, 2.0f, 4.0f);

        // Verificar estado inicial
        System.out.println("Estado inicial: " + p1);

        // 3. Probar el movimiento (el corazón de la clase)
        System.out.println("\n--- Probando método move() ---");
        p1.move();
        System.out.println("Después de 1 movimiento: " + p1);

        // 4. Probar encadenamiento (gracias al return this)
        p1.move().move();
        System.out.println("Después de 2 movimientos más: " + p1);
    }
}
