package Ejercicio8;

public class Dado {
    //Creamos el atributo del dado
    private int valorDado;

    //Constructor
    public Dado(int valorDado) {
        this.valorDado = valorDado;
    }

    //Getters
    public int getValorDado() {
        return valorDado;
    }

    public void imprimirDado() {
        System.out.println(valorDado);
    }

    //Setter
    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }
}
