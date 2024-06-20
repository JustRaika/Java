package ch.hslu.oop.SW10.temperaturVerlauf;

//Interface: Muss von allen Observern implementiert werden, d.h. sozusagen Briefkasten.
public interface TemperaturMaxChangeListener {

    public void temperaturMaxChangePerformed(TemperaturMaxChangeEvent maxChangeEvent);
}