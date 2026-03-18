package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float[] getXY() {
        float[] coord=new float[2];
        coord[0]=x;
        coord[1]=y;
        return coord;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}