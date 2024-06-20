package ch.hslu.oop.SW05.element;

public abstract class Element {

    private int temperaturInCelsius;

    // Konstruktor: Speichert den Temperaturwert eines Elementes.
    public Element(int temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }

    // Getter-Methode: Gibt den aktuellen Aggregatszustand für ein Element.
    public abstract String getState();

    public String defineState(float fest, float gas) {
        String zustand = null;
        if (temperaturInCelsius <= fest) {
            zustand = "fest";
        } else if (temperaturInCelsius >= gas) {
            zustand = "gasförmig";
        } else {
            zustand = "flüssig";
        }
        return zustand;
    }
}
