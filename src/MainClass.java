import java.lang.annotation.AnnotationFormatError;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        // 5 Mitarbeiter
        Mitarbeiter m1 = new Mitarbeiter(1, "Schlaumeier", "Hans", 5000);
        Mitarbeiter m2 = new Mitarbeiter(2, "Wunderbar", "Walter", 3500);
        Mitarbeiter m3 = new Mitarbeiter(3, "Lustig", "Paul", 2700);
        Mitarbeiter m4 = new Mitarbeiter(4, "Jung", "Janine", 6000);
        Mitarbeiter m5 = new Mitarbeiter(5, "Fleissig", "Frieda", 3400);
        Angestellte a1 = new Angestellte(6, "Potter", "Harry", 100000);

        // zwei Abteilungen
        Abteilung abt2 = new Abteilung("Einkauf", m5);
        Abteilung abt1 = new Abteilung("Marketing", m1);

        ArrayList<Abteilung> alle = new ArrayList<>();
        alle.add(abt1);
        alle.add(abt2);


        Projekt proj1 = new Projekt("Kranke Website", 2000000, m2);
        proj1.fuegeMitarbeiterHinzu(m1);
        proj1.fuegeMitarbeiterHinzu(m3);
        proj1.fuegeMitarbeiterHinzu(a1);

        Projekt proj2 = new Projekt("Nicht so kranke Website", 20, m4);
        proj2.fuegeMitarbeiterHinzu(m5);

        // Mitarbeiter einstellen

        abt2.zuordnenMitarbeiter(m3);
        abt1.zuordnenMitarbeiter(m4);
        abt2.zuordnenMitarbeiter(m2);


        // Test Ausgabe

        System.out.println("Die Firma hat folgende Organisationsstruktur:" );

        for ( Abteilung a : alle) {
            System.out.println("Abteilung: " + a.getName());
            System.out.println("Abteilungsleiter: " + a.getAbteilungsleiter());
            System.out.println("Mitarbeiter: ");

            for (int i= 1; i <= a.getAnzahlMitarbeiter(); i++)
            {
                System.out.println(a.getMitarbeiterNachIndex(i));
            }
        }

        m1.erfasseArbeitszeit(8);
        m2.erfasseArbeitszeit(18);
        m3.erfasseArbeitszeit(5);
        m4.erfasseArbeitszeit(1);
        m5.erfasseArbeitszeit(1);

        System.out.println("");
        System.out.println(abt1.ermittlePersonalKosten());
        System.out.println(abt2.ermittlePersonalKosten());

        System.out.println(proj1.getProjektname());
        System.out.println(proj1.getProjektbudget());
        System.out.println(proj1.getProjektLeiter());
        System.out.println(proj1.entferneMitarbeiter(1));
        proj1.aendereProjektleitung(m3);
        System.out.println("Projektleitung: \n" + proj1.getProjektLeiter());

        System.out.println(proj2.getProjektname());
        System.out.println(proj2.getProjektbudget());
        System.out.println(proj2.getProjektLeiter());
    }

}
