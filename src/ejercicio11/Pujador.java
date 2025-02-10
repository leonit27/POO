package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String nombre;
    private Set<Lote> lotes;

    //Constructor
    public Pujador(String nombre) {
        this.nombre = nombre;
        this.lotes = new HashSet<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Setter para añadir lotes
    public void addLotes(Lote lote) {
        this.lotes.add(lote);
    }
}
