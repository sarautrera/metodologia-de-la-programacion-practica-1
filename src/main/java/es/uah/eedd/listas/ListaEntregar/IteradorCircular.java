package es.uah.eedd.listas.ListaEntregar;

public class IteradorCircular<T> implements MiIterador<T> {
    private EDE<T> actual;
    private EDE<T> primero;
    private boolean vuelta;
    public IteradorCircular(EDE<T> comienzo) {
        actual = comienzo;
        primero=comienzo;
        vuelta=false;
    }//recorre la lista

    @Override
    public boolean hasNext() {
        return actual != null &&!vuelta;
    }//comprueba si existe siguiente por el contenido de actual

    @Override
    public T next() {
        if (!hasNext()) return null;//si la lista se ha acabado devuelve nulo
        T dato = actual.valor;//asigna el valor a dato
        actual = actual.siguiente;//avanza al siguiente elemento de la lista
        if(actual==primero){
            vuelta=true;
        }
        return dato;
    }
}
