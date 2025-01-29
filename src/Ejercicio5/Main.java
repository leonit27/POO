package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        //Mostramos el banco y sus sucursales
        Banc banc = new Banc(124);

        banc.addSucursal(new Sucursal(8, banc));
        banc.addSucursal(new Sucursal(6, banc));

        System.out.print("El banco con número de entidad " + banc.getNumEntidad() + " tiene las sucursales: ");

        for (Sucursal suc : banc.getSucursals()) {
            System.out.print(suc.getNumSucursal() + " ");
        } System.out.println();

        System.out.println("-----------------------------------------------------------------------------------");

        //Mostramos la sucursal, sus prestamos y sus cuentas corrientes
        Sucursal suc = new Sucursal(20, banc);

        suc.addPrestecs(new Prestec(1, suc, new Client("3982473J")));
        suc.addPrestecs(new Prestec(2, suc, new Client("9275697F")));

        suc.addComptesCorrents(new CompteCorrent(50, suc));
        suc.addComptesCorrents(new CompteCorrent(60, suc));

        System.out.print("La sucursal con número " + suc.getNumSucursal() + " tiene los préstamos: ");

        for (Prestec pres : suc.getPrestecs()) {
            System.out.print(pres.getNumPrestec() + " ");
        }
        System.out.print("y las cuentas corrientes: ");

        for (CompteCorrent compt : suc.getComptesCorrents()) {
            System.out.print(compt.getNumCompteCorrent() + " ");
        } System.out.println();

        System.out.println("-----------------------------------------------------------------------------------");

        //Mostramos el cliente con sus prestamos
        Client client = new Client("6519819L");

        client.addPrestecs(new Prestec(10, suc, client));
        client.addPrestecs(new Prestec(20, suc, client));

        System.out.print("El cliente con DNI " + client.getDNI() + " tiene los prestamos: ");

        for (Prestec pres : client.getPrestecs()) {
            System.out.print(pres.getNumPrestec() + " ");
        } System.out.println();

        System.out.println("-----------------------------------------------------------------------------------");

        //Mostramos el compte corrent con sus domiciliaciones
        CompteCorrent compteCorrent = new CompteCorrent(70, suc);

        compteCorrent.addDomiciliacions(new Domiciliacio(100, compteCorrent));
        compteCorrent.addDomiciliacions(new Domiciliacio(200, compteCorrent));

        System.out.print("El compte corrent con número " + compteCorrent.getNumCompteCorrent() + " tiene las domiciliaciones: ");

        for (Domiciliacio dom : compteCorrent.getDomiciliacions()) {
            System.out.print(dom.getNumDomiciliacio() + " ");
        } System.out.println();

        System.out.println("-----------------------------------------------------------------------------------");
    }
}