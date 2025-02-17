package herencia.trabajadores;

public class Empleado {
    private String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre();
    }
}
