package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase base (Superclase) para todos los animales del sistema
public class Animal {

    // ATRIBUTO
    private String name;

    // CONSTRUCTOR
    public Animal(String name){
        this.name = name;
    }

    // TOSTRING
    public String toString(){
        // Formato base que será extendido por las subclases
        return "Animal[name=" + name + "]";
    }
}