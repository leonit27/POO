package ejercicio5;

public class Prestec {
    private int numPrestec;
    private Sucursal sucursal;
    private Client client;

    //Constructor
    public Prestec(int numPrestec, Sucursal sucursal, Client client) {
        this.numPrestec = numPrestec;
        this.sucursal = sucursal;
        this.client = client;
    }

    //Getters
    public int getNumPrestec() {
        return numPrestec;
    }

    public int getSucursal() {
        return sucursal.getNumSucursal();
    }

    public String getClient() {
        return client.getDNI();
    }
}
