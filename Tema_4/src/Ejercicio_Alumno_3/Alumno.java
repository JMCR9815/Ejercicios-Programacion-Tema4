package Ejercicio_Alumno_3;

import java.time.LocalDate;

public class Alumno {

    private static int numAlumno = 0;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private int numExpediente;
    private String cursoMatriculado;
    private int notaUno;
    private int notaDos;

    /**
     * @param nombre
     * @param apellidos
     * @param fechaNac
     * @param numExpediente
     * @param cursoMatriculado
     */
    public Alumno(int numAlumno, String nombre, String apellidos, LocalDate fechaNac, int numExpediente,
                  String cursoMatriculado, int notaUno, int notaDos) {
        super();
        Alumno.numAlumno++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.numExpediente = numAlumno;
        this.cursoMatriculado = cursoMatriculado;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fechaNac
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the numExpediente
     */
    public int getNumExpediente() {
        return numExpediente;
    }

    /**
     * @param numExpediente the numExpediente to set
     */
    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    /**
     * @return the cursoMatriculado
     */
    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    /**
     * @param cursoMatriculado the cursoMatriculado to set
     */
    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Alumno [nombre= " + nombre + ", apellidos= " + apellidos + ", fechaNac= " + fechaNac
                + ", numExpediente= " + numExpediente + ", cursoMatriculado= " + cursoMatriculado + "]";
    }

    public String getNombreyApellido() {
        return getNombre() + " " + getApellidos();

    }

    /**
     * @return the notaUno
     */
    public int getNotaUno() {
        return notaUno;
    }

    /**
     * @param notaUno the notaUno to set
     */
    public void setNotaUno(int notaUno) {
        this.notaUno = notaUno;
    }

    /**
     * @return the notaDos
     */
    public int getNotaDos() {
        return notaDos;
    }

    /**
     * @param notaDos the notaDos to set
     */
    public void setNotaDos(int notaDos) {
        this.notaDos = notaDos;
    }

    public double getMedia() {
        return (notaUno + notaDos) / 2;

    }

    public String getInfoAlumno() {
        return "Iformacion del Alumno: " + "Expediente: " + getNumExpediente() + ", Nombre: " + getNombre()
                + ", Media: " + getMedia();
    }

}
