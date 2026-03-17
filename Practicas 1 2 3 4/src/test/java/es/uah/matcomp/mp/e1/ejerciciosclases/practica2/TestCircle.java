package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyCircle;
public class TestCircle {
    public static void main(String[] args){
        MyCircle c1= new MyCircle();
        c1.setCenterXY(1,2);
        System.out.println("x:"+c1.getCenterX());
        System.out.println("y:"+c1.getCenterY());
        System.out.println("Radio por defecto:"+c1.getRadius());
        c1.setRadius(3);
        c1.setCenterX(2);
        c1.setCenterY(2);
        System.out.println("x:"+c1.getCenterX());
        System.out.println("y:"+c1.getCenterY());
        System.out.println("x:"+c1.getCenterXY()[0]);
        System.out.println("y:"+c1.getCenterXY()[1]);
        System.out.println("Radio:"+c1.getRadius());
        MyPoint p1= new MyPoint(1,2);
        MyCircle c2 =new MyCircle(p1, 2);
        System.out.println("Center:"+c2.getCenter());
        MyPoint p2=new MyPoint(1,1);
        c2.setCenter(p2);
        System.out.println("Center 2:"+c2.getCenter());
        System.out.println("Radio:"+c2.getRadius());
        MyCircle c3=new MyCircle(1,1,6);
        System.out.println("x:"+c3.getCenterX());
        System.out.println("y:"+c3.getCenterY());
        System.out.println("Radio:"+c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getCircumference());
        System.out.println(c2.distance(c3));

    }
}
