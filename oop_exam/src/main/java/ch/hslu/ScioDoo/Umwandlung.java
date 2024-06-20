package ch.hslu.ScioDoo;

// Java Objekte in Java Methoden übergeben
public class Umwandlung {
    
    private int x;

    static public int getX(Umwandlung u) {
        return u.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // wenn man im Methodenrumpf einer Klassenmethode auf eine Instanzvariable zugreifen möchte,
    // muss man mit Punktnotation darauf zugreifen.
    static public void setX(Umwandlung u, int x) {
        u.x = x;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Umwandlung umwandler = new Umwandlung();

        setX(umwandler, 22);
        System.out.println(umwandler.getX(umwandler));
    }
}
