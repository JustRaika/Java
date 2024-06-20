package ch.hslu.ScioDoo;

public class Copyshop {

    // Um auf Variablen aus anderen Klassen zuzugreifen, muss man zuerst entsprechende Klasse ausweisen und dann per Punkt auf Klassenvariable.
    public static void zähleGeräte(){
        System.out.println("Im Copyshop befindet sich " +Farbscanner.scannerGeräteAnzahl+ " Scanner.");
        System.out.println("Im Copyshop befindet sich " +Kopiergeräte.kopierGeräteAnzahl+ " Kopierer.");
        System.out.println("Im Copyshop befinden sich " +(Farbscanner.scannerGeräteAnzahl+Kopiergeräte.kopierGeräteAnzahl)+ " Geräte.");
    }

    static void gibGesamtBericht() {
        zähleGeräte();
        System.out.println("Gesamtanzahl Scanvorgänge: "+Farbscanner.scanvorgängeAlle);
		System.out.println("Gesamtanzahl gescannter Papiere: "+Farbscanner.papieranzahlAlle);
        System.out.println("Durchschnittliche Papiermenge je Scan " +(double)Farbscanner.papieranzahlAlle/(double)Farbscanner.scanvorgängeAlle);
        System.out.println("");
        System.out.println("Gesamtanzahl Kopiervorgänge: "+Kopiergeräte.kopiervorgängeAlle);
		System.out.println("Gesamtanzahl kopierter Papiere: "+Kopiergeräte.papieranzahlAlle);
        System.out.println("Durchschnittliche Papiermenge je Kopieren " +(double)Kopiergeräte.papieranzahlAlle/(double)Kopiergeräte.kopiervorgängeAlle);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Kopiergeräte kopierer1 = new Kopiergeräte("JG654");
        Kopiergeräte kopierer2 = new Kopiergeräte("FP76");
        Kopiergeräte kopierer3 = new Kopiergeräte("6534XS");
        Farbscanner scanner1 = new Farbscanner("DT84");
        Farbscanner scanner2 = new Farbscanner("XS75");
        Farbscanner scanner3 = new Farbscanner("75B");

        scanner1.scannePapier(200);
        scanner1.scannePapier(400);
        scanner2.scannePapier(800);
        scanner2.scannePapier(20);
        scanner3.scannePapier(196);
        scanner3.scannePapier(23);
        scanner3.scannePapier(34);
        
        kopierer1.kopierePapier(8);
        kopierer1.kopierePapier(98);
        kopierer2.kopierePapier(17);
		kopierer2.kopierePapier(4);
		kopierer3.kopierePapier(44);
		kopierer3.kopierePapier(23);
		kopierer1.kopierePapier(195);
        
        gibGesamtBericht();
    }
}
