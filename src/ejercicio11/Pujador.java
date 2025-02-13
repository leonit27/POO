package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String nombre;
    private Set<Lote> lotesAdjudicados;

    // Constructor
    public Pujador(String nombre) {
        this.nombre = nombre;
        this.lotesAdjudicados = new HashSet<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Set<Lote> getLotesAdjudicados() {
        return lotesAdjudicados;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para realizar una puja
    public void pujar(Lote lote, double cantidad) {
        if (cantidad > lote.getPujaMasAlta()) {
            lote.registrarPuja(this, cantidad);
        }
    }

    // Método para añadir lotes adjudicados
    public void addLoteAdjudicado(Lote lote) {
        this.lotesAdjudicados.add(lote);
    }
}
