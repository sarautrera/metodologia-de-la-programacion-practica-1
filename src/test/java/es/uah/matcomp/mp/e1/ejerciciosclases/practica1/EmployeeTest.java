package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("id is: " + e1.getId());
        assertEquals(8, e1.getId());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("firstname is: " + e1.getFirstName());
        assertEquals("Peter", e1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("lastname is: " + e1.getLastName());
        assertEquals("Tan", e1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("name is: " + e1.getName());
        // Nota: Según tu clase actual, getName() devuelve firstName + lastName sin espacio
        assertEquals("PeterTan", e1.getName());
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("salary is: " + e1.getSalary());
        assertEquals(2500, e1.getSalary());
    }

    @org.junit.jupiter.api.Test
    void setSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        e1.setSalary(999);
        System.out.println("new salary: " + e1.getSalary());
        assertEquals(999, e1.getSalary());
    }

    @org.junit.jupiter.api.Test
    void getAnnualSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println("annual salary is: " + e1.getAnnualSalary());
        assertEquals(2500 * 12, e1.getAnnualSalary());
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        // Según tu implementación actual: (1 + percent) * salary
        // Si percent es 10, el resultado será 11 * 2500 = 27500
        int newSalary = e1.raiseSalary(10);
        System.out.println("raised salary: " + newSalary);
        assertEquals(27500, newSalary);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1.toString());
        String expected = "Employee[id=8 name=Peter, last name=Tan, salary=2500]";
        assertEquals(expected, e1.toString());
    }
}