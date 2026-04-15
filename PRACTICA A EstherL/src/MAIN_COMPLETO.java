import java.io.*;
import java.util.Scanner;

public class MAIN_COMPLETO {

    // --- 1. EXCEPCIONES PERSONALIZADAS ---
    static class ContrasenaIncorrectaException extends Exception {
        public ContrasenaIncorrectaException(String message) { super(message); }
    }

    static class UnidadesInsuficientesException extends Exception {
        public UnidadesInsuficientesException(String mensaje) { super(mensaje); }
    }

    // --- 2. CLASES DE APOYO ---
    static class Ordenador {
        public void comprobarContrasena(String palabra) throws ContrasenaIncorrectaException {
            if (palabra.equals("unicornio")) {
                throw new ContrasenaIncorrectaException("CONTRASEÑA INCORRECTA");
            }
            System.out.println("Acceso concedido");
        }
    }

    static class Shape {
        public void crearForma() throws IOException { System.out.println("Creando forma..."); }
    }

    static class Cuadrado extends Shape {
        @Override
        public void crearForma() throws FileNotFoundException { System.out.println("Creando cuadrado..."); }
    }

    // --- 3. MÉTODOS PARA EL EJEMPLO 1.2 (PILA DE LLAMADAS) ---
    public static void Notas() { sumaNotas(); }
    public static void sumaNotas() { MediaNotas(0); }
    public static void MediaNotas(int alumnos) {
        int suma = 100;
        int resultado = suma / alumnos;
    }

    // --- 4. MÉTODO PARA EL EJEMPLO 1.5 ---
    public static void comprarUnidades(int uDisponibles, int uPedidas) throws UnidadesInsuficientesException {
        if (uPedidas > uDisponibles) {
            throw new UnidadesInsuficientesException("No hay suficientes unidades");
        }
        System.out.println("Unidades concedidas");
    }

    // MAIN CONJUNTO
    // ======================================================
    public static void main(String[] args) {

        System.out.println("=== EJEMPLO 1.1: Manejo de Archivos ===");
        Scanner lector = null;
        try {
            lector = new Scanner(new File("test.txt"));
            while(lector.hasNextLine()) System.out.println(lector.nextLine());
        } catch(FileNotFoundException e) {
            System.err.println("Error: El archivo no se ha podido encontrar");
        } finally {
            if (lector != null) lector.close();
            System.out.println("Fin del ejemplo 1.1\n");
        }

        System.out.println("=== EJEMPLO 1.2: Pila de Llamadas ===");
        try {
            Notas();
        } catch (ArithmeticException e) {
            System.err.println("Error en la pila: " + e.getMessage());
            // e.printStackTrace(); //  muestra toda la ruta del error
        }
        System.out.println("Fin del ejemplo 1.2\n");

        System.out.println("=== EJEMPLO 1.5: Declarar y Lanzar ===");
        try {
            comprarUnidades(10, 20);
        } catch (UnidadesInsuficientesException e) {
            System.err.println("OPERACIÓN DENEGADA: " + e.getMessage());
        }
        System.out.println("Fin del ejemplo 1.5\n");

        System.out.println("=== EJEMPLO 1.6: Orden de Catch y Sobrescritura ===");
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Error division: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error generico.");
        }

        Shape miForma = new Cuadrado();
        try {
            miForma.crearForma();
        } catch (IOException e) {
            System.err.println("Error IO: " + e.getMessage());
        }
        System.out.println("Fin del ejemplo 1.6\n");

        System.out.println("=== EJEMPLO 1.7: Excepciones Comunes (Runtime) ===");
        try {
            int[] caja = {1, 2, 3};
            System.out.println(caja[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Fuera de los límites del array");
        }

        try {
            Integer.parseInt("abc");
        } catch(NumberFormatException e) {
            System.err.println("Error: Formato de número incorrecto");
        }
        System.out.println("Fin del ejemplo 1.7\n");

        System.out.println("=== EJEMPLO 1.8: Excepción Personalizada (Contraseña) ===");
        Ordenador miPC = new Ordenador();
        try {
            miPC.comprobarContrasena("unicornio");
        } catch(ContrasenaIncorrectaException e) {
            System.err.println("Resultado: " + e.getMessage());
        }
        System.out.println("\n--- TODAS LAS PRÁCTICAS FINALIZADAS ---");
    }
}
