package ch.hslu.ScioDoo;

import java.util.Scanner;

public class LetzteZiffer {
    
    static void findeLetzeZiffer(int zahl, int anzahl) {
        int potenz = 1;

        for(int i = 0; i<anzahl; i++) {
            potenz = potenz * 10;
        }

        System.out.println("Letzte " +anzahl+ " Stellen: " +zahl%potenz);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        int zahl = eingabe.nextInt();
        System.out.println("Wie viele Stellen benötigst du?");
        int anzahl = eingabe.nextInt();
        findeLetzeZiffer(zahl,anzahl);
    }
}
