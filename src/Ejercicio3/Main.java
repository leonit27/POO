package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan", 40);
        Cuenta cuenta2 = new Cuenta("Pedro");

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.retirar(30);
        cuenta2.ingresar(50);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
