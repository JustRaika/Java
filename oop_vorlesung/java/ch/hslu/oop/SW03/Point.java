package ch.hslu.oop.SW03;

public class Point {
    // Private als Instanzvariable, dass meine andere Methoden nicht auf meine Variablen zugreifen & ändern können.
    private int x;
    private int y;
    
    // Konstruktor: Wenn das Objekt, also ein Kreis erstellt wird, dann werden die Werte x & y in diese Variabeln übergeben.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
}