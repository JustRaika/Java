package ch.hslu.oop.SW05.shape;

public class Rectangle extends Shape {
    private int width; //privates Attribut. Speichert den Durchmesser des Rechtecks.
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); //super ruft den Konstruktor von Shape auf, um x & y-Koordinaten zu initialisieren. 
        if (width>0 && height >0) {
            setDimensions(width, height); //Methode, die den Grösse & Breite setzt am Anfang.
        }
    }

    public void changeDimensions(int newWidth, int newHeight) { //Methode, die Grösse & Breite bei Objekt nochmals verändern kann. Ändert den Wert des privaten Attributes entsprechend.
        setDimensions(newWidth, newHeight);
    }

    private void setDimensions(int newWidth, int newHeight) { //Setzt die neue Höhe & Breite. (Nicht im UML, aber Compiler hat gemotzt)
        width = newWidth;
        height = newHeight;
    }
    
    public int getWidth() { //Methode, die Breite zurückgibt.
        return width;
    }

    public int getHeight() { //Methode, die Höhe zurückgibt.
        return height;
    }

    @Override // = Überschreibung der Methode getPerimeter
    public int getPerimeter() {
        return 2 * (width + height); // weil Umfang ist 2x Höhe und 2x Breite
    }

    @Override // = Überschreibung der Methode getArea
    public int getArea() {
        return width * height; //Fläche = Höhe * Breite
    }
}