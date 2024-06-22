package ch.hslu.oop.SW10.switchable;

import java.beans.PropertyChangeEvent; // Klasse
import java.beans.PropertyChangeListener; // Interface
import java.util.ArrayList; // Klasse
import java.util.List; // Interface

public final class Motor implements Switchable  {
    
    private int rmp;
    // Liste mit allen PropertyChangeListeners, die auf dem Motor registriert sind.
    private List<PropertyChangeListener> changeListeners = new ArrayList<>();

    //Konstruktor: Setzt den Motor auf ausgeschalten am Anfang.
    public Motor() {
        this.rmp = 0;
    }

    // Methode: Registriert einen PropertyChangeListener.
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) { // Wenn die Liste der Listener nicht null ist, dann...
            this.changeListeners.add(listener);
        }
    }

    // Methode: Deregistriert einen PropertyChangeListener.
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) { 
            this.changeListeners.remove(listener);
        }
    }

    // Methode: Informiert alle PropertyChangeListeners über einen PropertyChangeEvent. Private, damit andere Klassen das nicht firen können
    private void firePropertyChangeEvent(final PropertyChangeEvent event) { // Iterator: Event wird übergeben.
        for (final PropertyChangeListener listener : this.changeListeners) {  // Für jeden Listener in der Liste...
            listener.propertyChange(event);
        }
    }

    // Methode: if der Zustand des Motors is switchedOff, dann setzt Motor auf On (1200).
    @Override
    public void switchOn() {
        if (isSwitchedOff()) { // Aufruf der Methode isSwitchedOff() -> ist boolean, gibt also nur true/false zurück. Wenn sie wahr ist, dann...
            rmp = 1200;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "Zustand Motor", false, true);
            this.firePropertyChangeEvent(event);
        }
    }
    
    // Methode: if der Zustand des Motors is switchedOn, dann setzt Motor auf Off (0).
    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            rmp = 0;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "Zustand Motor", true, false);
            this.firePropertyChangeEvent(event);
        }
    }

    // Methode: Prüfen, ob der Motor an ist.
    @Override
    public boolean isSwitchedOn() {
        if (rmp > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Methode: Prüfen, ob der Motor aus ist.
    @Override
    public boolean isSwitchedOff() {
        if (rmp <= 0) {
            return true;
        } else {
            return false;
        }
    }
}