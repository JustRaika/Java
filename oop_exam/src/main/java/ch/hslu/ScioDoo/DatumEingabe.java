package ch.hslu.ScioDoo;

// If - else if - else mit zusätlichem (if - else)
public class DatumEingabe {
    
    static void prüfeDatum(int monat, int jahr) {
        int tage = 0;
        if (monat == 1 || monat == 3 || monat == 5 ||monat == 7 ||monat == 8 ||monat == 10 ||monat == 12) {
            tage = 31;
        } else if (monat == 4 || monat == 6 || monat == 9) {
            tage = 30;
        } else {
            if (jahr%4 == 0) { //Schaltjahr ja oder nein
                tage = 29;
            } else {
                tage = 28;
            }
        }
        System.out.println("Der " +monat+ " Monat in Jahr " +jahr+ " hat " +tage+ " Tage.");
    }

    public static void main(String[] args) {
        prüfeDatum(2,2001);
    }

}
