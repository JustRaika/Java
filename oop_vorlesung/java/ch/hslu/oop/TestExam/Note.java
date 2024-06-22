package ch.hslu.oop.TestExam;

public class Note {
    
        public enum Bewertung {
            A(6.0f), B(5.5f), C(5.0f), D(4.5f), E(4.0f), F(3.0f);
    
            private final float note;

            Bewertung(float note) {
                this.note = note;
            }

            public float getNote() {
                return note;
            }
        }

    //Kein Datentyp, weil Enum sozuagen der Datentyp ist.
    private Bewertung bewertung;

    public Note(Bewertung bewertung) {
        this.bewertung = bewertung;
    }

    public float getNote() {
        return bewertung.getNote();
    }

}