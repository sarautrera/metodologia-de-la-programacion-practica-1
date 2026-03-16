package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    public static void main (String[] args) {
            // Test Student [cite: 639]
            Student s = new Student("Pepe", "Calle 1", "Ingeniería", 2026, 1500.0);
            assertEquals("Pepe", s.getName());
            assertEquals("Ingeniería", s.getProgram());
            s.setFee(1600.0);
            s.setYear(2027);
            s.setProgram("Master");
            assertEquals(1600.0, s.getFee());
            assertTrue(s.toString().contains("Student"));

            // Test Staff [cite: 650]
            Staff st = new Staff("Ana", "Calle 2", "UAH", 2500.0);
            assertEquals("UAH", st.getSchool());
            st.setPay(2600.0);
            st.setAddress("Calle Nueva");
            assertEquals(2600.0, st.getPay());
            assertEquals("Calle Nueva", st.getAddress());
            assertTrue(st.toString().contains("Staff"));
        }
    }

