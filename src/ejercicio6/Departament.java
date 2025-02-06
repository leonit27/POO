package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departament {
    private int codDep;
    private AreaConeixement areaConeixement;
    private Set<Professor> professors;
    private Set<Catedra> catedras;

    //Constructor
    public Departament(int codDep, AreaConeixement areaConeixement) {
        this.codDep = codDep;
        this.areaConeixement = areaConeixement;
        this.professors = new HashSet<>();
        this.catedras = new HashSet<>();
    }

    //Getters
    public int getCodDep() {
        return codDep;
    }

    public int getAreaConeixement() {
        return areaConeixement.getCodArea();
    }

    public Set<Professor> getProfessors() {
        return professors;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    //Setters
    public void setCodDep(int codDep) {
        this.codDep = codDep;
    }

    public void setAreaConeixement(AreaConeixement areaConeixement) {
        this.areaConeixement = areaConeixement;
    }

    //Setter para añadir professors
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    //Setter para añadir catedras
    public void addCatedras(Catedra catedra) {
        this.catedras.add(catedra);
    }
}
