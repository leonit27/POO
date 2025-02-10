package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora();
        Scanner s = new Scanner(System.in);
        String empezar;
        System.out.println("MÁQUINA EXPENDEDORA");

        System.out.print("Deseas sacar un ticket? (S/N): ");
        empezar = s.next();

        if (empezar.equalsIgnoreCase("S")) maquinaExpendedora.sacarTickets();
    }
}
