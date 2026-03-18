package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

    class StudentTest {

        @org.junit.jupiter.api.Test
        void getProgram() {
            Student st = new Student("Ana", "C/Madrid 12", "Ingeniería", 2, 2150.5);
            assertEquals("Ingeniería", st.getProgram());
        }

        @org.junit.jupiter.api.Test
        void getYear() {
            Student st = new Student("Luis", "C/Toledo 9", "Matemáticas", 3, 1800.0);
            assertEquals(3, st.getYear());
        }

        @org.junit.jupiter.api.Test
        void setProgram() {
            Student st = new Student("Clara", "C/Granada 5", "Historia", 1, 2200.0);
            st.setProgram("Física");
            assertEquals("Física", st.getProgram());
        }

        @org.junit.jupiter.api.Test
        void setYear() {
            Student st = new Student("Mario", "Av. Valencia 7", "Derecho", 1, 1500.0);
            st.setYear(4);
            assertEquals(4, st.getYear());
        }

        @org.junit.jupiter.api.Test
        void getFee() {
            Student st = new Student("Rosa", "C/León 3", "Biología", 2, 1200.75);
            assertEquals(1200.75, st.getFee());
        }

        @org.junit.jupiter.api.Test
        void setFee() {
            Student st = new Student("Lucía", "C/Córdoba 10", "Química", 2, 1800.0);
            st.setFee(2000.5);
            assertEquals(2000.5, st.getFee());
        }

        @org.junit.jupiter.api.Test
        void testToString() {
            Student st = new Student("Pablo", "C/Sevilla 25", "Informática", 3, 3000.5);
            String expected = "Student[Person[name=Pablo, address=C/Sevilla 25], program=Informática, year=3, fee=3000.5]";
            assertEquals(expected, st.toString());
        }
}