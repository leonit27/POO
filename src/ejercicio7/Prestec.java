package ejercicio7;

public class Prestec {
    private String dataP;
    private Lector lector;
    private Exemplar exemplar;

    //Constructor
    public Prestec(String dataP, Lector lector, Exemplar exemplar) {
        this.dataP = dataP;
        this.lector = lector;
        this.exemplar = exemplar;
    }

    //Getters
    public String getDataP() {
        return dataP;
    }

    public String getLector() {
        return lector.getDNI();
    }

    public int getExemplar() {
        return exemplar.getnReg();
    }

    //Setters
    public void setDataP(String dataP) {
        this.dataP = dataP;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
}
