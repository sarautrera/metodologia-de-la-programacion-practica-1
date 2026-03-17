package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    //Atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructores
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    //Getters y setters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return (1+percent)*salary;
    }
    public String toString(){
        return "Employee[id="+id+" name="+firstName+", last name="+lastName+", salary="+salary+"]";
    }


}
