package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distance(int x, int y){
        //La distancia entre el punto guardado en memoria y el dado
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(MyPoint another){
        //Another es una variable que representa otro objeto de la clase MyPoint
        int xOtro = another.getX();
        int yOtro = another.getY();

        int xDiff = this.x - xOtro;
        int yDiff = this.y - yOtro;

        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        //Se podria poner en una sola linea como return distance(another.getX(), another.getY());

    }
    public double distance() {
        // Distancia al punto (0,0)
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public String toString(){
        return "("+x+","+y+")";
    }

}
