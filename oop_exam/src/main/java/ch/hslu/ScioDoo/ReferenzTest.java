package ch.hslu.ScioDoo;

// 1 Objekt aber mit mehreren Zuweisungen auf verschiedene Variablen
public class ReferenzTest {
    
    int a;
    int b;
    int c;

    public ReferenzTest() {

    }

    public static void main(String[] args) {
        ReferenzTest refEins = new ReferenzTest();
        ReferenzTest refZwei = refEins;
        ReferenzTest refDrei = refEins;

        refEins.a = 2;
        refZwei.b = 16;
        refDrei.c = 32;

        System.out.println(refEins.a+ " " +refEins.b+ " " +refEins.c);
        // prints: 1 16 32
    }

}
