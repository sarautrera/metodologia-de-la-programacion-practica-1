package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para crear un círculo usando un objeto MyPoint como centro
public class MyCircle {

    // ATRIBUTOS
    private MyPoint center;
    private int radius;

    // CONSTRUCTORES
    public MyCircle(){
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }

    // GETS
    public int getRadius(){
        return radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    public int[] getCenterXY(){
        return center.getXY();
    }

    // SETS
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }

    // Modificamos la X del punto que ya tenemos, no creamos uno nuevo
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula el área con la fórmula de PI por radio al cuadrado
    public double getArea(){
        return Math.PI*radius*radius;
    }

    // Saca el perímetro del círculo
    public double getCircumference(){
        return Math.PI*2*radius;
    }

    // Calcula la distancia entre el centro de este círculo y otro que le pases
    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }

    // TOSTRING
    public String tostring(){
        return "MyCircle[radius="+radius+", center="+center+"]";
    }
}