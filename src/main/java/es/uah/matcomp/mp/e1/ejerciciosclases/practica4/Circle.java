package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

// Clase Circle que hereda de Shape (Práctica 4)
public class Circle extends Shape {

    // ATRIBUTOS
    // Definido como protected para facilitar el acceso en posibles subclases
    protected double radius = 1.0;

    // CONSTRUCTORES
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        // Invocamos al constructor de la clase abstracta Shape
        super(color, filled);
        this.radius = radius;
    }

    // GETS Y SETS
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // IMPLEMENTACIÓN DE MÉTODOS ABSTRACTOS

    @Override
    public double getArea() {
        // Área = π * r²
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        // Perímetro = 2 * π * r
        return this.radius * 2 * Math.PI;
    }

    // TOSTRING
    @Override
    public String toString() {
        // Reutilizamos la descripción de Shape y añadimos el radio
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}