package ucu.edu.aed.tda.entregables.ej26;

public class Main {

    public static void main(String[] args) {

        Expresion e = new Expresion();

        // Caso 1: correcto
        char[] caso1 = {'{', '{', '}', '}'};
        System.out.println("Caso 1: " + e.controlCorchetes(caso1));

        // Caso 2: falta cerrar
        char[] caso2 = {'{', '{', '}'};
        System.out.println("Caso 2: " + e.controlCorchetes(caso2));

        // Caso 3: cierra sin abrir
        char[] caso3 = {'}', '{'};
        System.out.println("Caso 3: " + e.controlCorchetes(caso3));

        // Caso 4: vacío
        char[] caso4 = {};
        System.out.println("Caso 4: " + e.controlCorchetes(caso4));

        // Caso 5: desorden
        char[] caso5 = {'{', '}', '}', '{'};
        System.out.println("Caso 5: " + e.controlCorchetes(caso5));

        // Caso 6: solo abre
        char[] caso6 = {'{', '{', '{'};
        System.out.println("Caso 6: " + e.controlCorchetes(caso6));

        // Caso 7: solo cierra
        char[] caso7 = {'}', '}', '}'};
        System.out.println("Caso 7: " + e.controlCorchetes(caso7));
    }
}