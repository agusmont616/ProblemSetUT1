package ucu.edu.aed.tda.entregables.ej23;

import ucu.edu.aed.tda.Lista;

public class Ciudades {
    public static void main(String[] args) {
        Lista<String> sucursales1 = new Lista<>();
        Lista<String> sucursales2=new Lista<>();
        Lista<String> sucursales3=new Lista<>();
        
        cargarSucursalesDesdeArchivo("sucursales1.txt", sucursales1);

        buscarSucursal(sucursales1, "Tokio");

        imprimirSucursales(sucursales1);

        System.out.println("Total de sucursales: " + sucursales1.tamanio());

        quitarSucursal(sucursales1, "Chicago");

        imprimirSucursales(sucursales1);

        cargarSucursalesDesdeArchivo("sucursales2.txt", sucursales2);

        estaVacio(sucursales2);

        quitarSucursal(sucursales2, "Tokio");

        quitarSucursal(sucursales2, "Shenzen");

        System.out.println("Total de sucursales "+ sucursales2.tamanio());

        cargarSucursalesDesdeArchivo("sucursales3.txt", sucursales3);
        
        imprimirSucursales(sucursales3);

    }

    public static void cargarSucursalesDesdeArchivo(String archivo, Lista<String> lista) {
        try {
            java.util.Scanner scanear = new java.util.Scanner(new java.io.File(archivo));
            while (scanear.hasNextLine()) {
                lista.agregar(scanear.nextLine());
            }
            scanear.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }

    public static void agregarSucursal(Lista<String> lista, String ciudad) {
        lista.agregar(ciudad);
        System.out.println("Sucursal agregada: " + ciudad);
    }

    public static void quitarSucursal(Lista<String> lista, String ciudad) {
        if (lista.remover(ciudad)) {
            System.out.println("Sucursal eliminada: " + ciudad);
        } else {
            System.out.println("No se encontró la sucursal: " + ciudad);
        }
    }

    public static void buscarSucursal(Lista<String> lista, String ciudad) {
        if (lista.contiene(ciudad)) {
            int indice = lista.indiceDe(ciudad)+1;
            System.out.println("Sucursal encontrada en índice " + indice + ": " + ciudad);
        } else {
            System.out.println("Sucursal no encontrada: " + ciudad);
        }
    }

    public static void   estaVacio(Lista<String> lista){
        if (lista.esVacio()) {
            System.out.println("Esta vacio");
        }else{
            System.out.println("No esta vacio");;
        }
        
    }

    public static void imprimirSucursales(Lista<String> lista) {
        for (int i = 0; i < lista.tamanio(); i++) {
            System.out.print(lista.obtener(i));
            if (i < lista.tamanio() - 1) {
                System.out.print("; "); 
            }
        }
        System.out.println(); 
    }   
}