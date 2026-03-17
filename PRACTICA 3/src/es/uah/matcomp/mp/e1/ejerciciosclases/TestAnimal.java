package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestAnimal {
    public static void main(String[] args) {
        // 1. Probamos las instancias de cada clase
        Animal a = new Animal("Animal");
        Mammal m = new Mammal("Mamífero");
        Cat c = new Cat("Michi");
        Dog d = new Dog("Firulais");


        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        System.out.println(d);

        System.out.println("\n--- Prueba de greets() ---");
        c.greets();
        d.greets();

        Dog d2 = new Dog("Rayo");
        d.greets(d2);
    }
}
