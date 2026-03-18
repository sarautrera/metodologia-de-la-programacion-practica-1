package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(){
        this.x= 0;
        this.y= 0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
            return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(MyPoint another){
        int xDif=this.x -another.getX();
        int yDif=this.y- another.getY();
        return Math.sqrt(xDif*xDif+yDif*yDif);
    }
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}





