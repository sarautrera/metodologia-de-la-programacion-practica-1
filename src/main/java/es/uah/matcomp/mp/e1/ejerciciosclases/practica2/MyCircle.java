package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// esta clase sirve para representar un circulo que tiene un punto como centro
public class MyCircle {
    // atributos privados: un objeto punto para el centro y un entero para el radio
    private MyPoint center;
    private int radius;

    // constructor por defecto: pone el circulo en el origen (0,0) y con radio cero
    public MyCircle(){
        this.center=new MyPoint(0,0);
        this.radius=0;
    }

    // este constructor crea el centro directamente pasando las coordenadas x e y
    public MyCircle(int x, int y, int radius){
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }

    // aqui creamos el circulo usando un objeto mypoint que ya tengamos hecho
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }

    // metodos para consultar y cambiar el valor del radio
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }

    // metodos para manejar el objeto centro completo
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }

    // estos metodos son atajos para cambiar la x y la y del centro sin pedir el objeto punto
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }

    // saca o mete las dos coordenadas del centro a la vez usando un array
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    // devuelve un resumen del circulo con su radio y la posicion del centro
    public String toString(){
        return "MyCircle[radius= "+radius+", center= "+center.toString()+"]";
    }

    // calculamos el area usando la formula de pi por el radio al cuadrado
    public double getArea(){
        return Math.PI*radius*radius;
    }

    // sacamos el perimetro o circunferencia del circulo (2 * pi * r)
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    // mide la distancia que hay entre el centro de este circulo y el de otro
    public double distance(MyCircle another){
        // reutilizamos el metodo distance que ya programamos en la clase mypoint
        return this.center.distance(another.getCenter());
    }
}
