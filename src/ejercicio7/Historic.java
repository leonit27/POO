package ejercicio7;

public class Historic {
    private String dataP;
    private String dataT;
    private Lector lector;
    private Exemplar exemplar;

    //Constructor
    public Historic(String dataP, String dataT, Lector lector, Exemplar exemplar) {
        this.dataP = dataP;
        this.dataT = dataT;
        this.lector = lector;
        this.exemplar = exemplar;
    }

    //Getters
    public String getDataP() {
        return dataP;
    }

    public String getDataT() {
        return dataT;
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

    public void setDataT(String dataT) {
        this.dataT = dataT;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
}
