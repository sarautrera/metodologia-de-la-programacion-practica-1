package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase sirve para guardar los datos basicos del autor
public class Author {
    private String name;
    private String email;

    // constructor para crear al autor con su nombre y correo de primeras
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // metodos para que otras clases puedan consultar el nombre y el email
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    // por si el autor cambia de correo, lo actualizamos aqui
    public void setEmail(String email) {
        this.email = email;
    }

    // devuelve toda la info del autor en una sola linea de texto
    public String toString() {
        return "Author[name=" + this.name + ", email=" + this.email +"]";
    }
}
