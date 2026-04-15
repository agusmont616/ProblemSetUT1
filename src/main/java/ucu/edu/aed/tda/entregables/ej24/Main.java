package ucu.edu.aed.tda.entregables.ej24;
import ucu.edu.aed.tda.Conjunto;
import ucu.edu.aed.tda.TDAConjunto;

public class Main {
    public static void main(String[] args) {


        // ########## Ejercicio 24 ##########


        // Creo los cursos como conjuntos de TAlumno
        Conjunto<TAlumno> AED1 = new Conjunto<>(); 
        Conjunto<TAlumno> PF = new Conjunto<>();
        
        // Creo unas cuantas instancias de alumnos
        TAlumno alumno1 = new TAlumno("Juan", "Perez", "1234");
        TAlumno alumno2 = new TAlumno("Maria", "Gomez", "5678");
        TAlumno alumno3 = new TAlumno("Carlos", "Lopez", "9012");
        TAlumno alumno4 = new TAlumno("Ana", "Martinez", "3456");
        TAlumno alumno5 = new TAlumno("Luis", "Garcia", "7890");
        TAlumno alumno6 = new TAlumno("Sofia", "Rodriguez", "2345");

        // Agrego los alumnos a los cursos, repitiendo algunos para probar la intersección
        AED1.agregar(alumno1);
        AED1.agregar(alumno2);
        AED1.agregar(alumno3);
        AED1.agregar(alumno4);
        PF.agregar(alumno3);
        PF.agregar(alumno4);
        PF.agregar(alumno5);
        PF.agregar(alumno6);

        // Asigno los resultados de unión e intersección a nuevos conjuntos
        Conjunto<TAlumno> union = (Conjunto<TAlumno>) AED1.union(PF);
        Conjunto<TAlumno> interseccion = (Conjunto<TAlumno>) AED1.interseccion(PF);


        System.out.println("Alumnos en 'Cualquiera de los dos cursos o ambos':");
        System.out.println();
        // Recorro el conjunto de la unión para mostrar los alumnos
        for (int i = 0; i < union.tamanio(); i++) {
            TAlumno alumno = union.obtener(i);
            System.out.println(alumno.getInfo());
        }

        System.out.println("Alumnos en 'Ambos cursos':");
        System.out.println();
        for (int i = 0; i < interseccion.tamanio(); i++) {
            TAlumno alumno = interseccion.obtener(i);
            System.out.println(alumno.getInfo());
        }



    }
}
 