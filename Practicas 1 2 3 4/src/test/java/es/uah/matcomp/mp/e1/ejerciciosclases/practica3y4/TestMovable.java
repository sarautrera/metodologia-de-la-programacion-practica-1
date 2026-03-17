package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Movable;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.MovablePoint;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.MovableCircle;
public class TestMovable {
    public static void main(String[] args){
        Movable p1= new MovablePoint(1, 1, 2, 2);
        System.out.println(p1);
        System.out.println("Punto inicial: " + p1);
        p1.moveUp();
        System.out.println("Punto tras moveUp: " + p1);
        p1.moveRight();
        System.out.println("Punto tras moveRight: " + p1);

        Movable m2 = new MovableCircle(2, 1, 2, 2, 5); // x=2, y=1, xSpeed=2, ySpeed=2, radio=5
        System.out.println("Círculo inicial: " + m2);
        m2.moveDown();
        System.out.println("Círculo tras moveDown: " + m2);
        m2.moveLeft();
        System.out.println("Círculo tras moveLeft: " + m2);
    }
}
