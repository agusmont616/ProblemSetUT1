package ucu.edu.aed.tda.entregables.ej17;

public class Libro {
    private String codigo;
    private String titulo;
    private double precioReposicion;
    private int cantidadEjemplares;

    public Libro(String codigo, String titulo, double precioReposicion, int cantidadEjemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precioReposicion = precioReposicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }


    public void agregarEjemplares(int cantidad) {
        this.cantidadEjemplares = this.cantidadEjemplares + cantidad; // Suma la cantidad de ejemplares al stock actual
    }

    public int prestarEjemplares(int cantidad) {
        int cantidadPrestada;
        if (cantidad > this.cantidadEjemplares) {
            cantidadPrestada = this.cantidadEjemplares;
            this.cantidadEjemplares = 0;
        } else {
            cantidadPrestada = cantidad;
            this.cantidadEjemplares = this.cantidadEjemplares - cantidad;
        }
        return cantidadPrestada; // Devuelve la cantidad de ejemplares realmente prestada, que puede ser menor a la solicitada si no hay suficiente stock
    }

    public void devolverEjemplares(int cantidad) {
        this.cantidadEjemplares = this.cantidadEjemplares + cantidad; // Suma la cantidad de ejemplares devueltos al stock actual
    }


    public String toString() {
        return this.titulo + " | " + this.codigo + " | $" + this.precioReposicion + " | stock: " + this.cantidadEjemplares;
    } // Devuelve una representación en cadena del libro con su título, código, precio de reposición y cantidad de ejemplares disponibles
}
