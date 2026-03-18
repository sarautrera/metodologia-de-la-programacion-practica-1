package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void greets();

    @Override
    public String toString(){
        return "Animal[name= "+name+"]";
    }
}
// no puedo hacer una llamada a greets() directamente desde animal porque esta en cat y dog, no en animal
