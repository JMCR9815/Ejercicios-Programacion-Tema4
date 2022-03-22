package Ejercicio_Empleado;

public class Empleado {
    private int ID;
    private String nombre;
    private String apellido;
    private int salario;

    /**
     * @param iD
     * @param nombre
     * @param apellido
     * @param salario
     */
    public Empleado(int iD, String nombre, String apellido, int salario) {
        super();
        this.ID = iD;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        ID = iD;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
    }

    public String NombreCompleto() {
        return this.apellido + " " + this.nombre;
    }

    public int SalarioAnual() {
        return this.salario * 12;
    }

    public int MostrarIncrementaSalario(int porcentaje) {
        int incremento = salario * porcentaje / 100;
        return incremento;
    }

    public int SetIncrementaSalario(int porcentaje) {
        int incremento = salario * porcentaje / 100;
        return this.salario = this.salario + incremento;
    }
}
