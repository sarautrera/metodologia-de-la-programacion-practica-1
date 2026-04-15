public class Alumno {
    String nombre;
    int curso;
    String carrera;

    public Alumno(String nombre, int curso, String carrera) {
        this.nombre = nombre;
        this.curso = curso;
        this.carrera = carrera;
    }

    // Método para convertir el objeto a una cadena formato JSON
    public String toJson() {
        return String.format("{\"nombre\":\"%s\", \"curso\":%d, \"carrera\":\"%s\"}",
                nombre, curso, carrera);
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Curso: " + curso + " | Carrera: " + carrera;
    }
}