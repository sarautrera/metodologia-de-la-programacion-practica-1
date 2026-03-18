package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Circle extends Shape{
    protected double radius=1.0;
    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle["+super.toString()+", radius="+radius+"]";
    }
}

