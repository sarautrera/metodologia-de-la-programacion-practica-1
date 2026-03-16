package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio65;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Circle[radius= "+radius+"]";
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
