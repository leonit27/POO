package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private int codTema;
    private Set<Llibre> llibres;

    //Constructor
    public Tema(int codTema) {
        this.codTema = codTema;
        this.llibres = new HashSet<>();
    }

    //Getters
    public int getCodTema() {
        return codTema;
    }

    public Set<Llibre> getLlibres() {
        return llibres;
    }

    //Setters
    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }

    //Setter para añadir llibres
    public void addLlibre(Llibre llibre) {
        this.llibres.add(llibre);
    }
}
