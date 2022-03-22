package Ejercicio_Alumno_3;

public class Ejercicio {

    public static void main(String[] args) {
        GestionAlumnos gestion = new GestionAlumnos();
        gestion.rellenarArrayAlumnos();
        System.out.println();
        gestion.mostrarNotas();
        System.out.println();
        gestion.motrar();
        System.out.println();
        Alumno alumno = gestion.buscarAlumnoPorNumExp(1016);
        System.out.println();
        if (alumno == null) {
            System.out.println("Error Alumno no encontrado");
        } else {
            System.out.println(alumno);
        }

    }
}