package es.uah.eedd.listas.ListaEntregar;

public class IteradorLSE<T> implements MiIterador<T> {
    private ESE<T> actual;

    public IteradorLSE(ESE<T> comienzo) {
        actual = comienzo;
    }//recorre la lista

    @Override
    public boolean hasNext() {
        return actual != null;
    }//comprueba si existe siguiente por el contenido de actual

    @Override
    public T next() {
        if (!hasNext()) return null;//si la lista se ha acabado devuelve nulo
        T dato = actual.valor;//asigna el valor a dato
        actual = actual.siguiente;//avanza al siguiente elemento de la lista
        return dato;
    }
}
