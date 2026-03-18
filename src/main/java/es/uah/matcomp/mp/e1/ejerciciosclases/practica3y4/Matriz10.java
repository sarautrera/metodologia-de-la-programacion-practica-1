package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

import es.uah.matcomp.mp.e1.ejerciciosclases.practica2.MyPoint;

public class Matriz10 {
    public static void main(String[] args) {
        // Instanciar un array de 10 puntos MyPoint
        MyPoint[] puntos = new MyPoint[10];
        // Inicializarlos como (1,1), (2,2)...(10,10)
        for (int i = 0; i < puntos.length; i++) {
            int valor = i + 1; // Para que empiece en 1 y no en 0
            puntos[i] = new MyPoint(valor, valor);
        }
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos.length; j++) {
                // Calculamos la distancia usando el método de la clase MyPoint
                double d = puntos[i].distance(puntos[j]);
                // Formateamos la salida para que las columnas queden alineadas
                // %6.2f significa: 6 espacios de ancho y 2 decimales
                System.out.printf("%6.2f ", d);
            }
            // Al terminar cada fila de la matriz, saltamos de línea
            System.out.println();
        }
    }
}
