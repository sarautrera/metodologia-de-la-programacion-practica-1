package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio62;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public String toString(){
        return "Rectangle[width= "+width+", length= "+ length+"]";
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return this.length*2+this.width*2;
    }
}
