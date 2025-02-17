package herencia.network;

public class PubFotografica extends Publicacion{
    private String imagen;
    private String titulo;

    public PubFotografica(String ID, String imagen, String titulo) {
        super(ID);
        this.imagen = imagen;
        this.titulo = titulo;
    }
}