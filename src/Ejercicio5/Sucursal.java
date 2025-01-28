package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int numSucursal;
    private Banc banc;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> comptesCorrents;

    //Constructor
    public Sucursal(int numSucursal, Banc banc) {
        this.numSucursal = numSucursal;
        this.banc = banc;
        this.prestecs = new HashSet<>();
        this.comptesCorrents = new HashSet<>();
    }

    //Getters
    public int getNumSucursal() {
        return numSucursal;
    }

    public int getBanc() {
        return banc.getNumEntidad();
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public Set<CompteCorrent> getComptesCorrents() {
        return comptesCorrents;
    }

    //Setter para añadir prestecs
    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    //Setter para añadir comptes corrents
    public void addComptesCorrents(CompteCorrent compteCorrent) {
        this.comptesCorrents.add(compteCorrent);
    }
}
