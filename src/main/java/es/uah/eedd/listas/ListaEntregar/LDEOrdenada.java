package es.uah.eedd.listas.ListaEntregar;

//heredamos ListaSimpleEnlazada y modidficamos sus funciones add para que sea una lista ordenada
public class LDEOrdenada<T extends Comparable<T>> extends ListaDobleEnlazada<T> {
    @Override
    public void add_cabeza(T valor){
        EDE<T> nuevo=new EDE<>(valor);
        EDE<T> aux= cabeza;
        EDE<T> anterior=null;
        boolean continuo= true;
        if(cabeza==null){//es el primer elemento de la lista
            cabeza=nuevo;
            fin=nuevo;
        }
        else{
            if(cabeza.valor.compareTo(valor)>=0){//añadimos el elemento como cabeza al ser el menor
                nuevo.siguiente=cabeza;
                cabeza.anterior=nuevo;
                cabeza=nuevo;
            }
            else{

                if(fin.valor.compareTo(valor)<=0){//añadimos el elemento como fin al ser el mayor
                    fin.siguiente=nuevo;
                    nuevo.anterior=fin;
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
                    nuevo.anterior=anterior;
                    nuevo.siguiente = aux;
                    aux.anterior=nuevo;
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

