package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Staff;
import main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.Student;

public class TestPerson {
    public static void main(String[] args){
        Student Estudiante1 = new Student("Paco", "C/Siguienza","Secundaria", 7, 300.5);
        System.out.println("Name="+Estudiante1.getName()+
                ", Address="+Estudiante1.getAddress()+
                ", Program="+Estudiante1.getProgram()+
                ", Year="+Estudiante1.getYear()+
                ", Fee="+Estudiante1.getFee());
        System.out.println("Con el toString:");
        System.out.println(Estudiante1);

        Staff Staff1 = new Staff("Lucas", "C/Zaragoza","SantaAna", 3000.5);
        System.out.println("Name="+Staff1.getName()+
                ", Address="+Staff1.getAddress()+
                ", School="+Staff1.getSchool()+
                ", Fee="+Staff1.getPay());
        System.out.println("Con el toString:");
        System.out.println(Estudiante1);
    }
}
