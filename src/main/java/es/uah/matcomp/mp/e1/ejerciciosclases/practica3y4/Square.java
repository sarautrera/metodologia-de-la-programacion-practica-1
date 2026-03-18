package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color, filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide( double side){
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
