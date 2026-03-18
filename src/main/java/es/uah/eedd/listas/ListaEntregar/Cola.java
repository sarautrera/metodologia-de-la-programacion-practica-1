package es.uah.eedd.listas.ListaEntregar;

public class Cola<T extends Comparable <T>> extends ListaDobleEnlazada<T>{
    @Override
    public void add_cabeza(T valor){//ya que siempre vamos a borrar la posicion 0, siempre añadimos al final de la lista
        add_final(valor);
    }
    //al ser una cola se borra el primer elemento que ha entrado y obviamos los parametros de entrada de las funciones
    @Override
    public boolean del_pos(int pos){
        boolean retorno=super.del_pos(0);
        return retorno;
    }
    @Override
    public boolean del_valor(T valor){
        boolean retorno=super.del_pos(0);
        return retorno;
    }
}