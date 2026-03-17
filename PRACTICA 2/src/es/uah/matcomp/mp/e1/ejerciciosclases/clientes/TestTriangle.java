package es.uah.matcomp.mp.e1.ejerciciosclases.clientes;

public class TestTriangle {
    public static void main(String[] args){
        MyTriangle t1= new MyTriangle(10,20,10,10,20,15);
        System.out.println(t1);
        MyPoint p1= new MyPoint(1,2);
        MyPoint p2= new MyPoint(3,4);
        MyPoint p3= new MyPoint(5,6);
        MyTriangle t2= new MyTriangle(p1,p2,p3);
        System.out.println(t2);

        System.out.printf("%.2f%n",t1.getPerimeter());
        MyTriangle escaleno = new MyTriangle(0, 0, 4, 0, 0, 3);
        System.out.println(escaleno.getType());
        MyTriangle isosceles = new MyTriangle(0, 0, 6, 0, 3, 4);
        System.out.println(isosceles.getType());
        //Un equilatero es imposible en enteros
    }
}
