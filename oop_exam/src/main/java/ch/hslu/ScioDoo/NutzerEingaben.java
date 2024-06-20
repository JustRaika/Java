package ch.hslu.ScioDoo;

public class NutzerEingaben {
    
    private int geburtsjahr; //mit private wird ausserhalb der Klasse Zugriff verwehrt

    public int getGeburtsJahr() {
        return geburtsjahr;
    }

    public void setGeburtsJahr(int geburtsjahr) {
        if (geburtsjahr >= 1900 && geburtsjahr <= 2024){
            this.geburtsjahr = geburtsjahr;
        } else {
            System.out.println("Bitte überprüfe deine Eingabe.");
        }   
    }
}
