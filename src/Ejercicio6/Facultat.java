package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultat {
    private int codFac;
    private Set<Catedra> catedras;

    //Constructor
    public Facultat(int codFac) {
        this.codFac = codFac;
        this.catedras = new HashSet<>();
    }

    //Getters
    public int getCodFac() {
        return codFac;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    //Setters
    public void setCodFac(int codFac) {
        this.codFac = codFac;
    }

    //Setter para añadir catedras
    public void addCatedras(Catedra catedra) {
        this.catedras.add(catedra);
    }
}
