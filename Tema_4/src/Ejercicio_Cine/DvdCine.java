package Ejercicio_Cine;

public class DvdCine {
    private String titulo;
    private String director;
    private String productora;
    private String protagonistas;
    private Generos genero;
    private String resumen;
    private int duracion;

    /**
     * @param titulo
     * @param director
     * @param productora
     * @param protagonistas
     * @param genero
     * @param resumen
     * @param duracion
     */

    /**
     * @param titulo
     * @param director
     * @param productora
     * @param protagonistas
     * @param genero
     * @param resumen
     * @param duracion
     */
    public DvdCine(String titulo, String director, String productora, String protagonistas, Generos genero,
                   String resumen, int duracion) {
        super();
        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.protagonistas = protagonistas;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the productora
     */
    public String getProductora() {
        return productora;
    }

    /**
     * @param productora the productora to set
     */
    public void setProductora(String productora) {
        this.productora = productora;
    }

    /**
     * @return the protagonistas
     */
    public String getProtagonistas() {
        return protagonistas;
    }

    /**
     * @param protagonistas the protagonistas to set
     */
    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    /**
     * @return the genero
     */
    public Generos getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    /**
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * @param resumen the resumen to set
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean esThriller() {
//		boolean bamdera = false;
//		if (getGenero() == "thriller") {
//			bamdera = true;
//		} else {
//			bamdera = false;
//		}
//		return bamdera;

        return this.genero.equals(Generos.Thriller);
    }

    public boolean mismaProductora(DvdCine peliculas) {
//		boolean bandera=false;
//		if (this.productora==peliculas.getProductora()) {
//			bandera=true;
//		}else {
//			bandera=false;
//		}
//		return bandera;
//

        return this.productora.equalsIgnoreCase(peliculas.getProductora());
    }

    public String listaPeliculas() {
        return this.titulo + " ," + this.productora;
    }

    public void peliculaConMayorDuracion(DvdCine pelis2) {

        if (this.duracion >= pelis2.getDuracion()) {

            System.out.println(
                    "Pelicula con mayor duracion : " + this.titulo + "; Duracion: " + this.duracion + " minutos.");
        }
    }

    public boolean indexarPorGenero(String generoBusc) {
        boolean bandera = String.valueOf(genero).equalsIgnoreCase(generoBusc);
        return bandera;
    }
}
