import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ejemplo1_6 {
    public static void main(String[] args){
        /**
         * EJEMPLOS DE CATCH Y ORDEN (DE LOS CASOS MAS ESPECIFICOS AL MAS GENERAL)
         */
        try{
            System.out.println("1. Abriendo archivo...");
            //El archivo puede no ser encontrado asi que hacemos el primer catch para manejarla
            Scanner lector = new Scanner(new File("datos.txt"));

            System.out.println("2. Realizando la division");
            int  resultado=10/0;// Esto lanzará ArithmeticException (el segundo catch se lo dedicaremos a esta excepcion)
        }catch (FileNotFoundException e){
            // Este atrapa solo si el archivo no existe
            System.err.println("Error, El archivo no se encontró.");
        }catch (ArithmeticException e) {
            // Este atrapa errores matemáticos
            System.err.println("Error division: " + e.getMessage());
        } catch (Exception e) {
            // Este es el "comodín" (Superclase).
            // DEBE IR AL FINAL. Si lo pones primero, los de arriba darán error de compilación.
            System.err.println("Error generico: Algo salió mal.");
        }
        finally {
            System.out.println("3. Llegamos al finally");
        }
        /**
         * Main del ejemplo 2:
         */
        System.out.println("Ejemplo sobreescritura:");
        Shape objeto = new Cuadrado();
        try {
            objeto.crearForma();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    /**
     * 2. EJEMPLOS DE SOBREESCRITURA YSOBRECARGA DE METODOS
     */
    static class Shape{
        public void crearForma() throws IOException {
            System.out.println("Creando forma...");
        }
    }
    static class Cuadrado extends Shape{
        //Cuadrado puede lanzar la misma excepcion o una subclase, pero no una mas general
        @Override
        public void crearForma() throws FileNotFoundException {
            System.out.println("creando cuadrado...");
        }
    }
}
