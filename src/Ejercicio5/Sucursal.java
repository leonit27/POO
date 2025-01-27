package Ejercicio5;

public class Sucursal {
    private int numSucursal;
    private Banc banc;

    //Constructor
    public Sucursal(int numSucursal, Banc banc) {
        this.numSucursal = numSucursal;
        this.banc = banc;
    }

    //Getters
    public int getNumSucursal() {
        return numSucursal;
    }

    public Banc getBanc() {
        return banc;
    }
}
