package ejercicio4;

public class Autor {
    private final String nombre;
    private final String fechaNacimiento;

    //Constructor
    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
