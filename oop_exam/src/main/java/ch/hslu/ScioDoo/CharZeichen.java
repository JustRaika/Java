package ch.hslu.ScioDoo;

// Char Zeichen mit for-Schleife ausgeben
public class CharZeichen {
    
    static void gibZeichen() {
        for (char zeichen = 33; zeichen <=126; zeichen++) {
            System.out.println(zeichen);
        }
    }

    public static void main(String[] args) {
        gibZeichen();
    }
}
