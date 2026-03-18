package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase abstracta: no se pueden crear objetos "Shape" directamente,
// solo de sus hijas (Circle, Rectangle, etc.)
public abstract class Shape {

    // ATRIBUTOS (protected para que las clases hijas accedan directamente)
    protected String color = "red";
    protected boolean filled = true;

    // CONSTRUCTORES
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        // Corregido: ahora usamos los valores que recibimos por parámetro
        this.color = color;
        this.filled = filled;
    }

    // GETS
    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    // SETS
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // MÉTODOS ABSTRACTOS
    // Obligan a Circle y Rectangle a implementar su propia lógica
    public abstract double getArea();
    public abstract double getPerimeter();

    // TOSTRING
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}