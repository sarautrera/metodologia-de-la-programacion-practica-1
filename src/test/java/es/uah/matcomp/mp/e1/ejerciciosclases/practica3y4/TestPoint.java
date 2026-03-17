package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Point3D;

public class TestPoint {
    public static void main(String[] args) {
        // 1. Probamos Point3D
        System.out.println("--- Probando Point3D ---");
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);

        // Verificar toString()
        System.out.println("Punto: " + p3);

        // Verificar getXYZ()
        float[] coords = p3.getXYZ();
        System.out.println("Coordenadas obtenidas: [" + coords[0] + ", " + coords[1] + ", " + coords[2] + "]");

        // 2. Probamos la herencia (Point3D comportándose como Point2D)
        System.out.println("\n--- Probando herencia ---");
        System.out.println("X desde Point2D: " + p3.getX());

        // 3. Probamos setter
        p3.setXYZ(10.0f, 20.0f, 30.0f);
        System.out.println("Nuevo punto después de setXYZ: " + p3);
    }
}