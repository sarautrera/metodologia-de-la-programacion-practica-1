package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase sencilla para crear círculos con radio y color
public class Circle {

    // ATRIBUTOS
    private double radius;
    private String color;

    // CONSTRUCTORES
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    // GETS
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // SETS
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula el área total del círculo usando PI
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Calcula lo que mide el borde del círculo (el perímetro)
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // TOSTRING
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}