package ucu.edu.aed.tda.entregables.ej24;
import ucu.edu.aed.tda.Conjunto;
import ucu.edu.aed.tda.TDAConjunto;

public class Main {
    public static void main(String[] args) {
        // ########## Ejercicio 24 ##########

        Conjunto<TAlumno> AED1 = new Conjunto<>();
        Conjunto<TAlumno> PF = new Conjunto<>();
        
        TAlumno alumno1 = new TAlumno("Juan", "Perez", "1234");
        TAlumno alumno2 = new TAlumno("Maria", "Gomez", "5678");
        TAlumno alumno3 = new TAlumno("Carlos", "Lopez", "9012");
        TAlumno alumno4 = new TAlumno("Ana", "Martinez", "3456");
        TAlumno alumno5 = new TAlumno("Luis", "Garcia", "7890");
        TAlumno alumno6 = new TAlumno("Sofia", "Rodriguez", "2345");

        AED1.agregar(alumno1);
        AED1.agregar(alumno2);
        AED1.agregar(alumno3);
        AED1.agregar(alumno4);
        PF.agregar(alumno3);
        PF.agregar(alumno4);
        PF.agregar(alumno5);
        PF.agregar(alumno6);

        System.out.println("Alumnos en 'Cualquiera de los dos cursos o ambos':");
        System.out.println(AED1.union(PF));
        System.out.println();

        System.out.println("Alumnos en 'Ambos cursos':");
        System.out.println(AED1.interseccion(PF));
        System.out.println();

        



    }
}
 