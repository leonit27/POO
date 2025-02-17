package herencia.network;

public class PubTexto extends Publicacion{
    private String mensaje;

    //Constructor
    public PubTexto(String ID, String mensaje) {
        super(ID);
        this.mensaje = mensaje;
    }
}
