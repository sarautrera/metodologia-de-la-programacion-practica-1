package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @org.junit.jupiter.api.Test
    void testConstructorSinBalance() {
        Customer c1 = new Customer(1, "Ana", 'f');
        Account a1 = new Account(100, c1);
        assertEquals(100, a1.getId());
        assertEquals(c1, a1.getCustomer());
        assertEquals(0.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testConstructorConBalance() {
        Customer c1 = new Customer(2, "Luis", 'm');
        Account a1 = new Account(200, c1, 500.0);
        assertEquals(200, a1.getId());
        assertEquals(c1, a1.getCustomer());
        assertEquals(500.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testSetYGetBalance() {
        Customer c1 = new Customer(3, "Maria", 'f');
        Account a1 = new Account(300, c1);
        a1.setBalance(999.99);
        assertEquals(999.99, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testGetCustomerName() {
        Customer c1 = new Customer(4, "Pedro", 'm');
        Account a1 = new Account(400, c1, 100.0);
        assertEquals("Pedro", a1.getCustomerName());
    }

    @org.junit.jupiter.api.Test
    void testDeposit() {
        Customer c1 = new Customer(5, "Ricardo", 'm');
        Account a1 = new Account(500, c1, 100.0);
        a1.deposit(50.0);
        assertEquals(150.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testDepositEncadenado() {
        Customer c1 = new Customer(6, "Eva", 'f');
        Account a1 = new Account(600, c1, 0.0);
        a1.deposit(100.0).deposit(50.0).deposit(25.0);
        assertEquals(175.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testWithdrawConSaldoSuficiente() {
        Customer c1 = new Customer(7, "Laura", 'f');
        Account a1 = new Account(700, c1, 200.0);
        a1.withdraw(50.0);
        assertEquals(150.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testWithdrawSinSaldoSuficiente() {
        Customer c1 = new Customer(8, "Carlos", 'm');
        Account a1 = new Account(800, c1, 20.0);
        a1.withdraw(100.0);
        assertEquals(20.0, a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Customer c1 = new Customer(9, "Lucía", 'f');
        Account a1 = new Account(900, c1, 500.5);
        String expected = "Lucía(900) balance=500.5";
        assertEquals(expected, a1.toString());
    }
}
