package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

public class Customer {
    public int id;
    public String name;
    public int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return this.name + "(" + this.id + ")(" + this.discount + "%)";
    }
}
