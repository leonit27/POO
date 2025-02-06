package ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CompteCorrent {
    private int numCompteCorrent;
    private Sucursal sucursal;
    private Set<Domiciliacio> domiciliacions;
    private Set<Client> clients;

    //Constructor
    public CompteCorrent(int numCompteCorrent, Sucursal sucursal) {
        this.numCompteCorrent = numCompteCorrent;
        this.sucursal = sucursal;
        this.domiciliacions = new HashSet<>();
        this.clients = new HashSet<>();
    }

    //Getters
    public int getNumCompteCorrent() {
        return numCompteCorrent;
    }

    public int getSucursal() {
        return sucursal.getNumSucursal();
    }

    public Set<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public Set<Client> getClients() {
        return clients;
    }

    //Setter para añadir domiciliacions
    public void addDomiciliacions(Domiciliacio domiciliacio) {
        this.domiciliacions.add(domiciliacio);
    }

    //Setter para añadir clients
    public void addClients(Client client) {
        this.clients.add(client);
    }
}
