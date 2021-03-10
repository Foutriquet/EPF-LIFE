/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
package epf.life;

/**
 *
 * @author Utilisateur
 */
public class ListeEvent {
    
    private DailyEvent ListeEventMatin[];
    private RandomEvent ListeEventMatinRandom[];
    private DailyEvent ListeEventMidi[];
    private RandomEvent ListeEventMidiRandom[];
    private DailyEvent ListeEventApresMidi[];
    private RandomEvent ListeEventApresMidiRandom[];
    private DailyEvent ListeEventSoir[];
    private RandomEvent ListeEventSoirRandom[];
    
    public ListeEvent() {
        
    }
    
    public DailyEvent recupererEventMatin(int num) {
        return ListeEventMatin[num];
    }
    
    public RandomEvent recupererEventMatinRandom(int num) {
        return ListeEventMatinRandom[num];
    }
    
    public DailyEvent recupererEventMidi(int num) {
        return ListeEventMidi[num];
    }
    
    public RandomEvent recupererEventMidiRandom(int num) {
        return ListeEventMidiRandom[num];
    }
    
    public DailyEvent recupererEventApresMidi(int num) {
        return ListeEventApresMidi[num];
    }
    
    public RandomEvent recupererEventApresMidiRandom(int num) {
        return ListeEventApresMidiRandom[num];
    }
    
    public DailyEvent recupererEventSoir(int num) {
        return ListeEventSoir[num];
    }
    
    public RandomEvent recupererSoirRandom(int num) {
        return ListeEventSoirRandom[num];
    }
}
