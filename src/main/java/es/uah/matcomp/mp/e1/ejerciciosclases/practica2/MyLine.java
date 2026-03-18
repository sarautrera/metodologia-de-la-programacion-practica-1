package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para representar una línea uniendo dos puntos (inicio y fin)
public class MyLine {

    // ATRIBUTOS
    private MyPoint begin;
    private MyPoint end;

    // CONSTRUCTORES
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin= new MyPoint(x1, y1);
        this.end= new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }

    // GETS
    public MyPoint getBegin(){
        return begin;
    }
    public MyPoint getEnd(){
        return end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public int[] getBeginXY(){
        return new int[] {this.begin.getX(),this.begin.getY()};
    }
    public int[] getEndXY(){
        return new int[] {this.end.getX(),this.end.getY()};
    }

    // SETS
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public void setEnd(MyPoint end){
        this.end=end;
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula cuánto mide la línea usando Pitágoras entre los dos puntos
    public double getLength(){
        double xDiff= end.getX()-begin.getX();
        double yDiff= end.getY()-begin.getY();

        return Math.sqrt(xDiff*xDiff+ yDiff*yDiff);
    }

    // Saca el ángulo de inclinación de la línea en radianes
    public double getGradient(){
        int xDiff= end.getX()-begin.getX();
        int yDiff= end.getY()-begin.getY();

        return Math.atan2(yDiff,xDiff);
    }

    // TOSTRING
    public String toString(){
        return "MyLine[begin=("+begin.getX()+","+begin.getY()+"), end=("+end.getX()+","+end.getY()+")]";
    }
}