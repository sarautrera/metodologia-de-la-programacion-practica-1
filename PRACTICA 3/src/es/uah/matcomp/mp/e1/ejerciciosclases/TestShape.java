package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestShape {
    public static void main(String[] args) {
        // 1. Probar Circle
        Circle c1 = new Circle(5.0, "blue", false);
        System.out.println("--- Prueba Circle ---");
        System.out.println(c1.toString());
        System.out.println("Área: " + c1.getArea()+
                "Perímetro: " + c1.getPerimeter());

        // 2. Probar Rectangle
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println("\n--- Prueba Rectangle ---");
        System.out.println(r1);
        System.out.println("Área: " + r1.getArea()+
                "Perímetro: " + r1.getPerimeter());

        // 3. Probar Square
        Square s1 = new Square(3.0, "green", false);
        System.out.println("\n--- Prueba Square ---");
        System.out.println(s1);

        // Verificamos que al cambiar el lado, cambien width y length (según el diagrama)
        s1.setSide(6.0);
        System.out.println("Después de setSide(6.0): " + s1.toString());
    }
}