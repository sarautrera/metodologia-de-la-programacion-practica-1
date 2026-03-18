package es.uah.eedd.listas.ListaEntregar;

/**
 * Clase de prueba para verificar el funcionamiento de la Lista Simple Enlazada Ordenada.
 * Se prueba la inserción, el recorrido con el iterador, la búsqueda y el borrado.
 */
public class TestMainLSE {

    public static void main(String[] args) {
        System.out.println("--- INICIO DEL TEST: LSE ORDENADA ---");

        // Creamos la lista. Al ser ordenada, usaremos Integers para ver el orden numérico.
        Cola<Integer> lista = new Cola<>();

        // 1. Probamos inserciones en desorden
        System.out.println("\n1. Insertando: 50, 10, 30, 20, 40...");
        lista.add_cabeza(50);
        lista.add_cabeza(10);
        lista.add_cabeza(30);
        lista.add_final(20); // Aunque sea add_final, la clase ordenada debe colocarlo en su sitio
        lista.add_cabeza(40);

        // 2. Verificamos el tamaño
        System.out.println("Tamaño actual: " + lista.getSize());

        // 3. Recorrido con el Iterador (Debería salir: 10, 20, 30, 40, 50)
        System.out.print("Contenido de la lista (orden esperado): ");
        MiIterador<Integer> it = lista.getIterador();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 4. Probamos la búsqueda por valor
        System.out.println("\n2. Probando búsquedas:");
        int valorBuscar = 30;
        System.out.println("¿Existe el " + valorBuscar + "?: " + (lista.existe(valorBuscar) ? "SÍ" : "NO"));
        System.out.println("Posición del " + valorBuscar + ": " + lista.buscar(valorBuscar, 0));

        // 5. Probamos el borrado por posición (Borramos el 10, que es la cabeza)
        System.out.println("\n3. Eliminando el elemento en la posición 0 (la cabeza)...");
        if (lista.del_pos(0)) {
            System.out.println("Borrado exitoso. Nueva cabeza: " + lista.get_pos(0));
        }

        // 6. Probamos el borrado por valor (Borramos el 50, que es el final)
        System.out.println("Eliminando el valor 50 (el final)...");
        if (lista.del_valor(50)) {
            System.out.println("Borrado exitoso.");
        }

        // 7. Resultado final
        System.out.print("\nLista final tras los borrados: ");
        it = lista.getIterador();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\n--- TEST FINALIZADO ---");
    }
}
