package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase sencilla para guardar los datos básicos de un autor
public class Author {

    // ATRIBUTOS
    private String name;
    private String email;

    // CONSTRUCTORES
    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }

    // GETS
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    // SETS
    public void setEmail(String email){
        this.email=email;
    }

    // TOSTRING
    public String toString(){
        return "Author[name="+name+", email="+email+"]";
    }
}