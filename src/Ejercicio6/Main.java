package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        // Creamos un área de conocimiento y sus departamentos
        AreaConeixement area1 = new AreaConeixement(1);

        area1.addDepartament(new Departament(101, area1));
        area1.addDepartament(new Departament(102, area1));

        System.out.print("El área de conocimiento con código " + area1.getCodArea() + " tiene los departamentos: ");
        for (Departament dep : area1.getDepartaments()) {
            System.out.print(dep.getCodDep() + " ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------");
        // Mostramos un departamento, sus profesores y cátedras
        Departament dep1 = new Departament(101, area1);

        // Profesores del departamento
        Professor prof1 = new Professor(201, dep1);
        Professor prof2 = new Professor(202, dep1);
        dep1.addProfessor(prof1);
        dep1.addProfessor(prof2);

        // Cátedras del departamento
        Facultat fac1 = new Facultat(401);
        Catedra cat1 = new Catedra(301, dep1, fac1);
        Catedra cat2 = new Catedra(302, dep1, fac1);
        dep1.addCatedras(cat1);
        dep1.addCatedras(cat2);
        fac1.addCatedras(cat1);
        fac1.addCatedras(cat2);

        System.out.print("El departamento con código " + dep1.getCodDep() + " tiene los profesores: ");
        for (Professor prof : dep1.getProfessors()) {
            System.out.print(prof.getCodProf() + " ");
        }
        System.out.print("y las cátedras: ");
        for (Catedra cat : dep1.getCatedras()) {
            System.out.print(cat.getCodCat() + " ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------");
        // Mostramos la facultad y sus cátedras
        System.out.print("La facultad con código " + fac1.getCodFac() + " tiene las cátedras: ");
        for (Catedra cat : fac1.getCatedras()) {
            System.out.print(cat.getCodCat() + " ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------");

        // Mostramos un profesor y sus cátedras con adscripciones
        Professor prof3 = new Professor(203, dep1);
        Adscrit adsc1 = new Adscrit("2023-01-01", prof3, cat1);
        Adscrit adsc2 = new Adscrit("2023-02-15", prof3, cat2);

        // Añadir cátedras al profesor y viceversa
        prof3.addCatedras(cat1);
        prof3.addCatedras(cat2);
        cat1.addProfessor(prof3);
        cat2.addProfessor(prof3);

        System.out.print("El profesor con código " + prof3.getCodProf() + " está adscrito a las cátedras: ");
        for (Catedra c : prof3.getCatedras()) {
            System.out.print(c.getCodCat() + " ");
        }
        System.out.print("con fechas: " + adsc1.getData() + " y " + adsc2.getData());
        System.out.println("\n------------------------------------------------------------------------------------------------------");

        // Mostramos una cátedra y sus profesores
        Catedra cat3 = new Catedra(303, dep1, fac1);
        Professor prof4 = new Professor(204, dep1);

        cat3.addProfessor(prof4);
        prof4.addCatedras(cat3);

        System.out.print("La cátedra con código " + cat3.getCodCat() + " tiene los profesores: ");
        for (Professor p : cat3.getProfessors()) {
            System.out.print(p.getCodProf() + " ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------");
    }
}