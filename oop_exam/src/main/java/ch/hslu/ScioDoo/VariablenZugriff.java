package ch.hslu.ScioDoo;

public class VariablenZugriff {

    int zaehlerInstanz; //Instanzvariable. Jedes Objekt erbt diese Variablen, d.h sie existiert auf jedem Objekt (d.h. mehrmals)
    static int zaehlerKlasse; //Klassenvariable. Existiert pro Klasse nur 1x. Wenn ein Objekt diesen Wert ändert, ändert es für ganze Klasse.

    public VariablenZugriff() {
        zaehlerInstanz = zaehlerInstanz+1;
        zaehlerKlasse = zaehlerKlasse+1;
    }

    int zaehleInstanz() {
        return zaehlerInstanz;
    }

    static int zaehleKlasse() {
        return zaehlerKlasse;
    }

    public static void main(String[] args) {
        VariablenZugriff zaehlerEins = new VariablenZugriff();
        VariablenZugriff zaehlerZwei = new VariablenZugriff();
        System.out.println(zaehlerEins.zaehleInstanz());
        System.out.println(zaehlerZwei.zaehleInstanz());
        System.out.println(zaehleKlasse());
    }
}
