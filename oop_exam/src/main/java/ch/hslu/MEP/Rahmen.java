package ch.hslu.MEP;

import java.util.Objects;

public final class Rahmen {

    private int balken;

    // Default Konstruktor
    public Rahmen() {
        this.balken = 2;
    }

    // Überladener Konstruktor, wo man einen Wert mitgeben kann.
    public Rahmen(int balken) {
        this.balken = balken;

    }

    public int getAnzahlBalken() {
        return this.balken;
    }

    public void setAnzahlBalken(final int balken) {
        this.balken = balken;
    }
    
    @Override
    public String toString() {
        return "Rahmen [Anzahl der Balken: " + balken + "]";
    }

    @Override
    public boolean equals(final Object object) {
        if (object == this)
        return true;

        // prüft auf Wertegleichheit
        return (object instanceof Rahmen) 
        && ((Rahmen) object).balken == this.balken;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.balken);
    }
}
