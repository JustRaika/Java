package ch.hslu.oop.TestExam;

public class Student {

    private static final long ID_MINIMUM = 20200400000L;
    private long id;
    private String vorname;
    private String nachname;

    public Student (long id, String vorname, String nachname) {

        if (id < ID_MINIMUM) {
            throw new IllegalArgumentException("ID darf nicht kleiner als " + ID_MINIMUM + " sein.");
        }

        if (nachname == null || nachname.length() < 2) {
            throw new IllegalArgumentException("Nachname muss aus mindestens zwei Zeichen bestehen und darf nicht leer sein.");
        }

        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public long getId() {
        return id;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    @Override
    public String toString() {
        return "Student[ID: " + id + ", Vorname: " + vorname + ", Nachname: " + nachname+ "]"; // + this.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Student)) {
            return false;
        }
        final Student other = (Student) object;
        return (other.id == this.id);
    }
}
