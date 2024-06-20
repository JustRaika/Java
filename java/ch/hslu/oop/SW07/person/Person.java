package ch.hslu.oop.SW07.person;

import java.util.Objects; // enthält Hilfsmethoden für die Arbeit mit Objekten, wie z.B Berechnung des Hashcodes.

// comparable<...> ist ein Interface von Java selbst. Nicht zu verwevhseln mit Comparator!
public final class Person implements Comparable<Person> {
    
    private final long id;
    private String vorname;
    private String nachname;
    
    
    /**
     * Initialisiert ein neues Personenobjekt
     * @param id Eindeutige Identifikationsnummer
     * @param vorname Vorname der Person
     * @param nachname Nachname der Peson
     */
    // Konstruktor: Initialisiert eine Instanz der Personen-Klasse mit den übergebenen Parametern.
    public Person(final long id, final String vorname, final String nachname) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    // toString() ist eine Methode von der Object-Class. Würden wir diese Methode nicht überschreiben und ein Object der Klasse generieren,
    // würde es uns den Hashcode des Objekts zurückgeben. Wir wollen aber den Inhalt des Strings wissen.
    // Methode: Gibt die ID, den Vornamen, Nachnamen und de Hash des Objekts (also der Person)
    @Override
    public String toString() {
        return "ID: " + this.id + ", Vorname: " + this.vorname + ", Nachname: " + this.nachname + ", Hash: ";
    }

    /**
     * Vergleicht zwei Objekte, sagt, ob sie gleich sind. 
     * @param object Zu vergleichendes Objekt
     * @return true für gleich, false für ungleich
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person)) {
            return false;
        }
        final Person other = (Person) object;
        return (other.id == this.id);
    }
    
    // Definiert den Hash-Wert eines Objekts. Hash von zwei Objekten ist gleich falls sie nach equals() gleich sind. Gibt Hash-Wert des Objekts zurück.
    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    /**
     * Vergleicht zwei Personen Objekte nach der natürlichen Ordnung
     * @param other Personenobjekt
     * @return Vergleich
     */
    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }
}