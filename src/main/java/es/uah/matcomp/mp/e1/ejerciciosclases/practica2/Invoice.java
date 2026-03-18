package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// clase invoice para gestionar las facturas y el dinero de los clientes
public class Invoice {
    // atributos privados para el id, el cliente asociado y el dinero total
    private int id;
    private Customer customer;
    private double amount;

    // constructor para crear la factura con su identificador, el objeto cliente y el dinero
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // metodos para consultar el id de la factura y los datos del cliente
    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    // este metodo sirve para actualizar el cliente de la factura
    public void setCustomer() {
        this.customer = this.customer;
    }

    // metodos para ver y cambiar la cantidad de dinero de la factura
    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // estos metodos son atajos para sacar la info del cliente sin pedir el objeto entero
    public int getCustomerId() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    // aqui calculamos cuanto dinero hay que pagar de verdad aplicando el descuento
    public double getAmountAfterDiscount() {
        // restamos al total el porcentaje de descuento que tenga el cliente
        return this.amount - this.amount * ((double)this.customer.getDiscount() / (double)100.0F);
    }

    // devuelve el resumen de la factura con el id, los datos del cliente y el dinero total
    public String toString() {
        int var10000 = this.id;
        return "Invoice[id=" + var10000 + this.customer.toString() + ", amount=" + this.amount + "]";
    }
}