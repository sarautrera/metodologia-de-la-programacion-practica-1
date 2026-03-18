package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// esta clase sirve para representar una linea que une dos puntos en el plano
public class MyLine {
    // la linea se compone de dos objetos de tipo punto: el de inicio y el de fin
    private MyPoint begin;
    private MyPoint end;

    // constructor para crear la linea directamente pasando las coordenadas x e y de cada punto
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }

    // este otro constructor se usa si ya tenemos los objetos punto creados de antes
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }

    // metodos para obtener o cambiar los puntos enteros de la linea
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

    // atajos para manejar la x y la y del punto inicial sin tener que pedir el objeto punto
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

    // metodos para sacar o meter las coordenadas juntas usando un array
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

    // saca cuanto mide la linea reutilizando el metodo de distancia que ya tiene el punto
    public double getLength(){
        return begin.distance(end);
    }

    // calcula la inclinacion o el angulo de la linea usando la libreria math
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        // usamos atan2 para sacar el arcotangente segun la diferencia de coordenadas
        return Math.atan2(yDiff, xDiff);
    }

    // devuelve el resumen de la linea con los datos de sus dos puntos
    public String toString(){
        return "MyLine[begin= "+begin.toString()+", end= "+end.toString()+"]";
    }
}