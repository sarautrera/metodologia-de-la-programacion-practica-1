package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase que hereda de Point y añade movimiento mediante velocidades
public class MovablePoint extends Point {

    // ATRIBUTOS
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // CONSTRUCTORES
    public MovablePoint() {
        // Constructor vacío
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        // Pasamos la posición inicial a la clase padre (Point)
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // GETS
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // Devuelve un array con las dos velocidades [xSpeed, ySpeed]
    public float[] getSpeed() {
        float[] coord = new float[2];
        coord[0] = xSpeed;
        coord[1] = ySpeed;
        return coord;
    }

    // SETS
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // FUNCIONES ESPECÍFICAS

    // El método clave: actualiza la posición del punto sumándole la velocidad
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Devolvemos el propio objeto para poder encadenar métodos
    }

    // TOSTRING
    @Override
    public String toString() {
        // Combina la posición de Point con la velocidad de esta clase
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}