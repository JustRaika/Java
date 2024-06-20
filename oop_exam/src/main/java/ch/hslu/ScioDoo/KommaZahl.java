package ch.hslu.ScioDoo;

public class KommaZahl {
    
    static int zähleKommaStellen(double zahl) {
        int kommastelle = 0;
        while (zahl - (int) zahl != 0) {
            zahl = zahl * 10;
            kommastelle++;
        }

        return kommastelle;
    }

    public static void main(String[] args) {
        System.out.println(zähleKommaStellen(22.55543));
    }

}
