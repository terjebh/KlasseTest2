package no.itfakultetet;

public class Laptop extends Datamaskin {

    public static Integer antallLaptoper = 0;

    public Laptop() {
        antallLaptoper++;
        Datamaskin.antallMaskiner++;
    }

    public Laptop(String type, Integer modell) {
        this();
        this.type = type;
        this.modell = modell;
    }

    public Laptop(String type) {
        this();
        this.type = type;
    }

    public void skiftBatteri() {
        System.out.println("Sendt melding til drift om bytte av batteri for "+this.type);
    }



}
