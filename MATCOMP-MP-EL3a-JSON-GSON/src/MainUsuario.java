public class MainUsuario {
    public static void main(String[] args) {
        Usuarios usuario = new Usuarios("Juan", 30, "juan@example.com");
        String rutaArchivo = "usuario.json";

        // NOTA: Para hacer un programa que solo lea el fichero y modifique la salida borrariamos esa linea
        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, usuario);

        Usuarios usuarioCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, Usuarios.class);

        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.getNombre());
        }
    }
}