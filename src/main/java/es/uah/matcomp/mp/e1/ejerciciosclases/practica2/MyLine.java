package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin=new MyPoint(x1,y1);
        this.end=new MyPoint(x2,y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin=begin;
        this.end=end;
    }
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
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLine[begin= "+begin.toString()+", end= "+end.toString()+"]";
    }
}

/**
 * public class TestMain {
 *     public static void main(String[] args) {
 *         // 1. Probar el constructor con coordenadas (x1, y1, x2, y2)
 *         // Creamos una línea que va de (0,0) a (3,4)
 *         // (Nota: Esta es la hipotenusa de un triángulo 3-4-5, la longitud debe ser 5.0)
 *         MyLine l1 = new MyLine(0, 0, 3, 4);
 *
 *         System.out.println("--- Prueba 1: Constructor con coordenadas ---");
 *         System.out.println("Línea 1 creada de (0,0) a (3,4)");
 *         System.out.println("Coordenada X inicio: " + l1.getBeginX());
 *         System.out.println("Coordenada Y fin: " + l1.getEndY());
 *         System.out.println("Longitud calculada: " + l1.getLength());
 *         System.out.println("Gradiente (en radianes): " + l1.getGradient());
 *         System.out.println();
 *
 *         // 2. Probar el constructor con objetos MyPoint
 *         MyPoint p1 = new MyPoint(5, 5);
 *         MyPoint p2 = new MyPoint(10, 10);
 *         MyLine l2 = new MyLine(p1, p2);
 *
 *         System.out.println("--- Prueba 2: Constructor con objetos MyPoint ---");
 *         // Imprime los objetos (esto usa el toString() de MyPoint)
 *         System.out.println("Inicio de Línea 2: " + l2.getBegin());
 *         System.out.println("Fin de Línea 2: " + l2.getEnd());
 *         System.out.println("Longitud: " + l2.getLength());
 *         System.out.println();
 *
 *         // 3. Probar métodos que manejan arreglos int[] (getXY / setXY)
 *         System.out.println("--- Prueba 3: Métodos de Arreglos (XY) ---");
 *         int[] coords = l2.getBeginXY();
 *         System.out.println("Array de inicio: [" + coords[0] + ", " + coords[1] + "]");
 *
 *         l2.setEndXY(20, 30);
 *         System.out.println("Nuevo fin (tras setEndXY): " + l2.getEndX() + "," + l2.getEndY());
 *         System.out.println();
 *
 *         // 4. Probar Setters individuales y lógica de distancia
 *         System.out.println("--- Prueba 4: Modificación con Setters ---");
 *         l1.setBeginX(10);
 *         l1.setBeginY(10);
 *         l1.setEndX(10);
 *         l1.setEndY(20);
 *
 *         System.out.println("Línea 1 ahora es vertical: (10,10) a (10,20)");
 *         System.out.println("Nueva Longitud (debe ser 10.0): " + l1.getLength());
 *         // Math.atan2 para una línea vertical hacia arriba devuelve PI/2 (aprox 1.57)
 *         System.out.println("Nuevo Gradiente: " + l1.getGradient());
 *     }
 * }
 */
