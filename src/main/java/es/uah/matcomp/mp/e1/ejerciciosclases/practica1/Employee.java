package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para gestionar los datos de un empleado y su sueldo
public class Employee {

    // ATRIBUTOS
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // CONSTRUCTORES
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    // GETS
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    // Junta el nombre y el apellido en un solo String
    public String getName(){
        return firstName+lastName;
    }
    public int getSalary(){
        return salary;
    }

    // SETS
    public void setSalary(int salary){
        this.salary=salary;
    }

    // FUNCIONES ESPECÍFICAS

    // Multiplica el sueldo mensual por 12 para sacar el total del año
    public int getAnnualSalary(){
        return salary*12;
    }

    // Aplica una subida al sueldo según el porcentaje que le pases
    public int raiseSalary(int percent){
        return (1+percent)*salary;
    }

    // TOSTRING
    public String toString(){
        return "Employee[id="+id+" name="+firstName+", last name="+lastName+", salary="+salary+"]";
    }

}