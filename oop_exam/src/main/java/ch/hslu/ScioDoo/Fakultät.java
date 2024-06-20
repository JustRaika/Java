package ch.hslu.ScioDoo;

// for Schleife und int vs long
public class Fakultät {
    
    // int geht nur bis 30. Für 31 braucht es long
    static void berechneFakultät(int zahl) {
        int fakultät = 1; //int

        for (int i = 1; i <= zahl; ++i) {
            fakultät = fakultät * i;
        }
        System.out.println("Die Fakultät von " +zahl+ " ist: " +fakultät);
    }

    // Methode 2 für long das bis 39 geht.
    static void berechneFakultätlong(int zahl) {
        long fakultät = 1; //long

        for (int i = 1; i <= zahl; ++i) {
            fakultät = fakultät * i;
        }
        System.out.println("Die Fakultät von " +zahl+ " ist: " +fakultät);
    }

    public static void main(String[] args) {
        berechneFakultät(2);
        berechneFakultät(5);
        berechneFakultät(31);
        berechneFakultätlong(39);
    }
}
