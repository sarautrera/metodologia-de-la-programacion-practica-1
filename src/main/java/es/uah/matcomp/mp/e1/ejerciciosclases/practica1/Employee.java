package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase para gestionar los datos de los empleados y su sueldo
public class Employee {
    // atributos privados para que la info del trabajador este protegida
    private double Id;
    private String firstName;
    private String lastName;
    private double salary; // el dinero que gana al mes

    // constructor por defecto con algunos valores ya fijados de antemano
    public Employee() {
        this.Id = this.Id;
        this.firstName = this.firstName;
        this.lastName = "tan";
        this.salary = (double)2500.0F; // sueldo base inicial
    }

    // constructor para cuando creamos al empleado con todos sus datos reales
    public Employee(double Id, String firstName, String lastName, double salary) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // metodos de acceso para consultar el id, nombre y apellidos
    public double getId() {
        return this.Id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // junta el nombre y el apellido para dar el nombre completo en un solo texto
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // saca el dinero que cobra el empleado mensualmente
    public double getSalary() {
        return this.salary;
    }

    // permite actualizar el sueldo si hay algun cambio
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // calcula el dinero total que gana el empleado en un año entero
    public double getAnnualSalary() {
        return this.salary * (double)12.0F;
    }

    // metodo para subir el sueldo aplicando un porcentaje de aumento
    public double raiseSalary(double percent) {
        // sumamos al sueldo actual la parte del dinero que corresponde al porcentaje
        this.salary += percent * this.salary / (double)100.0F;
        return this.salary;
    }

    // devuelve toda la info del empleado bien organizada en una cadena
    public String toString() {
        return "Employee[Id= " + this.Id + ", name= " + this.firstName + " " + this.lastName + ", salary= " + this.salary + "]";
    }
}

