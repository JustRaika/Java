package ch.hslu.oop.SW09;

import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MainException {
    
    private static final Logger LOG = LoggerFactory.getLogger(MainException.class);
    
    public static void main(String[] args) { 
        String input;
        Scanner scanner = new Scanner(System.in); // Scanner Objekt wird erstellt. Braucht es, um aus der Konsole Dateien zu lesen.
        do { //do while Schleife. Wird mindestens einmal ausgeführt, danach nur, wenn die Bedingung erfüllt ist.
            LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            if (!input.equals("exit")) { //wenn Input nicht exit ist..
                try {
                    Float.valueOf(input);
                } catch (NumberFormatException e) {
                    LOG.error("Ungültige Eingabe! Geben Sie eine Zahl oder 'exit' ein. / " + e);
                }
            }
        } while (!input.equals("exit")); // Bedingung: solange input nicht "exit" ist, wird die Schleife ausgeführt.
        scanner.close();
        LOG.info("Programm beendet.");
    }
}