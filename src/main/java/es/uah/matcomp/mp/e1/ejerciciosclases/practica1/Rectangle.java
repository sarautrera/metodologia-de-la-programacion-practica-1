package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase rectangle: define una figura rectangular basada en el diseño del uml
public class Rectangle {
    // atributos privados para proteger el estado del objeto (encapsulamiento)
    private double length;
    private double width;

    // constructor por defecto: inicializa las dimensiones a 1.0 como marca el esquema
    public Rectangle() {
        this.length = 1.0F;
        this.width = 1.0F;
    }

    // constructor parametrizado: permite crear el rectangulo con medidas especificas
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // metodos de acceso (getters) para consultar las dimensiones desde fuera
    public double getLength() {
        return this.length;
    }

    // metodos de modificacion (setters) para actualizar el largo o el ancho
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // calcula el area del rectangulo (base por altura)
    public double getArea() {
        return this.length * this.width;
    }

    // calcula el perimetro sumando todos sus lados (2 * largo + 2 * ancho)
    public double getPerimeter() {
        // hacemos el casting a double para que el calculo sea preciso
        return this.length * (double)2.0F + (double)2.0F * this.width;
    }

    // representacion en cadena: devuelve los datos del rectangulo bien formateados
    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}
