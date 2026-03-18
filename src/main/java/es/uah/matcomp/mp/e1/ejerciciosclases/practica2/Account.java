package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// clase account creada a partir del diagrama uml para gestionar el dinero de los clientes
public class Account {
    // atributos privados para cumplir con el encapsulamiento del diseño
    private int id;
    private Customer customer; // relacion de composicion: la cuenta tiene un cliente
    private double balance=0.0; // el dinero que hay en la cuenta, empieza en cero

    // primer constructor del uml: para cuando ya sabemos cuanto dinero tiene el cliente
    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    // segundo constructor: por si la cuenta se abre sin deposito inicial
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }

    // metodos de acceso (getters) para leer los datos de la cuenta de forma segura
    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    // permite actualizar el dinero que hay en la cuenta directamente
    public void setBalance( double balance){
        this.balance=balance;
    }

    // devuelve un resumen de la cuenta aprovechando el tostring del cliente
    public String toString(){
        return customer.toString() + "balance= $"+ balance;
    }

    // atajo para sacar el nombre del cliente sin pedir el objeto entero
    public String getCustomerName(){
        return customer.getName();
    }

    // para meter dinero en la cuenta. devuelve "this" para poder encadenar llamadas
    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    // para sacar dinero: primero mira si hay suficiente para no quedar debiendo
    public Account withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            // si el dinero que se pide es mas del que hay, saca este aviso
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
    }
}
