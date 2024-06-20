package ch.hslu.oop.SW10.switchable;

import java.beans.PropertyChangeEvent; // Klasse
import java.beans.PropertyChangeListener; // Interface
import org.slf4j.LoggerFactory; // Erstellt einen Logger
import org.slf4j.Logger; // Generiert Logger-Nachrichten

// PropertyChangeListener ist ein Interface von Java selbst. Das Objekt Auto registriert sich damit als Listener.
public class Auto implements Switchable, PropertyChangeListener {

    // Statischer Logger für die Klasse Auto
    private static final Logger LOGGER = LoggerFactory.getLogger(Auto.class);
    
    private boolean ignition; // Zündung
    private final Motor motor; // Referenz auf das Objekt Motor der Klasse Motor -> nur innerhalb Auto sichtbar.

    // Konstruktor: Setzt das Auto auf ausgeschalten am Anfang.
    public Auto() {
        this.ignition = false;
        this.motor = new Motor();
        this.motor.addPropertyChangeListener(this); // Die Methode wird auf dem Motor-Objekt aufgerufen. Dabei this = Auto-Objekt.
    }

    // Methode: Schaltet die Zündung und den Motor des Autos an.
    @Override
    public void switchOn() {
        if (isSwitchedOff()) { // Aufruf der Methode isSwitchedOff() -> ist boolean, gibt also nur true/false zurück. Wenn sie wahr ist, dann...
            ignition = true;
            this.motor.switchOn();
        }
    }
    
    // Methode: Schaltet die Zündung des Autos aus.
    @Override
    public void switchOff() { 
        if (isSwitchedOn()) {
            ignition = false;
            this.motor.switchOff();
        }
    }

    // Methode: Prüfen, ob das Auto an ist.
    @Override
    public boolean isSwitchedOn() {
        return ignition;
    }

    // Methode: Prüfen, ob das Auto aus ist.
    @Override
    public boolean isSwitchedOff() {
        return !ignition;
    }

    @Override // !!muss überschrieben werden, da Auto das Interface PropertyChangeListener implementiert.
    public void propertyChange(PropertyChangeEvent event) {
        if (event.getSource() == this.motor) { // Überprüft, ob das Event vom Motor kommt.
            LOGGER.info("Der Zustand des Motors wurde geändert von " + event.getOldValue() + " auf " + event.getNewValue());
        }
    }
}