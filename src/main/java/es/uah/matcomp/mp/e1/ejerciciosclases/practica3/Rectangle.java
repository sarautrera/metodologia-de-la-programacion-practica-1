package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase Rectangle que hereda de Shape para añadir dimensiones (ancho y largo)
public class Rectangle extends Shape {

    // ATRIBUTOS
    private double width = 1.0;
    private double length = 1.0;

    // CONSTRUCTORES
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        // Llamamos al constructor de Shape para pasarle el color y si está relleno
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // GETS
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    // SETS
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula el área multiplicando ancho por largo
    public double getArea(){
        return this.width * this.length;
    }

    // Suma los cuatro lados para sacar el perímetro
    public double getPerimeter(){
        return this.width * 2 + 2 * this.length;
    }

    // TOSTRING
    @Override
    public String toString(){
        // Concatenamos lo que diga Shape con los datos del rectángulo
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}