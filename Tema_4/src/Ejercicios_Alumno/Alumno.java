package Ejercicios_Alumno;

import java.time.LocalDate;

public class Alumno {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private int numExpediente;
    private String cursoMatriculado;

    /**
     * @param nombre
     * @param apellidos
     * @param fechaNac
     * @param numExpediente
     * @param cursoMatriculado
     */
    public Alumno(String nombre, String apellidos, LocalDate fechaNac, int numExpediente, String cursoMatriculado) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.numExpediente = numExpediente;
        this.cursoMatriculado = cursoMatriculado;
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

}
