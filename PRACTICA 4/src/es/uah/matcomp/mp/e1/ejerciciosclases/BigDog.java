package es.uah.matcomp.mp.e1.ejerciciosclases;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woow");
    }
    public void greets(Dog another){
        System.out.println("Wooooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
