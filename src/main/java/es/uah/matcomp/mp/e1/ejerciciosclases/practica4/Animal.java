package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
public abstract class Animal {
    // ATRIBUTO
    private String name;

    // CONSTRUCTOR
    public Animal(String name){
        this.name = name;
    }

    // MÉTODO ABSTRACTO
    // No tiene cuerpo {}. Obliga a las hijas a implementar su propia versión.
    public abstract void greets();
}