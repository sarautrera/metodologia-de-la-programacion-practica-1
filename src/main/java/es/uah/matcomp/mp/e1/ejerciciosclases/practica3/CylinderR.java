package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase para crear un cilindro usando un objeto Circle1R para la base
public class CylinderR {

    // ATRIBUTOS
    private Circle1R base; // Instancia de la clase Circle1R
    private double height;

    // CONSTRUCTORES
    public CylinderR(){
        height = 1.0;
        this.base = new Circle1R(1.0);
    }

    public CylinderR(double radius){
        base = new Circle1R(radius);
        height = 1.0;
    }

    public CylinderR(Circle1R base, double height){
        // Corregido para usar la base que pasamos por parámetro
        this.base = base;
        this.height = height;
    }

    // GETS
    public double getHeight(){
        return this.height;
    }

    public Circle1R getBase(){
        return this.base;
    }

    // SETS
    public void setHeight(double height){
        this.height = height;
    }

    // FUNCIONES ESPECÍFICAS

    // El volumen es el área de la base por la altura
    public double getVolume(){
        // Nota: Si base.getArea() ya incluye PI, no hace falta multiplicarlo aquí otra vez
        return base.getArea() * height;
    }

    // TOSTRING
    @Override
    public String toString() {
        // Mostramos los datos del cilindro y delegamos la info del círculo a su propio toString
        return "Cylinder: [base=" + base.toString() + ", height=" + height + "]";
    }
}