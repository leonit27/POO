package ejercicio10;

public class MaquinaExpendedora {
    private double dinero;
    private double cajon;
    private double[] monedas = {2, 1, 0.50, 0.20, 0.10};

    public void addDinero(double dinero) {
        this.dinero += dinero;
    }

    public void addCajon(double dinero) {
        this.cajon += dinero;
    }

    public String devolverDinero(double dineroDevolucion) {
        StringBuilder devolucion = new StringBuilder();
        for (double m : monedas) {
            while (dineroDevolucion >= m && cajon >= m) {
                devolucion.append("Moneda de ").append(m).append("€\n");
                dineroDevolucion -= m;
                cajon -= m;
            }
        }
        if (dineroDevolucion > 0) {
            return "No hay suficiente dinero en el cajón para devolver el cambio exacto.";
        }
        return devolucion.toString();
    }

    public double getDinero() {
        return dinero;
    }

    public double getCajon() {
        return cajon;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}