package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle2 implements GeometricObject{
    protected double radius;
    public Circle2(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
}
