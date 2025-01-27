package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banc {
    private int numEntidad;
    private Set<Sucursal> sucursals;

    //Constructor
    public Banc(int numEntidad) {
        this.numEntidad = numEntidad;
        this.sucursals = new HashSet<>();
    }

    //Getters
    public int getNumEntidad() {
        return numEntidad;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursals.add(sucursal);
    }
}
