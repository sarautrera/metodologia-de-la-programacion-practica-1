package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase Cylinder que hereda de Circle1 (Uso de herencia en lugar de composición)
public class Cylinder extends Circle1 {

    // ATRIBUTOS
    private double height;

    // CONSTRUCTORES
    public Cylinder() {
        super(); // Llama al constructor por defecto de Circle1
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius); // Define el radio en la clase padre
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        // Pasamos radio y color al constructor de Circle1
        super(radius, color);
        this.height = height;
    }

    // GETS Y SETS
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // FUNCIONES ESPECÍFICAS

    // El volumen es el área del círculo base por la altura
    public double getVolume() {
        // Nota: Si getArea() de Circle1 ya devuelve PI * r^2,
        // solo necesitas: return getArea() * height;
        return getArea() * height;
    }

    // TOSTRING
    @Override
    public String toString() {
        // Reutilizamos el toString de la clase padre (Circle1) para los datos del radio/color
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}