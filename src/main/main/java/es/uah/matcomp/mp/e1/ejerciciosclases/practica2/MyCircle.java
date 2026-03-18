package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// representa un circulo que se coloca sobre un punto del plano
public class MyCircle {
    private MyPoint center; // el centro es un objeto de tipo punto
    private int radius;

    // si no pasamos nada, el circulo aparece en el centro (0,0) y vacio
    public MyCircle(){
        this.center=new MyPoint(0,0);
        this.radius=0;
    }

    // creamos el circulo dandole las coordenadas x e y del centro
    public MyCircle(int x, int y, int radius){
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }

    // o tambien podemos darle un objeto punto que ya tengamos hecho
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius=radius; }
    public MyPoint getCenter() { return center; }
    public void setCenter(MyPoint center) { this.center=center; }

    // metodos para mover el circulo tocando solo las coordenadas del centro
    public int getCenterX() { return center.getX(); }
    public void setCenterX(int x) { center.setX(x); }
    public int getCenterY() { return center.getY(); }
    public void setCenterY(int y) { center.setY(y); }

    public int[] getCenterXY() { return center.getXY(); }
    public void setCenterXY(int x, int y) { center.setXY(x,y); }

    public String toString() {
        return "MyCircle[radius= "+radius+", center= "+center.toString()+"]";
    }

    // calculamos el area y el perimetro usando las formulas de siempre
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    // mide la distancia que hay desde este circulo hasta otro
    public double distance(MyCircle another) {
        // comparamos los centros de los dos circulos para sacar la distancia
        return this.center.distance(another.getCenter());
    }
}
