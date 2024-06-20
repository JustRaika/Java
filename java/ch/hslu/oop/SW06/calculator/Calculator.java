package ch.hslu.oop.SW06.calculator;

public class Calculator implements InterfaceCalculator {

    /**
     * Macht eine einfache Addition von Ganzzahlen.
     *
     * @param a Ganzzahl 1
     * @param b Ganzzahl 2
     * @return Addition von a und b
     */
    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}