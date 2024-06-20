package ch.hslu.oop.SW06;

import ch.hslu.oop.Point;

public class PointV2 {
    // Private als Instanzvariable, dass meine andere Methoden nicht auf meine Variablen zugreifen & ändern können.
    private int x;
    private int y;
    
    // Konstruktor: Wenn das Objekt, also ein Kreis erstellt wird, dann werden die Werte x & y in diese Variabeln übergeben.
    public PointV2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // 2. Konstruktor: Erstellt einen zweiten Punkt mit den Wertend es ersten Punktes
    public PointV2(Point point) {
        this(point.getX(), point.getY());
    }

    // Getter-Methode für die x-Koordinate weil private Instanzvariable x
    public int getX() {
        return x;
    }
    
    //Same for y-Koordinate, weil best practise
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String getQuadrant(){
        if(x > 0 && y > 0){
            return "Quadrant 1";
        }else if(x < 0 && y >0){
            return "Quadrant 2";
        }else if(x < 0 && y < 0){
            return "Quadrant 3";
        }else if(x > 0 && y < 0){
            return "Quadrant 4";
        }else{
            return "Kein Quadrant.";
        }
    }

    // Methode: Verschiebt den Punkt um die eingegebenen Werte. @param x Verschiebung in X-Richtung, @param y Verschiebung in Y-Richtung.
    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    // Methode: Verschiebt den Punkt mit den Werten eines anderen Punktes. @param point Verschiebungswerte
    public void moveRelative(Point point) {
        this.x += point.getX();
        this.y += point.getY();
    }
}
