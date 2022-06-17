import java.util.ArrayList;

//Implementierung der Klasse
public class Raumschiff {

    //Attribute
    private int photonentorpedoAnzahl;
    private int energieversorgungInProzent;
    private int schildInProzent;
    private int huelleInProzent;
    private int lebenserhaltungssystemeInProzent;
    private int androidenAnzahl;
    private String schiffsname;

    private int ladungsverzeichnis[];


    //Konstruktoren
    Raumschiff() {

    }

    Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildInProzent, int huelleInProzent, int lebenserhaltungssystemeInProzent, String schiffsname){
        this.energieversorgungInProzent = energieversorgungInProzent;
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
        this.schiffsname = schiffsname;
        this.huelleInProzent = huelleInProzent;
        this.schildInProzent = schildInProzent;
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
    }

    //Verwaltungsmethoden
    public int getPhotonentorpedoAnzahl() {
        return photonentorpedoAnzahl;
    }

    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
    }

    public int getEnergieversorgungInProzent() {
        return energieversorgungInProzent;
    }

    public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
        this.energieversorgungInProzent = energieversorgungInProzent;
    }

    public int getSchildInProzent() {
        return schildInProzent;
    }

    public void setSchildeInProzent(int schildInProzent) {
        this.schildInProzent = schildInProzent;
    }

    public int getHuelleInProzent() {
        return huelleInProzent;
    }

    public void setHuelleInProzent(int huelleInProzent) {
        this.huelleInProzent = huelleInProzent;
    }

    public int getLebenserhaltungssystemeInProzent() {
        return lebenserhaltungssystemeInProzent;
    }

    public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
        this.lebenserhaltungssystemeInProzent = lebeneserhaltungssystemInProzent;
    }

    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }

    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    public String getSchiffsname() {
        return schiffsname;
    }

    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    //Methoden
    public void addLadung(neueLadung:Ladung) {

    }

    public void photonentorpedoSchiessen (Raumschiff) {

    }
    private void treffer(Raumschiff r) {
    }

    public void nachrichtAnAlle(Raumschiff r) {
    }

    public static ArrayList<String> eintraegeLogbuchZurueckgeben = new ArrayList<String>();

    public void photonentorpedosLaden(int anzahlTorpedos) {
    }

    public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle,
                                      int anzahlDroiden) {
    }

    public void zustandRaumschiff() {
    }

    public void ladungsverzeichnisAusgeben() {
    }

    public void ladungsverzeichnisAufraeumen() {
    }

    @Override
    public String toString() {
        return "Raumschiff [photonentorpedoAnzahl=" + photonentorpedoAnzahl + ", energieversorgungInProzent="
                + energieversorgungInProzent + ", schildInProzent=" + schildInProzent + ", huelleInProzent="
                + huelleInProzent + ", lebenserhaltungssystemeInProzen=" + lebenserhaltungssystemeInProzent
                + ", androidenAnzahl=" + androidenAnzahl + ", schiffsname=" + schiffsname + ", ladungsverzeichnis="
                + ladungsverzeichnis + "]";
    }

}
