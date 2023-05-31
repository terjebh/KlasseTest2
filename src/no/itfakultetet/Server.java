package no.itfakultetet;

public class Server extends Datamaskin {


    public static Integer antallServere = 0;

    public Server() {
        antallMaskiner++;
        antallServere++;
    }

    public Server(Integer antallNIC) {
        this();
        this.antallNIC = antallNIC;
    }

    private Integer antallNIC;

    public Integer getAntallNIC() {
        return antallNIC;
    }

    public void setAntallNIC(Integer antallNIC) {
        this.antallNIC = antallNIC;
    }
}
