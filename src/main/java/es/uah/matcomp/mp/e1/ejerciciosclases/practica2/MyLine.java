package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase representa una linea que se forma uniendo dos objetos de tipo punto
public class MyLine {
    // la linea tiene un punto de inicio y otro de fin (composicion)
    private MyPoint begin;
    private MyPoint end;

    // constructor para crear la linea pasando directamente las coordenadas x e y de cada punto
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }

    // este constructor se usa si ya tenemos los objetos mypoint creados de antes
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }

    // metodos para obtener o cambiar los puntos completos de la linea
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint End){
        this.end=end;
    }

    // atajos para manejar las coordenadas x e y del punto inicial sin pedir el objeto entero
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }

    // lo mismo que antes pero para controlar las coordenadas del punto final
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }

    // metodos para sacar o meter las coordenadas de inicio y fin usando un array
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    // calcula cuanto mide la linea aprovechando el metodo de distancia de mypoint
    public double getLength(){
        return begin.distance(end);
    }

    // saca la inclinacion o el angulo de la linea usando funciones de la libreria math
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        // atan2 nos da el arcotangente para saber el angulo exacto
        return Math.atan2(yDiff, xDiff);
    }

    // devuelve un resumen de la linea con la info de sus dos puntos
    public String toString(){
        return "MyLine[begin= "+begin.toString()+", end= "+end.toString()+"]";
    }
}
