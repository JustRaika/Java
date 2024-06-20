package ch.hslu.oop.SW05.shape;

/**
 * Varianten zur objektorientierten Struktur:
 * a) Subklasse von Shape
 * b) Subklasse von Rectangle
 * c) Seperate Klasse
 */

 public class Square extends Shape { //Child-Klasse: Erbt von Shape alle Attribute & Methoden. (Kann bei Bedarf erweitern/überschreiben)
    private int length; //privates Attribut. Speichert die Seitenlänge des Quadrates.

    public Square(int x, int y, int length) { //Konstruktor der Sqaure-Klasse.
        super(x, y); //super ruft den Konstruktor von Shape auf, um x & y-Koordinaten zu initialisieren. 
            if (length>0) {
                setLength(length); //Methode, die Seitenlänge setzt am Anfang.
            }
    }
    
    public void setLength(int length) { //Methode, die die Länge bei Objekt nochmals verändern kann. Ändert den Wert des privaten Attributes entsprechend.
        this.length = length;
    }

    public int getLength() { //Methode, die die Länge zurückgibt.
        return length;
    }

    @Override // = Überschreibung der Methode getPerimeter
    public int getPerimeter() {
        return 4*length; // Umfang eines Quadrates: 4* Seitenlänge
    }

    @Override // = Überschreibung der Methode getArea
    public int getArea() {
        return length * length; // Fläche eines Quadrates Seitenlänge^2.
    }
}