package Ejercicio_Alumno_3;

import java.time.LocalDate;
import java.util.Random;

public class GestionAlumnos {
    private final Alumno[] alumnos = new Alumno[25];

    public void rellenarArrayAlumnos() {
        Random rnd = new Random();
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(1000 + i, "Alumno" + i, "Ramos" + i,
                    LocalDate.of(2000, rnd.nextInt(12) + 1, rnd.nextInt(27) + 1), rnd.nextInt(10) + 1, "DAM1",
                    rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
        }
    }

    public void motrar() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].toString());
        }
    }

    public void mostrarNotas() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].getMedia());
        }
    }

    public Alumno buscarAlumnoPorNumExp(int numEXP) {
        for (int i = 0; i < alumnos.length; i++) {
            if (numEXP == alumnos[i].getNumExpediente()) {
                return alumnos[i];
            }
        }
        return null;
    }
}
