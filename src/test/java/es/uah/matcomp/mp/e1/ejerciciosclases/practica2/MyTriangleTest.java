package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(10, 20, 10, 10, 20, 15);
        double expected = new MyPoint(10, 20).distance(new MyPoint(10, 10))
                + new MyPoint(10, 10).distance(new MyPoint(20, 15))
                + new MyPoint(20, 15).distance(new MyPoint(10, 20));
        System.out.println("Perímetro del triángulo: " + t1.getPerimeter());
        assertEquals(expected, t1.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void getType() {
        // Triángulo escaleno (3-4-5)
        MyTriangle escaleno = new MyTriangle(0, 0, 4, 0, 0, 3);
        // Triángulo isósceles
        MyTriangle isosceles = new MyTriangle(0, 0, 6, 0, 3, 4);
        // “Equilátero” aproximado usando enteros (no exacto, pero válido para test)
        MyTriangle equilatero = new MyTriangle(0, 0, 2, 0, 1, 2);

        System.out.println("Tipo del triángulo escaleno: " + escaleno.getType());
        System.out.println("Tipo del triángulo isósceles: " + isosceles.getType());
        System.out.println("Tipo del triángulo equilátero (aprox): " + equilatero.getType());

        assertEquals("Scalene", escaleno.getType());
        assertEquals("Isosceles", isosceles.getType());
        assertTrue(
                equilatero.getType().equals("Equilateral")
                        || equilatero.getType().equals("Isosceles")
        );
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(3, 4);
        MyPoint p3 = new MyPoint(5, 6);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        String expected = "MyTriangle[v1=" + p1 + ",v2=" + p2 + ",v3" + p3 + "]";
        System.out.println("Salida toString: " + t2);
        assertEquals(expected, t2.toString());
    }
}
