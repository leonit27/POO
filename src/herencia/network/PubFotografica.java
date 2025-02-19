package herencia.network;

public class PubFotografica extends Publicacion {
    private String nombreArchivoImagen;
    private String titulo;

    public PubFotografica(String autor, String nombreArchivoImagen, String titulo) {
        super(autor);
        this.nombreArchivoImagen = nombreArchivoImagen;
        this.titulo = titulo;
    }

    public String getNombreArchivoImagen() {
        return nombreArchivoImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTítulo: " + titulo +
                "\nImagen: " + nombreArchivoImagen;
    }
}