package ch.hslu.oop.SW04;

public class Auto implements Switchable {
    
    private boolean ignition;

    // Konstruktor: Setzt das Auto auf ausgeschalten am Anfang.
    public Auto() {
        this.ignition = false;
    }

    // Methode: Schaltet die Zündung des Autos an.
    @Override
    public void switchOn() {
        if (isSwitchedOff()) { // Aufruf der Methode isSwitchedOff() -> ist boolean, gibt also nur true/false zurück. Wenn sie wahr ist, dann...
            ignition = true;
        }
    }
    
    // Methode: Schaltet die Zündung des Autos aus.
    @Override
    public void switchOff() { 
        if (isSwitchedOn()) {
            ignition = false;
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
}