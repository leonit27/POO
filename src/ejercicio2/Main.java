package ejercicio2;

public class Main {
    public static void main(String[] args) {
        AireAcondicionado aireAcondicionado1 = new AireAcondicionado("Toshiba", 30, 15, 23);
        AireAcondicionado aireAcondicionado2 = new AireAcondicionado("LG", 32, 14, 21);

        System.out.println(aireAcondicionado1);
        System.out.println(aireAcondicionado2);

        aireAcondicionado1.bajarTemperatura();
        aireAcondicionado2.subirTemperatura();

        System.out.println(aireAcondicionado1);
        System.out.println(aireAcondicionado2);
    }
}