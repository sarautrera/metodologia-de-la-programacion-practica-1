package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// Clase Dog que hereda directamente de Animal
public class Dog extends Animal {

    // CONSTRUCTOR
    public Dog(String name) {
        super(name);
    }

    // SOBRESCRITURA (Override)
    // Implementa o modifica el método de la clase padre
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // SOBRECARGA (Overload)
    // Mismo nombre de método, pero diferentes parámetros:

    // Saludo al encontrarse con otro perro normal
    public void greets(Dog another) {
        System.out.println("Wooooof");
    }

    // Saludo al encontrarse con un perro grande (BigDog)
    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}