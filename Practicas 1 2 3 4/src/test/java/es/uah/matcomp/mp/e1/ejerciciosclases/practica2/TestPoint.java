package test.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyPoint;
public class TestPoint {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        p1.setX(8);
        p1.setY(9);
        System.out.println("X:"+p1.getXY()[0]);
        System.out.println("Y:"+p1.getXY()[1]);
        System.out.println("El punto es: "+p1);

        MyPoint p2 = new MyPoint(3,0);
        System.out.println("El punto es: "+p2);
        System.out.println("X:"+p2.getX());
        System.out.println("Y:"+p2.getY());

        p2.setXY(0,4);
        System.out.println(p2.distance());
        System.out.println(p2.distance(0,4));
        System.out.printf("%.2f%n", p2.distance(p1));

        //Programamos un array de 10 puntos
        //Creamos el contenedor
        MyPoint[] puntos = new MyPoint[10]; //MyPoint[] es un array de objetos MyPoint
        for (int i=0; i< puntos.length; i++){
            //Ahora rellenamos los espacios con los puntos
            puntos[i]= new MyPoint(i+1, i+1);//empieza en (1,1)
        }
        for (int i=0; i<puntos.length; i++){
            MyPoint p=puntos[i];
            System.out.println(p);
        }
        //Matriz distancias entre todos ellos
        for(int i=0; i<puntos.length; i++){
            for(int j=0; j<puntos.length; j++){
                double d= puntos[i].distance(puntos[j]);
                System.out.printf("%6.2f", d);//Reserva seis espacios para cada numero y usa dos decimales
            }
            System.out.println();//Salto de linea
        }
    }
}
