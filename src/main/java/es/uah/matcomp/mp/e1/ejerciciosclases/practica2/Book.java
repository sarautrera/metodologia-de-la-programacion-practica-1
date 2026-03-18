package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;
// Clase para gestionar los datos de un libro, conectándolo con su autor
public class Book {

    // ATRIBUTOS
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    // CONSTRUCTORES
    public Book(String isbn, String name, Author author, double price){
        this.isbn=isbn;
        this.name=name;
        this.author = author;
        this.price=price;
    }
    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.author = author;
        this.price=price;
        this.qty=qty;
    }

    // GETS
    public String getIsbn(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    // SETS
    public void setPrice(double price){
        this.price=price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }

    // FUNCIONES ESPECÍFICAS

    // Saca el nombre del autor directamente desde el objeto Author que tenemos guardado
    public String getAuthorName(){
        return author.getName();
    }

    // TOSTRING
    public String toString(){
        return "Book[isbn="+isbn+", name="+name+", "+"author="+author.toString()+", price="+price+", qty="+qty+"]";
    }

}