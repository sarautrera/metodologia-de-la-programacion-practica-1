package Ejercicio4;
import com.google.gson.Gson;

public class Estudiante {
    private String name;
    private int edad;

    public Estudiante(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }


    public String toJson() {
        return new Gson().toJson(this); //  convierte TODO el objeto automáticamente
    }
}
