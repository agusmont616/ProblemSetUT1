package ucu.edu.aed.tda.entregables.ej26;

import java.util.Stack;

public class Expresion {

    public boolean controlCorchetes(char[] lista) {

        Stack<Character> pila = new Stack<>(); // Creamos la pila para almacenar los corchetes

        for (int i = 0; i < lista.length; i++) {// Se recorre la lista de caracteres

            if (lista[i] == '{') {
                pila.push(lista[i]); // Si el corchete es abierto, se agrega a la pila
            } 
            else if (lista[i] == '}') { //Si es cerrado, se verifica si está vacía

                if (pila.isEmpty()) {
                    return false; // Si está vacía, retorna falso
                }

                pila.pop(); // Si no, se saca el último corchete de la pila
            }
        }

        return pila.isEmpty(); // Al finalizar el recorrido, si la pila está vacía, devuelve true (balanceado), de lo contrario devuelve false.
    }
}