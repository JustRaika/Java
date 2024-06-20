package ch.hslu.MEP;

import java.util.Objects;

public final class Fahrrad implements Gewichtable {

    // accessing private attibute of different class
    private final Rahmen rahmen;
    private String model;
    private double gewicht;
    
    public Fahrrad(Rahmen rahmen, String model) {
        // wenn Model null, leer oder länger als 23 Zeichen...
        if (model == null || model.isEmpty() || model.length() > 23) {
            throw new IllegalArgumentException("Model darf nicht null, leer oder länger als 23 Zeichen sein.");
        }

        this.rahmen = rahmen;
        this.model = model;
    }

    // nur get-Methode, damit man das final Attribut nicht neu setzen kann.
    public Rahmen getRahmen() {
        return this.rahmen;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public double getGewichtInKg() {
        return this.gewicht;
    }

    @Override
    public String toString() {
        return "Fahrrad [Model: " +model+ ", Anzahl der Balken im Rahmen: " + rahmen.getAnzahlBalken() + "]";
    }

    // prüft, dass 2 Objekte gleich sind, wenn Attribut "model" und das enthaltene Objekt "rahmen" gleich sind.
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Fahrrad other = (Fahrrad) object;
        return model.equals(other.model) && rahmen.equals(other.rahmen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, rahmen);
}

}

