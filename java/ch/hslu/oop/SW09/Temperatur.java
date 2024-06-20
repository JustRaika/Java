package ch.hslu.oop.SW09;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {

    public enum TemperaturTyp {
        CELSIUS, KELVIN;
    }
    
    private float temperaturInCelsius;
    private final static float KELVIN_OFFSET = 273.15F;
    
    public Temperatur(final float temperatur, final TemperaturTyp temperaturTyp) {
        switch(temperaturTyp) {
            case CELSIUS:
                if (temperatur >= -KELVIN_OFFSET) {
                    this.temperaturInCelsius = temperatur;
                } else {
                    throw new IllegalArgumentException("Der Temperaturwert ist zu niedrig/physikalisch nicht möglich.");
                }
                break;
            case KELVIN:
                if (temperatur >= 0) {
                    this.temperaturInCelsius = Temperatur.convertKelvinToCelsius(temperatur);
                } else {
                    throw new IllegalArgumentException("Der Temperaturwert ist zu niedrig/physikalisch nicht möglich.");
                }
                break;
            default:
                this.temperaturInCelsius = 20F;
        }
    }
    
    private Temperatur(final float temperaturInCelsius){
        if (temperaturInCelsius >= -KELVIN_OFFSET) {
            this.temperaturInCelsius = temperaturInCelsius;
        } else {
            throw new IllegalArgumentException("Der Temperaturwert ist zu niedrig/physikalisch nicht möglich.");
        }
    }
    
    public static Temperatur createFromCelsius(final float temperaturInCelsius) {
        return new Temperatur(temperaturInCelsius);
    }
    
    public static Temperatur createFromKelvin(final float temperaturInKelvin) {
        return new Temperatur(Temperatur.convertKelvinToCelsius(temperaturInKelvin));
    }

    public float getTemperaturInCelsius() {
        return temperaturInCelsius;
    }
    
    public float getTemperaturInKelvin() {
        return Temperatur.convertCelsiusToKelvin(temperaturInCelsius);
    }
    
    public float getTemperaturInFahrenheit() {
        return temperaturInCelsius * 1.8F + 32;
    }
    
    public static float convertCelsiusToKelvin(float temperaturInCelsius) {
        return temperaturInCelsius + KELVIN_OFFSET;
    }
    
    public static float convertKelvinToCelsius(float temperaturInKelvin) {
        return temperaturInKelvin - KELVIN_OFFSET;
    }
    
    @Override
    public String toString() {
        return "Temperatur in Celsius: " + temperaturInCelsius + "°C " + ", Hash: " + this.hashCode();
    }
    
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
    
    @Override
    public int hashCode() {
        return Objects.hash(this.temperaturInCelsius);
    }

    @Override
    public int compareTo(Temperatur other) {
        return Float.compare(this.temperaturInCelsius, other.temperaturInCelsius);
    }
}