package ch.hslu.MEP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

public class RahmenTest {

    // Testet Default Konstruktor mit Wert 2.
    @Test
    public void KonstruktorMitDefaultWert() {
        Rahmen rahmen = new Rahmen();
        assertEquals(2, rahmen.getAnzahlBalken());
    }

    // Testet gesetzten Wert
    @Test
    public void KonstruktorMitGesetztemWert() {
        Rahmen rahmen = new Rahmen(3);
        assertEquals(3, rahmen.getAnzahlBalken());
    }

    // Testet equals, ob 2 Objekte gleich von equals betrachtet werden.
    @Test
    public void testEqual() {
        Rahmen rahmen1 = new Rahmen(3);
        Rahmen rahmen2 = new Rahmen(3);
        assertEquals(true, rahmen1.equals(rahmen2));
    }

    // Testet ob 2 Objekte als ungleich betrachtet von equals
    @Test
    public void testUnequal() {
        Rahmen rahmen1 = new Rahmen(3);
        Rahmen rahmen2 = new Rahmen(4);
        assertEquals(false, rahmen1.equals(rahmen2));
    }

    @Disabled
    void testequalsVerifier() {
        EqualsVerifier.forClass(Rahmen.class).verify();
    }
}
