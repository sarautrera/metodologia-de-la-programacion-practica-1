package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Cat que hereda de Animal (Práctica 4)
public class Cat extends Animal {

    // CONSTRUCTOR
    public Cat(String name) {
        // Pasa el nombre al constructor de Animal
        super(name);
    }

    // IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO
    @Override
    public void greets() {
        // El saludo específico del gato
        System.out.println("Meow");
    }
}