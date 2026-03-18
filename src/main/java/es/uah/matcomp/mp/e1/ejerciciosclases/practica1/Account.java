package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para gestionar una cuenta del banco (ingresos, gastos y envíos de dinero)
public class Account {

    // ATRIBUTOS
    private String id;
    private String name;
    private int balance;

    // CONSTRUCTORES
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // GETS
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // FUNCIONES ESPECÍFICAS

    // Para meter dinero en la cuenta y que se sume al total
    public int credit(int amount) {
        this.balance = balance + amount;
        return balance;
    }

    // Para sacar dinero. Si pides más de lo que tienes, te avisa y no te deja
    public int debit(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Pasa dinero de esta cuenta a otra si hay saldo suficiente
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount; // lo quito de aquí
            another.credit(amount); // lo mando allá
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // TOSTRING
    public String toString(){
        return "Account[id="+id+", name="+name+", balance="+balance+"]";
    }
}