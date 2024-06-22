package ch.hslu.oop.SW05.shape;

public class Circle extends Shape { //Child-Klasse: Erbt von Shape alle Attribute & Methoden. (Kann bei Bedarf erweitern/überschreiben)
    private int diameter; //privates Attribut. Speichert den Durchmesser des Kreises.

    public Circle(int x, int y, int diameter) { //Konstruktor der Circle-Klasse.
        super(x, y); //super ruft den Konstruktor von Shape auf, um x & y-Koordinaten zu initialisieren. 
        if (diameter>0) {
            setDiameter(diameter); //Methode, die den Durchmesser setzt am Anfang.
        }
    }

    public void setDiameter(int diameter) { //Methode, die den Durchmesser bei Objekt nochmals verändern kann. Ändert den Wert des privaten Attributes entsprechend.
        this.diameter = diameter;
    }

    public int getDiameter() { //Methode, die den Durchmesser zurückgibt.
        return diameter;
    }

    @Override // = Überschreibung der Methode getPerimeter
    public int getPerimeter() {
        return (int) (2 * Math.PI * diameter / 2); // Umfang eines Kreises: 2 * π * radius (-> radius = diameter / 2)
    }

    @Override // = Überschreibung der Methode getArea
    public int getArea() {
        return (int) (Math.PI * Math.pow(diameter / 2, 2)); // Fläche eines Kreises: π * radius^2 (-> radius = diameter / 2)
    }
}