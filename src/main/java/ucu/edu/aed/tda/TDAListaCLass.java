package ucu.edu.aed.tda;

import java.util.Comparator;
import java.util.function.Predicate;

public class TDAListaCLass<T> implements TDALista<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elementos;
    private int size;

    public TDAListaCLass() {
        this.elementos = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == elementos.length) {
            T[] nuevo = (T[]) new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, nuevo, 0, size);
            elementos = nuevo;
        }
    }

    @Override
    public void agregar(T elem) {
        ensureCapacity();
        elementos[size++] = elem;
    }

    @Override
    public void agregar(int index, T elem) {
        // Implementación del método agregar en una posición específica
    }

    @Override
    public T obtener(int index) {
        // Implementación del método obtener un elemento por su índice
        return null; // Placeholder, debe retornar el elemento obtenido
    }

    @Override
    public T remover(int index) {
        // Implementación del método remover un elemento por su índice
        return null; // Placeholder, debe retornar el elemento removido
    }

    @Override
    public boolean remover(T elem) {
        // Implementación del método remover la primera ocurrencia de un elemento
        return false; // Placeholder, debe retornar true si se removió el elemento, false si no se encontró
    }

    @Override
    public boolean contiene(T elem) {
        // Implementación del método para determinar si la lista contiene un elemento
        return false; // Placeholder, debe retornar true si se encuentra el elemento, false en caso contrario
    }

    @Override
    public int indiceDe(T elem) {
        // Implementación del método para obtener el índice de la primera ocurrencia de un elemento
        return -1; // Placeholder, debe retornar el índice del elemento o -1 si no se encuentra
    }

    @Override
    public T buscar(Predicate<T> criterio) {
        // Implementación del método para buscar un elemento que cumpla con un criterio específico
        return null; // Placeholder, debe retornar el elemento encontrado o null si no se encuentra
    }

    @Override
    public TDALista<T> ordenar(Comparator<T> comparador) {
        // Implementación del método para ordenar la lista según un comparador específico
        return this; // Placeholder, debe retornar una nueva lista ordenada
    }

    @Override
    public int tamaño() {
        // Implementación del método para obtener el tamaño de la lista
        return 0; // Placeholder, debe retornar el número de elementos en la lista
    }

    @Override
    public boolean esVacio() {
        // Implementación del método para determinar si la lista está vacía
        return true; // Placeholder, debe retornar true si la lista está vacía, false en caso contrario
    }

    @Override
    public void vaciar() {
        // Implementación del método para vaciar la lista
    }
    
}
