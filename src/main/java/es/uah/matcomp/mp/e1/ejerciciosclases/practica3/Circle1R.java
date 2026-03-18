package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

// Clase base para círculos, utilizada frecuentemente para composición
public class Circle1R {

    // ATRIBUTOS
    private double radius = 1.0;
    private String color = "red";

    // CONSTRUCTORES
    public Circle1R() {
        // Valores por defecto: radio 1.0 y color rojo
    }

    public Circle1R(double radius) {
        this.radius = radius;
    }

    public Circle1R(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // GETS
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // SETS
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // MÉTODOS DE CÁLCULO

    // Área = π * r²
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Perímetro (Circunferencia) = 2 * π * r
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}