package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Circle2 que implementa la interfaz GeometricObject
public class Circle2 implements GeometricObject {

    // ATRIBUTO (protected para permitir herencia y modificación en subclases)
    protected double radius;

    // CONSTRUCTOR
    public Circle2(double radius) {
        this.radius = radius;
    }

    // IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ

    @Override
    public double getArea() {
        // Área = π * r²
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        // Perímetro = 2 * π * r
        return 2 * radius * Math.PI;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}