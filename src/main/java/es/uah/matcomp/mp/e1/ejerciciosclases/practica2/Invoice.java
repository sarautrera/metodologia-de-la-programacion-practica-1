package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para gestionar facturas vinculadas a un cliente y aplicar descuentos
public class Invoice {

    // ATRIBUTOS
    private int id;
    private Customer customer;
    private double amount;

    // CONSTRUCTORES
    public Invoice(int id, Customer customer, double amount){
        this.id=id;
        this.customer = customer;
        this.amount=amount;
    }

    // GETS
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getAmount(){
        return amount;
    }

    // SETS
    public void setAmount(double amount){
        this.amount=amount;
    }

    // FUNCIONES ESPECÍFICAS

    // Saca el ID del cliente directamente desde su objeto
    public int getCustomerId(){
        return customer.getId();
    }

    // Saca el nombre del cliente
    public String getCustomerName(){
        return customer.getName();
    }

    // Mira qué descuento tiene asignado el cliente
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    // Calcula el precio final restándole el porcentaje de descuento del cliente
    public double getAmountAfterDiscount(){
        this.amount=amount*(1-customer.getDiscount()/100.0);
        return amount;
    }

    // TOSTRING
    public String toString(){
        return "Invoice[id="+id+", costumer="+ customer.toString()+", amount="+amount+"]";
    }
}