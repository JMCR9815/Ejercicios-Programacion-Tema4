package Ejercicio_bicicleta;

public class BIcicleta {
    private static int numBicicleta = 0;
    private static int idBicicleta = 0;
    private int numMarchas;
    private int diametroRueda;
    private int velocidad;
    private int id;

    /**
     * @param numMarchas
     * @param diametroRueda
     * @param velocidad
     * @param id
     */
    public BIcicleta(int numMarchas, int diametroRueda, int velocidad, int id) {
        super();
        this.numMarchas = numMarchas;
        this.diametroRueda = diametroRueda;
        this.velocidad = velocidad;
        // id = ++numBicicleta;
        id = ++idBicicleta;
    }

    /**
     * @return the numBicicleta
     */
    public static int getNumBicicleta() {
        return numBicicleta;
    }

    /**
     * @param numBicicleta the numBicicleta to set
     */
    public static void setNumBicicleta(int numBicicleta) {
        BIcicleta.numBicicleta = numBicicleta;
    }

    public static int getIDBicicletas() {
        return idBicicleta;
    }

    /**
     * @return the numMarchas
     */
    public int getNumMarchas() {
        return numMarchas;
    }

    /**
     * @param numMarchas the numMarchas to set
     */
    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    /**
     * @return the diametroRueda
     */
    public int getDiametroRueda() {
        return diametroRueda;
    }

    /**
     * @param diametroRueda the diametroRueda to set
     */
    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
