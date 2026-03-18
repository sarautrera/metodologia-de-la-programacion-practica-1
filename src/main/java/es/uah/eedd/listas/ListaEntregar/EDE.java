package es.uah.eedd.listas.ListaEntregar;

//cada elemento de la lista contiene su valor y el posicionamiento de cada elemento
public class EDE<T> {
    T valor;//dato del elemento
    EDE<T> siguiente;//puntero al siguiente elemento
    EDE<T> anterior;//puntero al elemento anterior
    EDE(T valor){
        this.valor=valor;
        this.siguiente=null;//esta posicion se rellena al asignarse a la lista
        this.anterior=null;//esta posicion se rellena al asignarse a la lista
    }


}
