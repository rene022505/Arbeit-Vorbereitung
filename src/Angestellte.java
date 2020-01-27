public class Angestellte extends Personal {

    private double grundgehalt;

    public Angestellte(int nr, String name, String vorname, double pGrundgehalt) {
        super(nr, name, vorname);
        this.grundgehalt = pGrundgehalt;
    }

    public double getGehalt() {
        return grundgehalt;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }
}
