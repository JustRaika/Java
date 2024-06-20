package ch.hslu.ScioDoo;

// if-else zwischen 2 switch Statements
public class Schwimmbad {
    
    static void berechnePreis(boolean mehrereTage, int ersterTag) {
        double preisTag1 = 4.5;
        double preisTag2 = 6;
        double preisTag3 = 7;
        double preisTag4 = 8;
        double gesamtpreis = 0;

        if (mehrereTage == false) {
            switch (ersterTag) {
                case 1:
                    System.out.println("Tag 1 Preis: " +preisTag1);
                    gesamtpreis = preisTag1;
                    break;
                case 2:
                        System.out.println("Tag 2 Preis: " +preisTag2);
                    gesamtpreis = preisTag2;
                    break; 
                case 3:
                    System.out.println("Tag 3 Preis: " +preisTag3);
                    gesamtpreis = preisTag3;
                    break; 
                case 4:
                    System.out.println("Tag 4 Preis: " +preisTag4);
                    gesamtpreis = preisTag4;
                    break;
                case 5:
                    System.out.println("Tag 5 Preis: " +preisTag4);
                    gesamtpreis = preisTag4;
                    break;
                case 6:
                    System.out.println("Tag 6 Preis: " +preisTag4);
                    gesamtpreis = preisTag4;
                    break;
                case 7:
                    System.out.println("Tag 7 Preis: " +preisTag4);
                    gesamtpreis = preisTag4;
                    break;
                default:
                    System.out.println("An diesem Tag leider geschlossen.");
                    break;
            }
        } else {
            // Das Fehlen von break bewirkt, dass der Tag eingegeben wird und dann alle nachfolgenden Fälle durchgeamcht werden.
            switch (ersterTag) {
                case 1:
                    System.out.println("Tag 1 - Preis: " + preisTag1);
                    gesamtpreis = preisTag1;
                case 2:
                    System.out.println("Tag 2 - Preis: " + preisTag2);
                    gesamtpreis = gesamtpreis + preisTag2;
                case 3:
                    System.out.println("Tag 3 - Preis: " + preisTag3);
                    gesamtpreis = gesamtpreis + preisTag3;
                case 4:
                    System.out.println("Tag 4 - Preis: " + preisTag4);
                    gesamtpreis = gesamtpreis + preisTag4;
                case 5:
                    System.out.println("Tag 5 - Preis: " + preisTag4);
                    gesamtpreis = gesamtpreis + preisTag4;
                case 6:
                    System.out.println("Tag 6 - Preis: " + preisTag4);
                    gesamtpreis = gesamtpreis + preisTag4;
                case 7:
                    System.out.println("Tag 7 - Preis: " + preisTag4);
                    gesamtpreis = gesamtpreis + preisTag4;
                    break;
                default:
                    System.out.println("An diesem Tag- Leider geschlossen.");
                    break;
                }
            }
            System.out.println("Gesamtpreis: " + gesamtpreis);
        }

    public static void main(String[] args) {
        berechnePreis(false, 3);
    }
}
