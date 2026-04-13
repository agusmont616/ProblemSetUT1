package ucu.edu.aed.tda.entregables.ej27;

public class ColaCircular<T> {

    private Object[] datos;
    private int frente;
    private int fondo;
    private int cantidad;
    private int capacidad;

    public ColaCircular(int capacidad) {
        
        this.capacidad = capacidad;
        this.datos = new Object[capacidad];
        this.frente = 0;
        this.fondo = -1;
        this.cantidad = 0;
    }

    public boolean esVacia() {

        return cantidad == 0;
    }

    public boolean esLlena() {

        return cantidad == capacidad;
    }

    public int getCantidad() {

        return cantidad;
    }

    public void poneEnCola(T elemento) {

        if (esLlena()) {
            throw new IllegalStateException("La cola está llena");
        }

        fondo = (fondo + 1) % capacidad;
        datos[fondo] = elemento;
        cantidad++;
    }

    public T quitaDeCola() {

        if (esVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        T elemento = (T) datos[frente];
        datos[frente] = null;
        frente = (frente + 1) % capacidad;
        cantidad--;

        return elemento;
    }

    public T frente() {

        if (esVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        return (T) datos[frente];
    }
}