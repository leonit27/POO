package ejercicio10;

import java.util.Scanner;

public class MaquinaExpendedora {
    //Creamos las variables
    private double dinero;
    private double cajon;
    private double[] monedas = {2, 1, 0.50, 0.20, 0.10};

    public void addDinero(double dinero) {
        this.dinero += dinero;
    }

    public void addCajon(double dinero) {
        this.cajon += dinero;
    }


    public String devolverDinero(double dineroDevolucion) {
        StringBuilder devolucion = new StringBuilder();
        for (double m : monedas) {
            while (dineroDevolucion >= m && cajon >= m) {
                devolucion.append("Moneda de ").append(m).append("€\n");
                dineroDevolucion -= m;
                cajon -= m;
            }
        }
        return devolucion.toString();
    }
    
    public void sacarTickets() {
        Scanner s = new Scanner(System.in);
        double[] preciosTickets = {1.20, 2.30, 3.80};
        double[] monedas = {0.10, 0.20, 0.50, 1, 2};
        String continuar;
        do {
            System.out.println("Ticket 1: " + preciosTickets[0] + "€\nTicket 2: " + preciosTickets[1] + "€\nTicket 3: " + preciosTickets[2] + "€");

            int ticketDeseado;
            do {
                System.out.print("Introduce el número del ticket que deseas sacar: ");
                ticketDeseado = s.nextInt();

                if (ticketDeseado < 1 || ticketDeseado > 3) System.out.println("El ticket introducido es incorrecto");
            } while (ticketDeseado < 1 || ticketDeseado > 3);

            double monedaIntroducida;
            do {
                System.out.print("Introduce las monedas (en euros), para acabar pulsa 0: ");
                monedaIntroducida = s.nextDouble();
                boolean monedaValida = false;
                for (double moneda : monedas) {
                    if (monedaIntroducida == moneda) {
                        addDinero(monedaIntroducida);
                        monedaValida = true;
                        break;
                    }
                }
                if (!monedaValida && monedaIntroducida != 0) System.out.println("Moneda introducida incorrecta");
            } while (monedaIntroducida != 0);

            if (getDinero() >= preciosTickets[ticketDeseado - 1]) {
                double dineroDevolucion = getDinero() - preciosTickets[ticketDeseado - 1];
                if (dineroDevolucion > getCajon()) {
                    System.out.println("Introduzca el importe exacto, no hay dinero para devolver en el cajón");
                } else {
                    System.out.println("El ticket ha sido sacado correctamente, dinero a devolver " + dineroDevolucion + "€");
                    String devolucion = devolverDinero(dineroDevolucion);
                    System.out.println(devolucion);
                    addCajon(preciosTickets[ticketDeseado - 1]);
                }
            } else {
                System.out.println("Dinero insuficiente para sacar el ticket.");
            }

            setDinero(0);

            System.out.print("Deseas continuar comprando? (S/N): ");
            continuar = s.next();
        } while (continuar.equalsIgnoreCase("S"));
    }

    //Getters
    public double getDinero() {
        return dinero;
    }

    public double getCajon() {
        return cajon;
    }

    //Setters
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}