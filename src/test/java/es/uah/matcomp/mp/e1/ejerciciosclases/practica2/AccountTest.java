package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    public static void main(String[] args) {
            Customer c1 = new Customer(1, "Juan", 5);
            Account acc = new Account(101, c1, 100.0);

            acc.deposit(50.0);
            assertEquals(150.0, acc.getBalance());

            // Retiro válido
            acc.withdraw(100.0);
            assertEquals(50.0, acc.getBalance());

            // Retiro excedido (debe imprimir error y no restar)
            acc.withdraw(500.0);
            assertEquals(50.0, acc.getBalance());

            assertEquals("Juan", acc.getCustomerName());
        }
    }

