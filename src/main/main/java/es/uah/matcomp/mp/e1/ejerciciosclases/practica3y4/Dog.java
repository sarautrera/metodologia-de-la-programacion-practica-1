package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Wooooof");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
