package ucu.edu.aed.tda.entregables.ej17;

import ucu.edu.aed.tda.Lista;
import ucu.edu.aed.tda.TDALista;

public class Biblioteca {
    private TDALista<Libro> libros;

    public Biblioteca() {
        this.libros = new Lista<>();
    }

    // Método para buscar un libro por su código
    public Libro buscarLibroPorCodigo(String codigo) {
        for (int i = 0; i < libros.tamanio(); i++) {
            Libro libroActual = libros.obtener(i);  // Obtiene el libro en la posición i
            if (libroActual.getCodigo().equals(codigo)) { // Si el código del libro actual coincide con el código buscado, se devuelve el libro
                return libroActual;
            }
        }
        return null;
    }

    public void incorporarLibro(String codigo, String titulo, double precioReposicion, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);

        if (libroBuscado == null) { // Si el libro no existe, se crea un nuevo libro y se inserta en la lista ordenada por título
            Libro nuevoLibro = new Libro(codigo, titulo, precioReposicion, cantidad);
            insertarOrdenadoPorTitulo(nuevoLibro);
        } else {
            libroBuscado.agregarEjemplares(cantidad); // Si existe, se suma la cantidad al stock
        }
    }

    private void insertarOrdenadoPorTitulo(Libro nuevoLibro) {
        if (libros.esVacio()) {
            libros.agregar(nuevoLibro);
        }

        int posicion = 0; // Se recorre la lista hasta encontrar la posición correcta para insertar el nuevo libro
        while (posicion < libros.tamanio() &&
                libros.obtener(posicion).getTitulo().compareToIgnoreCase(nuevoLibro.getTitulo()) < 0) { 
            posicion++; 
            
            /*Compara los títulos de los libros ignorando mayúsculas y minúsculas, 
            y avanza la posición mientras el título del libro en la posición actual 
            ea menor que el título del nuevo libro */ 
        }

        libros.agregar(posicion, nuevoLibro);
    }

    public int registrarPrestamo(String codigo, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo); // Busca el libro por su código
        if (libroBuscado == null) {
            return 0;
        }
        return libroBuscado.prestarEjemplares(cantidad); // Si el libro existe, se intenta prestar la cantidad solicitada y se devuelve la cantidad realmente prestada
    }

    public void registrarDevolucion(String codigo, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado != null) {
            libroBuscado.devolverEjemplares(cantidad); // Si el libro existe, se registra la devolución sumando la cantidad al stock
        }
    }

    public boolean retirarLibro(String codigo) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado != null) {
            return libros.remover(libroBuscado); // Si el libro existe, se intenta removerlo de la lista y se devuelve el resultado de la operación
        }
        return false;
    }

    public int consultarExistencias(String codigo) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado == null) {
            return -1;
        }
        return libroBuscado.getCantidadEjemplares(); // Si el libro existe, se devuelve la cantidad de ejemplares disponibles, de lo contrario se devuelve -1
    }

    public TDALista<Libro> getLibros() {
        return libros; // Devuelve la lista de libros de la biblioteca
    }

    public void listarLibros() {
        for (int i = 0; i < libros.tamanio(); i++) {
            System.out.println(libros.obtener(i)); // Imprime cada libro en la lista
        }
    }
}
