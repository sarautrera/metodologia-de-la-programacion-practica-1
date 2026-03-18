package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;
// BigDog extiende de Dog, heredando sus capacidades y añadiendo más potencia al saludo
public class BigDog extends Dog {

    // CONSTRUCTOR
    public BigDog(String name) {
        // Pasa el nombre al constructor de Dog (y este a Animal)
        super(name);
    }

    // SOBRESCRITURA (Override) del saludo básico
    @Override
    public void greets() {
        System.out.println("Woow");
    }

    // SOBRECARGA (Overload) para interactuar con otros perros

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    // Sobrecarga específica para cuando se encuentra con otro perro de su tamaño
    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}