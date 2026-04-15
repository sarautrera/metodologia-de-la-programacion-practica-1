public class Ejemplo1_2 {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        try {
            Notas();
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(); // Esto mostrará la pila de llamadas
        }
        System.out.println("Fin del programa");
    }
        //Metodo A
        public static void Notas () {
            sumaNotas();
        }
        //Metodo B
        public static void sumaNotas () {
            MediaNotas(0); //Provocamos el error
        }
        //Metodo C
        public static void MediaNotas ( int alumnos){
            int suma = 100;
            int resultado = suma / alumnos;
        }
    }

