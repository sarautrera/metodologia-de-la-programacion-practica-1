package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getId() =====");
        System.out.println("Invoice id is: " + inv1.getId());
        assertEquals(101, inv1.getId());
    }

    @org.junit.jupiter.api.Test
    void getCustomer() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getCustomer() =====");
        System.out.println("Customer is: " + inv1.getCustomer());
        assertEquals(c1, inv1.getCustomer());
    }

    @org.junit.jupiter.api.Test
    void getAmount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getAmount() =====");
        System.out.println("Invoice amount is: " + inv1.getAmount());
        assertEquals(888.8, inv1.getAmount());
    }

    @org.junit.jupiter.api.Test
    void setAmount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        inv1.setAmount(999.9);
        System.out.println("===== TEST setAmount() =====");
        System.out.println("New amount: " + inv1.getAmount());
        assertEquals(999.9, inv1.getAmount());
    }

    @org.junit.jupiter.api.Test
    void getCustomerId() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getCustomerId() =====");
        System.out.println("Customer id: " + inv1.getCustomerId());
        assertEquals(88, inv1.getCustomerId());
    }

    @org.junit.jupiter.api.Test
    void getCustomerName() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getCustomerName() =====");
        System.out.println("Customer name: " + inv1.getCustomerName());
        assertEquals("Tan Ah Teck", inv1.getCustomerName());
    }

    @org.junit.jupiter.api.Test
    void getCustomerDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println("===== TEST getCustomerDiscount() =====");
        System.out.println("Customer discount: " + inv1.getCustomerDiscount() + "%");
        assertEquals(10, inv1.getCustomerDiscount());
    }

    @org.junit.jupiter.api.Test
    void getAmountAfterDiscount() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 1000.0);
        double amountAfterDiscount = inv1.getAmountAfterDiscount();
        System.out.println("===== TEST getAmountAfterDiscount() =====");
        System.out.println("Amount after discount (10%): " + amountAfterDiscount);
        assertEquals(900.0, amountAfterDiscount);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);
        String expected = "Invoice[id=101, costumer=Tan Ah Teck(88)(10%), amount=888.8]";
        System.out.println("===== TEST toString() =====");
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + inv1.toString());
        assertEquals(expected, inv1.toString());
    }
}
