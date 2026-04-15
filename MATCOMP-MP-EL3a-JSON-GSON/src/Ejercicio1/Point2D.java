package Ejercicio1;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(){
        this.x=x;
    }
    public void setY(){
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
    public String toJson(){
        return "{\"x\":\"" + x + "\", \"y\":\"" + y + "\"}";
    }
}
