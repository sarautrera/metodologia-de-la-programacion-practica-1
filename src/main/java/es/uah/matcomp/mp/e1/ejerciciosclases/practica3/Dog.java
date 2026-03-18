package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase específica para perros que hereda de Mammal
public class Dog extends Mammal {

    // CONSTRUCTORES
    public Dog(String name){
        // Subimos el nombre a Mammal (y este a Animal)
        super(name);
    }

    // MÉTODOS DE SONIDO (Sobrecarga)

    // Saludo estándar
    public void greets(){
        System.out.println("Woof");
    }

    // Saludo especial cuando se encuentra con otro perro
    public void greets(Dog another){
        System.out.println("Wooooooof");
    }

    // TOSTRING
    @Override
    public String toString(){
        // Seguimos la estructura de capas: Dog[Mammal[Animal[name=...]]]
        return "Dog[" + super.toString() + "]";
    }
}