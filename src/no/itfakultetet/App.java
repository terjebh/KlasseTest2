package no.itfakultetet;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {



        Laptop l1 = new Laptop();
        l1.setType("Lenovo Thinkpad X240");
        l1.setModell(2017);
        l1.setRam(16);
        l1.setVekt(2.34);

        Laptop l2 = new Laptop("Lenovo Yoga", 2022);
        l2.setVekt(1.56);

        Laptop l3 = new Laptop("Lenovo Thinkpad w541");

        System.out.println("Laptop 1 er en : "+l1.getType() + " fra "+l1.getModell());
        System.out.println(l2);
        System.out.println(l3);


        Server s1 = new Server(4);
        s1.setType("Dell Poweredge r720");
        s1.setModell(2018);

        Desktop d1 = new Desktop();
        d1.setType("Lenovo Thinkcentre");

        System.out.println("Antall Laptoper er nå: " + Laptop.antallLaptoper);
        System.out.println("Antall Desktoper er nå: " + Desktop.antallDesktoper);
        System.out.println("Antall Servere er nå: " + Server.antallServere);

        System.out.println("Antall Datamaskiner totalt er nå: "+Datamaskin.antallMaskiner);






    } // slutt på main


}
