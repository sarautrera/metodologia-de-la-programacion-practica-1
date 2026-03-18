package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase circle para representar un circulo y calcular sus propiedades
public class Circle {
    // atributo privado para el radio siguiendo el principio de encapsulamiento
    private double radius;

    // constructor por defecto: si no pasamos nada, el radio es 1.0
    public Circle() {
        this.radius = (double)1.0F;
    }

    // constructor para crear un circulo con el radio que queramos
    public Circle(double radius) {
        this.radius = radius;
    }

    // este constructor recibe tambien el color, aunque en esta clase no lo guardamos
    public Circle(double radius, String color) {
        this.radius = radius;
    }

    // metodos getter y setter para manejar el valor del radio desde fuera
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // calcula el area del circulo: pi por el radio al cuadrado
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    // calcula el perimetro o longitud de la circunferencia (2 * pi * r)
    public double getCircumference() {
        return (Math.PI * 2D) * this.radius;
    }

    // devuelve una cadena con la informacion del radio del circulo
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}