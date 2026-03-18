package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase Circle que hereda de Shape para integrar color y estado de relleno
public class Circle extends Shape {

    // ATRIBUTOS
    private double radius = 1.0;

    // CONSTRUCTORES
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        // Enviamos el color y el estado de relleno a la clase Shape
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

    // MÉTODOS DE CÁLCULO

    // Área = π * r²
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Perímetro = 2 * π * r
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    // TOSTRING
    @Override
    public String toString() {
        // Combinamos la descripción de Shape con el radio específico del círculo
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}