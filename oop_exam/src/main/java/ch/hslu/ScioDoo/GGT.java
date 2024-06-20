package ch.hslu.ScioDoo;

// Implementation while-Schleife
public class GGT {
    
    static void bestimmeGGT(int zahl1, int zahl2) {

        int teiler; // Das ist eine lokale Variable.

        if (zahl1 <= zahl2) {
            teiler = zahl1;
        } else {
            teiler = zahl2;
        }
        while (zahl1 % teiler !=0 || zahl2 % teiler !=0) {
            System.out.println("versuche: " +teiler);
            teiler --;
        }
        System.out.println(teiler);
    }

    public static void main(String[] args) {
        bestimmeGGT(18, 12);
    }

}
