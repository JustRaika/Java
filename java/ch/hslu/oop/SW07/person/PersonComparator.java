package ch.hslu.oop.SW07.person;

import java.util.Comparator;

// 
public class PersonComparator implements Comparator<Person> {
    
    /**
     * Vergleicht zwei Personenobjekte nach der speziellen Ordnung
     * @param person1 Personenobjekt 1
     * @param person2 Personenobjekt 2
     * @return Vergleich
     */
    @Override
    public int compare(Person person1, Person person2) {
        int compare = person1.getNachname().compareTo(person2.getNachname());
        if (compare == 0) {
            compare = person1.getVorname().compareTo(person2.getVorname());
        }
        return compare;
    }
}