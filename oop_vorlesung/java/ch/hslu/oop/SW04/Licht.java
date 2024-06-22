package ch.hslu.oop.SW04;

public class Licht implements Switchable {
    
    private boolean light;

    // Konstruktor: Setzt das Licht auf ausgeschalten am Anfang.
    public Licht() {
        this.light = false;
    }

    // Methode: Schaltet das Licht des Autos an.
    @Override
    public void switchOn() {
        if (isSwitchedOff()) { // Aufruf der Methode isSwitchedOff() -> ist boolean, gibt also nur true/false zurück. Wenn sie wahr ist, dann...
            light = true;
        }
    }
    
    // Methode: Schaltet das Licht des Autos aus.
    @Override
    public void switchOff() { 
        if (isSwitchedOn()) {
            light = false;
        }
    }

    // Methode: Prüfen, ob das Licht an ist.
    @Override
    public boolean isSwitchedOn() {
        return light;
    }

    // Methode: Prüfen, ob das Licht aus ist.
    @Override
    public boolean isSwitchedOff() {
        return !light;
    }
}