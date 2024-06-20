package ch.hslu.oop.SW08.element;

public class Blei extends Element {

    // Konstruktor der Oberklasse: Celsius Wert für Initialisierung
    public Blei(int temperaturInCelsius) {
        super(temperaturInCelsius);
    }

    // Überschriebene Methode: Gibt den Zustand des Elements zurück.
    @Override
    public String getState() {
        String state = defineState(327, 550);
        return "Blei " + state;
    }
}