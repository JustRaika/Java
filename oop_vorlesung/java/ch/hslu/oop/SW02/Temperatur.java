package ch.hslu.oop.SW02;

public class Temperatur
{
    // Attribut: Speichert den Wert in Celsius (wenn man = weglässt und keinen Wert eingibt -> automatisch 0).
    public double temperaturInCelsius = 20;

    // Konstruktor: Aktiviert das Temperatur-Attribut.
    public Temperatur(final double temperaturInCelsius) {
        // Überschreiben des Wertes in der Anfangstemperatur, d.h. beim Erstellen vom Objekt eine neue Temperatur eingeben.
        this.temperaturInCelsius = temperaturInCelsius;
    }

    // Get-Methode der Klasse: Gibt den aktuellen Wert zurück, der in der Variable "temperaturInCelsius" gespeichert ist.
    public double gettemperaturInCelsius() {
        return temperaturInCelsius;
    }

    // Set-Methode der Klasse: Damit kann der gespeicherte Wert in der Variable wieder verändert werden, sofern gewünscht.
    public void settemperaturInCelsius(double temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }
    
    // Methode: Gibt den Temperaturwert in Kelvin heraus. 
    // @return Temperatur in Kelvin.
    public double ConvertC2K() {
        return temperaturInCelsius + 273.15;
    }
    
    // Methode: Gibt den Temperaturwert in Fahrenheit heraus. 
    // @return Temperatur in Fahrenheit.
    public double ConvertC2F() {
        return temperaturInCelsius * 1.8 + 32;
    }
    
    // Methode: Ändert den Temperaturwert um eine gewisse Zahl in Celsius. (+) positive Zahl -> wärmer, (-) negative Zahl -> kälter.
    // @param temperaturChangeInCelsius Speichert den veränderten Wert.
    public void ChangeTemperatur(final double temperaturChangeInCelsius) {
    this.temperaturInCelsius = temperaturInCelsius + temperaturChangeInCelsius;
    } 
}