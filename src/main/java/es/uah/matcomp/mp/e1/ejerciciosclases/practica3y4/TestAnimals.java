package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class TestAnimals {
    public static void main(String[] args) {

        // 3. Probar la clase hija: Cat
        // Hereda de Mammal y tiene sonido propio
        Cat gato = new Cat("Garfield");
        System.out.println("Prueba Cat:");
        System.out.println(gato.toString());
        System.out.print("Sonido: ");
        gato.greets();
        System.out.println("------------------------------------");

        // 4. Probar la clase hija: Dog
        // Hereda de Mammal y tiene dos tipos de sonido (Overloading)
        Dog perro1 = new Dog("Snoopy");
        Dog perro2 = new Dog("Ayudante de Santa");
        System.out.println("Prueba Dog:");
        System.out.println(perro1.toString());
        System.out.print("Sonido solo: ");
        perro1.greets();
        System.out.print("Sonido con otro perro: ");
        perro1.greets(perro2);
        System.out.println("------------------------------------");
    }
}