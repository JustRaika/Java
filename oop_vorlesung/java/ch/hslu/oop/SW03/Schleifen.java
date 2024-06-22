package ch.hslu.oop.SW03;

/**
 * Klasse für 3 Schleifenvariationen, die das selbe Ziel haben. Geben die Zahlen 1-10 zurück. 
 */
public class Schleifen {
    /**
     * Schleifenvaraition do-while.
     */
    public void printNumberz() {
        int number = 0;
        // do-while Schleife gewählt, weil ich zuerst Durchführung haben wollte und am Schluss Prüfung, ob die Bedingung noch stimmt.
        do { 
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
        } while (number <=10);
    }
    /**
     * for-Schleife. Gibt die Zahlen 1-10 zurück.
     * 
     * @param num = 0 Startet bei dieser Zahl.
     * @param num <= 10 Gibt die Zahlen zurück solange diese Zahl kleiner oder gleich ist.
     * @return Hier print(die einzelnen Zahlen)
     */
    public void printNumbers() {
    for (int num = 0; num <=10; num++) {
            System.out.println(num);
        }
    }
    /**
     * Schleifenvariation while.
     */
    public void printZahl() {
    int zahl = 0;
        while (zahl <= 10) {
            System.out.println(zahl);
            zahl++; //erhöht den Wert jeweils um 1, ist eine Java-Operator. Würde er vorne stehen, dann würde er zuerst den Wert erhöhen und dann den erhöhten Wert zurückgeben. Zahl++ hingegen verwendet aktuellen Wert und erhöht ihn erst dann.
        }
    }

    // Print Box Art mit #-es.
    public void printBox(final int width, final int height) {
        for (int h=1; h<=height; h++) {
            for (int w=1; w<=width; w++) {
                if (w==1 || w==width) {
                    System.out.println('#');
                } else if (h==1 || h==height) {
                    System.out.println('#');
                } else {
                    System.out.println(' ');
                }
            }
            System.out.println();
        }
    }
}