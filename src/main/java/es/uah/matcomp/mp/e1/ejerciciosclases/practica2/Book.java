package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase sirve para gestionar los libros y conectarlos con su autor
public class Book {
    // atributos privados para que la info este protegida segun el diseño
    private String isbn;
    private String name;
    private Author author; // aqui vemos la relacion con la clase author
    private double price; // el dinero que vale el libro
    private int qty = 0; // unidades disponibles, por defecto a cero

    // constructor por si solo tenemos los datos basicos y el dinero que cuesta
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // este otro constructor es para cuando ya sabemos tambien la cantidad en stock
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // getters para poder consultar los datos del libro desde otras clases
    public String getIsbn() { return isbn; }
    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }

    // el setter para cambiar el dinero que cuesta el libro si sube el precio
    public void setPrice(double price) { this.price = price; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    // un metodo muy util para sacar el nombre del autor sin pedir el objeto entero
    public String getAuthorName() {
        // delegamos la tarea al objeto author que ya sabe su propio nombre
        return author.getName();
    }

    @Override
    public String toString() {
        // junta toda la info del libro y aprovecha el tostring de author
        return "Book[isbn=" + isbn + ",name=" + name + "," + author + ",price=" + price + ",qty=" + qty + "]";
    }
}

