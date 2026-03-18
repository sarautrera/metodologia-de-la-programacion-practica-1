package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// esta clase maneja las facturas y calcula el dinero final a pagar
public class Invoice {
    private int id;
    private Customer customer;
    private double amount; // este es el dinero total antes de descuentos

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() { return this.id; }
    public Customer getCustomer() { return this.customer; }

    public void setCustomer() {
        this.customer = this.customer;
    }

    public double getAmount() { return this.amount; }
    public void setAmount(double amount) { this.amount = amount; }

    // estos metodos sacan info del cliente directamente a traves de la factura
    public int getCustomerId() { return this.customer.getId(); }
    public String getCustomerName() { return this.customer.getName(); }
    public int getCustomerDiscount() { return this.customer.getDiscount(); }

    // aqui hacemos la cuenta para ver cuanto dinero hay que pagar con el descuento
    public double getAmountAfterDiscount() {
        // restamos al total la parte proporcional del descuento del cliente
        return this.amount - this.amount * ((double)this.customer.getDiscount() / 100.0);
    }

    public String toString() {
        // muestra el id de la factura, los datos del cliente y el dinero total
        return "Invoice[id=" + this.id + this.customer.toString() + ", amount=" + this.amount + "]";
    }
}