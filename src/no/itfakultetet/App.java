package no.itfakultetet;

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

       // System.out.println("Laptop 1 er en : "+l1.getType() + " fra "+l1.getModell());
       // System.out.println(l2);
       //  System.out.println(l3);


        Server s1 = new Server(4);
        s1.setType("Dell Poweredge r720");
        s1.setModell(2018);

        Desktop d1 = new Desktop();
        d1.setType("Lenovo Thinkcentre");


        d1.oppdaterProgramvare();
        l3.oppdaterProgramvare();
        l2.installerProgramvare("git");

        /*
        System.out.println("Antall Laptoper er nå: " + Laptop.antallLaptoper);
        System.out.println("Antall Desktoper er nå: " + Desktop.antallDesktoper);
        System.out.println("Antall Servere er nå: " + Server.antallServere);
        System.out.println("Antall Datamaskiner totalt er nå: "+Datamaskin.antallMaskiner);
        */

        List<Datamaskin> maskiner = new ArrayList<>();

        maskiner.add(l1);
        maskiner.add(d1);
        maskiner.add(s1);

        maskiner.forEach(System.out::println);


        record Menneske (String navn, Integer alder, String adresse) { };

        Menneske ola = new Menneske("Ola",34,"Olaveien 45");
        Menneske kari = new Menneske("Kari",44,"Kariveien 143");

       // System.out.println(ola.navn+ " er "+ola.alder+" år gammel");

       // System.out.println(kari);

        List<Menneske> folk = new ArrayList<>();
        folk.add(ola);
        folk.add(kari);

        folk.forEach(System.out::println);









    } // slutt på main


}
