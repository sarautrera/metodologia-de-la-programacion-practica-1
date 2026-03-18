package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceItemTest {

    @org.junit.jupiter.api.Test
    void getId() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println("id is: " + inv1.getId());
        assertEquals("A101", inv1.getId());
    }

    @org.junit.jupiter.api.Test
    void getDesc() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println("desc is: " + inv1.getDesc());
        assertEquals("Pen Red", inv1.getDesc());
    }

    @org.junit.jupiter.api.Test
    void getQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println("qty is: " + inv1.getQty());
        assertEquals(888, inv1.getQty());
    }

    @org.junit.jupiter.api.Test
    void setQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        inv1.setQty(999);
        System.out.println("new qty is: " + inv1.getQty());
        assertEquals(999, inv1.getQty());
    }

    @org.junit.jupiter.api.Test
    void getUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println("unitPrice is: " + inv1.getUnitPrice());
        assertEquals(0.08, inv1.getUnitPrice());
    }

    @org.junit.jupiter.api.Test
    void setUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        inv1.setUnitPrice(0.99);
        System.out.println("new unitPrice is: " + inv1.getUnitPrice());
        assertEquals(0.99, inv1.getUnitPrice());
    }

    @org.junit.jupiter.api.Test
    void getTotal() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 2, 1.5);
        // 2 * 1.5 = 3.0
        System.out.println("The total is: " + inv1.getTotal());
        assertEquals(3.0, inv1.getTotal(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1.toString());
        String expected = "InvoiceItem[id=A101, desc=Pen Red, qty=888, unitPrice=0.08]";
        assertEquals(expected, inv1.toString());
    }
}