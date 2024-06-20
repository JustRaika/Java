package ch.hslu.oop.SW04;

public final class Motor implements Switchable  {
    
    // privates Attribut -> bleibt nur in dieser Klasse sichtbar & veränderbar.
    private int rmp;

    //Konstruktor: Setzt den Motor auf ausgeschalten am Anfang.
    public Motor() {
        this.rmp = 0;
    }

    // Methode: if der Zustand des Motors is switchedOff, dann setzt Motor auf On (1200).
    @Override // Es braucht alle Methoden im Override, sonst funktioniert das implementierte Interface nicht!
    public void switchOn() {
        if (isSwitchedOff()) { // Aufruf der Methode isSwitchedOff() -> ist boolean, gibt also nur true/false zurück. Wenn sie wahr ist, dann...
            rmp = 1200;
        }
    }
    
    // Methode: if der Zustand des Motors is switchedOn, dann setzt Motor auf Off (0).
    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            rmp = 0;
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