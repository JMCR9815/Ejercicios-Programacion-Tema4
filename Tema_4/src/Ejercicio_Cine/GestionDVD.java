package Ejercicio_Cine;

import java.util.Scanner;

public class GestionDVD {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] menuOpc = {"1. Listar peliculas: ", "2. Mostar pelicula mas larga: ",
                "3. Buscar peliculas por genero: ", "4. EXIT "};
        Menu menu = new Menu(menuOpc);
        String opc;

        DvdCine[] pelis = {
                new DvdCine("El hobbit: La desolación de Smaug", "Peter Jackson", "New Line Cinema",
                        "Ian McKellen, Martin Freeman", Generos.Thriller, "Bla...", 123),
                new DvdCine("El Padrino", "Francis Ford Copola", "Paramount Pictures", "AlPacino, Marlon Brando",
                        Generos.Drama, "Bla...", 175),
                new DvdCine("Titanic", "Francis Ford Copola", "Paramount Pictures. 20thCentury Fox", "Di Caprio",
                        Generos.Thriller, "Bla...", 132),
                new DvdCine("El Rey León", "WD", "Walt Dysney", "------", Generos.Animacion, "Bla...", 86),
                new DvdCine("Los Vengadores", "--", "Marvel Studios. Walt Dysney", "--", Generos.Thriller, "Bla...",
                        114),
                new DvdCine("Avatar", "Francis Ford Copola", "20th Century Fox", "--", Generos.cienciaFiccion, "Bla...",
                        126),
                new DvdCine("Harry Potter: Las reliquias de la muerte", "--", "Warner Bros", "--",
                        Generos.cienciaFiccion, "Bla...", 131),
                new DvdCine("El señor de los anillos: El retorno del rey", "Francis Ford Copola", "New Line Cinema",
                        "--", Generos.cienciaFiccion, "Bla...", 175),
                new DvdCine("Toy Story 3", "----", "Dysney/Pixar", "--", Generos.Animacion, "Bla...", 78),

                new DvdCine("The Dark Knight Rises", "--", "Warner Bros.", "--", Generos.cienciaFiccion, "Bla...",
                        99)};

        do {

            opc = menu.mostrarMenu();

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
                    int contadorAux = 0;
                    for (int i = 0; i < pelis.length; i++) {
                        contadorAux = i + 1;
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
        } while (!opc.equals("5"));

    }
}
