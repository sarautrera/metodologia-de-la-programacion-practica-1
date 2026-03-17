package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.CylinderR;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Circle1R;
public class TestCircleR {
    public static void main (String[] args) {
// Declare and allocate a new instance of cylinder
// with default color, radius, and height
        CylinderR c1 = new CylinderR();
        System.out.println("Cylinder:"
                + " height=" + c1.getHeight()
                + " volume=" + c1.getVolume());
// Declare and allocate a new instance of cylinder
// specifying height, with default color and radius
        CylinderR c2 = new CylinderR(10.0);
        System.out.println("Cylinder:"
                + " height=" + c2.getHeight()
                + " volume=" + c2.getVolume());
// Declare and allocate a new instance of cylinder
// specifying radius and height, with default color
        Circle1R  s1 =new Circle1R(2.0);
        CylinderR c3 = new CylinderR(s1 , 10.0);
        System.out.println("Cylinder:"
                + " base=" + c3.getBase()
                + " height=" + c3.getHeight()
                + " volume=" + c3.getVolume());
    }
}