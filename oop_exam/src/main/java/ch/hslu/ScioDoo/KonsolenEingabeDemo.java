package ch.hslu.ScioDoo;

import java.util.Scanner;

// Bildschirmeingabe mit scanner-Klasse implemnetieren
public class KonsolenEingabeDemo {
    
    static void addiere() {
        @SuppressWarnings("resource")
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine gaze Zahl ein.");
        int eingabeEins = eingabe.nextInt();
        System.out.println("Gib eine weitere Zahl ein.");
        int eingabeZwei = eingabe.nextInt();
        System.out.println(eingabeEins + eingabeZwei);
    }

    public static void main(String[] args) {
        addiere();
    }

}
