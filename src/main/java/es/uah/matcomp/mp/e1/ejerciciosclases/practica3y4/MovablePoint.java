package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;


public class MovablePoint extends Point implements Movable{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MovablePoint(){}
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] coord= new float[2];
        coord[0]=xSpeed;
        coord[1]=ySpeed;
        return coord;
    }
    public void setSpeed(float xSpeed, float y){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public void moveUp() {
        setY(getY() - ySpeed); // En gráficos, subir suele ser restar Y
    }

    @Override
    public void moveDown() {
        setY(getY() + ySpeed);
    }

    @Override
    public void moveLeft() {
        setX(getX() - xSpeed);
    }

    @Override
    public void moveRight() {
        setX(getX() + xSpeed);
    }
    @Override
    public String toString(){
        return super.toString()+", speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
