package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String DNI;
    private Set<Exemplar> exemplarsHistoric;
    private Set<Exemplar> exemplarsPrestec;

    //Constructor
    public Lector(String DNI) {
        this.DNI = DNI;
        this.exemplarsHistoric = new HashSet<>();
        this.exemplarsPrestec = new HashSet<>();
    }

    //Getters
    public String getDNI() {
        return DNI;
    }

    public Set<Exemplar> getExemplarsHistoric() {
        return exemplarsHistoric;
    }

    public Set<Exemplar> getExemplarsPrestec() {
        return exemplarsPrestec;
    }

    //Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //Setter para añadir exemplars historic
    public void addExemplarHistoric(Exemplar exemplar) {
        this.exemplarsHistoric.add(exemplar);
    }

    //Setter para añadir exemplars prestec
    public void addExemplarPrestec(Exemplar exemplar) {
        this.exemplarsPrestec.add(exemplar);
    }
}
