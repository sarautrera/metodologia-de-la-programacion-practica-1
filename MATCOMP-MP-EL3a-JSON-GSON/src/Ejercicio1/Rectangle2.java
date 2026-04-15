package Ejercicio1;

public class Rectangle2 implements GeometricObject{
    private double width;
    private double length;
    public Rectangle2(double width, double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return width*2+length*2;
    }
    public String toJson(){
        return "{\"width\":\"" + width + "\", \"length\":\"" + length + "\"}";
    }
}
