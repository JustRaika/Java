package ch.hslu.ScioDoo;

public class Rechteck {

    // statische Methoden: Vorteil, dass kein Objekt angelegt werden muss
    static void berechneFläche(double breite) {
        System.out.println("Der Flächeninhalt beträgt "+ (breite*breite));
    }

    // beide Methoden haben gleichen Namen, aber untercshiedliche Parameter. D.h sie sind überladen.
    static void berechneFläche(double breite, double länge) {
        System.out.println("Der Flächeninhalt beträgt "+ (länge*breite));
    }

    public static void main(String[] args) {
        berechneFläche(22.5);
        berechneFläche(49,17.5);
    }

}
