package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase que implementa Movable delegando el movimiento a un MovablePoint
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    // CONSTRUCTOR
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // CORRECCIÓN: Usamos los parámetros recibidos, no valores fijos (1,1,2,2)
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // IMPLEMENTACIÓN DE MÉTODOS (Delegación)

    @Override
    public void moveUp() {
        // En lugar de modificar center.y directamente (que podría ser privado),
        // lo ideal es llamar al método del punto.
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    // TOSTRING
    @Override
    public String toString() {
        // CORRECCIÓN: Mostramos xSpeed/ySpeed del centro en lugar de su posición dos veces
        return center.toString() + ", radius=" + radius;
    }
}