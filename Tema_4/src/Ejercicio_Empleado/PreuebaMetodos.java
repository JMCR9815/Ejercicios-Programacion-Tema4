package Ejercicio_Empleado;

public class PreuebaMetodos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Empleado JuanEmpleado = new Empleado(1, "Juan", "Perez", 800);
        Empleado AlbertoEmpleado = new Empleado(1, "Alberto", "Gutierrez", 900);
        Empleado PepeEmpleado = new Empleado(1, "Pepe", "Algarroba", 700);
//		System.out.println("Nombre completo: " + JuanEmpleado.NombreCompleto());
//		System.out.println("");
//		System.out.println("Salrio anual: " + JuanEmpleado.SalarioAnual());
//		System.out.println("");
//		System.out.println("Salario incrementado: " + JuanEmpleado.IncrementaSalario(15));
//		System.out.println("");
//		System.out.println(JuanEmpleado.toString());

        // SEGUNDA PARTE EJERCICIO EMPLEADO//
        System.out.println(AlbertoEmpleado);
        System.out.println(PepeEmpleado);
        System.out.println();
        System.out.println("Nombre completo: " + AlbertoEmpleado.NombreCompleto());
        System.out.println("Nombre completo: " + PepeEmpleado.NombreCompleto());
        System.out.println("Nombre del primero: " + JuanEmpleado.getNombre());
        System.out.println();
        System.out.println("Salario Juan: " + JuanEmpleado.MostrarIncrementaSalario(15) + ", Salario total Juan: "
                + JuanEmpleado.SetIncrementaSalario(15));
        System.out.println();
        System.out.println("Salario Alberto: " + AlbertoEmpleado.MostrarIncrementaSalario(15)
                + ", Salario total Alberto: " + AlbertoEmpleado.SetIncrementaSalario(15));
        System.out.println();
        System.out.println("Salario Pepe: " + PepeEmpleado.MostrarIncrementaSalario(15) + ", Salario total PEpe: "
                + PepeEmpleado.SetIncrementaSalario(15));
        System.out.println();
        System.out.println("Salario Pepe: " + PepeEmpleado.getSalario());

    }

}
