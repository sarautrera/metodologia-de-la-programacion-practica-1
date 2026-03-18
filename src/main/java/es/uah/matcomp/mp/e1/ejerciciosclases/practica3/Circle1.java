package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

// Clase base Circle1 para la jerarquía de herencia con Cylinder
public class Circle1 {

    // ATRIBUTOS
    private double radius = 1.0;
    private String color = "red";

    // CONSTRUCTORES
    public Circle1() {
        // Valores iniciales por defecto
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color) {
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

    // Calcula el área: π * r²
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // Calcula el perímetro (longitud): 2 * π * r
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}