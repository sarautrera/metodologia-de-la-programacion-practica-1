package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// clase author: define los datos basicos del autor siguiendo el esquema uml
public class Author {
    // atributos privados para cumplir con el encapsulamiento del diagrama
    private String name;
    private String email;

    // constructor para crear al autor con su nombre y correo de primeras
    public Author(String name, String email) {
        this.name = name; // usamos this para asignar el valor al atributo de la clase
        this.email = email;
    }

    // metodo getter para recuperar el nombre del autor desde otras clases
    public String getName() {
        return this.name;
    }

    // metodo getter para consultar la direccion de correo electronico
    public String getEmail() {
        return this.email;
    }

    // metodo setter por si el autor cambia su correo y hay que actualizarlo
    public void setEmail(String email) {
        this.email = email;
    }

    // devuelve la informacion del autor con el formato de texto que pide el ejercicio
    public String toString() {
        return "Author[name=" + this.name + ", email=" + this.email +"]";
    }
}
