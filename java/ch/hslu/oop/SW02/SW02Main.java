package ch.hslu.oop.SW02;

public class SW02Main {

    public static void main (String [] args){

        // Deklaration zur Erstellung eines Objektes: final Klasse NameObjekt = new Klasse();
        // temperatur1 Speichert das Objekt und seine Werte in der Variabel
        final Temperatur temperatur1 = new Temperatur(30);

        // Aktuelle Temperatur abfragen & Änderung der Temperatur in Celsius
        System.out.println("Aktuelle Temperatur in Celsius: " + temperatur1.gettemperaturInCelsius());
        temperatur1.settemperaturInCelsius(25);
        System.out.println("Neue Temperatur in Celsius: " + temperatur1.gettemperaturInCelsius());

        // Gibt Temperatur in Kelvin zurück.
        System.out.println(temperatur1.ConvertC2K());

        // Gibt Temperatur in Fahrenheit zurück.
        System.out.println(temperatur1.ConvertC2F());

        // Die Temperatur ändern
        temperatur1.ChangeTemperatur(-5);
        System.out.println("Neue Temperatur in Celsius: " + temperatur1.gettemperaturInCelsius());
    }
}