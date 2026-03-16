package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Cat("Fuffy");
        Animal a2 = new Dog("Rex");
        Animal a3 = new BigDog("Wolf");


        a1.greets(); // Meow
        a2.greets(); // Woof
        a3.greets(); // Wooow


        Dog d2 = (Dog) a2;
        BigDog bd2 = (BigDog) a3;

        d2.greets(new Dog("Otro")); // Woooof
        bd2.greets(d2); // Woooooow
        bd2.greets(new BigDog("Jefe")); // Wooooooooow
    }
}
