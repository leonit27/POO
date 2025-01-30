package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        // Creamos un tema y sus libros
        Tema tema1 = new Tema(1);

        tema1.addLlibre(new Llibre("123456789", tema1, new Editorial(101)));
        tema1.addLlibre(new Llibre("987654321", tema1, new Editorial(102)));

        System.out.print("El tema con código " + tema1.getCodTema() + " tiene los libros: ");
        for (Llibre llibre : tema1.getLlibres()) {
            System.out.print(llibre.getIsbn() + " ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------");

        // Mostramos un libro, sus autores y ejemplares
        Llibre llibre1 = new Llibre("123456789", tema1, new Editorial(101));

        // Autores del libro
        Autor autor1 = new Autor(201);
        Autor autor2 = new Autor(202);
        llibre1.addAutor(autor1);
        llibre1.addAutor(autor2);

        // Ejemplares del libro
        Lector lector1 = new Lector("12345678A");
        Exemplar exemplar1 = new Exemplar(1, llibre1, lector1);
        Exemplar exemplar2 = new Exemplar(2, llibre1, lector1);
        llibre1.addExemplar(exemplar1);
        llibre1.addExemplar(exemplar2);

        System.out.print("El libro con ISBN " + llibre1.getIsbn() + " tiene los autores: ");
        for (Autor autor : llibre1.getAutors()) {
            System.out.print(autor.getCodAut() + " ");
        }
        System.out.print("y los ejemplares: ");
        for (Exemplar exemplar : llibre1.getExemplars()) {
            System.out.print(exemplar.getnReg() + " ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------");

        // Mostramos un lector y sus préstamos
        Lector lector2 = new Lector("87654321B");

        lector2.addExemplarPrestec(exemplar1);
        lector2.addExemplarPrestec(exemplar2);

        System.out.print("El lector con DNI " + lector2.getDNI() + " tiene los ejemplares de préstamos: ");
        for (Exemplar exemplar : lector2.getExemplarsPrestec()) {
            System.out.print(exemplar.getnReg() + " ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------");

        // Mostramos un ejemplar y su historial
        Exemplar exemplar3 = new Exemplar(3, llibre1, lector1);
        Historic historic1 = new Historic("2023-03-01", "2023-03-15", lector1, exemplar3);
        lector1.addExemplarHistoric(exemplar3);

        System.out.print("El ejemplar con número de registro " + exemplar3.getnReg() + " tiene el historial: ");
        System.out.print("Fecha préstamo: " + historic1.getDataP() + ", Fecha devolución: " + historic1.getDataT());
        System.out.println("\n-----------------------------------------------------------------------------------");
    }
}