package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase que hereda de Person para los trabajadores del centro (profes, bedeles, etc.)
public class Staff extends Person {

    // ATRIBUTOS
    private String school;
    private double pay;

    // CONSTRUCTORES
    public Staff(String name, String address, String school, double pay){
        // Le pasamos el nombre y la dirección al constructor de la clase "padre" (Person)
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // GETS
    public String getSchool(){
        return this.school;
    }
    public double getPay(){
        return this.pay;
    }

    // SETS
    public void setSchool(String school){
        this.school = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    // TOSTRING
    @Override
    public String toString(){
        // Concatenamos lo que ya hace el toString de Person con los datos nuevos de Staff
        return "Staff[" + super.toString() + ", school=" + school + " ,pay=" + pay + "]";
    }
}