package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// aqui gestionamos los libros y los conectamos con su autor
public class Book {
    private String isbn;
    private String name;
    private Author author; // usamos un objeto de la clase author
    private double price;
    private int qty = 0;

    // constructor principal con los datos obligatorios del libro
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // este otro es por si tambien sabemos cuantas unidades hay en stock
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // getters y setters para manejar toda la info del libro
    public String getIsbn() { return isbn; }
    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    // un atajo para sacar el nombre del autor sin pedirle el objeto entero
    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        // devuelve los detalles del libro y aprovecha el tostring del autor
        return "Book[isbn=" + isbn + ",name=" + name + "," + author + ",price=" + price + ",qty=" + qty + "]";
    }
}

