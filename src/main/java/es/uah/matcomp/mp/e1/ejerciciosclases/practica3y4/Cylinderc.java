package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import es.uah.matcomp.mp.e1.ejerciciosclases.practica1.Circle;

public class Cylinderc {
    private Circle base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinderc() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }
    public Cylinderc(double radius, double height) {
        base = new Circle(radius); // Construye la base con el radio dado
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }
    public double getVolumen() {
        return base.getArea() * height;
    }
    public double getArea() {
        return (2 * base.getArea()) + (2 * Math.PI * base.getRadius() * height);
    }
    @Override
    public String toString() {
        return "Cilindro: [base=" + base.toString() + ", altura=" + height + "]";
    }
}
//es mejor composicion, ya que un cilindro tiene como base un circulo, de la otra manera se podria entender que un cilindro es un circulo, y no es asi.