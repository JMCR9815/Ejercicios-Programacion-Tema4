package Ejercicio_Alumno_2;

import java.time.LocalDate;

public class Ejercicio {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Alumno2 alumno1 = new Alumno2("Jesus", "Macarro Valle", LocalDate.of(2001, 01, 18), 15, "1. DAM");
        Alumno2 alumno2 = new Alumno2("Juan", "Vazquez Olmo", LocalDate.of(2001, 04, 15), 16, "1. DAM");
        Alumno2 alumno3 = new Alumno2("Alberto", "Bargas Perez", LocalDate.of(2001, 06, 2), 17, "1. DAM");
        Alumno2 alumno4 = new Alumno2("Jose", "Perez ", LocalDate.of(2002, 01, 01), 18, "1. DAM");
        System.out.println("NUmero de alumnos instanciados: " + Alumno2.getNumAlumno());


    }

}
