package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyTriangle;

public class TestMain {
    public static void main(String[] args) {
        // --- PRUEBA 1: Triángulo Escaleno (Lados 3, 4 y 5) ---
        // Un triángulo rectángulo con base 3 y altura 4 es un escaleno perfecto.
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("--- Prueba Triángulo 1 ---");
        System.out.println("Datos: " + t1.toString());
        System.out.println("Perímetro esperado (12.0): " + t1.getPerimeter());
        System.out.println("Tipo: " + t1.getType());
        System.out.println();

        // --- PRUEBA 2: Triángulo Isósceles ---
        // Usando puntos: (0,0), (4,0) y (2,4)
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 4);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        System.out.println("--- Prueba Triángulo 2 ---");
        System.out.println("Datos: " + t2.toString());
        System.out.println("Tipo (debe ser isósceles): " + t2.getType());
        System.out.println();

        // --- PRUEBA 3: Triángulo Equilátero (Aproximado) ---
        // Nota: Es casi imposible tener un equilátero perfecto con solo enteros,
        // pero probaremos la lógica con uno de base 10.
        MyTriangle t3 = new MyTriangle(0, 0, 10, 0, 5, 8);
        System.out.println("--- Prueba Triángulo 3 ---");
        System.out.println("Datos: " + t3.toString());
        System.out.println("Tipo: " + t3.getType());

        // --- VERIFICACIÓN ADICIONAL ---
        // Verificamos las distancias de los lados de T2 para entender el resultado
        System.out.println("\n--- Análisis de distancias de T2 ---");
        System.out.println("Lado v1-v2: " + p1.distance(p2));
        System.out.println("Lado v2-v3: " + p2.distance(p3));
        System.out.println("Lado v3-v1: " + p3.distance(p1));
    }
}
