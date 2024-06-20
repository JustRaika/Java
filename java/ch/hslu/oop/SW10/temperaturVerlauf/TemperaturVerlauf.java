package ch.hslu.oop.SW10.temperaturVerlauf;

import java.util.ArrayList; // Implmentierung einer dynamischen Liste
import java.util.Collection; // Interface
import java.util.Iterator; // Iterator (Interface)

public class TemperaturVerlauf {

    private Collection<Temperatur> temperaturVerlauf = new ArrayList<>(); // Liste mit allen Temperaturen
    private Collection<TemperaturMinChangeListener> minChangeListeners = new ArrayList<>();
    private Collection<TemperaturMaxChangeListener> maxChangeListeners = new ArrayList<>();

    private float minimaleTemperatur = Float.MAX_VALUE; // Gestartet wird mit dem Wert Float.MIN_VALUE = -3.4028235E38f. Beide Zahlen werden verglichen -> kleinste wird gespeichert. So mit allen Werten.
    private float maximaleTemperatur = Float.MIN_VALUE; // same wie oben, nur umgekehrt.

    // Konstruktor: ohne Parameter
    public TemperaturVerlauf() {
    }

    // Methode: Registriert einen TemperaturMinChangeListener.
    public void addTemperaturMinChangeListener(final TemperaturMinChangeListener minChangeListener) {
        if (minChangeListener != null) { // Wenn die Liste der Listener nicht leer ist, dann wird der Listener hinzugefügt.
            this.minChangeListeners.add(minChangeListener);
        }
    }

    // Methode: Deregistriert einen TemperaturMinChangeListener.
    public void removeTemperaturMinChangeListener(final TemperaturMinChangeListener minChangeListener) {
        if (minChangeListener != null) {
            this.minChangeListeners.remove(minChangeListener);
        }
    }

    // Methode: Informiert alle Listeners darüber, dass eine neue minimale Temperatur definiert wurde.
    private void fireTemperaturMinChangeEvent(TemperaturMinChangeEvent minChangeEvent) {
        for (final TemperaturMinChangeListener minChangeListener : this.minChangeListeners) {
            minChangeListener.temperaturMinChangePerformed(minChangeEvent);
        }
    }

    // Methode: Registriert einen TemperaturMaxChangeListener.
    public void addTemperaturMaxChangeListener(final TemperaturMaxChangeListener maxChangeListener) {
        if (maxChangeListener != null) {
            maxChangeListeners.add(maxChangeListener);
        }
    }

    // Methode: Deregistriert einen TemperaturMaxChangeListener.
    public void removeTemperaturMinChangeListener(final TemperaturMaxChangeListener maxChangeListener) {
        if (maxChangeListener != null) {
            maxChangeListeners.remove(maxChangeListener);
        }
    }

    //Methode: Informiert alle Listeners darüber, dass eine neue maximale Temperatur definiert wurde.
    public void fireTemperaturMaxChangeEvent(TemperaturMaxChangeEvent maxChangeEvent) {
        for (TemperaturMaxChangeListener maxChangeListener : this.maxChangeListeners) {
            maxChangeListener.temperaturMaxChangePerformed(maxChangeEvent);
        }
    }

    // Methode: Fügt eine Temperatur der Liste hinzu. Prüft zuerst, on grösser/kleiner als bisherige max/min Temperaturen.
    public void add(Temperatur temperatur) {
        temperaturVerlauf.add(temperatur); // Temperatur wird zur Collection Temperaturverlauf hinzugefügt.
        if (temperatur.getTemperaturInCelsius() < minimaleTemperatur) { // Wenn die neue Temperatur kleiner ist als die bisherige minimale Temperatur, dann -> Wert hier ersetzt.
            final TemperaturMinChangeEvent minChangeEvent = new TemperaturMinChangeEvent(this, this.minimaleTemperatur, temperatur.getTemperaturInCelsius()); // Erstellt ein neues MinChangeEventObjekt und erbt dabei von EventObject = Event wird erstellt.
            this.minimaleTemperatur = temperatur.getTemperaturInCelsius(); // minimale Temperatur wird ersetzt auf dem TemperaturverlaufObjekt.
            this.fireTemperaturMinChangeEvent(minChangeEvent); // Event wird ausgelöst.
        }
        if (temperatur.getTemperaturInCelsius() > maximaleTemperatur) {
            final TemperaturMaxChangeEvent maxChangeEvent = new TemperaturMaxChangeEvent(this, this.maximaleTemperatur, temperatur.getTemperaturInCelsius());
            this.maximaleTemperatur = temperatur.getTemperaturInCelsius();
            this.fireTemperaturMaxChangeEvent(maxChangeEvent);
        }
    }

    // Methode: Gibt die gesamte Anzahl Temperaturwerte in der Liste zurück.
    public int getCount() {
        return temperaturVerlauf.size();
    }

    // Methode: Gibt den tiefsten Temperaturwert aus der Liste als Float.
    public float getMin() {
        return minimaleTemperatur;
    }

    // Methode: Gibt den höchsten Temperaturwert aus der Liste als Float.
    public float getMax() {
        return maximaleTemperatur;
    }

    // Methode: Gibt die Durchschnittstemperatur aller in der Liste enthaltenen Temperaturen.
    public float getAvg() {
        float avgCelsius = Float.MIN_VALUE; // Variable 
        if (temperaturVerlauf.size() > 0) { // prüft, ob die Liste mehr als 0 Objekte hat
            float temperaturen = 0;
            Iterator<Temperatur> iterator = temperaturVerlauf.iterator();
            while (iterator.hasNext()) {
                final Temperatur t = iterator.next();
                temperaturen += t.getTemperaturInCelsius();
            }
            avgCelsius = temperaturen / temperaturVerlauf.size();
        }
        return avgCelsius;
    }

    public String toString() {
        return "\n Anzahl Temperaturpunkte: " + this.getCount()
                + "\n Durchschnittstemperatur: " + this.getAvg()
                + "\n Minimale Temperatur: " + this.getMin()
                + "\n Maximale Temperatur: " + this.getMax();
    }
}
