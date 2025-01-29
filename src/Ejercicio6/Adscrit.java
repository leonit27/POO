package Ejercicio6;

public class Adscrit {
    private String data;
    private Professor professor;
    private Catedra catedra;

    //Constructor
    public Adscrit(String data, Professor professor, Catedra catedra) {
        this.data = data;
        this.professor = professor;
        this.catedra = catedra;
    }

    //Getters
    public String getData() {
        return data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    //Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }
}
