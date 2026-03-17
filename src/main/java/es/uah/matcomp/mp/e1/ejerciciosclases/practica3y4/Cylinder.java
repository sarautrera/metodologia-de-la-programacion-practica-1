package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Cylinder extends Circle1{
    private double height;
    public Cylinder(){
        super();
        height=1.0;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return getArea()*Math.PI*height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
