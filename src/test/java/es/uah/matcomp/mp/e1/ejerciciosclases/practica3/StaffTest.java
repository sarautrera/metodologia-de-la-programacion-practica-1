package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;

import static org.junit.jupiter.api.Assertions.*;

    class StaffTest {

        @org.junit.jupiter.api.Test
        void getSchool() {
            Staff s = new Staff("María", "C/Granada 4", "IES Cervantes", 2500.0);
            assertEquals("IES Cervantes", s.getSchool());
        }

        @org.junit.jupiter.api.Test
        void getPay() {
            Staff s = new Staff("Pepe", "Av. Madrid 15", "Colegio Norte", 3200.5);
            assertEquals(3200.5, s.getPay());
        }

        @org.junit.jupiter.api.Test
        void setSchool() {
            Staff s = new Staff("Laura", "C/Toledo 8", "Colegio Sur", 2800.0);
            s.setSchool("IES Goya");
            assertEquals("IES Goya", s.getSchool());
        }

        @org.junit.jupiter.api.Test
        void setPay() {
            Staff s = new Staff("Luis", "C/Almería 12", "IES Bravo", 2000.0);
            s.setPay(3500.75);
            assertEquals(3500.75, s.getPay());
        }

        @org.junit.jupiter.api.Test
        void testToString() {
            Staff s = new Staff("Paco", "C/Sevilla 22", "IES Central", 3100.0);
            String expected = "Staff[Person[name=Paco, address=C/Sevilla 22], school=IES Central ,pay=3100.0]";
            assertEquals(expected, s.toString());
        }
}
