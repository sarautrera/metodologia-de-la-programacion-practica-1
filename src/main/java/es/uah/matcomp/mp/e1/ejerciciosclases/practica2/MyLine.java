package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin= new MyPoint(x1, y1);
        this.end= new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }
    public MyPoint getBegin(){
        return begin;
    }
    public MyPoint getEnd(){
        return end;
    }
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public void setEnd(MyPoint end){
        this.end=end;
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
    public int[] getBeginXY(){
        return new int[] {this.begin.getX(),this.begin.getY()};
        //Tambien: return this.begin.getXY();
    }
    public int[] getEndXY(){
        return new int[] {this.end.getX(),this.end.getY()};
    }
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }
    public double getLength(){
        double xDiff= end.getX()-begin.getX();
        double yDiff= end.getY()-begin.getY();

        return Math.sqrt(xDiff*xDiff+ yDiff*yDiff);
        //podriamos haber hecho return begin.distance(end);
    }
    public double getGradient(){
        int xDiff= end.getX()-begin.getX();
        int yDiff= end.getY()-begin.getY();

        return Math.atan2(yDiff,xDiff);
    }
    public String toString(){
        return "MyLine[begin=("+begin.getX()+","+begin.getY()+"), end=("+end.getX()+","+end.getY()+")]";
    }




}
