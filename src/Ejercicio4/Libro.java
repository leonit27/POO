package Ejercicio4;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private ArrayList<String> temas;

    //Constructor
    public Libro(String titulo, String autor, int paginas, ArrayList<String> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public ArrayList<String> getTemas() {
        return temas;
    }
}