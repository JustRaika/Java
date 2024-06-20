package ch.hslu.oop.SW09;

// Beispiel für eine Exception, wenn eine Division durch null ausgeführt wird.
public class BspException {
// static hier heisst, dass wir kein Objekt der Klasse zuerst erstellen müssen.
    public static void main(String[] args) {
        try {
            // Division 10/0
            int result = divide(10, 0);
            System.out.println("Result: " + result); // Wird nicht erreicht
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
    
    // Statische Methoder der Klasse
    public static int divide(int numerator, int denominator) {
        // Hier wird überprüft, ob der Nenner gleich null ist
        if (denominator == 0) {
            // Wenn ja, wird eine ArithmeticException ausgelöst
            throw new ArithmeticException("Division by zero is not allowed");
        }
        // Andernfalls wird die Division durchgeführt und das Ergebnis zurückgegeben
        return numerator / denominator;
    }
}
