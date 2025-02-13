package ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private int numero;
    private double precioSalida;
    private Set<Articulo> articulos;
    private Pujador pujadorAdjudicado;
    private double pujaMasAlta;

    // Constructor
    public Lote(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = new HashSet<>();
        this.pujaMasAlta = precioSalida; // Inicialmente, la puja más alta es el precio de salida
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public Pujador getPujadorAdjudicado() {
        return pujadorAdjudicado;
    }

    public double getPujaMasAlta() {
        return pujaMasAlta;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    // Método para añadir artículos
    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    // Método para registrar una puja
    public void registrarPuja(Pujador pujador, double cantidad) {
        if (cantidad > pujaMasAlta) {
            pujaMasAlta = cantidad;
            pujadorAdjudicado = pujador;
        }
    }

    // Método para adjudicar el lote
    public void adjudicar() {
        if (pujadorAdjudicado != null) {
            pujadorAdjudicado.addLoteAdjudicado(this);
        }
    }
}