package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para manejar la cuenta de un cliente específico y su saldo
public class Account {

    // ATRIBUTOS
    private int id;
    private Customer customer;
    private double balance;

    // CONSTRUCTORES
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // GETS
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }

    // SETS
    public void setBalance(double balance){
        this.balance=balance;
    }

    // FUNCIONES ESPECÍFICAS

    // Saca el nombre del cliente directamente desde el objeto Customer
    public String getCustomerName(){
        return customer.getName();
    }

    // Para meter dinero en la cuenta y devolver el objeto actualizado
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }

    // Para sacar dinero. Si intentas sacar más de lo que hay, te suelta el aviso
    public Account withdraw(double amount){
        if (balance >= amount){
            this.balance-=amount;
        }
        else{
            System.out.println("Amount withdraw exceeds the current balance!");
        }
        return this;
    }

    // TOSTRING
    public String toString(){
        return customer.getName()+"("+id+") "+"balance="+balance;
    }

}