package ch.hslu.ScioDoo;

public class Farbscanner {

    int papieranzahl; // Objektvariable
    int scanvorgänge; // Objektvariable
    String scannergerät; // Instanzvariable
    static int scannerGeräteAnzahl; // static, weil nicht gerätespezifisch.
    static int scanvorgängeAlle;
    static int papieranzahlAlle;

    public Farbscanner(String scannergerät) {
        this.scannergerät = scannergerät;
        scannerGeräteAnzahl = scannerGeräteAnzahl + 1;
    }

    public void scannePapier (int papieranzahl) {
        this.papieranzahl = this.papieranzahl + papieranzahl;
        this.scanvorgänge = scanvorgänge + 1;
        scanvorgängeAlle = scanvorgängeAlle + 1;
        scannInfos(papieranzahl);
    }

    void scannInfos(int papieranzahl) {
        System.out.println("Scanner: " +scannergerät);
        System.out.println("Summe Papieranzahl: " +papieranzahl);
        System.out.println("Anzahl Scan: " +scanvorgänge);
        System.out.println("Durchschnitt Anzahl je Vorgang: "+(double)papieranzahl/(double)scanvorgänge);
        System.out.println("");
    }
}
