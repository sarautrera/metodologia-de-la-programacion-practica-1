package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase ball para representar una pelota que se mueve en un espacio 2d
public class Ball {
    // atributos privados para el encapsulamiento segun el diseño
    private float x;
    private float y;
    private int radius;
    // xdelta e ydelta funcionan como la velocidad o el desplazamiento en cada paso
    private float xDelta;
    private float yDelta;

    // constructor para dejar la pelota lista con su posicion, tamaño y velocidad inicial
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // metodos de acceso y modificacion para la posicion x
    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // metodos para gestionar la posicion y de la pelota
    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // permite consultar o cambiar el radio (tamaño) de la pelota
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // estos getters y setters controlan la direccion y velocidad del movimiento
    public float getXDelta() {
        return this.xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return this.yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // metodo para actualizar la posicion de la pelota sumando el desplazamiento actual
    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }
}