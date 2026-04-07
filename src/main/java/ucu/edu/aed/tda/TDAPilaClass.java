package ucu.edu.aed.tda;

public class TDAPilaClass<T>{

    private TDALista<T> lista = new TDAListaCLass<>();

    public TDAPilaClass() {
        this.lista = lista; // Llama al constructor de la clase padre para inicializar la estructura de datos interna
    }

    public T tope() {
        if (this.lista.esVacio()) {
            throw new java.util.NoSuchElementException("La pila está vacía");
        }
        return this.lista.obtener(this.lista.tamanio() - 1); // Devuelve el elemento en la cima de la pila sin eliminarlo
    }


    public T saca() {
        if (this.lista.esVacio()) {
            throw new java.util.NoSuchElementException("La pila está vacía");
        }

        return this.lista.remover(this.lista.tamanio() - 1);
    }

    public void mete(T dato) {
        this.lista.agregar(dato);
    }

    public boolean esVacio() {
        return this.lista.esVacio();
    }

    public void mostrarElementos() {
        for (int i = 0; i < this.lista.tamanio(); i++) {
            System.out.println(this.lista.obtener(i));
        }
    }
}
