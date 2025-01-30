package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private int codEd;
    private Set<Llibre> llibres;

    //Constructor
    public Editorial(int codEd) {
        this.codEd = codEd;
        this.llibres = new HashSet<>();
    }

    //Getters
    public int getCodEd() {
        return codEd;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    //Setters
    public void setCodEd(int codEd) {
        this.codEd = codEd;
    }

    //Setter para añadir llibres
    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }
}
