package ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Subasta> subastas = new ArrayList<>();
        List<Pujador> pujadores = new ArrayList<>();
        int opcion;

        do {
            System.out.println("SISTEMA DE SUBASTAS");
            System.out.println("1. Crear una nueva subasta");
            System.out.println("2. Añadir lote a una subasta");
            System.out.println("3. Registrar pujador");
            System.out.println("4. Realizar puja");
            System.out.println("5. Cerrar subasta y mostrar resultados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearSubasta(scanner, subastas);
                    break;
                case 2:
                    añadirLoteASubasta(scanner, subastas);
                    break;
                case 3:
                    registrarPujador(scanner, pujadores);
                    break;
                case 4:
                    realizarPuja(scanner, subastas, pujadores);
                    break;
                case 5:
                    cerrarSubasta(scanner, subastas);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void crearSubasta(Scanner scanner, List<Subasta> subastas) {
        System.out.print("Ingrese el día de la subasta (DD-MM): ");
        String diaSubasta = scanner.nextLine();
        Subasta subasta = new Subasta(diaSubasta);
        subastas.add(subasta);
        System.out.println("Subasta creada con éxito.");
    }

    private static void añadirLoteASubasta(Scanner scanner, List<Subasta> subastas) {
        if (subastas.isEmpty()) {
            System.out.println("No hay subastas disponibles. Cree una subasta primero.");
            return;
        }

        System.out.println("Seleccione una subasta:");
        for (int i = 0; i < subastas.size(); i++) {
            System.out.println((i + 1) + ". Subasta del día " + subastas.get(i).getDiaSubasta());
        }
        int indiceSubasta = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.print("Ingrese el número del lote: ");
        int numeroLote = scanner.nextInt();
        System.out.print("Ingrese el precio de salida del lote: ");
        double precioSalida = scanner.nextDouble();
        scanner.nextLine();

        Lote lote = new Lote(numeroLote, precioSalida);

        System.out.println("Añadiendo artículos al lote...");
        boolean añadirMasArticulos;
        do {
            System.out.print("Ingrese el nombre del artículo: ");
            String nombreArticulo = scanner.nextLine();
            System.out.print("Ingrese el precio del artículo: ");
            double precioArticulo = scanner.nextDouble();
            scanner.nextLine();

            lote.addArticulo(new Articulo(nombreArticulo, precioArticulo, lote));

            System.out.print("¿Desea añadir otro artículo? (S/N): ");
            añadirMasArticulos = scanner.nextLine().equalsIgnoreCase("S");
        } while (añadirMasArticulos);

        subastas.get(indiceSubasta).addLote(lote);
        System.out.println("Lote añadido con éxito.");
    }

    private static void registrarPujador(Scanner scanner, List<Pujador> pujadores) {
        System.out.print("Ingrese el nombre del pujador: ");
        String nombrePujador = scanner.nextLine();
        Pujador pujador = new Pujador(nombrePujador);
        pujadores.add(pujador);
        System.out.println("Pujador registrado con éxito.");
    }

    private static void realizarPuja(Scanner scanner, List<Subasta> subastas, List<Pujador> pujadores) {
        if (subastas.isEmpty() || pujadores.isEmpty()) {
            System.out.println("No hay subastas o pujadores disponibles.");
            return;
        }

        System.out.println("Seleccione una subasta:");
        for (int i = 0; i < subastas.size(); i++) {
            System.out.println((i + 1) + ". Subasta del día " + subastas.get(i).getDiaSubasta());
        }
        int indiceSubasta = scanner.nextInt() - 1;
        scanner.nextLine();

        Subasta subasta = subastas.get(indiceSubasta);

        System.out.println("Seleccione un pujador:");
        for (int i = 0; i < pujadores.size(); i++) {
            System.out.println((i + 1) + ". " + pujadores.get(i).getNombre());
        }
        int indicePujador = scanner.nextInt() - 1;
        scanner.nextLine();

        Pujador pujador = pujadores.get(indicePujador);

        System.out.println("Seleccione un lote:");
        Set<Lote> lotes = subasta.getLotes();
        List<Lote> listaLotes = new ArrayList<>(lotes);
        for (int i = 0; i < listaLotes.size(); i++) {
            System.out.println((i + 1) + ". Lote " + listaLotes.get(i).getNumero());
        }
        int indiceLote = scanner.nextInt() - 1;
        scanner.nextLine();

        Lote lote = listaLotes.get(indiceLote);

        System.out.print("Ingrese la cantidad de la puja: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();

        pujador.pujar(lote, cantidad);
        System.out.println("Puja realizada con éxito.");
    }

    private static void cerrarSubasta(Scanner scanner, List<Subasta> subastas) {
        if (subastas.isEmpty()) {
            System.out.println("No hay subastas disponibles.");
            return;
        }

        System.out.println("Seleccione una subasta para cerrar:");
        for (int i = 0; i < subastas.size(); i++) {
            System.out.println((i + 1) + ". Subasta del día " + subastas.get(i).getDiaSubasta());
        }
        int indiceSubasta = scanner.nextInt() - 1;
        scanner.nextLine();

        Subasta subasta = subastas.get(indiceSubasta);
        subasta.cerrarSubasta();
        System.out.println("Subasta cerrada. Resultados:");
        subasta.imprimirResultados();
    }
}