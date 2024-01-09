import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // Scanner aus der Loop raus, weil Java mehrere Scanner-Objekte hasst.
        Scanner sc = new Scanner(System.in);
        while(true) {
            // sps = SteinPapierSchere für den Player Input
            String[] sps = {"Stein", "Papier", "Schere"};
            // Alles was der Computer aussuchen kann. Hier einfach die Länge des Arrays vom Spielerinput gegeben.
            String computerMove = sps[new Random().nextInt(sps.length)];

            String playerMove;

            while(true) {
                System.out.println("Wählst du Stein, Papier oder Schere?");
                playerMove = sc.nextLine();
                if (playerMove.equals("Stein") || playerMove.equals("Papier") || playerMove.equals("Schere")) {
                    break;
                }
                System.out.println(playerMove + " ,dein Ernst? Vallah Brudi, das ist keine gültige Eingabe, try again.");
            }

            System.out.println("Computer sagt: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Unentschieden!");
            }
            else if (playerMove.equals("Stein")) {
                if (computerMove.equals("Papier")) {
                    System.out.println("Du hast verloren, hehe.");
                } else if (computerMove.equals("Schere")) {
                    System.out.println("Oh man, du hast gewonnen.");
                }
            }
            else if (playerMove.equals("Papier")) {
                if (computerMove.equals("Schere")) {
                    System.out.println("Du hast verloren, hehe.");
                } else if (computerMove.equals("Stein")) {
                    System.out.println("Oh man, du hast gewonnen.");
                }
            }
            else if (playerMove.equals("Schere")) {
                if (computerMove.equals("Stein")) {
                    System.out.println("Du hast verloren, hehe.");
                } else if (computerMove.equals("Papier")) {
                    System.out.println("Oh man, du hast gewonnen.");
                }
            }
        System.out.println("Nochmals spielen? (Ja/Nein)");
        String playAgain = sc.nextLine();

        if (!playAgain.equals("Ja")) {
            break;
        }

        }
    sc.close();
    }
}
