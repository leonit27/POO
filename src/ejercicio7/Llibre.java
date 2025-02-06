package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Llibre {
    private String isbn;
    private Set<Autor> autors;
    private Tema tema;
    private Editorial editorial;
    private Set<Exemplar> exemplars;

    //Constructor
    public Llibre(String isbn, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.autors = new HashSet<>();
        this.tema = tema;
        this.editorial = editorial;
        this.exemplars = new HashSet<>();
    }

    //Getters
    public String getIsbn() {
        return isbn;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public int getTema() {
        return tema.getCodTema();
    }

    public int getEditorial() {
        return editorial.getCodEd();
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    //Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    //Setter para añadir autors
    public void addAutor(Autor autor) {
        this.autors.add(autor);
    }

    //Setter para añadir exemplars
    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }
}
