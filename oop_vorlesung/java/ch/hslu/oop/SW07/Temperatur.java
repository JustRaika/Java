package ch.hslu.oop.SW07;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {
    
    private double temperaturInCelsius = 20;

    public Temperatur(final double temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }

    public double gettemperaturInCelsius() {
        return temperaturInCelsius;
    }

    public void settemperaturInCelsius(double temperaturInCelsius) {
        this.temperaturInCelsius = temperaturInCelsius;
    }
    
    public double ConvertC2K() {
        return temperaturInCelsius + 273.15;
    }

    public double ConvertC2F() {
        return temperaturInCelsius * 1.8 + 32;
    }
    
    public void ChangeTemperatur(final double temperaturChangeInCelsius) {
    this.temperaturInCelsius = temperaturInCelsius + temperaturChangeInCelsius;
    } 

    @Override
    public String toString() {
        return "Aktuelle Temperatur in Celsius: " + this.temperaturInCelsius + "";
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
       return Double.compare(this.temperaturInCelsius, other.temperaturInCelsius);
    }
}  