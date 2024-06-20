package ch.hslu.ScioDoo;

public class Mahnung {

    int mahnstufe;
    double mahngebühr;
    
    // Konstruktor 1, normal.
    public Mahnung(int Mahnstufe, double Mahngebühr) {
        this.mahnstufe = 1;
        this.mahngebühr = 5;
        gibInfo();
    }

    // Konstruktor 2. Nimmt ein Objekt entgegen.
    public Mahnung(Mahnung erste) {
        this.mahngebühr = erste.mahngebühr+5;
        this.mahnstufe = erste.mahnstufe+1;
        gibInfo();
    }

    void gibInfo() {
        System.out.println("Mahnstufe: " +mahnstufe+ " Mahngebühr: " +mahngebühr+ "CHF");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Mahnung ersteMahnung = new Mahnung(1,5);
        Mahnung zweiteMahnung = new Mahnung(ersteMahnung);
        Mahnung dritteMahnung = new Mahnung(zweiteMahnung);
    }

}
