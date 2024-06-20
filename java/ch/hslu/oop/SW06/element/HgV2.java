package ch.hslu.oop.SW06.element;

public class HgV2 extends ElementV2 {
    
    // Konstruktor: Ruft den Konstruktor der Oberklasse auf. Definiert die aktuelle Temperatur in Celsius.
    public HgV2(int temperaturInCelsius) {
        super(temperaturInCelsius);
    }

    // Ruft die Methode der Oberklasse auf.
    @Override
    public String getState() {
        return defineState(-38, 357);
    }

    //Überschriebene Methode als String im 
    @Override
    public String toString() {
        return super.toString() + ", Warnhinweis: GIFTIG";
    }
}