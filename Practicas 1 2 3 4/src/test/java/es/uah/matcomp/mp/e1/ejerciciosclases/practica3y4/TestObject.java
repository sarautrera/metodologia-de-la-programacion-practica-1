package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.*;

public class TestObject {
    public static void main(String[] args){
        GeometricObject c1 = new Circle2(2.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        GeometricObject r1 =new Rectangle2(3.0, 4.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Resizable re1=new ResizableCircle(2.0);
        System.out.println(re1);
        re1.resize(10);
        System.out.println(re1);
    }
}
