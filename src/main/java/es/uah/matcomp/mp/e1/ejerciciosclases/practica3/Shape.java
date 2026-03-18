package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase base para todas las figuras geométricas (define color y relleno)
public class Shape {

    // ATRIBUTOS
    private String color = "red";
    private boolean filled = true;

    // CONSTRUCTORES
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // GETS
    public String getColor(){
        return this.color;
    }

    // En booleanos se suele usar "is" en lugar de "get"
    public boolean isFilled(){
        return this.filled;
    }

    // SETS
    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // TOSTRING
    public String toString(){
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}