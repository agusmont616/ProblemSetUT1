package ucu.edu.aed.tda.entregables.ej17;

import ucu.edu.aed.tda.Lista;
import ucu.edu.aed.tda.TDALista;

public class Biblioteca {
    private TDALista<Libro> libros;

    public Biblioteca() {
        this.libros = new Lista<>();
    }

    public Libro buscarLibroPorCodigo(String codigo) {
        for (int i = 0; i < libros.tamanio(); i++) {
            Libro libroActual = libros.obtener(i);
            if (libroActual.getCodigo().equals(codigo)) {
                return libroActual;
            }
        }
        return null;
    }

    public void incorporarLibro(String codigo, String titulo, double precioReposicion, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);

        if (libroBuscado == null) {
            Libro nuevoLibro = new Libro(codigo, titulo, precioReposicion, cantidad);
            insertarOrdenadoPorTitulo(nuevoLibro);
        } else {
            libroBuscado.agregarEjemplares(cantidad);
        }
    }

    private void insertarOrdenadoPorTitulo(Libro nuevoLibro) {
        if (libros.esVacio()) {
            libros.agregar(nuevoLibro);
            return;
        }

        int posicion = 0;
        while (posicion < libros.tamanio() &&
                libros.obtener(posicion).getTitulo().compareToIgnoreCase(nuevoLibro.getTitulo()) < 0) {
            posicion++;
        }

        libros.agregar(posicion, nuevoLibro);
    }

    public int registrarPrestamo(String codigo, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado == null) {
            return 0;
        }
        return libroBuscado.prestarEjemplares(cantidad);
    }

    public void registrarDevolucion(String codigo, int cantidad) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado != null) {
            libroBuscado.devolverEjemplares(cantidad);
        }
    }

    public boolean retirarLibro(String codigo) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado != null) {
            return libros.remover(libroBuscado);
        }
        return false;
    }

    public int consultarExistencias(String codigo) {
        Libro libroBuscado = buscarLibroPorCodigo(codigo);
        if (libroBuscado == null) {
            return -1;
        }
        return libroBuscado.getCantidadEjemplares();
    }

    public TDALista<Libro> getLibros() {
        return libros;
    }

    public void listarLibros() {
        for (int i = 0; i < libros.tamanio(); i++) {
            System.out.println(libros.obtener(i));
        }
    }
}
