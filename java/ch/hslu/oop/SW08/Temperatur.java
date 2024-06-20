package ch.hslu.oop.SW08;

import java.util.Objects;

// Anderes Beispiel wie die Temperaturkalsse aufgebaut sein kann
public final class Temperatur implements Comparable<Temperatur> {

    private float temperaturInCelsius;
    
     // Statische Klassenvariable für die Umrechnung zwischen Celsius und Kelvin.
    private final static float KELVIN_OFFSET = 273.15F;
    
    // Konstruktor. Initialisiert Temperaturwert.
    public Temperatur(final float temperaturInCelsius){
        this.temperaturInCelsius = temperaturInCelsius;
    }

    // Getter-Methode für den Temperaturwert.
    public float getTemperaturInCelsius() {
        return temperaturInCelsius;
    }
    // Setter-Methode für den Temperaturwert.
    public void setTemperaturInCelsius(final float temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }
    
    // Gibt den Temperaturwert in Kelvin zurück.
    public float getTemperaturInKelvin() {
        return this.convertCelsiusToKelvin(temperaturInCelsius);
    }
    
    // Gibt den Temperaturwert in Fahrenheit zurück
    public float getTemperaturInFahrenheit() {
        return temperaturInCelsius * 1.8F + 32;
    }
    
    // Ändert den Temperaturwert um einen Wert in Celsius.
    public void changeTemperaturWithCelsius(final float temperaturChangeInCelsius) {
        this.temperaturInCelsius += temperaturChangeInCelsius;
    }
    
    // Ändert den Temperaturwert um einen Wert in Kelvin.
    public void changeTemperaturWithKelvin(final float temperaturChangeInKelvin) {
        this.temperaturInCelsius += temperaturChangeInKelvin;
    }

    // Konvertiert die mitgegeben Temperatur von Celsius nach Kelvin.
    public float convertCelsiusToKelvin(float temperaturInCelsius) {
        return temperaturInCelsius + KELVIN_OFFSET;
    }
    
    /**
     * Konvertiert die mitgegeben Temperatur von Kelvin nach Celsius.
     * @param temperaturInKelvin Temperatur in Kelvin
     * @return Temperatur in Celsius
     */
    public static float convertKelvinToCelsius(float temperaturInKelvin) {
        return temperaturInKelvin - KELVIN_OFFSET;
    }
    
    @Override
    public String toString() {
        return "Temperatur in Celsius: " + temperaturInCelsius + "°C " + ", Hash: " + this.hashCode();
    }
    
    /**
     * Definiert die Gleichheit zwischen zwei Objekten.
     * @param object Zu vergleichendes Objekt
     * @return true für gleich, false für ungleich
     */
    @Override
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Temperatur)) {
            return false;
        }
        final Temperatur other = (Temperatur) object;
        return Objects.equals(this.temperaturInCelsius, other.temperaturInCelsius);
    }
    
    /**
     * Definiert den Hash-Wert eines Objekts.
     * Hash von zwei Objekten ist gleich falls sie nach equals() gleich sind
     * @return Hash-Wert eines Objekts
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.temperaturInCelsius);
    }

    /**
     * Vergleicht zwei Personen Objekte nach der natürlichen Ordnung
     * @param other Personenobjekt
     * @return Vergleich
     */
    @Override
    public int compareTo(Temperatur other) {
        return Float.compare(this.temperaturInCelsius, other.temperaturInCelsius);
    }
}