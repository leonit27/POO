package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String diaSubasta;
    private Set<Lote> lotes;

    // Constructor
    public Subasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
        this.lotes = new HashSet<>();
    }

    // Getters
    public String getDiaSubasta() {
        return diaSubasta;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    // Setters
    public void setDiaSubasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
    }

    // Método para añadir lotes
    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

    // Método para cerrar la subasta y adjudicar los lotes
    public void cerrarSubasta() {
        for (Lote lote : lotes) {
            lote.adjudicar();
        }
    }

    // Método para imprimir los resultados de la subasta
    public void imprimirResultados() {
        System.out.println("Resultados de la subasta del día " + diaSubasta);
        for (Lote lote : lotes) {
            Pujador pujador = lote.getPujadorAdjudicado();
            String resultado = (pujador != null)
                    ? "Lote " + lote.getNumero() + " adjudicado a: " + pujador.getNombre()
                    : "Lote " + lote.getNumero() + " no adjudicado";
            System.out.println(resultado);
        }
    }
}