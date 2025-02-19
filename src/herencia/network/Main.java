package herencia.network;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Publicacion> publicaciones = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Menú de Publicaciones ---");
            System.out.println("1. Crear publicación de texto");
            System.out.println("2. Crear publicación fotográfica");
            System.out.println("3. Buscar publicaciones por autor");
            System.out.println("4. Mostrar todas las publicaciones");
            System.out.println("5. Eliminar una publicación por ID");
            System.out.println("6. Dar like a una publicación");
            System.out.println("7. Añadir comentario a una publicación");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del autor: ");
                    String autorTexto = scanner.nextLine();
                    System.out.print("Introduce el mensaje: ");
                    String mensaje = scanner.nextLine();
                    PubTexto texto = new PubTexto(autorTexto, mensaje);
                    publicaciones.add(texto);
                    System.out.println("Publicación de texto creada con ID: " + texto.getID());
                    break;

                case 2:
                    System.out.print("Introduce el nombre del autor: ");
                    String autorFoto = scanner.nextLine();
                    System.out.print("Introduce el nombre del archivo de imagen: ");
                    String nombreArchivo = scanner.nextLine();
                    System.out.print("Introduce el título de la fotografía: ");
                    String titulo = scanner.nextLine();
                    PubFotografica foto = new PubFotografica(autorFoto, nombreArchivo, titulo);
                    publicaciones.add(foto);
                    System.out.println("Publicación fotográfica creada con ID: " + foto.getID());
                    break;

                case 3:
                    System.out.print("Introduce el nombre del autor para buscar sus publicaciones: ");
                    String autorBuscar = scanner.nextLine();
                    List<Publicacion> publicacionesAutor = new ArrayList<>();
                    for (Publicacion pub : publicaciones) {
                        if (pub.getAutor().equals(autorBuscar)) {
                            publicacionesAutor.add(pub);
                        }
                    }
                    if (publicacionesAutor.isEmpty()) {
                        System.out.println("No se encontraron publicaciones para el autor: " + autorBuscar);
                    } else {
                        System.out.println("Publicaciones de " + autorBuscar + ":");
                        for (Publicacion pub : publicacionesAutor) {
                            System.out.println(pub);
                        }
                    }
                    break;

                case 4:
                    if (publicaciones.isEmpty()) {
                        System.out.println("No hay publicaciones para mostrar.");
                    } else {
                        System.out.println("Todas las publicaciones:");
                        for (Publicacion pub : publicaciones) {
                            System.out.println(pub);
                            System.out.println("-----------------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Introduce el ID de la publicación a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    boolean eliminada = false;
                    for (Publicacion pub : publicaciones) {
                        if (pub.getID() == idEliminar) {
                            publicaciones.remove(pub);
                            eliminada = true;
                            System.out.println("Publicación con ID " + idEliminar + " eliminada.");
                            break;
                        }
                    }
                    if (!eliminada) {
                        System.out.println("No se encontró una publicación con ID " + idEliminar + ".");
                    }
                    break;

                case 6:
                    System.out.print("Introduce el ID de la publicación a la que quieres dar like: ");
                    int idLike = scanner.nextInt();
                    boolean likeDado = false;
                    for (Publicacion pub : publicaciones) {
                        if (pub.getID() == idLike) {
                            pub.darLike();
                            likeDado = true;
                            System.out.println("Like añadido a la publicación con ID " + idLike + ".");
                            break;
                        }
                    }
                    if (!likeDado) {
                        System.out.println("No se encontró una publicación con ID " + idLike + ".");
                    }
                    break;

                case 7:
                    System.out.print("Introduce el ID de la publicación a la que quieres añadir un comentario: ");
                    int idComentario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduce el comentario: ");
                    String comentario = scanner.nextLine();
                    boolean comentarioAñadido = false;
                    for (Publicacion pub : publicaciones) {
                        if (pub.getID() == idComentario) {
                            pub.agregarComentario(comentario);
                            comentarioAñadido = true;
                            System.out.println("Comentario añadido a la publicación con ID " + idComentario + ".");
                            break;
                        }
                    }
                    if (!comentarioAñadido) {
                        System.out.println("No se encontró una publicación con ID " + idComentario + ".");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}