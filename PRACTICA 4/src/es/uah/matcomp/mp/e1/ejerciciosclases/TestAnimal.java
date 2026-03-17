package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestAnimal {
    public static void main(String[] args){
        Animal c1=new Cat("Firulais");
        c1.greets();

        Animal d1 =new Dog("Nugget");
        d1.greets();
        Animal d2 =new Dog("Rayo");
        ((Dog)d1).greets((Dog)d2);

        Animal b1 =new BigDog("Salchi");
        b1.greets();
        ((Dog)d1).greets((BigDog)b1);
    }
}
