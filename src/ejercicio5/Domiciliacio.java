package ejercicio5;

public class Domiciliacio {
    private int numDomiciliacio;
    private CompteCorrent compteCorrent;

    //Constructor
    public Domiciliacio(int numDomiciliacio, CompteCorrent compteCorrent) {
        this.numDomiciliacio = numDomiciliacio;
        this.compteCorrent = compteCorrent;
    }

    //Getters
    public int getNumDomiciliacio() {
        return numDomiciliacio;
    }

    public int getCompteCorrent() {
        return compteCorrent.getNumCompteCorrent();
    }
}
