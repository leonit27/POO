package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String diaSubasta;
    private Set<Lote> lotes;

    //Constructor
    public Subasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
        this.lotes = new HashSet<>();
    }

    //Getters
    public String getDiaSubasta() {
        return "El dia de la subasta es " + diaSubasta;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    //Setters
    public void setDiaSubasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
    }

    //Setter para añadir lotes
    public void addLotes(Lote lote) {
        this.lotes.add(lote);
    }
}
