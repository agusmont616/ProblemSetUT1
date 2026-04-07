package ucu.edu.aed.tda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String rutaArchivo = "parentesis.txt";
        TDAPilaClass<String> pila = new TDAPilaClass<>();
        boolean balanceado = true;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            int caracter;
            while ((caracter = br.read()) != -1) {  // Lee carácter por carácter hasta el fin del archivo
                String s = String.valueOf((char) caracter);

                if (s.equals("(")) {
                    pila.mete(s);
                } else if (s.equals(")")) {
                    if (!pila.esVacio()) {
                        pila.saca();
                    } else {
                        System.out.println("No balanceado: cerró sin haber abierto");
                        balanceado = false;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        if (balanceado) {
            if (pila.esVacio()) {
                System.out.println("Balanceado");
            } else {
                System.out.println("No balanceado: quedaron paréntesis abiertos sin cerrar");
            }
        }
    }
}