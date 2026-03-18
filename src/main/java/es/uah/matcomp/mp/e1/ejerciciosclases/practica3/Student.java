package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase que hereda de Person para añadir datos específicos de un estudiante
public class Student extends Person {

    // ATRIBUTOS
    private String program;
    private int year;
    private double fee;

    // CONSTRUCTORES
    public Student(String name, String address, String program, int year, double fee){
        // Llamamos al constructor de Person para guardar el nombre y la dirección
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // GETS
    public String getProgram(){
        return this.program;
    }
    public int getYear(){
        return this.year;
    }
    public double getFee(){
        return this.fee;
    }

    // SETS
    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    // TOSTRING
    @Override
    public String toString(){
        // Usamos super.toString() para aprovechar el formato que ya definimos en Person
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}