package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase base para representar un punto en dos dimensiones (X, Y)
public class Point2D {

    // ATRIBUTOS
    private float x = 0.0f;
    private float y = 0.0f;

    // CONSTRUCTORES
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // GETS
    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    // Devuelve un array con las coordenadas [x, y]
    public float[] getXY() {
        float[] coord = new float[2];
        coord[0] = x;
        coord[1] = y;
        return coord;
    }

    // SETS
    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    // Cambia ambas coordenadas a la vez
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // TOSTRING
    public String toString(){
        return "(" + x + "," + y + ")";
    }

}