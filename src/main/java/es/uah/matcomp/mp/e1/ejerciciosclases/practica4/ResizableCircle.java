package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase que extiende Circle2 e implementa la interfaz Resizable
public class ResizableCircle extends Circle2 implements Resizable {

    // CONSTRUCTOR
    public ResizableCircle(double radius) {
        // Llamamos al constructor de la clase padre (Circle2)
        super(radius);
    }

    // IMPLEMENTACIÓN DE LA INTERFAZ
    @Override
    public void resize(int percent) {
        // Multiplicamos el radio por el factor de escala (ej: 50% -> 0.5)
        // Usamos 100.0 para forzar la división decimal
        this.radius *= (percent / 100.0);
    }

    // TOSTRING
    @Override
    public String toString() {
        // Envolvemos el toString de Circle2
        return "ResizableCircle[" + super.toString() + "]";
    }
}