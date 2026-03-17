package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape(){
        color="red";
        filled=true;
    }
    public Shape(String color, boolean filled){
        this.color="red";
        this.filled=true;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public String toString(){
        return "Shape[color="+color+", filled="+filled+"]";
    }
}
