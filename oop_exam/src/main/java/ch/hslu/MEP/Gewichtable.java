package ch.hslu.MEP;

public interface Gewichtable {
    
    /**
     * Gibt das Gewicht in Kilogramm zurück.
     * Der Wert liegt im Bereich von 0.01 kg bis 2000 kg und ist auf 3 relevante Stellen genau.
     *
     * @return das Gewicht in Kilogramm
     * @param gewichtInKg das Gewicht in Kilogram
     */
    double getGewichtInKg();
}
