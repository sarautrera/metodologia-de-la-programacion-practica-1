package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;


public class Circle1R{
    private double radius=1.0;
    private String color = "red";
    public Circle1R(){
    }
    public Circle1R(double radius){
        this.radius=radius;
    }
    public Circle1R(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius="+radius+", color="+color+"]";
    }
}


