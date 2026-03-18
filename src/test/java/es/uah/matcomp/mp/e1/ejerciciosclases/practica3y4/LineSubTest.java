package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {
    public static void main (String[] args) {
            LineSub ls1 = new LineSub(0, 0, 3, 4);
            assertEquals(0, ls1.getBeginX());
            assertEquals(4, ls1.getEndY());


            Point p1 = new Point(1, 1);
            Point p2 = new Point(5, 5);
            LineSub ls2 = new LineSub(p1, p2);
            assertEquals(1, ls2.getBeginX());
            assertEquals(5, ls2.getEndX());

            LineSub ls = new LineSub(0, 0, 1, 1);
            Point pNew = new Point(10, 10);

            ls.setBegin(pNew);
            ls.setEnd(pNew);
            assertEquals(10, ls.getBeginX());
            assertEquals(10, ls.getEndX());

            ls.setBeginXY(2, 2);
            ls.setEndXY(8, 8);
            assertEquals(2, ls.getBeginY());
            assertEquals(8, ls.getEndY());

            ls.setBeginX(3);
            ls.setBeginY(4);
            ls.setEndX(9);
            ls.setEndY(10);
            assertEquals(3, ls.getBeginX());
            assertEquals(10, ls.getEndY());

            // Gradiente en radianes
            double expectedGradient = Math.atan2(4, 3);
            assertEquals(expectedGradient, ls.getGradient(), 0.001);

            assertNotNull(ls.toString());
        }
    }