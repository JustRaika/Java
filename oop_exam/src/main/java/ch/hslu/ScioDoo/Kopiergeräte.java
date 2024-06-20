package ch.hslu.ScioDoo;

public class Kopiergeräte {
    
    int papieranzahl;
    int kopiervorgänge;
    String kopiergerät;
    static int kopierGeräteAnzahl;
    static int kopiervorgängeAlle;
    static int papieranzahlAlle;

    public Kopiergeräte(String kopiergerät){
        this.kopiergerät = kopiergerät;
        kopierGeräteAnzahl = kopierGeräteAnzahl + 1;
    }

    public void kopierePapier (int papieranzahl) {
        this.papieranzahl = this.papieranzahl + papieranzahl;
        this.kopiervorgänge = kopiervorgänge + 1;
        kopiervorgängeAlle = kopiervorgängeAlle + 1;
        scannInfos(papieranzahl);
    }

    void scannInfos(int papieranzahl) {
        System.out.println("Scanner: " +kopiergerät);
        System.out.println("Summe Papieranzahl: " +papieranzahl);
        System.out.println("Anzahl Scan: " +kopiervorgänge);
        // Hier werden int/int geteilt. UmmKOmmazahlen zu erhalten, muss auf double gecastet werden.
        System.out.println("Durchschnitt Anzahl je Vorgang: "+(double)papieranzahl/(double)kopiervorgänge);
        System.out.println("");
    }
}
