package Ejercicio1;

public class Circle {
    // Atributos
    private double radius;
    private String color;

    //CONSTRUCTORES SOBRECARGADOS:
    /**Constructor por defecto de un circulo*/
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    /**Constructor de un circulo*/
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    // Métodos (Getters y Setters)
    /**Obtiene el radio*/
    public double getRadius() {
        return radius;
    }
    /**Obtiene el color*/
    public String getColor() {
        return color;
    }
    /**CEstablece el radio*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**Establece el color*/
    public void setColor(String color) {
        this.color = color;
    }
    //Metodos publicos
    /**Obtiene el area*/
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /**Obtiene la circunferencia*/
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**tostring*/
    public String toJson(){
        return "{\"radius\":\"" + radius + "\", \"color\":\"" + color + "\"}";
    }
}