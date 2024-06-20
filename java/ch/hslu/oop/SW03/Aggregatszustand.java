package ch.hslu.oop.SW03;

public class Aggregatszustand {
    public String getaggregatszustand(String element,double temperatur) { 
    String aggregatszustand = "";
    switch (element) {
        case "N":
            if (temperatur <= -210) {
                aggregatszustand = "fest";
            } else if (temperatur > -210 && temperatur < -195) {
                aggregatszustand = "flüssig";
            } else {
                aggregatszustand = "gasförmig";
            }
            break;
        case "Hg":
            if (temperatur <= -38.83) {
                aggregatszustand = "fest";
           } else {
                aggregatszustand = "flüssig";
            }
            break;
        case "Pb":
            if (temperatur <= 327.46) {
                aggregatszustand = "fest";
            } else {
                aggregatszustand = "flüssig";
            }
            break;
        default:
            aggregatszustand = "Element unbekannt.";
            break;
    }
    return aggregatszustand;
    }
    // Eingeben der Werte beim Aufruf der Methode wie folgt: z.B "N", -10 oder "Pb", 500
}