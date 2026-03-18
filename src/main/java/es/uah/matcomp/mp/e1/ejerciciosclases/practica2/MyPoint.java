package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para representar un punto en el plano con coordenadas X e Y
public class MyPoint {

    // ATRIBUTOS
    private int x;
    private int y;

    // CONSTRUCTORES
    public MyPoint() {
        // Constructor vacío
    }

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    // GETS
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    // Devuelve un array con las dos posiciones [x, y]
    public int[] getXY(){
        return new int[] {x,y};
    }

    // SETS
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    // Cambia la X y la Y a la vez
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula la distancia entre este punto y unas coordenadas que le pases
    public double distance(int x, int y){
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    // Calcula la distancia entre este punto y otro objeto MyPoint
    public double distance(MyPoint another){
        int xOtro = another.getX();
        int yOtro = another.getY();

        int xDiff = this.x - xOtro;
        int yDiff = this.y - yOtro;

        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    // Calcula la distancia desde este punto hasta el origen (0,0)
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    // TOSTRING
    public String toString(){
        return "("+x+","+y+")";
    }

}