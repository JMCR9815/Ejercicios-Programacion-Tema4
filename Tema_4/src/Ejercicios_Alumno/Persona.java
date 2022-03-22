package Ejercicios_Alumno;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String correoElectronico;

    /**
     * Constructor de Persona creado con los atributos:
     *
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public Persona(String nombre, String apellidos, int edad, String correoElectronico) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece el valor de apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece el valor de edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
