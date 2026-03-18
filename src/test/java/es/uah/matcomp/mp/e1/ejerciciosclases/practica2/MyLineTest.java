package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
        public static void main(String[] args) {
            MyLine l1 = new MyLine(0, 0, 3, 4);
            assertEquals(0, l1.getBeginX());
            assertEquals(0, l1.getBeginY());
            assertEquals(3, l1.getEndX());
            assertEquals(4, l1.getEndY());

            MyPoint p1 = new MyPoint(1, 1);
            MyPoint p2 = new MyPoint(2, 2);
            l1.setBegin(p1);
            l1.setEnd(p2);
            assertEquals(p1, l1.getBegin());
            assertEquals(p2, l1.getEnd());

            l1.setBeginXY(5, 5);
            l1.setEndXY(10, 10);
            assertArrayEquals(new int[]{5, 5}, l1.getBeginXY());
            assertArrayEquals(new int[]{10, 10}, l1.getEndXY());

            MyLine l2 = new MyLine(p1, p2);
            assertEquals(Math.sqrt(2), l2.getLength(), 0.001);
            assertEquals(Math.atan2(1, 1), l2.getGradient(), 0.001);
            assertNotNull(l2.toString());
        }
    }


