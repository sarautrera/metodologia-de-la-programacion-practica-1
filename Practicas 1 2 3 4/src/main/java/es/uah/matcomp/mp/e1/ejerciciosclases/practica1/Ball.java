package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    /**Constructores con parametros*/
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }
    /**Getter para obtener x*/
    public float getX(){
        return x;
    }
    /**Setter para establecer x*/
    public void setX(float x){
        this.x=x;
    }
    /**Getter para obtener y*/
    public float getY(){
        return y;
    }
    /**Setter para establecer y*/
    public void setY(float y){
        this.y=y;
    }
    /**Getter para obtener radio*/
    public int getRadius(){
        return radius;
    }
    /**Setter para establecer el radio*/
    public void setRadius(int radius){
        this.radius=radius;
    }
    /**Setter para establecer xDelta*/
    public float getXDelta(){
        return xDelta;
    }
    /**Setter para establecer xDelta*/
    public void setXDelta(float xDelta){
        this.xDelta=xDelta;
    }
    /**Getter para obtener yDelta*/
    public float getYDelta(){
        return yDelta;
    }
    /**Setter para establecer yDelta*/
    public void setYDelta(float yDelta){
        this.yDelta=yDelta;
    }
    /**Metodo para mover*/
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    /**Metodo para reflejat horizontalmente*/
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }
    /**Metodo para reflejat verticalmente*/
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }
    public String toString(){
        return "ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }

}
