package es.uah.eedd.listas.ListaEntregar;
//hemos usado como base la lista simple enlazada pero añadiendo los puteros necesarios hacia el elemento anterior
public class ListaDobleEnlazada<T extends Comparable<T>> implements Lista<T>{
    //declaramos las variables que establecen el principio y fin de la lista y el tamaño de la lista
    protected EDE<T> cabeza;
    protected EDE<T> fin;
    protected int size=0;
    @Override
    //esta funcion integra un nuevo elemento como cabeza de lista
    public void add_cabeza(T valor){
        //generamos un nuevo elemento fuera de la lista
        EDE<T> nuevo= new EDE<>(valor);
        //si la lista todavia no tiene elementos asignamos este elemento como comienzo y fin de lista
        if(cabeza==null){
            cabeza=nuevo;
            fin=nuevo;
        }
        //si ya hay elementos en la lista asignamos este elemento como nuevo comienzo de lista
        else{
            nuevo.siguiente=cabeza;
            cabeza.anterior=nuevo;//antes de asignar el nuevo inicio de lista apuntamos el inicio anterior al inicio nuevo
            cabeza=nuevo;//asignamos nuevo inicio de lista
        }
        size++;//como hemos añadido un elemento aumentamos el tamaño de la lista
    }
    @Override
    //esta funcion añade un elemento al final de la lista
    public void add_final(T valor){
        //generamos un nuevo elemento fuera de la lista
        EDE<T> nuevo= new EDE<>(valor);
        //si la lista todavia no tiene elementos asignamos este elemento como comienzo y fin de lista
        if(cabeza==null){
            cabeza=nuevo;
            fin=nuevo;
        }
        //si ya hay elementos en la lista asignamos este elemento como nuevo fin de lista
        else{
            fin.siguiente=nuevo;
            nuevo.anterior=fin;
            fin=nuevo;
        }
        size++;//como hemos añadido un elemento aumentamos el tamaño de la lista
    }
    @Override
    public int getSize(){
        //devolvemos la variable size que contiene el numero de elementos
        return size;
    }
    @Override
    //comprobamos si la lista tiene algun elemento, si existe, se devuelve verdadero o falso
    public boolean isEmpty(){
        //la comprobacion se hace mirando si la lista tiene un inicio
        if(cabeza==null){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    //recorremos la lista para devolver el valor de una posicion
    public T get_pos(int pos){
        if(pos<0) return null;//si la posicion es negativa devolveos null
        if (pos>=size) return null;//si la posicion es mas grande que el tamaño de la lista devolvemos null
        EDE<T> aux = cabeza;
        for (int i=0;i<pos;i++){
            aux=aux.siguiente;
        }
        return aux.valor;
    }
    @Override
    //comprobamos si un valor existe dentro de la lista
    public boolean existe(T valor){
        EDE<T> aux= cabeza;
        boolean continuo= true;
        boolean respuesta=false;
        //recorremos la lista
        while(continuo){
            if (aux.valor.equals(valor)){//si se encuentra el valor salimos del while con respuesta igual a verdadero
                respuesta=true;
                continuo=false;
            }
            if(aux.siguiente==null){//si se acaba la lista salimos del while
                continuo=false;
            }
            else{
                aux=aux.siguiente;//avanzamos al siguiente elemento
            }
        }
        return respuesta;
    }
    @Override
    //buscamos un valor en la lista a partir de una posicion, si el valor no existe se devuelve -1
    public int buscar(T valor, int pos){
        if(cabeza==null){
            return -1;
        }
        EDE<T> aux= cabeza;
        boolean continuo= true;
        int contador=pos-1;
        if(pos<0||pos>size) return -1;
        if(pos>0){
            for(int i=0;i<pos;i++){//avanzamos hasta la posision inicial de busqueda
                aux=aux.siguiente;
            }
        }
        while(continuo){//realizamos la busqueda siguiendo la logica de la funcion existe pero devolviendo la posicion
            contador++;
            if (aux.valor.equals(valor)){
                return contador;
            }
            if(aux.siguiente==null){
                return -1;
            }
            else{
                aux=aux.siguiente;
            }
        }
        return -1;
    }
    @Override
    //se borra un elemento de la lista por posicion
    public boolean del_pos(int pos){
        if(cabeza==null){
            return false;
        }
        EDE<T> aux=cabeza;
        EDE<T> anterior;
        EDE<T> borrado;
        if(pos<0||pos>size) return false;
        if(pos==0){ // Si la posicion dada es 0, se borra la cabeza
            if (cabeza == fin) {
                //como solo hay un elemento vaciamos la lista por completo
                cabeza = null;
                fin = null;
            } else {
                // hay más de un elemento
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
            }
        }
        else{
            for(int i=0; i<pos-1; i++) {//avanzamos hasta la posicion a borrar
                aux=aux.siguiente;
            }
            anterior=aux;
            borrado=anterior.siguiente;
            if(borrado.siguiente==null){//hacemos los nuevos enlaces entre elementos
                anterior.siguiente=null;
                borrado.anterior=null;//no es necesario ya que el elemento no esta en la cola, pero asi queda mas limpio
            }
            else{
                anterior.siguiente=borrado.siguiente;
                aux=borrado.siguiente;
                aux.anterior=anterior;
            }
        }
        size--;//como hemos borrado el tamaño disminuye
        return true;
    }
    @Override
    //borramos el primer elemneto con el valor dado. usamos las funciones buscar y borrar por posicion
    public boolean del_valor(T dato){
        if(cabeza==null){
            return false;
        }
        int posicion=buscar(dato,0);
        if(posicion!=-1){
            boolean resultado=del_pos(posicion);
            return resultado;
        }
        else{
            return false;
        }
    }
    @Override
    //recorre la lista
    public MiIterador<T> getIterador() {
        return new IteradorLDE<T>(cabeza);
    }
}
