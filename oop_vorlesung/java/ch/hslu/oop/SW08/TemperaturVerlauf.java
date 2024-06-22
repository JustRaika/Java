package ch.hslu.oop.SW08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TemperaturVerlauf {
    
    //Sammlung von Temperaturobjekten, initialisiert als ArrayList.
    private Collection<Temperatur> temperaturVerlauf = new ArrayList<>();
    
    //Variabeln um die bisherigen Minimal- und Maximalwerte zu speichern.
    private float minimaleTemperatur = Float.MAX_VALUE;
    private float maximaleTemperatur = Float.MIN_VALUE;
    
    // Standardkonstruktor
    public TemperaturVerlauf() {
    }
    
    // Add-Methode um eine Temperatur der Liste hinzuzufügen. Aktualisiert auch die Minimal- und Maximalwerte.
    public void add(Temperatur temperatur) {
        if (temperatur.getTemperaturInCelsius() < minimaleTemperatur) {
            this.minimaleTemperatur = temperatur.getTemperaturInCelsius();
        } 
        if (temperatur.getTemperaturInCelsius() > maximaleTemperatur) {
            this.maximaleTemperatur = temperatur.getTemperaturInCelsius();
        }
        temperaturVerlauf.add(temperatur);
    }
    
    // Clear-Methode um alle Temperaturen aus der Liste zu entfernen.
    public void clear() {
        temperaturVerlauf.clear();
    }
    
    // Count-Methode um die Anzahl Temperaturen in der Liste zu erhalten.
    public int getCount() {
        return temperaturVerlauf.size();
    }
    
    // Min-Methode. Gibt den tiefsten Temperaturwert aus der Liste als Float.
    public float getMin() {
        return minimaleTemperatur;
    }
    
    // Max-Methode. Gibt den höchsten Temperaturwert aus der Liste als Float.
    public float getMax() {
        return maximaleTemperatur;
    }
    
    // Avg-Methode. Gibt die Durchschnittstemperatur aller in der Liste erhaltenen Temperaturen.
    public float getAvg() {
        float avgCelsius = Float.MIN_VALUE; // Hier wird die Variable avgCelsius initialisiert und auf Float.MIN_VALUE gesetzt. -> vorläufige Zuweisung, wird später aktualisiert!
        if (temperaturVerlauf.size() > 0) { // Überprüft ob die Liste nicht leer ist. Wenn nicht leer, wird der Code ausgeführt.
            float temperaturen = 0; // Variable temperaturen erstellt und auf 0 gesetzt. Wird verwendet, um die Summe zu berechnen.
            Iterator<Temperatur> iterator = temperaturVerlauf.iterator(); // Erstellung eines Iterators, um durch die Liste zu iterieren. Ermöglicht Zugriff auf die Elemente.
            while (iterator.hasNext()) { // Solange es noch ein nächstes Element gibt, wird der Code ausgeführt.
                final Temperatur t = iterator.next(); // Das nächste Element aus der Liste wird abgerufen und in der Variable t gespeichert. Jetzt kann es nicht mehr geändert werden.
                temperaturen += t.getTemperaturInCelsius(); // Die Temperaturen des aktuellen Objekts t wird zur Gesamtsumme "temperaturen" hinzugefügt
            }
            avgCelsius = temperaturen / temperaturVerlauf.size(); // Berechnet Durchschnitt der Temperturen.
        }
        return avgCelsius;
    }
}