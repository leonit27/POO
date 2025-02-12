package ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String continuar;

        Pujador pujador1 = new Pujador("Diego");
        Pujador pujador2 = new Pujador("Carles");

        Lote lote1 = new Lote(43, 50.00);
        Lote lote2 = new Lote(44, 100.00);

        lote1.addArticulos(new Articulo("Pelota", 10.00, lote1));
        lote1.addArticulos(new Articulo("Reloj", 60.00, lote1));

        lote2.addArticulos(new Articulo("Ratón", 30.00, lote2));
        lote2.addArticulos(new Articulo("Teclado", 80.00, lote2));

        do {
            System.out.println("SUBASTA");

            System.out.print("Qué día es la subasta? (DD-MM): ");
            String diaSubasta = s.next();

            Subasta subasta = new Subasta(diaSubasta);

            subasta.addLotes(lote1);
            subasta.addLotes(lote2);

            System.out.println(subasta.getDiaSubasta());

            for (Lote lote : subasta.getLotes()) {
                System.out.print(lote.getNumero() + " ");
            }

            System.out.print("Deseas generar otra subasta? (S/N): ");
            continuar = s.next();
        } while (continuar.equalsIgnoreCase("S"));
    }
}
