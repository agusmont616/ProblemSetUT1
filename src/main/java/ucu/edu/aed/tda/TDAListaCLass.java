package ucu.edu.aed.tda;

import java.util.Comparator;
import java.util.function.Predicate;

public class TDAListaCLass<T> implements TDALista<T> {

    private Nodo<T> cabeza;
    private int tamanio;

    public TDAListaCLass() {
        // Constructor para inicializar la estructura de datos interna de la lista
        this.cabeza = null;
        this.tamanio = 0;
    }

    public boolean indiceValido(int index) {
        // Método para verificar si un índice es válido para la lista
        return index >= 0 && index < tamanio;
    }



    @Override
    public void agregar(T elem) {
        // Implementación del método agregar al final de la lista
        Nodo<T> nuevoNodo = new Nodo<>(elem);
        if (this.esVacio()) {   // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
            cabeza = nuevoNodo;
        } else {    // Si la lista no está vacía, se recorre hasta el final y se agrega el nuevo nodo
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) { // Recorre la lista hasta encontrar el último nodo
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamanio++;

    }

    @Override
    public void agregar(int index, T elem) {
        // Implementación del método agregar en una posición específica
        if (indiceValido(index)) { // Verificación de índice válido
         
            Nodo<T> nuevoNodo = new Nodo<>(elem); // Creación del nuevo nodo con el elemento a agregar
        if (index == 0) {   // Si se agrega en la posición 0, el nuevo nodo se convierte en la nueva cabeza
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {    // Si se agrega en una posición diferente a 0, se recorre hasta la posición anterior y se inserta el nuevo nodo
            Nodo<T> actual = cabeza;
            for (int i = 0; i < index - 1; i++) { // Recorre la lista hasta llegar a la posición anterior al índice deseado
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente()); // El nuevo nodo apunta al siguiente nodo del actual
            actual.setSiguiente(nuevoNodo); // El nodo actual apunta al nuevo nodo
        }  
        }
        else {throw new IndexOutOfBoundsException("Índice fuera de rango");}
    }

    @Override
    public T obtener(int index) {
        // Implementación del método obtener un elemento por su índice
            if (indiceValido(index)){
                Nodo<T> actual = cabeza; // Se inicia desde la cabeza de la lista
                for (int i = 0; i < index; i++) { // Recorre la lista hasta llegar al índice deseado
                    actual = actual.getSiguiente();
                }
                return actual.getDato(); // Retorna el dato del nodo en el índice especificado
            } else {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
    }

    @Override
    public T remover(int index) {
        // Implementación del método remover un elemento por su índice
        if (indiceValido(index)){
            Nodo<T> actual = cabeza;
            if (index == 0) {
                cabeza = actual.getSiguiente();
            } else {
                for (int i = 0; i < index - 1; i++) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            }
            tamanio--;
            return actual.getDato();
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    @Override
    public boolean remover(T elem) {
        // Implementación del método remover la primera ocurrencia de un elemento
        if (elem != null) { // Verificación de elemento válido
            Nodo<T> actual = cabeza;
            Nodo<T> anterior = null;
            while (actual != null) {
                if (actual.getDato().equals(elem)) { // Si se encuentra el elemento a remover
                    if (anterior == null) { // Si el elemento a remover es la cabeza
                        cabeza = actual.getSiguiente();
                    } else { // Si el elemento a remover no es la cabeza
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    tamanio--;
                    return true; // Retorna true si se removió el elemento
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
        return false; // Retorna false si no se encontró el elemento a remover o si el elemento es null
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
    public int tamanio() {
        // Implementación del método para obtener el tamaño de la lista
        return tamanio; // Placeholder, debe retornar el número de elementos en la lista
    }

    @Override
    public boolean esVacio() {
        // Implementación del método para determinar si la lista está vacía
        if (tamanio == 0) {
            return true; // Retorna true si el tamaño es 0, indicando que la lista está vacía
        }
        return false; // Retorna false si el tamaño no es 0, indicando que la lista no está vacía
    }

    @Override
    public void vaciar() {
        // Implementación del método para vaciar la lista
    }
    
}
