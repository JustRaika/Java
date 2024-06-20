package ch.hslu.ScioDoo;

// Implementation von einem Switch Statement
public class Ticketshop {
    
    static void verkaufeTicket(int uhrzeit) {
        switch (uhrzeit) {
            case 7:
                System.out.println("Preis: 28.-");
                break;
            case 8:
                System.out.println("Preis: 28.50.-");
                break;
            case 9:
                System.out.println("Preis: 39.-");
                break;
            case 10:
                System.out.println("Preis: 70.-");
                break;
            case 11:
                System.out.println("Preis: 120.50.-");
                break;
            default:
            System.out.println("Shop geschlossen!");
                break;
        }
    }

    public static void main(String[] args) {
        verkaufeTicket(6);
    }
}
