package ucu.edu.aed.tda.entregables.ej17;

import ucu.edu.aed.utils.FileUtils;

public class Ejercicio17 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        double valorTotalAgregado = procesarAdquisiciones(biblioteca, "adquisiciones.txt");
        int variacionPrestamos = procesarPrestamos(biblioteca, "prestamos.txt");

        System.out.println("VALOR TOTAL AGREGADO AL STOCK: " + valorTotalAgregado);
        System.out.println("VARIACION TOTAL DE EJEMPLARES PRESTADOS: " + variacionPrestamos);
        System.out.println();
        System.out.println("CATALOGO ORDENADO POR TITULO:");
        biblioteca.listarLibros();
    }

    public static double procesarAdquisiciones(Biblioteca biblioteca, String archivo) {
        final double[] total = {0};

        FileUtils.leerLineas(archivo, linea -> {
            String[] partes = linea.split(",");
            String codigo = partes[0].trim();
            String titulo = partes[1].trim();
            double precio = Double.parseDouble(partes[2].trim());
            int cantidad = Integer.parseInt(partes[3].trim());

            biblioteca.incorporarLibro(codigo, titulo, precio, cantidad);
            total[0] = total[0] + (precio * cantidad);
        });

        return total[0];
    }

    public static int procesarPrestamos(Biblioteca biblioteca, String archivo) {
        final int[] totalPrestados = {0};

        FileUtils.leerLineas(archivo, linea -> {
            String[] partes = linea.split(",");
            String codigo = partes[0].trim();
            String tipo = partes[1].trim();
            int cantidad = Integer.parseInt(partes[2].trim());

            if (tipo.equals("PRESTAMO")) {
                int prestados = biblioteca.registrarPrestamo(codigo, cantidad);
                totalPrestados[0] = totalPrestados[0] + prestados;
            } else if (tipo.equals("DEVOLUCION")) {
                biblioteca.registrarDevolucion(codigo, cantidad);
            }
        });

        return totalPrestados[0];
    }
}
