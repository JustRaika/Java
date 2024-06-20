package ch.hslu.ScioDoo;

public class MainNutzerEingaben {
    
    public static void main(String[] args) {
        NutzerEingaben nutzer = new NutzerEingaben();
        nutzer.setGeburtsJahr(1899);
        // Ausgabe ist 0. Wieso? Weil default Wert von int 0 ist. D.h ihr wurde kein Wert zugewiesen.

        System.out.println(nutzer.getGeburtsJahr());
    }

}
