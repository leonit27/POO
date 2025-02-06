package ejercicio2;

public class AireAcondicionado {
    private String nombre;
    final private int maxTemp;
    final private int minTemp;
    private int temperatura;

    //Constructor
    public AireAcondicionado(String nombre, int maxTemp, int minTemp, int temperatura) {
        this.nombre = nombre;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.temperatura = temperatura;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getTemperatura() {
        return temperatura;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Métodos
    public void subirTemperatura() {
        if (temperatura < maxTemp) temperatura++;
    }

    public void bajarTemperatura() {
        if (temperatura > minTemp) temperatura--;
    }

    @Override
    public String toString() {
        return "La temperatura actual del aire acondicionado " + this.nombre + " es " + this.temperatura;
    }
}
