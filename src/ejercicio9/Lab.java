package ejercicio9;

import java.util.HashSet;
import java.util.Set;

public class Lab {
    private String nombre;
    private String taller;
    private int maxCap;
    private String hora;
    private String dia;
    private String profesor;
    private Set<String> estudiantes;

    //Constructor
    public Lab(String nombre, String taller, int maxCap, String hora, String dia, String profesor) {
        this.nombre = nombre;
        this.taller = taller;
        this.maxCap = maxCap;
        this.hora = hora;
        this.dia = dia;
        this.profesor = profesor;
        this.estudiantes = new HashSet<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTaller() {
        return taller;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public String getHora() {
        return hora;
    }

    public String getDia() {
        return dia;
    }

    public String getProfesor() {
        return profesor;
    }

    public Set<String> getEstudiantes() {
        return estudiantes;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    //Setter para añadir estudiantes
    public void addEstudiantes(String estudiante) {
        this.estudiantes.add(estudiante);
    }
}