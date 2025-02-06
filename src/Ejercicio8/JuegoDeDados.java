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
    private void tirarDados() {
        dado1.setValorDado((int) (Math.random() * 6 + 1));
        dado2.setValorDado((int) (Math.random() * 6 + 1));
        dado3.setValorDado((int) (Math.random() * 6 + 1));
    }

    public static void main(String[] args) {
        JuegoDeDados juegoDeDados = new JuegoDeDados();

        juegoDeDados.definirDados();

        int tiradas = 0;
        do {
            System.out.println(juegoDeDados.dado1.getValorDado() + " - " + juegoDeDados.dado2.getValorDado() + " - " + juegoDeDados.dado3.getValorDado());
            if (juegoDeDados.dado1.getValorDado() == juegoDeDados.dado2.getValorDado() && juegoDeDados.dado1.getValorDado() == juegoDeDados.dado3.getValorDado()) {
                System.out.println("Lo conseguiste en la tirada " + (tiradas + 1));
                break;
            } else {
                tiradas++;
                juegoDeDados.tirarDados();
            }
        } while(true);
    }
}
