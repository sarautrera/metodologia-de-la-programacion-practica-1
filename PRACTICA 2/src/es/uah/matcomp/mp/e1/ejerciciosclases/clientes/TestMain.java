package es.uah.matcomp.mp.e1.ejerciciosclases.clientes;

public class TestMain {
    public static void main(String[] args){
        Customer c1= new Customer(123, "Paco", 'm');
        System.out.println(c1);
        System.out.println("Id="+c1.getId());
        System.out.println("Nombre="+c1.getName());
        System.out.println("Genero="+c1.getGender());

        Account a1= new Account(456, c1, 13.0);
        System.out.println(a1);
        System.out.println("Id="+a1.getId());
        System.out.println("Costumer="+a1.getCustomer());
        System.out.println("Nombre costumer="+a1.getCustomerName());
        System.out.println("Balance="+a1.getBalance());

        a1.setBalance(23);
        System.out.println("Balance="+a1.getBalance());

        a1.withdraw(11);
        System.out.println("Balance="+a1.getBalance());
        a1.withdraw(30);
        System.out.println("Balance="+a1.getBalance());
        a1.deposit(10);
        System.out.println("Balance="+a1.getBalance());
    }

}
