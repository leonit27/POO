package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Banc banc = new Banc(34);
        banc.addSucursal(new Sucursal(8, banc));
        banc.addSucursal(new Sucursal(6, banc));

        Sucursal sucursal = new Sucursal(7, banc);

        for (Sucursal suc : banc.getSucursals()) {
            System.out.println(suc.getNumSucursal());
        }

        System.out.println(sucursal.getBanc());

        System.out.println("-----------");

        Sucursal suc = new Sucursal(20, banc);

        suc.addPrestecs(new Prestec(1, suc, new Client("3982473J")));
        suc.addPrestecs(new Prestec(2, suc, new Client("9275697F")));

        Prestec prestec = new Prestec(3, suc, new Client("927590L"));

        for (Prestec pres : suc.getPrestecs()) {
            System.out.println(pres.getNumPrestec());
        }

        System.out.println(prestec.getSucursal());

        System.out.println("---------------");

        suc.addComptesCorrents(new CompteCorrent(50, suc));
        suc.addComptesCorrents(new CompteCorrent(60, suc));

        CompteCorrent compteCorrent = new CompteCorrent(70, suc);

        for (CompteCorrent compt : suc.getComptesCorrents()) {
            System.out.println(compt.getNumCompteCorrent());
        }

        System.out.println(compteCorrent.getSucursal());

        System.out.println("---------------");

        Client client = new Client("11111111T");

        client.addPrestecs(new Prestec(10, suc, client));
        client.addPrestecs(new Prestec(20, suc, client));

        for (Prestec pres : client.getPrestecs()) {
            System.out.println(pres.getNumPrestec());
        }

        System.out.println(prestec.getClient());

        System.out.println("----------------");

        compteCorrent.addDomiciliacions(new Domiciliacio(100, compteCorrent));
        compteCorrent.addDomiciliacions(new Domiciliacio(200, compteCorrent));

        for (Domiciliacio dom : compteCorrent.getDomiciliacions()) {
            System.out.println(dom.getNumDomiciliacio());
        }

        Domiciliacio domiciliacio = new Domiciliacio(300, compteCorrent);

        System.out.println(domiciliacio.getCompteCorrent());
    }
}
