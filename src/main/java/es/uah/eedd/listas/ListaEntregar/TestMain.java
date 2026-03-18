package es.uah.eedd.listas.ListaEntregar;

public class TestMain {

    public static void main(String[] args) {
        // --- 1. pruebas de cola (playlist fifo) ---
        // el primero que entra es el primero que suena
        Cola<String> playlist = new Cola<>();

        playlist.add_cabeza("Queen - Bohemian Rhapsody");
        playlist.add_cabeza("Queen - Don't Stop Me Now");
        playlist.add_cabeza("Queen - Under Pressure");

        System.out.println("nº de canciones: " + playlist.getSize());
        System.out.print("playlist actual: ");
        imprimirLista(playlist.getIterador());

        System.out.println("reproduciendo (borro el elemento en pos 0)...");
        playlist.del_pos(0);
        imprimirLista(playlist.getIterador());


        // --- 2. pruebas lde ordenada (artistas) ---
        LDEOrdenada<String> artistas = new LDEOrdenada<>();

        // compruebo que se mantenga el orden alfabetico
        artistas.add_final("Queen");
        artistas.add_cabeza("Aitana");
        artistas.add_final("Melendi");
        artistas.add_cabeza("Quevedo");

        System.out.print("lista de artistas: ");
        imprimirLista(artistas.getIterador());

        System.out.println("¿esta melendi? " + artistas.existe("Melendi"));
        artistas.del_valor("Melendi");
        System.out.print("tras borrar a melendi: ");
        imprimirLista(artistas.getIterador());


        // --- 3. pruebas lista circular (acordes) ---
        ListaCircular<String> acordes = new ListaCircular<>();

        acordes.add_cabeza("Do Mayor");
        acordes.add_cabeza("Re Menor");
        acordes.add_final("Sol Septima");
        acordes.add_final("La m");

        System.out.print("bucle de acordes: ");
        imprimirLista(acordes.getIterador());

        System.out.println("buscando sol septima: posicion " + acordes.buscar("Sol Septima", 0));


        // --- 4. pruebas lista circular ordenada (generos) ---
        ListaCircularOrdenada<String> generos = new ListaCircularOrdenada<>();

        generos.add_cabeza("Rock");
        generos.add_final("Pop");
        generos.add_cabeza("Jazz");
        generos.add_final("Techno");

        System.out.print("generos: ");
        imprimirLista(generos.getIterador());

        System.out.println("borro el elemento de la pos 2");
        generos.del_pos(2);
        imprimirLista(generos.getIterador());
        System.out.println("pruebo a borrar un elemento de una pos inexistente");
        generos.del_pos(1234567890);
        imprimirLista(generos.getIterador());


        // --- 5. casos extra y borrados ---
        System.out.println("\n--- probando casos limite ---");

        Cola<String> vacia = new Cola<>();
        System.out.println("¿puedo borrar en lista vacia?: " + vacia.del_pos(0)); // deberia dar false
        System.out.println("buscar en vacia: " + vacia.buscar("Test", 0)); // deberia dar -1

        // ver si se gestiona bien el borrado del ultimo elemento
        ListaCircular<String> listaUnica = new ListaCircular<>();
        listaUnica.add_cabeza("ElementoUnico");
        listaUnica.del_valor("ElementoUnico");
        System.out.println("¿esta vacia tras borrar el unico elemento?: " + listaUnica.isEmpty());


        // --- 6. lista simple y pila ---
        System.out.println("\n--- pruebas finales ---");

        ListaSimpleEnlazada<String> lse = new ListaSimpleEnlazada<>();
        lse.add_cabeza("Elemento A");
        lse.add_final("Elemento B");
        System.out.print("lista simple: ");
        imprimirLista(lse.getIterador());

        Pila<String> stack = new Pila<>();
        stack.add_cabeza("Pagina 1");
        stack.add_cabeza("Pagina 2");
        stack.add_cabeza("Cima de la Pila");
        System.out.print("pila: ");
        imprimirLista(stack.getIterador());

        // simulo un pop sacando el elemento de arriba
        stack.del_pos(0);
        System.out.print("pila tras hacer el pop: ");
        imprimirLista(stack.getIterador());
    }
    // metodo para imprimir usando el iterador de la practica
    public static void imprimirLista(MiIterador<String> it) {
        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(" -> ");
            }
        }
        System.out.println("]");
    }
}