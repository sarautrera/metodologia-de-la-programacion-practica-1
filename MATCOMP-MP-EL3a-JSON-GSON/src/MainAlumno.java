import java.io.*;
import java.nio.file.*;

public class MainAlumno {
    public static void main(String[] args) {
        // 1. Validar argumentos(en caso de que el usuario se le olvide algun argumento)
        if (args.length < 2) {
            System.out.println("Uso: java -jar Nombre.jar <operacion> <fichero>");
            return;
        }

        //Vamos a ver que hay dentro de String [] args:
        //hacer: java -jar out/artifacts/MATCOMP_MP_EL3a_JSON_GSON_jar/MATCOMP-MP-EL3a-JSON-GSON.jar Hola Mundo Cruel
        //Sale: Argumento0:Hola
        //Argumento1:Mundo
        //Argumento2:Cruel
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<args.length;i++)
            sb.append("Argumento"+i+":"+args[i]+"\n");
        System.out.println("Argumentos: \n"+sb);
        //El programa lee lo que escribes en la consola(no pide datos por teclado)
        //args[0] guarda si quieres 'init' o 'show'
        //args[1] guarda la ruta del archivo
        String operacion = args[0].toLowerCase();//Ajustamos todo a lower case para que no haya problemas sobre como lo escriba el usuario
        String ruta = args[1];

        if (operacion.equals("init")) {
            generarFichero(ruta);
        } else if (operacion.equals("show")) {
            leerFichero(ruta);
        } else {
            System.out.println("Operación no válida. Use 'init' o 'show'.");
        }
    }

    private static void generarFichero(String ruta) {
        // Creamos datos por defecto
        Alumno a1 = new Alumno("Ana Garcia", 1, "Informatica");
        Alumno a2 = new Alumno("Luis Perez", 2, "Matematicas");

        // Construimos un array JSON manual (serializacion manual)
        String contenido = "[\n  " + a1.toJson() + ",\n  " + a2.toJson() + "\n]";

        try {
            // Convertimos la ruta String a un objeto Path
            Path path = Paths.get(ruta);
            // Files.createDirectories sirve para crear carpetas en caso de la que ha puesto el usuario no exista
            if (path.getParent() != null) Files.createDirectories(path.getParent());

            // El metodo Files.write se encarga de abrir el archivo, escibir y cerrarlo automaticamente
            // A esto se le conoce como la persistencia(los datos sobreviven aunque apagues el ordenador)
            Files.write(path, contenido.getBytes());
            System.out.println("Fichero creado exitosamente en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    private static void leerFichero(String ruta) {
        try {
            // Leemos todo el texto del archivo
            // File.readAllBytes() lee el archivo y lo devuelve para que podamos ocnvertirlo en String
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));

            System.out.println("--- Mostrando contenido de " + ruta + " ---");
            System.out.println(contenido);

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}