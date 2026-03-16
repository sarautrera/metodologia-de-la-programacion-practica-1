package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0F;
        this.width = 1.0F;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length * (double)2.0F + (double)2.0F * this.width;
    }

    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}

