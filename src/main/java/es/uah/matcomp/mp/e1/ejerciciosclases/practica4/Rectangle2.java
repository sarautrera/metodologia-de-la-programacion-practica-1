package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Rectangle2 que implementa la interfaz GeometricObject
public class Rectangle2 implements GeometricObject {

    // ATRIBUTOS
    private double width;
    private double length;

    // CONSTRUCTOR
    public Rectangle2(double width, double length){
        this.width = width;
        this.length = length;
    }

    // IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ

    @Override
    public double getArea() {
        // Área = ancho * largo
        return width * length;
    }

    @Override
    public double getPerimeter(){
        // Perímetro = 2 * (ancho + largo)
        return (width * 2) + (length * 2);
    }

    // TOSTRING
    @Override
    public String toString(){
        // Corregido el nombre a Rectangle
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }
}