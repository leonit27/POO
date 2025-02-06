package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador("Asus", "Vivobook 15", 850.95, 100);
        Ordenador ordenador2 = new Ordenador("MSI", "Vector 16", 1250.99, 25);

        System.out.println(ordenador1);
        System.out.println(ordenador2);

        System.out.println("La el modelo del primer ordenador es: " + ordenador1.getModelo());
        System.out.println("La el modelo del segundo ordenador es: " + ordenador2.getModelo());
    }
}
