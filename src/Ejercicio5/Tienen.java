package Ejercicio5;

public class Tienen {
    private CompteCorrent compteCorrent;
    private Client client;
    private int priv;

    //Constructor
    public Tienen(CompteCorrent compteCorrent, Client client, int priv) {
        this.compteCorrent = compteCorrent;
        this.client = client;
        this.priv = priv;
    }

    //Getters
    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public Client getClient() {
        return client;
    }

    public int getPriv() {
        return priv;
    }
}
