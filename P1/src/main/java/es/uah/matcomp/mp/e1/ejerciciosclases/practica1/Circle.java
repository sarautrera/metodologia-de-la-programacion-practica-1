package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Circle {
    // Atributos
    private double radius;
    private String color;

    // Constructores
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    //getters y setters
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    // Métodos (Getters y Setters)
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}