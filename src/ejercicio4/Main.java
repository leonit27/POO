package ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Pedro Ramiro", "05-11-1982");

        ArrayList<String> temas = new ArrayList<>();
        temas.add("Aventuras");
        temas.add("Accion");
        temas.add("Suspense");

        System.out.println(temas);

        Libro libro = new Libro("Harry Potter", "Pedro Ramiro", 600, temas);

        System.out.println(libro.getTemas());
    }
}
