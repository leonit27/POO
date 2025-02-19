package herencia.network;

public class PubTexto extends Publicacion {
    private String mensaje;

    public PubTexto(String autor, String mensaje) {
        super(autor);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMensaje: " + mensaje;
    }
}