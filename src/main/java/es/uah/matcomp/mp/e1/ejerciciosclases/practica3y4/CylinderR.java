package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class CylinderR {
    private Circle1R base; // Base circle, an instance of Circle class
    private double height;

    public CylinderR(){
        height=1.0;
        this.base = new Circle1R(1.0);
    }
    public CylinderR(double radius){
        base= new Circle1R(radius);
        height =1.0;
    }
    public CylinderR(Circle1R base, double height){
        this.base = new Circle1R(1.0);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public Circle1R getBase(){
        return this.base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return base.getArea()*Math.PI*height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
