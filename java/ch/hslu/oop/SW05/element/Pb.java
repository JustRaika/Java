package ch.hslu.oop.SW05.element;

public class Pb extends Element {
    
    // Konstruktor: Ruft den Konstruktor der Oberklasse auf. Definiert die aktuelle Temperatur in Celsius.
    public Pb(int temperaturInCelsius) {
        super(temperaturInCelsius);
    }

    // Ruft die Methode der Oberklasse auf.
    @Override
    public String getState() {
        return defineState(327, 550);
    }
}
