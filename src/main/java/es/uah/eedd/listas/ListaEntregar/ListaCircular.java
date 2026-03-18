package es.uah.eedd.listas.ListaEntregar;
//ejecutamos las funciones de add y del de lista doble enlazada añadiendo el cierre circular de cabeza y fin
public class ListaCircular<T extends Comparable<T>> extends ListaDobleEnlazada<T>{
    @Override
    public void add_cabeza(T valor){
        super.add_cabeza(valor);
        cabeza.anterior=fin;
        fin.siguiente=cabeza;
    }
    @Override
    public void add_final(T valor){
        super.add_final(valor);
        cabeza.anterior=fin;
        fin.siguiente=cabeza;
    }
    @Override
    public boolean del_pos(int pos){
        boolean retorno;
        retorno=super.del_pos(pos);
        if (cabeza != null && fin != null) {
            cabeza.anterior=fin;
            fin.siguiente=cabeza;
        }
        else{
            cabeza=null;
            fin=null;
        }
        return retorno;
    }
    @Override
    public boolean del_valor(T valor){
        boolean retorno;
        retorno=super.del_valor(valor);
        if (cabeza != null && fin != null) {
            cabeza.anterior=fin;
            fin.siguiente=cabeza;
        }
        return retorno;
    }
    @Override
    public MiIterador<T> getIterador() {
        return new IteradorCircular<T>(cabeza);
    }
}
