package es.uah.eedd.listas.ListaEntregar;

import es.uah.eedd.listas.ListaEntregar.ListaSimpleEnlazada;
//heredamos ListaSimpleEnlazada y modidficamos sus funciones add para que sea una lista ordenada
public class LSEOrdenada<T extends Comparable<T>> extends ListaSimpleEnlazada<T> {
    @Override
    public void add_cabeza(T valor){
        ESE<T> nuevo=new ESE<>(valor);
        ESE<T> aux= cabeza;
        ESE<T> anterior=null;
        boolean continuo= true;
        if(cabeza==null){//es el primer elemento de la lista
            cabeza=nuevo;
            fin=nuevo;
        }
        else{
            if(cabeza.valor.compareTo(valor)>=0){//añadimos el elemento como cabeza al ser el menor
                nuevo.siguiente=cabeza;
                cabeza=nuevo;
            }
            else{

                if(fin.valor.compareTo(valor)<=0){//añadimos el elemento como fin al ser el mayor
                    fin.siguiente=nuevo;
                    fin=nuevo;
                }
                else {
                    while (continuo) {//buscamos el primer elemento mayor
                        anterior = aux;
                        aux = aux.siguiente;
                        if (aux.valor.compareTo(valor) >= 0) {
                            continuo = false;
                        }
                    }
                    //colocamos el elemento justo delante del mayor y hacemos los enlaces con el anterior y posterior
                    anterior.siguiente = nuevo;
                    nuevo.siguiente = aux;
                }
            }
        }
        size++;//como hemos añadido un elemento aumentamos el tamaño
    }

    @Override
    //como es una lista ordenada todos los add funcionan igual
    public void add_final(T valor){
        add_cabeza(valor);
    }
}

