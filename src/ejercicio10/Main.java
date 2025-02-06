package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora();
        double[] preciosTickets = {1.20, 2.30, 3.80};
        System.out.println("MÁQUINA EXPENDEDORA");

        System.out.println("Ticket 1: " + preciosTickets[0] + "€\nTicket 2: " + preciosTickets[1] + "€\nTicket 3: " + preciosTickets[2] + "€");

        Scanner s = new Scanner(System.in);

        int ticketDeseado;
        do {
            System.out.print("Introduce el número del ticket que deseas sacar: ");
            ticketDeseado = s.nextInt();

            if (ticketDeseado <= 0 || ticketDeseado > 3) System.out.println("El ticket introducido incorrecto");
        } while (ticketDeseado <= 0 || ticketDeseado > 3);
        
        System.out.print("Introduce el dinero (en euros): ");
        maquinaExpendedora.addDinero(s.nextDouble());
        
        if (maquinaExpendedora.getDinero() == preciosTickets[ticketDeseado - 1]) System.out.println("El ticket ha sido sacado correctamente");
        if (maquinaExpendedora.getDinero() > preciosTickets[ticketDeseado - 1]) {

        }
        System.out.println(maquinaExpendedora.getDinero());
    }
}
