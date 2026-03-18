package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @org.junit.jupiter.api.Test
    void greets() {
        Cat c1 = new Cat("Michi");

        System.out.println("===== TEST greets() =====");
        System.out.print("Salida esperada: Meow  -->  ");
        c1.greets(); // imprime "Meow"

        // No hay retorno, solo verificamos que no haya errores
        assertDoesNotThrow(c1::greets);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Cat c1 = new Cat("Michi");

        System.out.println("===== TEST toString() =====");
        System.out.println("Salida obtenida: " + c1);
        String expected = "Cat[Mammal[Animal[name=Michi]]]";
        System.out.println("Salida esperada: " + expected);

        assertEquals(expected, c1.toString());
    }
}
