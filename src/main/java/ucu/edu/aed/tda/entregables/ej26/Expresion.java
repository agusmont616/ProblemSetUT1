package ucu.edu.aed.tda.entregables.ej26;

import java.util.Stack;

public class Expresion {

    public boolean controlCorchetes(char[] lista) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] == '{') {
                pila.push(lista[i]);
            } 
            else if (lista[i] == '}') {

                if (pila.isEmpty()) {
                    return false;
                }

                pila.pop();
            }
        }

        return pila.isEmpty();
    }
}