package herencia.network;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    public int ID;
    private static int conID = 0;
    private String autor;
    private int likes;
    private List<String> comentarios;

    public Publicacion(String autor) {
        this.ID = ++conID;
        this.autor = autor;
        this.likes = 0;
        this.comentarios = new ArrayList<>();
    }

    public void darLike() {
        likes++;
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public int getID() {
        return ID;
    }

    public String getAutor() {
        return autor;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "Publicación ID: " + ID +
                "\nAutor: " + autor +
                "\nLikes: " + likes +
                "\nComentarios: " + comentarios;
    }
}