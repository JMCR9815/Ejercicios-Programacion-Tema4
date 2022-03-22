package Ejercicios_Alumno;

public class Persona_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Persona juanPersona = new Persona("Juan", "Perez", 21, "exampleMail@gmail.com");
        Presentacion(juanPersona);
    }

    public static void Presentacion(Persona juanPersona) {
        System.out.println("Hola, mi nombre es " + juanPersona.getNombre() + ", mi apellido es "
                + juanPersona.getApellidos() + ", mi edad es " + juanPersona.getEdad() + " y mi correo electronico es: "
                + juanPersona.getCorreoElectronico());
    }

}
