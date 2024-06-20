package ch.hslu.oop.SW08.element;

public abstract class Element {

    private int temperaturInCelsius;

    // Konstruktor: Initialisiert die Instanzvariable (also den Temperaturwert eines Elements)
    public Element(int temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }

    // Abstrakte Methode: Gibt den Aggregatszustand für eine Element zurück.
    public abstract String getState();
    
    // Methode: Definiert den Aggregatszustand für ein Element.
    public String defineState(float fest, float gas) {
        State zustand = null;
        if (temperaturInCelsius <= fest) {
            zustand = State.SOLID;
        } else if (temperaturInCelsius >= gas) {
            zustand = State.GAS;
        } else {
            zustand = State.LIQUID;
        }
        return "ist bei " + temperaturInCelsius + " °C " + zustand.getStateDescription();
    }

    // Überschriebene Methode: Gibt den Zustand des Elements zurück.
    @Override
    public String toString() {
        return "Temperatur des Elements in Celsius: " + temperaturInCelsius;
    }
}