package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// clase para llevar el registro de los clientes y sus descuentos
public class Customer {
    public int id;
    public String name;
    public int discount;

    // creamos al cliente con su id, nombre y el descuento que le toque
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // metodos para leer los datos del cliente desde fuera
    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public int getDiscount() { return this.discount; }

    // para cambiar el porcentaje de descuento si el cliente sube de nivel
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // saca el nombre, el id y el descuento con un formato limpio
    public String toString() {
        return this.name + "(" + this.id + ")(" + this.discount + "%)";
    }
}