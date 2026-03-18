package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para guardar los datos de un cliente, como su género y el descuento que tiene
public class Customer {

    // ATRIBUTOS
    private int id;
    private String name;
    private char gender;
    private int discount;

    // CONSTRUCTORES
    public Customer(int id, String name, char gender, int discount) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.discount = 0; // si no nos dan descuento, le ponemos 0 por defecto
    }

    // GETS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getDiscount() {
        return discount;
    }

    // SETS
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // TOSTRING
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}