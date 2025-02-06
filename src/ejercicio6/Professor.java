package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Professor {
    private int codProf;
    private Departament departament;
    private Set<Catedra> catedras;

    //Constructor
    public Professor(int codProf, Departament departament) {
        this.codProf = codProf;
        this.departament = departament;
        this.catedras = new HashSet<>();
    }

    //Getters
    public int getCodProf() {
        return codProf;
    }

    public int getDepartament() {
        return departament.getCodDep();
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    //Setters
    public void setCodProf(int codProf) {
        this.codProf = codProf;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    //Setter para añadir catedras
    public void addCatedras(Catedra catedra) {
        this.catedras.add(catedra);
    }
}
