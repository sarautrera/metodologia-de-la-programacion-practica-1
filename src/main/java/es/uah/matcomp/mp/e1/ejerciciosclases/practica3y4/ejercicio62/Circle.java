package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio62;

public class Circle implements GeometricObject {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Circle["+radius+"]";
    }
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
