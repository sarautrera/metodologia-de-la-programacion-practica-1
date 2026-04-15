import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//Usamos estructura try-catch para manejar el error (la estructura dada en el ejemplo 2)
public class Ejemplo1_1 {
    public static void main(String[] args){
        //inicializamos el scanner fuera para poder accederlo ne el finally
        Scanner lector = null;
        //Intentamos abrir una archivo txt
        try{
            lector = new Scanner(new File("test.txt"));

            //Para que imprima el archvo
            while(lector.hasNextLine()){
                System.out.print((lector.nextLine()));
            }
        } catch(FileNotFoundException e){
            //Manejamos la excepcion para que no de error, como en el ejemplo 1 del punto 1.1
            System.err.println("Error, el archivo no se ha podido encontrar");//usamos System.err porque como es un mensaje de error aparece rojo en la consola
        } finally{
            //en finally, nos aseguramos que pase lo que pase se acaba cerrando(o sino habia nada que cerrar que se mantenga igual)
            if (lector != null) {
                lector.close();
                System.out.println("Cerrado correctamente");
            } else {
                System.out.println("El lector era null, no hubo nada que cerrar.");
            }
            System.out.println("Fin del programa");
        }
    }
}

