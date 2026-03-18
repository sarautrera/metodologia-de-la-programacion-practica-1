package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase para crear cuadrados, heredando de Rectangle pero obligando a que los lados sean iguales
public class Square extends Rectangle {

    // CONSTRUCTORES
    public Square() {
        // Un cuadrado por defecto de 1.0 x 1.0
        super(1.0, 1.0);
    }

    public Square(double side) {
        // Pasamos el mismo valor para largo y ancho al padre
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // GETS
    // Como es un cuadrado, el "lado" es cualquiera de las dos dimensiones
    public double getSide() {
        return getWidth();
    }

    // SETS
    // Al cambiar el lado, actualizamos obligatoriamente largo y ancho
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    // REDEFINICIÓN DE MÉTODOS (POLIMORFISMO)

    @Override
    public void setWidth(double side) {
        // Si alguien intenta cambiar solo el ancho, cambiamos también el largo
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        // Lo mismo aquí: mantenemos la forma de cuadrado pase lo que pase
        super.setWidth(side);
        super.setLength(side);
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Square[" + super.toString() + ", width=" + getSide() + ", length=" + getSide() + "]";
    }
}