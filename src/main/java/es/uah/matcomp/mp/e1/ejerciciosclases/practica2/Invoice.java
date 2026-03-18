package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer() {
        this.customer = this.customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount - this.amount * ((double)this.customer.getDiscount() / (double)100.0F);
    }

    public String toString() {
        int var10000 = this.id;
        return "Invoice[id=" + var10000 + this.customer.toString() + ", amount=" + this.amount + "]";
    }
}
