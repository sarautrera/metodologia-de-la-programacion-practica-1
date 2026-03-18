package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase específica para gatos que hereda de Mammal
public class Cat extends Mammal {

    // CONSTRUCTORES
    public Cat(String name) {
        // Enviamos el nombre hacia arriba: Cat -> Mammal -> Animal
        super(name);
    }

    // MÉTODOS PROPIOS
    public void greets() {
        System.out.println("Meow");
    }

    // TOSTRING
    @Override
    public String toString() {
        // Mantiene la estructura de capas: Cat[Mammal[Animal[name=...]]]
        return "Cat[" + super.toString() + "]";
    }
}