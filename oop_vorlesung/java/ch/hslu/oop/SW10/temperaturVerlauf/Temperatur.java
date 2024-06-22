package ch.hslu.oop.SW10.temperaturVerlauf;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {

    private float temperaturInCelsius;
    // Statische Klassenvariable
    private final static float KELVIN_OFFSET = 273.15F;

    // Konstruktor: private, damit andere Klassen nicht darauf zugreifen können und die createFromCelsius Methode verwenden müssen.
    private Temperatur(final float temperaturInCelsius) {
        if (temperaturInCelsius >= -KELVIN_OFFSET) {
            this.temperaturInCelsius = temperaturInCelsius;
        } else {
            throw new IllegalArgumentException("Der Temperaturwert ist zu niedrig/physikalisch nicht möglich.");
        }
    }

    // Statische Methode: Erzeugt ein Temperaturobjekt aus einem Celsius Wert.
    public static Temperatur createFromCelsius(final float temperaturInCelsius) {
        return new Temperatur(temperaturInCelsius);
    }

    public float getTemperaturInCelsius() {
        return temperaturInCelsius;
    }

    @Override
    public String toString() {
        return "Temperatur in Celsius: " + temperaturInCelsius + "°C " + ", Hash: " + this.hashCode();
    }

    // Methode: Überprüft ob zwei Objekte gleich sind.
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

    // Methode: Definiert den Hash-Wert des Temperatur-Objekts.
    @Override
    public int hashCode() {
        return Objects.hash(this.temperaturInCelsius);
    }

    // Methode: Vergleicht zwei Temperatur-Objekte. Gibt -1 zurück, wenn das erste Objekt eine kleinere float-Zahl hat.
    // Gibt 0 zurück, wenn beide Objekte gleich sind. Gibt 1 zurück, wenn das erste Objekt eine grössere float-Zahl hat.
    @Override
    public int compareTo(Temperatur other) {
        return Float.compare(this.temperaturInCelsius, other.temperaturInCelsius);
    }
}