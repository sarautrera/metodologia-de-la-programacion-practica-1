package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para controlar una bola que se mueve por la pantalla y rebota
public class Ball {

    // ATRIBUTOS
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // CONSTRUCTORES
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }

    // GETS
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public int getRadius(){
        return radius;
    }

    public float getXDelta(){
        return xDelta;
    }

    public float getYDelta(){
        return yDelta;
    }

    // SETS
    public void setX(float x){
        this.x=x;
    }

    public void setY(float y){
        this.y=y;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public void setXDelta(float xDelta){
        this.xDelta=xDelta;
    }

    public void setYDelta(float yDelta){
        this.yDelta=yDelta;
    }

    // FUNCIONES ESPECÍFICAS

    // Actualiza la posición de la bola sumándole la velocidad que lleva
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }

    // Cambia la dirección en el eje X para que rebote hacia el otro lado (horizontal)
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }

    // Cambia la dirección en el eje Y para que rebote arriba o abajo (vertical)
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }

    // TOSTRING
    public String toString(){
        return "ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }

}