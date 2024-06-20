package ch.hslu.ScioDoo;

public class GeradeZahlen {
    
    // static bewirkt, dass es eine Klassenmethode wird.
    // Klassenmethode = z.B Auto hat 4 Räder. Class Auto hat immer 4 Räder. -> kann ich main als AnzahlRäder(); aufgerufen werden.
    // Objektmethode = z.B Farbe. Nicht jedes Auto von class Auto hat gleiche Farbe. -> muss auf Objekt aufgerufen werden als auto.farbe();
    public static void prüfeZahl(int zahl) {
        if (zahl % 2 == 0) {
            System.out.println("Zahl ist gerade");
        } else {
            System.out.println("Zahl ist ungerade.");
        }
    }

    public static void main(String[] args) {
        prüfeZahl(2);
        prüfeZahl(1);
        prüfeZahl(3);
    }
}
