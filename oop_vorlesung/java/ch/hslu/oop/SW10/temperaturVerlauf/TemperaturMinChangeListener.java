package ch.hslu.oop.SW10.temperaturVerlauf;

//Interface: Muss von allen Observern implementiert werden, d.h. sozusagen Briefkasten. -> Javadoc bei Interfaces
public interface TemperaturMinChangeListener {

    public void temperaturMinChangePerformed(TemperaturMinChangeEvent minChangeEvent);
}
