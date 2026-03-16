package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio65;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
        public static void main(String[] args) {

            Circle c1 = new Circle(5.0);

            System.out.println("Información del objeto: " + c1.toString());

            System.out.printf("El radio es: %.2f%n", c1.radius);
            System.out.printf("El área calculada es: %.4f%n", c1.getArea());
            System.out.printf("El perímetro (circunferencia) es: %.4f%n", c1.getPerimeter());

            System.out.println("------------------------------------------");

            GeometricObject g1 = new Circle(2.5);
            System.out.println("Probando polimorfismo con GeometricObject:");
            System.out.println("Área de g1: " + g1.getArea());
        }
    }