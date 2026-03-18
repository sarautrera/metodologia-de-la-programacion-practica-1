package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase intermedia para mamíferos que hereda de Animal
public class Mammal extends Animal {

    // CONSTRUCTORES
    public Mammal(String name){
        // Pasamos el nombre a la clase base Animal
        super(name);
    }

    // TOSTRING
    @Override
    public String toString(){
        // Envolvemos el toString de Animal dentro de la etiqueta Mammal
        return "Mammal[" + super.toString() + "]";
    }
}