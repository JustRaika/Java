package ch.hslu.oop.SW10.temperaturVerlauf;

import java.util.EventObject;

/**
 * Wieso zwei verschiedene Klassen für Min und Max? Eine Klasse für eine Funktionalität. So weiss man genau, 
 * welche Klasse was genau macht und sind auch einzeln austaschbar/wiederverwendbar.
 * Struktur sieht so aus: EventObject -> TemperaturMinChangeEvent -> TemperaturVerlauf
 * Struktur ist so sauberer.
 */
public class TemperaturMinChangeEvent extends EventObject {

    private final float oldValue;
    private final float newValue;

    // Konstruktor: Nimmt 3 Parameter entgegen.
    public TemperaturMinChangeEvent(Object source, float oldValue, float newValue) {
        super(source); // Das Objekt, dass das Ereignis ausgelöst hat. 
        this.oldValue = oldValue; // Der alte Max-Wert wird gespeichert. -> von was? Celsius? Kelvin? -> lieber gleich Temperatur-Objekt!
        this.newValue = newValue; // Der neue Max-Wert wird gespeichert.
    }

     // Getter: Gibt den alten Max-Wert zurück.
    public float getOldValue() {
        return this.oldValue;
    }

    // Getter: Gibt den neuen Max-Wert zurück.
    public float getNewValue() {
        return this.newValue;
    }
}
