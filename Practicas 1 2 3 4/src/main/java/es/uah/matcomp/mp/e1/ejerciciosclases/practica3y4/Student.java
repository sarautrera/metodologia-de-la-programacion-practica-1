package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram(){
        return this.program;
    }
    public int getYear(){
        return this.year;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double fee){
        this.fee=fee;
    }
    @Override
    public String toString(){
        return "Student["+super.toString()+", program="+program+", year="+year+", fee="+fee+"]";
    }
}
