package ch.hslu.oop.SW04;

import ch.hslu.oop.Point;

public class Line {

    // 2 private Attribute (=Instanzvariablen) vom Typ Point.
    private Point startOfLine;
    private Point endOfLine;

    /**
     * Erstellt eine Linie mittels zwei Point Objekten.
     *
     * @param startX X-Koordinate des Startpunktes
     * @param startY Y-Koordinate des Startpunktes
     * @param endX X-Koordinate des Endpunktes
     * @param endY Y-Koordinate des Endpunktes
     */

    // Konstruktor
    public Line(int startX, int startY, int endX, int endY) { // Konstruktor heisst Line und hat 4 Parameter.
        this.startOfLine = new Point(startX, startY); //Das Objekt StartOfLine besitzt die Werte StartX und StartY.
        this.endOfLine = new Point(endX, endY);
    }

    // Getter-Methode für die Startpunkte: Achtung: Die Methoden werden direkt auf dem Objekt aufgrufen!
    public String getStartOfLine() { // Klammern leer, weil Methode keine Parameter benötigt. Methode selbst gibt String zurück.
        int x = startOfLine.getX(); // Temporäre Variable "int x" erstellt und mit der x-Koordinate des Startpunkts von "startOfLine" belegt.
        int y = startOfLine.getY();
        String start = "Startpunkt: (" + x + "," + y + ")"; // Die "+" sind notwendig, weil der Compiler sonst die beiden Werte zu einem String versuchen würde zusammenzufassen.
        return start;
    }

    // Setter-Methode: Erzeugt eine neues Objekt und ersetzt somit das alte Objekt das auf "startOfLine" gespeichert war.
    public void setStartOfLine(int startX, int startY) { // void heisst, dass es kein return braucht, aka kein Rückhgabewert.
        startOfLine = new Point(startX, startY);
    }

    // Getter-Methode für die Endpunkte.
    public String getEndOfLine() {
        int x = endOfLine.getX();
        int y = endOfLine.getY();
        String end = "Endpunkt: (" + x + "," + y + ")";
        return end;
    }

    //Setter-Methode für die neuen Endpunkte.
    public void setEndOfLine(int endX, int endY) {
        endOfLine = new Point(endX, endY);
    }
}