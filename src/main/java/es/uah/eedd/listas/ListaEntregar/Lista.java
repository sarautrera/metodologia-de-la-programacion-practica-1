package es.uah.eedd.listas.ListaEntregar;

import es.uah.eedd.listas.ListaEntregar.MiIterador;

// Estas son las funciones que se implementaran en la lista
public interface Lista<T extends Comparable<T>> {
    void add_cabeza(T valor);//agrega un nuevo elemento al principio de la lista
    void add_final(T valor);//agrega un nuevo elemento al final de la lista
    T get_pos(int pos);//devuelve el valor de un elemento de la lista por su posicion
    boolean existe(T valor);//devuelve true si existe el valor en la lista
    int buscar(T valor,int pos);//busca un elemento dentro de la lista desde el elemnto dado
    // por la posicion y devuelve su posicion o  -1 si no se encuentra
    boolean del_valor(T valor);//elimina un elemento
    boolean del_pos(int pos);//elimina un elemento por posicion
    boolean isEmpty();//comprueba que existen elementos en la lista
    int getSize();//devuelve el numero de elementos de la lista
    MiIterador<T> getIterador();//recorre la lista
}