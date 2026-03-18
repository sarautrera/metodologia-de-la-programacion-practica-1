package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase sirve para guardar la informacion basica de cada cliente
public class Customer {
    // definimos los atributos para el id, el nombre y el descuento que tiene
    public int id;
    public String name;
    public int discount;

    // constructor para dar de alta al cliente con todos sus datos de golpe
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // metodos getter para poder consultar los datos del cliente desde otras clases
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    // este setter permite cambiar el porcentaje de descuento si el cliente mejora su perfil
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // devuelve el nombre, el id y el descuento con el formato de los parentesis
    public String toString() {
        return this.name + "(" + this.id + ")(" + this.discount + "%)";
    }
}
