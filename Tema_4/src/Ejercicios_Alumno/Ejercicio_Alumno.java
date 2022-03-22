package Ejercicios_Alumno;

import java.time.LocalDate;

public class Ejercicio_Alumno {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Alumno alumno1 = new Alumno("Jesus", "Macarro Valle", LocalDate.of(2001, 01, 18), 15, "1. DAM");
        Alumno alumno2 = new Alumno("Juan", "Vazquez Olmo", LocalDate.of(2001, 04, 15), 16, "1. DAM");
        Alumno alumno3 = new Alumno("Alberto", "Bargas Perez", LocalDate.of(2001, 06, 2), 17, "1. DAM");
        Alumno alumno4 = new Alumno("Jose", "Perez ", LocalDate.of(2002, 01, 01), 18, "1. DAM");

//		System.out.println("Nombre del alumno: " + alumno1.getNombre() + ", Apellido: " + alumno1.getApellidos()
//				+ ", Fecha de nacimiento: " + alumno1.getFechaNac() + ", Num.Expediente: " + alumno1.getNumExpediente()
//				+ " y curso matriculado: " + alumno1.getCursoMatriculado());

        System.out.println();
        System.out.println("Nombres de alumnos: " + alumno1.getNombre() + ", " + alumno2.getNombre() + ", "
                + alumno3.getNombre() + ", " + alumno4.getNombre());
        alumno2.setNombre("Pepe");
        alumno3.setApellidos("Bargas Perez");
        System.out.println();
        System.out.println(alumno4);
        System.out.println();
        if (alumno1.getNombre() == alumno2.getNombre()) {
            System.out.println("El alumno 1 tiene el mismo nombre que el alumno 2");
        } else {
            System.out.println("El alumno1 y alumno2 tienen distento nombre");
        }
        System.out.println();
        if (alumno3.getApellidos() == alumno4.getApellidos()) {
            System.out.println("El alumno 3 tiene el mismo apellido que el alumno 4");
        } else {
            System.out.println("El alumno3 y alumno4 tienen distento apellido");
        }

        System.out.println();
        System.out.println(alumno1.getNombreyApellido());
    }

}
