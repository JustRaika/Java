package ch.hslu.oop.SW06.shape;

 public abstract class ShapeV2 {
    private int x; //Attribut der Klasse: Child-Klassen dieser Klasse können darauf zugreifen, aber andere Klassen ausserhalb nicht.
    private int y;

    public ShapeV2(final int x, final int y) { //Konstruktor
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

    //Methode für Berechnung des Umfangs der Form -> Muss by Child-Klasse überschrieben werden, sonst gibt immer Wert 0 zurück.
    public abstract int getPerimeter();

    //Methode für Berechnung der Fläche der Form -> Muss by Child-Klasse überschrieben werden, sonst gibt immer Wert 0 zurück.
    public abstract int getArea(); 
}