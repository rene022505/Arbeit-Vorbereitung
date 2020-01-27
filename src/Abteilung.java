import java.util.ArrayList;

public class Abteilung {

    private String name = "";
    private Mitarbeiter leiter;
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();

    public Abteilung(String name, Mitarbeiter leiter) {
        this.name = name;
        this.leiter = leiter;
        mitarbeiterListe.add(leiter);
    }

    public String getName() {
        return name;
    }

    public Mitarbeiter getLeiter() {
        return leiter;
    }

    public int getAnzahlMitarbeiter() {
        return mitarbeiterListe.size() - 1;
    }

    public Mitarbeiter getAbteilungsleiter() {
        return leiter;
    }

    public void zuordnenMitarbeiter(Mitarbeiter neuerMitarbeiter) {
        mitarbeiterListe.add(neuerMitarbeiter);
    }

    public void entferneMitarbeiter(int persNr) {
        for (Mitarbeiter m : mitarbeiterListe) {
            if (m.getPersonalnummer() == persNr) {
                mitarbeiterListe.remove(m);
                break;
            }
        }
    }

    public Mitarbeiter getMitarbeiter(int persNr) {
        for (Mitarbeiter m : mitarbeiterListe) {
            if (m.getPersonalnummer() == persNr) {
                return m;
            }
        }
        return null;
    }

    public Mitarbeiter getMitarbeiterNachIndex(int index) {
        if (!(index < 1)) {
            return mitarbeiterListe.get(index);
        }
        return null;
    }

    public double ermittlePersonalKosten() {
        double gesKosten = 0;
        for (Mitarbeiter m : mitarbeiterListe) {
            gesKosten += m.ermittleBrutto();
        }
        return Math.round((gesKosten / mitarbeiterListe.size()) * 100.0) / 100.0;
    }
}
