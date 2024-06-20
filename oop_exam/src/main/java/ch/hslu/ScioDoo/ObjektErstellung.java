package ch.hslu.ScioDoo;

public class ObjektErstellung {
    
    ObjektErstellung () {
        System.out.println("Ein Objekt wurde angelegt.");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ObjektErstellung objektEins = new ObjektErstellung();
    }
}
