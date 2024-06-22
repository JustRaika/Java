package ch.hslu.oop.SW05.element;

public class N extends Element {
    
    // Konstruktor: Ruft den Konstruktor der Oberklasse auf. Definiert die aktuelle Temperatur in Celsius.
    public N(int temperaturInCelsius) {
        super(temperaturInCelsius);
    }

    // Ruft die Methode der Oberklasse auf.
    @Override
    public String getState() {
        return defineState(-210.1F, -196);
    }
}
