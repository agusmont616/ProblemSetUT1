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
        this.cantidadEjemplares = this.cantidadEjemplares + cantidad;
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
        return cantidadPrestada;
    }

    public void devolverEjemplares(int cantidad) {
        this.cantidadEjemplares = this.cantidadEjemplares + cantidad;
    }

    @Override
    public String toString() {
        return this.titulo + " | " + this.codigo + " | $" + this.precioReposicion + " | stock: " + this.cantidadEjemplares;
    }
}
