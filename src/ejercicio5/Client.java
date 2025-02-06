package ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private final String DNI;
    private Set<Prestec> prestecs;
    private Set<CompteCorrent> comptesCorrents;


    //Constructor
    public Client(String DNI) {
        this.DNI = DNI;
        this.prestecs = new HashSet<>();
        this.comptesCorrents = new HashSet<>();
    }

    //Getters
    public String getDNI() {
        return DNI;
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
