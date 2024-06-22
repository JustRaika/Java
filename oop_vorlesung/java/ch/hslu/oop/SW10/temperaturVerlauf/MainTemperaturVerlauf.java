package ch.hslu.oop.SW10.temperaturVerlauf;

import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

// Hauptfunktion: Verwaltet die Temperaturverläufe.
public class MainTemperaturVerlauf {

    // Erzeugt ein neues TemperaturVerlauf-Objekt.
    private TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
    private static final Logger LOGGER = LoggerFactory.getLogger(MainTemperaturVerlauf.class);

    /**
     * Konstruktor: 
     * 1) Fügt einen TemperaturMinChangeListener hinzu.
     * 2) Fügt einen TemperaturMaxChangeListener hinzu.
     * 3) Startet die Methode zum Hinzufügen vom Temperaturen in den Verlauf.
     * 4) Logger gibt statistische Daten aus.
     */
    public MainTemperaturVerlauf() {
        temperaturVerlauf.addTemperaturMinChangeListener(new TemperaturMinChangeListener() {
            @Override
            public void temperaturMinChangePerformed(TemperaturMinChangeEvent minChangeEvent) {
                LOGGER.info("Minimale Temperatur geändert von " + minChangeEvent.getOldValue() + " auf " + minChangeEvent.getNewValue());
            }
        });
        temperaturVerlauf.addTemperaturMaxChangeListener(new TemperaturMaxChangeListener() {
            @Override
            public void temperaturMaxChangePerformed(TemperaturMaxChangeEvent maxChangeEvent) {
                LOGGER.info("Maximale Temperatur geändert von " + maxChangeEvent.getOldValue() + " auf " + maxChangeEvent.getNewValue());
            }
        });
        addTemperaturToVerlauf();
        LOGGER.info(temperaturVerlauf.toString());
        LOGGER.info("Programm beendet.");
    }

    // Main-Methode: Startet die Applikation und ruft den Konstruktor auf.
    public static void main(String[] args) {
        new MainTemperaturVerlauf();
    }

    // Methode: Liest die Benutzereingabe. Dann a) fügt Temperatur in den Verlauf hinzu oder b) gibt Fehlermeldung.
    // Fragt User solange nach einer Temperatur, bis er 'exit' eingibt.
    public void addTemperaturToVerlauf() {
        String input;
        Scanner scanner = new Scanner(System.in); // Scanner zum Einlesen der Temperatur. System.in = Eingabe über Tastatur.
        do {
            LOGGER.info("Bitte Temperatur eingeben ('exit' zum beenden): ");
            input = scanner.next();
            if (!input.equals("exit")) {
                try {
                    float value = Float.valueOf(input);
                    Temperatur temperatur = Temperatur.createFromCelsius(value);
                    temperaturVerlauf.add(temperatur);
                } catch (NumberFormatException e) {
                    LOGGER.error("Die Eingabe konnte nicht gelesen werden. Gib eine Zahl oder 'exit' ein. / " + e);
                }
            }
        } while (!input.equals("exit"));
        scanner.close();
    }
}