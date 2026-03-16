package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Employee {
    private double Id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
        this.Id = this.Id;
        this.firstName = this.firstName;
        this.lastName = "Tan";
        this.salary = (double)2500.0F;
    }

    public Employee(double Id, String firstName, String lastName, double salary) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getId() {
        return this.Id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return this.salary * (double)12.0F;
    }

    public double raiseSalary(double percent) {
        this.salary += percent * this.salary / (double)100.0F;
        return this.salary;
    }

    public String toString() {
        return "Employee[Id= " + this.Id + ", name= " + this.firstName + " " + this.lastName + ", salary= " + this.salary + "]";
    }
}

