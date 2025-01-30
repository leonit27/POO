package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Exemplar {
    private int nReg;
    private Llibre llibre;
    private Set<Lector> lectors;
    private Lector lector;

    //Constructor
    public Exemplar(int nReg, Llibre llibre, Lector lector) {
        this.nReg = nReg;
        this.llibre = llibre;
        this.lectors = new HashSet<>();
        this.lector = lector;
    }

    //Getters
    public int getnReg() {
        return nReg;
    }

    public String getLlibre() {
        return llibre.getIsbn();
    }

    public Set<Lector> getLectors() {
        return lectors;
    }

    public String getLector() {
        return lector.getDNI();
    }

    //Setters
    public void setnReg(int nReg) {
        this.nReg = nReg;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    //Setter para añadir lectors
    public void addLector(Lector lector) {
        this.lectors.add(lector);
    }
}
