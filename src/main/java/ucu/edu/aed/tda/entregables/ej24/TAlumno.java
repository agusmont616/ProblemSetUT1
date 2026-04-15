package ucu.edu.aed.tda.entregables.ej24;

public class TAlumno {
    private String nombre;
    private String apellido;
    private String cedula;

    public TAlumno(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (cedula.length() == 4) {
            this.cedula = cedula;
        } else {
            throw new IllegalArgumentException("La cédula debe tener 4 caracteres");
        }
    }

    // Getters y setters

    // Muestra info completa para listado
    public String getInfo() {
        return nombre + " " + apellido + ", Cédula: " + cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
