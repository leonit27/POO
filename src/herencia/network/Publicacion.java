package herencia.network;

import java.util.Set;

public class Publicacion {
    public int ID;
    private static int conID = 0;

    //Constructor
    public Publicacion() {
        this.ID = ++conID;
    }

    //Getters
    public int getID() {
        return ID;
    }
}
