import java.util.ArrayList;

public class Projekt {

    private String projektname = "";
    private double projektbudget;
    private Mitarbeiter projektLeiter;
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private ArrayList<Angestellte> angestellteListe = new ArrayList<>();

    public Projekt(String projektname, double projektbudget, Mitarbeiter projektLeiter) {
        this.projektname = projektname;
        this.projektbudget = projektbudget;
        this.projektLeiter = projektLeiter;
    }

    public String getProjektname() {
        return projektname;
    }

    public double getProjektbudget() {
        return projektbudget;
    }

    public Mitarbeiter getProjektLeiter() {
        return projektLeiter;
    }

    public void budgetVerbrauchen(double betrag) {
        this.projektbudget -= betrag;
    }

    public void aendereProjektleitung(Mitarbeiter projektleiterNeu) {
        this.projektLeiter = projektleiterNeu;
    }

    public void fuegeMitarbeiterHinzu(Mitarbeiter neuerMitarbeiter) {
        this.mitarbeiterListe.add(neuerMitarbeiter);
    }

    public void fuegeMitarbeiterHinzu(Angestellte neuerAngestellter) {
        this.angestellteListe.add(neuerAngestellter);
    }

    public int getAnzahlMitarbeiter() {
        return this.mitarbeiterListe.size() + this.angestellteListe.size();
    }

    public Mitarbeiter getMitarbeiter(int index) {
        for (Mitarbeiter m : mitarbeiterListe) {
            if (m.getPersonalnummer() == index) {
                return m;
            }
        }
        return null;
    }

    public Angestellte getAngestellte(int index) {
        for (Angestellte a : angestellteListe) {
            if (a.getPersonalnummer() == index) {
                return a;
            }
        }
        return null;
    }

    public Mitarbeiter entferneMitarbeiter(int index) {
        Mitarbeiter temp = null;
        for (Mitarbeiter m : mitarbeiterListe) {
            if (m.getPersonalnummer() == index) {
                temp = m;
                mitarbeiterListe.remove(m);
                break;
            }
        }
        return temp;
    }

    public Angestellte entferneAngestellter(int index) {
        Angestellte temp = null;
        for (Angestellte a: angestellteListe) {
            if (a.getPersonalnummer() == index) {
                temp = a;
                mitarbeiterListe.remove(a);
                break;
            }
        }
        return temp;
    }
}
