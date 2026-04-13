package ucu.edu.aed.tda.entregables.ej27;

public class Main {
    public static void main(String[] args) {
        
        ColaCircular<Integer> cola = new ColaCircular<>(5);

        cola.poneEnCola(10);
        cola.poneEnCola(20);
        cola.poneEnCola(30);

        System.out.println("Frente: " + cola.frente());
        System.out.println("Sale: " + cola.quitaDeCola());
        System.out.println("Sale: " + cola.quitaDeCola());

        cola.poneEnCola(40);
        cola.poneEnCola(50);
        cola.poneEnCola(60);

        System.out.println("Cantidad: " + cola.getCantidad());

        while (!cola.esVacia()) {
            System.out.println("Sale: " + cola.quitaDeCola());
        }
    }
}