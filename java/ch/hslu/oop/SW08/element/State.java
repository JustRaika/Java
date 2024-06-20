package ch.hslu.oop.SW08.element;

// Spezielle Klasse: Enum ist von Java und ist immer eine Extension in der eigenen Klasse, wenn wir es brauchen.
public enum State {
    
    // Instanzvariablen: Aggregatszustände
    SOLID("fest"), LIQUID("flüssig"), GAS("gasförmig");
    
    // Beschreibung des Aggregatszustandes
    private final String stateDescription;
    
    // Konstruktor für Enumeration.Einfache Beschreibung des Zustands.
    private State(String description) {
        this.stateDescription = description;
    }
    
    // Methode: Gibt den Zustand zurück.
    public String getStateDescription() {
        return stateDescription;
    }
}