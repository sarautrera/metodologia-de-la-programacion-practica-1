package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import es.uah.matcomp.mp.e1.ejerciciosclases.practica1.Circle;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable
    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        // 2πrh + 2 * (área de la base)
        // Usamos getRadius() porque radius es privado en Circle
        // Usamos super.getArea() para obtener el área del círculo base
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
