package ch.hslu.oop.SW10.switchable;

/**
 * 4 Methoden (Interface, d.h can be used in multiple other classes) für einen simplen Schalter. 
 * switchOn:    Ohne Rückgabewert, schaltet ein Objekt ein.
 * switchOff:   Ohne Rückgabewert, schaltet ein Objekt aus.
 * isSwitchOn:  True/False Rückgabewert. Überprüft, ob das Objekt eingeschaltet ist.
 * isSwitchOff: True/False Rückgabewert. Überprüft, ob das Objekt ausgeschaltet ist.
 */
public interface Switchable {
     void switchOn();
     void switchOff();
     boolean isSwitchedOn();
     boolean isSwitchedOff();
}