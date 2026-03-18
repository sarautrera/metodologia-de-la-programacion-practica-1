package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// clase para gestionar el dinero en la cuenta de un cliente
public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0; // el dinero que hay ahorrado actualmente

    // constructores para abrir la cuenta con o sin dinero inicial
    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }

    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public double getBalance() { return balance; }
    public void setBalance( double balance) { this.balance=balance; }

    public String toString() {
        return customer.toString() + "balance= $"+ balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // para meter dinero en la cuenta
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    // para sacar dinero, pero solo si hay suficiente para que no de error
    public Account withdraw(double amount) {
        if(balance>=amount){
            balance-=amount;
        }
        else{
            // mensaje por si el dinero que se pide es mayor al que hay
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
    }
}