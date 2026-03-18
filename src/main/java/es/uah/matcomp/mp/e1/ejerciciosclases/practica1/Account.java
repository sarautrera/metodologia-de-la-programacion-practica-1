package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase para llevar el control de una cuenta bancaria y sus movimientos
public class Account {
    // definimos los atributos privados para que el dinero este bien protegido
    private String id;
    private String name;
    private int balance = 0; // el saldo empieza en cero por defecto

    // constructor para abrir la cuenta solo con los datos basicos
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // este otro constructor es para cuando la cuenta ya viene con algo de dinero
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters tipicos para que podamos consultar la info desde otras clases
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // metodo para ingresar dinero en la cuenta. devuelve el saldo final
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // para sacar dinero. primero mira si hay suficiente para no quedarse en negativo
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            // si intentamos sacar mas dinero del que hay, soltamos este aviso
            System.out.println("amount exceeded balance");
        }

        return this.balance;
    }

    // este metodo sirve para pasar dinero a otra cuenta distinta
    public int transferTo(Account another, int amount) {
        // comprobamos que tengamos dinero suficiente antes de hacer el envio
        if (amount <= this.balance) {
            this.balance -= amount; // lo quitamos de esta cuenta
            another.credit(amount); // y lo ingresamos en la cuenta de destino
        } else {
            System.out.println("amount exceeded balance");
        }

        // devolvemos como se queda nuestro saldo despues de la operacion
        return this.balance;
    }

    // devuelve un resumen de la cuenta con el id, el nombre y el dinero que queda
    public String toString() {
        return "Account[Id= " + this.id + ", name= " + this.name + ", balance= " + this.balance + "]";
    }
}