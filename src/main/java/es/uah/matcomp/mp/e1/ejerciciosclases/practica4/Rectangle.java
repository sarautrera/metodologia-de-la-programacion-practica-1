package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Rectangle que hereda de Shape e implementa sus métodos abstractos
public class Rectangle extends Shape {

    // ATRIBUTOS (protected para que Square pueda acceder a ellos)
    protected double width = 1.0;
    protected double length = 1.0;

    // CONSTRUCTORES
    public Rectangle() {
        // Por defecto 1.0 x 1.0
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        // Llamamos al constructor de Shape para el color y el relleno
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // GETS
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    // SETS
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // IMPLEMENTACIÓN DE MÉTODOS ABSTRACTOS DE SHAPE

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }

    // TOSTRING
    @Override
    public String toString() {
        // Incluimos la info de Shape (color, filled) y añadimos dimensiones
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}