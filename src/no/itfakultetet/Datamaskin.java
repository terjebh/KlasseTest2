package no.itfakultetet;

public class Datamaskin implements DatamaskinITF {
    public static Integer antallMaskiner = 0;
    protected String type;
    protected Integer modell;
    protected Double vekt;
    private Integer ram;
    private String ramtype;
    private String prosessor;

    @Override
    public void oppdaterProgramvare() {
        System.out.println("Oppgraderer programvaren for "+this.type+"....");
    }

    @Override
    public void installerProgramvare(String programvare) {
        System.out.println("Installerer "+programvare+" på "+this.type+"....");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getModell() {
        return modell;
    }

    public void setModell(Integer modell) {
        this.modell = modell;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getRamtype() {
        return ramtype;
    }

    public void setRamtype(String ramtype) {
        this.ramtype = ramtype;
    }

    public String getProsessor() {
        return prosessor;
    }

    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }

    public Double getVekt() {
        return vekt;
    }

    public void setVekt(Double vekt) {
        this.vekt = vekt;
    }

    @Override
    public String toString() {
        return "Maskin{" +
                "type='" + type + '\'' +
                ", modell=" + modell +
                ", ram=" + ram +
                ", ramtype='" + ramtype + '\'' +
                ", prosessor='" + prosessor + '\'' +
                ", vekt=" + vekt +
                '}';
    }
}
