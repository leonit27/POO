package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private int codAut;
    private Set<Llibre> llibres;

    //Constructor
    public Autor(int codAut) {
        this.codAut = codAut;
        this.llibres = new HashSet<>();
    }

    //Getters
    public int getCodAut() {
        return codAut;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    //Setters
    public void setCodAut(int codAut) {
        this.codAut = codAut;
    }

    //Setter para añadir llibres
    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }
}
