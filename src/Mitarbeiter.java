public class Mitarbeiter extends Personal{

    private double stundenlohn;
    private double arbeitszeit;

    public Mitarbeiter(int nr, String name, String vorname, double pStundenlohn) {
        super(nr, name, vorname);
        this.stundenlohn = pStundenlohn;
    }

    public void erfasseArbeitszeit(double stunden) {
        this.arbeitszeit += stunden;
    }

    public double ermittleBrutto() {
        return (this.stundenlohn * this.arbeitszeit) * 0.85;
    }

    public void aendernStundenlohn(double prozent) {
        this.stundenlohn *= (1 + prozent);
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

}
