package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Square que hereda de Rectangle, forzando que ancho y largo sean iguales
public class Square extends Rectangle {

    // CONSTRUCTORES
    public Square() {
        // Un cuadrado por defecto de 1.0 x 1.0
        super(1.0, 1.0);
    }

    public Square(double side) {
        // Pasamos el lado tanto para el ancho como para el largo
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // MÉTODOS ESPECÍFICOS DE SQUARE
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        // Actualizamos ambos atributos para mantener la integridad del cuadrado
        super.setWidth(side);
        super.setLength(side);
    }

    // SOBRESCRITURA (Override)
    // Redefinimos los métodos de Rectangle para que no se pueda romper el cuadrado

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    // TOSTRING
    @Override
    public String toString() {
        // Reutilizamos el toString de Rectangle y añadimos info específica
        return "Square[" + super.toString() + "]";
    }
}