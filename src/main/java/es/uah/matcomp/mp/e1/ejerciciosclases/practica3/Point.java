package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase básica para representar un punto con coordenadas X e Y (tipo float)
public class Point {

    // ATRIBUTOS
    private float x = 0.0f;
    private float y = 0.0f;

    // CONSTRUCTORES
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
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

    // Devuelve un array con ambas coordenadas [x, y]
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

    // Actualiza X e Y al mismo tiempo
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // TOSTRING
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}