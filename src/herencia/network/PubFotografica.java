package herencia.network;

public class PubFotografica extends Publicacion{
    private String imagen;
    private String titulo;

    //Constructor
    public PubFotografica(String imagen, String titulo) {
        super();
        this.imagen = imagen;
        this.titulo = titulo;
    }
}