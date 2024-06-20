package ch.hslu.oop.SW05.shape;


/**
 * BEI ABSTRAKTEN KLASSEN IMMER JAVADOC SCHREIBEN!
 * Abstrakte Klasse Shape für Erstellung von geometrischen Objekten. Speichert die Punkte von Koordinaten in x und y. 
 */

 public abstract class Shape {
    private int x; //Attribut der Klasse: Child-Klassen dieser Klasse können darauf zugreifen, aber andere Klassen ausserhalb nicht.
    private int y;

    public Shape(final int x, final int y) { //Konstruktor
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) { //Methode, die Position der Form im Koordinatensystem verändert.
        x = newX; //speichert neue Werte als Parameter
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract int getPerimeter();//Methode für Berechnung des Umfangs der Form -> Muss by Child-Klasse überschrieben werden, sonst gibt immer Wert 0 zurück.

    public abstract int getArea(); ///Methode für Berechnung der Fläche der Form -> Muss by Child-Klasse überschrieben werden, sonst gibt immer Wert 0 zurück.
}
