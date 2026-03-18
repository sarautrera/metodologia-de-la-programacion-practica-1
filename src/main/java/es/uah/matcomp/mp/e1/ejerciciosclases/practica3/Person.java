package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase base de la que heredan Student y Staff (contiene los datos comunes)
public class Person {

    // ATRIBUTOS
    private String name;
    private String address;

    // CONSTRUCTORES
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // GETS
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    // SETS
    public void setAddress(String address){
        this.address = address;
    }

    // TOSTRING
    public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";
    }
}