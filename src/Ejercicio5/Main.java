package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Banc banc = new Banc(34);
        banc.addSucursal(new Sucursal(34, banc));

        System.out.println(banc);
    }
}
