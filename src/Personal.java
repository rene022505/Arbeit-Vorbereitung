public class Personal {

    private String nachname = "";
    private String vorname = "";
    private int personalnummer;

    public Personal(int nr, String name, String vorname) {
        this.personalnummer = nr;
        this.vorname = vorname;
        this.nachname = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    @Override
    public String toString() {
        return "Name: " + this.nachname + ", " + this.vorname;
    }

}
