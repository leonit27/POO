package ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    //Constructores
    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    //Getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Métodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad < this.cantidad) this.cantidad -= cantidad;
    }

    @Override
    public String toString() {
        return "El titular de la cuenta " + this.titular + " tiene " + this.cantidad + "€";
    }
}
