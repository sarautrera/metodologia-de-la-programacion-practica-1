package es.uah.eedd.listas.ListaEntregar;

//cada elemento de la lista contiene su valor y el posicionamiento de cada elemento
public class ESE<T> {
    T valor;//dato del elemento
    ESE<T> siguiente;//puntero al siguiente elemento
    ESE(T valor){
        this.valor=valor;
        this.siguiente=null;//esta posicion se rellena al generarse el siguiente elemento
    }


}
