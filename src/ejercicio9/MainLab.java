package ejercicio9;

public class MainLab {
    public static void main(String[] args) {
        Lab lab1 = new Lab("Laboratorio 1", "Taller 1", 30, "16:30", "Viernes", "José Gómez");

        lab1.addEstudiantes("Pedro Ramírez");
        lab1.addEstudiantes("Juan González");

        Lab lab2 = new Lab("Laboratorio 2", "Taller 2", 25, "17:00", "Martes", "Marcos García");

        lab2.addEstudiantes("María Pérez");
        lab2.addEstudiantes("Carlos Prado");

        System.out.println("El laboratorio " + lab1.getNombre() + " tiene lugar en el " + lab1.getTaller());
        System.out.println("con capacidad de " + lab1.getMaxCap() + " a las " + lab1.getHora() + " los " + lab1.getDia());
        System.out.print("el profesor a cargo es " + lab1.getProfesor() + " y los alumnos son: ");

        for (String estudiante : lab1.getEstudiantes()) {
            System.out.print(estudiante + " ");
        }

        System.out.println("\n-----------------------------------------------------------------------------------");

        System.out.println("El laboratorio " + lab2.getNombre() + " tiene lugar en el " + lab2.getTaller());
        System.out.println("con capacidad de " + lab2.getMaxCap() + " a las " + lab2.getHora() + " los " + lab2.getDia());
        System.out.print("el profesor a cargo es " + lab2.getProfesor() + " y los alumnos son: ");

        for (String estudiante : lab2.getEstudiantes()) {
            System.out.print(estudiante + " ");
        }
    }
}
