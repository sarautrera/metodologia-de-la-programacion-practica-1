package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Account {
    //Atributos
    private String id;
    private String name;
    private int balance;

    //Constructores, getters y setters
    /**Constructor con argumentos*/
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**Constructor con argumentos*/
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    /**Getter para obtener el id*/
    public String getID() {
        return id;
    }
    /**Getter para obtener el nombre*/
    public String getName() {
        return name;
    }
    /**Getter para obtener Balance*/
    public int getBalance() {
        return balance;
    }
    /**Metodo para hallar credit*/
    public int credit(int amount) {
        this.balance = balance + amount;
        return balance;
    }
    /**Metodo para hallar debit*/
    public int debit(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    /**Metodo para hallar transfer*/
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;//le quitamos dinero a la cuenta para transferirlo
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id="+id+", name="+name+", balance="+balance+"]";
    }
}
