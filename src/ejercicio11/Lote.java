package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int numero;
    private double precioSalida;
    private Set<Articulo> articulos;
    private Pujador pujador;
    private Subasta subasta;

    //Constructor
    public Lote(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = new HashSet<>();
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public String getPujador() {
        return pujador.getNombre();
    }

    public String getSubasta() {
        return "El día de la subasta es" + subasta.getDiaSubasta();
    }

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    //Setter para añadir articulos
    public void addArticulos(Articulo articulo) {
        this.articulos.add(articulo);
    }
}