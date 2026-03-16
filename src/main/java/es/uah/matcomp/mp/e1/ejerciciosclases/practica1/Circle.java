package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = (double)1.0F;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return (Math.PI * 2D) * this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
