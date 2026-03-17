package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestCircle {
    public static void main(String[] args){
        //declarar una instancia de la clase circulo llamada c1
        Circle c1 = new Circle();
        //Para pedir al objeto que haga algo o te de informacion se utilica el operador (.)
        //Invocar los metodos publicos en la instancia c1, con el operador (.)
        System.out.println("El circulo tiene un radio de "
                + c1.getRadius()+" y un area de "+c1.getArea());
        Circle c2 = new Circle(2.0);
        //Invocar los metodos publicos en la instancia c2, con el operador (.)
        System.out.println("El circulo tiene un radio de "
                + c2.getRadius()+ " y un area de "+c2.getArea());
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("El radio es "+ c4.getRadius());
        c4.setColor("verde");
        System.out.println("El color es "+c4.getColor());
        //Esto no se puede hacer porque devuelve vacío: System.out.println(c4.setRadius(4.4));
        //De manera explicita
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());
        //De manera implicita
        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);



    }
}
