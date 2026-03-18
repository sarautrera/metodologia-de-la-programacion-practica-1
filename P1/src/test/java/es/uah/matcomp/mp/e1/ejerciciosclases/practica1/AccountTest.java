package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;
public class AccountTest {

    @org.junit.jupiter.api.Test
    void getID() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println("ID is: " + a1.getID());
        assertEquals("A101", a1.getID());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println("Name is: " + a1.getName());
        assertEquals("Tan Ah Teck", a1.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println("Balance is: " + a1.getBalance());
        assertEquals(88, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.credit(100);
        System.out.println(a1);
        assertEquals(188, a1.getBalance());
    }



    @org.junit.jupiter.api.Test
    void debit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        // Test debit() con saldo suficiente
        a1.debit(50);
        System.out.println(a1);
        assertEquals(38, a1.getBalance());

        // Test debit() excediendo el saldo
        a1.debit(500);
        assertEquals(38, a1.getBalance()); // No debería haber cambiado
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        Account a1 = new Account("A101", "Tan Ah Teck", 100);
        Account a2 = new Account("A102", "Kumar");

        // Transferencia exitosa
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);

        assertEquals(0, a1.getBalance());
        assertEquals(100, a2.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1.toString());
        assertEquals("Account[id=A101, name=Tan Ah Teck, balance=88]", a1.toString());
    }
}