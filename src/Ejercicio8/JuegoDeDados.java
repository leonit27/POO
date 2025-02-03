package Ejercicio8;

public class JuegoDeDados {
    //Creamos los dados
    Dado dado1;
    Dado dado2;
    Dado dado3;

    //Definimos el valor de los dados aleatoriamente
    private void definirDados() {
        dado1 = new Dado((int) (Math.random() * 6 + 1));
        dado2 = new Dado((int) (Math.random() * 6 + 1));
        dado3 = new Dado((int) (Math.random() * 6 + 1));
    }

    //Hacemos una tirada
    public void tirarDados() {
        dado1.setValorDado((int) (Math.random() * 6 + 1));
        dado2.setValorDado((int) (Math.random() * 6 + 1));
        dado3.setValorDado((int) (Math.random() * 6 + 1));
    }

    public void main(String[] args) {
        definirDados();

        int tiradas = 0;
        do {
            System.out.println(dado1.getValorDado() + " - " + dado2.getValorDado() + " - " + dado3.getValorDado());
            if (dado1.getValorDado() == dado2.getValorDado() && dado1.getValorDado() == dado2.getValorDado()) {
                System.out.println("Lo conseguiste en la tirada " + tiradas);
                break;
            }
        } while(true);
    }
}
