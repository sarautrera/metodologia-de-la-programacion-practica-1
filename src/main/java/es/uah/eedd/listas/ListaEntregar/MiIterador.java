package es.uah.eedd.listas.ListaEntregar;

// Interfaz para el iterador personalizado
public interface MiIterador<T> {
    boolean hasNext();
    T next();
}