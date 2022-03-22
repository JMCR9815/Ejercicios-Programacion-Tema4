package Ejercicio_Cine;

import java.util.Scanner;

public class Menu {
    private final String[] opciones;

    public Menu(String[] opciones) {
        this.opciones = opciones;
    }

    public String mostrarMenu() {
        Scanner entradaOpc = new Scanner(System.in);
        // mostrar opciones menu
        System.out.println();
        System.out.println("<===== Menu de opciones =====>");
        for (String string : opciones) {
            System.out.println(string);
        }
        System.out.println();
        System.out.print("Opcion: ");

        String opc = entradaOpc.nextLine();

        return opc;
    }

    public void opcionesMenu(DvdCine[] pelis) {
        String opc;
        do {

            opc = mostrarMenu();

            switch (opc) {

                case "1":
                    System.out.println();
                    System.out.println("Peliculas por titulo y productora: ");
                    System.out.println();
                    for (int i = 0; i < pelis.length; i++) {
                        System.out.println("    " + i + " " + pelis[i].listaPeliculas());
                    }
                    break;

                case "2":
                    System.out.println();
                    System.out.println("Buscando la pelicula con mayor duracion... ");
                    System.out.println();
                    for (int i = 0; i <= pelis.length; i++) {
                        int contadorAux = i + 1;
                        if (contadorAux == 10) {
                            break;
                        }

                        pelis[i].peliculaConMayorDuracion(pelis[contadorAux]);
                    }
                    break;
                case "3":
                    Scanner entradaScanner2 = new Scanner(System.in);
                    System.out.println();
                    String generoBUSC;
                    System.out.print("Introduce un genero: ");
                    generoBUSC = entradaScanner2.nextLine();
                    System.out.println("Buscando peliculas con el genero introducido... ");
                    System.out.println();
                    for (int i = 0; i < pelis.length; i++) {
                        if (pelis[i].indexarPorGenero(generoBUSC.toLowerCase())) {
                            System.out.println("Resultado: " + pelis[i].getTitulo());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Saliendo de menu...");
                    System.exit(0);

                default:
                    break;
            }
            if (opc.equals("5") || opc.equals("")) {
                System.err.println("Error, Introduce una opcion valida.");
                System.exit(0);
            }
        } while (opc != "5");
    }
}
