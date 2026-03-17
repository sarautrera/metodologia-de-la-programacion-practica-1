package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Rectangle extends Shape{
    protected double width=1.0;
    protected double length=1.0;

    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String  color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return this.width*this.length;
    }
    @Override
    public double getPerimeter(){
        return this.width*2+2*this.length;
    }
    @Override
    public String toString(){
        return "Rectangle["+ super.toString()+", width="+width+", length="+length+"]";
    }


}
