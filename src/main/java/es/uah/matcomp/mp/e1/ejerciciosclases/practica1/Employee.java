package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Employee {
    //Atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructores
    /**Constructor con argumentos*/
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    //Getters y setters
    /**Getter para obtener el id*/
    public int getId(){
        return id;
    }
    /**Getter para obtener el primer nombre*/
    public String getFirstName(){
        return firstName;
    }
    /**Getter para obtener el ultimo nombre*/
    public String getLastName(){
        return lastName;
    }
    /**Getter para obtener el nombre completo*/
    public String getName(){
        return firstName+lastName;
    }
    /**Getter para obtener el salario*/
    public int getSalary(){
        return salary;
    }
    /**Getter para establecer el salario*/
    public void setSalary(int salary){
        this.salary=salary;
    }
    /**Getter para establecer el salario anual*/
    public int getAnnualSalary(){
        return salary*12;
    }
    /**Metodo para hallar el salario aumentado*/
    public int raiseSalary(int percent){
        return (1+percent)*salary;
    }
    public String toString(){
        return "Employee[id="+id+" name="+firstName+", last name="+lastName+", salary="+salary+"]";
    }


}
