package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class AreaConeixement {
    private int codArea;
    private Set<Departament> departaments;

    //Constructor
    public AreaConeixement(int codArea) {
        this.codArea = codArea;
        this.departaments = new HashSet<>();
    }

    //Getters
    public int getCodArea() {
        return codArea;
    }

    public Set<Departament> getDepartaments() {
        return departaments;
    }

    //Setters
    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    //Setter para añadir departaments
    public void addDepartament(Departament departament) {
        this.departaments.add(departament);
    }
}
