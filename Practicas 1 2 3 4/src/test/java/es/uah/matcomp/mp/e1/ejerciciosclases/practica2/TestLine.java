package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyLine;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyPoint;
public class TestLine {
    public static void main(String[] args){
        MyLine l1= new MyLine(1,2,3,4);
        System.out.println("x1:"+l1.getBeginX());
        System.out.println("y1:"+l1.getBeginY());
        System.out.println("x2:"+l1.getEndX());
        System.out.println("y2:"+l1.getEndY());

        MyPoint p1= new MyPoint(4,5);
        MyPoint p2= new MyPoint(6,7);
        MyLine l2= new MyLine(p1,p2);
        System.out.println("p1:"+l2.getBegin());
        System.out.println("p2:"+l2.getEnd());

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());



    }
}
