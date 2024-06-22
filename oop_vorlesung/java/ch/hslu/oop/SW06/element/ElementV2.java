package ch.hslu.oop.SW06.element;

public abstract class ElementV2 {

    private int temperaturInCelsius;

    // Konstruktor: Speichert den Temperaturwert eines Elementes.
    public ElementV2(int temperaturInCelsius) {
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

    // Methode: Gibt den aktuellen Zustand des Elements zurück.
    @Override
    public String toString() {
        return "Temperatur des Elements in Celsius: " + temperaturInCelsius;
    }
}