package ch.hslu.MEP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class FahrradTest {

    // Testet, ob bei der Erstellung eines Objektes in Fahrrad auch ein Objekt in Rahmen erstellt wurde.
    @Test
    public void testRahmenObjektErstellung() {
        Rahmen rahmen = new Rahmen();
        Fahrrad fahrrad = new Fahrrad(rahmen, "NextBike");
        
        assertNotNull(fahrrad.getRahmen());
    }

    // Wird String korrekt gesetzt?
    @Test
    public void testModelSetzen() {
        Rahmen rahmen = new Rahmen();
        String model = "Mountainbike";
        Fahrrad fahrrad = new Fahrrad(rahmen, model);

        assertEquals(model, fahrrad.getModel());
    }
    
    // Exception Null
    @Test
    public void testModelNull() {
        Rahmen rahmen = new Rahmen();

        assertThrows(IllegalArgumentException.class, () -> {
            new Fahrrad(rahmen, null);
        });
    }
    
    // Exception leer
    @Test
    public void testExceptionNull() {
        Rahmen rahmen = new Rahmen();

        assertThrows(IllegalArgumentException.class, () -> {
            new Fahrrad(rahmen, "");
        });
    }

    // Exception über 23 chars
    @Test
    public void testExceptionÜber23() {
        Rahmen rahmen = new Rahmen();
        String model = "DiesesModelIstVielZuLang123";

        assertThrows(IllegalArgumentException.class, () -> {
            new Fahrrad(rahmen, model);
        });
    }

    @Disabled
    void testEqualsVerifier() {
        EqualsVerifier.forClass(Fahrrad.class).verify();
    }
}
