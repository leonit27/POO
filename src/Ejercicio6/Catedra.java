package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private int codCat;
    private Departament departament;
    private Facultat facultat;
    private Set<Professor> professors;

    //Constructor
    public Catedra(int codCat, Departament departament, Facultat facultat) {
        this.codCat = codCat;
        this.departament = departament;
        this.facultat = facultat;
        this.professors = new HashSet<>();
    }

    //Getters
    public int getCodCat() {
        return codCat;
    }

    public int getDepartament() {
        return departament.getCodDep();
    }

    public int getFacultat() {
        return facultat.getCodFac();
    }

    public Set<Professor> getProfessors() {
        return professors;
    }

    //Setters
    public void setCodCat(int codCat) {
        this.codCat = codCat;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setFacultat(Facultat facultat) {
        this.facultat = facultat;
    }

    //Setter para añadir professors
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }
}
