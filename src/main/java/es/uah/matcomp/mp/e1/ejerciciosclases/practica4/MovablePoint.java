package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase que implementa la interfaz Movable para control de movimiento manual
public class MovablePoint implements Movable {
    // ATRIBUTOS (Package-private por defecto en este diseño)
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // CONSTRUCTOR
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // IMPLEMENTACIÓN DE MÉTODOS DE LA INTERFAZ
    @Override
    public void moveUp(){
        y -= ySpeed; // En sistemas de coordenadas de pantalla, 'up' suele restar Y
    }

    @Override
    public void moveDown(){
        y += ySpeed; // Y 'down' suele sumar Y
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }

    // TOSTRING
    @Override
    public String toString(){
        // Corregido: antes mostraba (x,y) en el hueco de la velocidad
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}