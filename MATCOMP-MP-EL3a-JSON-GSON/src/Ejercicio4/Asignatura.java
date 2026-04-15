package Ejercicio4;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asignatura {
    private String nombreMateria;
    private List<Estudiante> alumnos; // Usamos una lista para tener varios alumnos

    public Asignatura(String nombreMateria, Estudiante[] listaAlumnos) {
        this.nombreMateria = nombreMateria;
        this.alumnos = new ArrayList<>();
        this.alumnos = new ArrayList<>(Arrays.asList(listaAlumnos));
    }

    // Método para añadir alumnos a la lista
    public void addAlumno(Estudiante e) {
        this.alumnos.add(e);
    }


    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}