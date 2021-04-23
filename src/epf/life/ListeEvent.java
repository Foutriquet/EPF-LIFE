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
    private DailyEvent ListeEventWeekend[];
    
    public ListeEvent() {
        ListeEventMatin = new DailyEvent[1];
        ListeEventMatin[0] = new DailyEvent("Matin","Le jour se lève enfin. Après une nuit de sommeil, il est temps de…","X", "chambre");
        ListeEventMatin[0].initialiserTableauDeChoixDaily(0, 20, 0, 0, 0, -10, -10, 20, 10, -10, 20, -10);
        ListeEventMatin[0].initialiserTableauPhrases("D’aller en cours pour sérieusement bosser","De rester au lit","De bosser depuis la maison","D’aller en cours pour voir les potes");
        
        ListeEventMatinRandom = new RandomEvent[2];
        ListeEventMatinRandom[0] = new RandomEvent("Maladie","Et moi qui pensais qu’une bonne journée t’attendait… Tu t’es réveillé malade ! Que faire ?","X", "chambre");
        ListeEventMatinRandom[0].initialiserTableauDeChoixRandom(0, -20, -10, 0, 0, 0, 0, 0, -20, 20, 10, 0);
        ListeEventMatinRandom[0].initialiserTableauPhrases("Pas le choix, direction le médecin !","Je peux pas rater les cours, tant pis si je me sens mal…","J’essaye de bosser à la maison","null");
        ListeEventMatinRandom[1] = new RandomEvent("Tram en panne","Et mince, une panne générale sur le réseau de Tram. Tu vas rater les cours si tu trouves pas une solution rapidement !","X", "rue");
        ListeEventMatinRandom[1].initialiserTableauDeChoixRandom(-20, 0, 10, 0, 10, 10, -10, 0, 20, 0, -10, 0);
        ListeEventMatinRandom[1].initialiserTableauPhrases("Je tape le sprint de ma vie.","J’y vais en marchant, tant pis si je suis en retard","Flemme, je rentre chez moi","null");
        
        ListeEventMidi = new DailyEvent[1];
        ListeEventMidi[0] = new DailyEvent("Midi","Le midi arrive ! Qu’ai-je le temps de faire en 45 min ?","X", "foyer");
        ListeEventMidi[0].initialiserTableauDeChoixDaily(10, 10, -10, 0, -10, 10, -10, 0, 10, 0, 20, 0);
        ListeEventMidi[0].initialiserTableauPhrases("Manger en travaillant","Manger avec des potes","Travailler","null");
        
        ListeEventMidiRandom = new RandomEvent[2];
        ListeEventMidiRandom[0] = new RandomEvent("Ta copine te trompe","Tu viens d’apprendre que ta copine t’a trompé pendant une soirée auquel tu n’étais pas invité… Il faut prendre une décision.","Copine", "campus");
        ListeEventMidiRandom[0].initialiserTableauDeChoixRandom(-10, 10, -10, -20, -20, 10, 0, 20, 20, -20, -10, -20);
        ListeEventMidiRandom[0].initialiserTableauPhrases("J’ai pas de copine !","Je me venge direct","Je laisse couler, mais que cette fois…","Je la quitte et je tourne la page");
        ListeEventMidiRandom[1] = new RandomEvent("Examen de Mécanique","Jousset t’indique que Laugerette a préparé un examen de techno méca pour demain. Tu avais complètement oublié !","Jousset", "campus");
        ListeEventMidiRandom[1].initialiserTableauDeChoixRandom(-10, 10, 10, 0, -20, 10, 20, 0, 30, -20, -30, -10);
        ListeEventMidiRandom[1].initialiserTableauPhrases("Je travaille à fond","Flemme de travailler, tant pis","Je préfère voir des potes, j’en ai besoin","Je fais le minimum de révision");
        
        ListeEventApresMidi = new DailyEvent[1];
        ListeEventApresMidi[0] = new DailyEvent("Après-midi","Les cours reprennent… Est-ce que j’ai vraiment envie d’y aller ?","X", "campus");
        ListeEventApresMidi[0].initialiserTableauDeChoixDaily(0, 0, 0, 20, 0, 20, -10, -10, 10, -10, 20, -10);
        ListeEventApresMidi[0].initialiserTableauPhrases("Oui. Je dois m’y mettre sérieusement !","Oui, mais que pour voir les potes.","Non, je bosserai mieux à la maison","Non. J’ai bien envie de me faire une petite séance de sport !");
        
        ListeEventApresMidiRandom = new RandomEvent[3];
        ListeEventApresMidiRandom[0] = new RandomEvent("Examen de Maths abstra","Winston t’a préparé un partiel de maths abs sur la moitié du programme ! Pas question de rater ça quand même, si ?","Winston", "campus");
        ListeEventApresMidiRandom[0].initialiserTableauDeChoixRandom(-10, 10, 10, 0, -20, 10, 20, 0, 30, -20, -30, -10);
        ListeEventApresMidiRandom[0].initialiserTableauPhrases("Je travaille à fond","Flemme de travailler, tant pis","Je préfère voir des potes, j’en ai besoin","Je fais le minimum de révision");
        ListeEventApresMidiRandom[1] = new RandomEvent("Examen de Physique","Un examen de méca flotte pour la route ! Barandon ne rigole pas cette fois, révise bien le barrage !","Barrandon", "campus");
        ListeEventApresMidiRandom[1].initialiserTableauDeChoixRandom(-10, 10, 10, 0, -20, 10, 20, 0, 30, -20, -30, -10);
        ListeEventApresMidiRandom[1].initialiserTableauPhrases("Je travaille à fond","Flemme de travailler, tant pis","Je préfère voir des potes, j’en ai besoin","Je fais le minimum de révision");
        ListeEventApresMidiRandom[2] = new RandomEvent("Agressé dans la rue","Un malfrat t’approche avec un couteau et te menace ! Il veut ton portefeuille et ton téléphone ! Réagis vite !","Voleur", "rue");
        ListeEventApresMidiRandom[2].initialiserTableauDeChoixRandom(0, -10, -30, 0, -20, -10, 30, 0, 0, 0, 0, 0);
        ListeEventApresMidiRandom[2].initialiserTableauPhrases("Je lui donne tout ce que j’ai sur moi","Je m’enfuis en tapant mon meilleur sprint","Je réplique. Ça va chauffer. ","null");
        
        ListeEventSoir = new DailyEvent[1];
        ListeEventSoir[0] = new DailyEvent("Soir","Le soleil commence à se coucher… Après une longue journée bien occupée, il est temps de…","X", "chambre");
        ListeEventSoir[0].initialiserTableauDeChoixDaily(-10, 20, -10, 0, 0, 0, 10, 0, 20, 0, 0, 0);
        ListeEventSoir[0].initialiserTableauPhrases("Travailler tard, je suis en retard sur le programme !","Aller dormir, ça me fera du bien","Passer une soirée chill sur mon ordinateur","null");
        
        ListeEventSoirRandom = new RandomEvent[2];
        ListeEventSoirRandom[0] = new RandomEvent("Soirée","Une méga soirée vient d’être organisée par tous tes potes ce soir. Un programme bien chargé t’attends. Alors, tu fonces t’éclater ?","Antoine", "soiree");
        ListeEventSoirRandom[0].initialiserTableauDeChoixRandom(20, 0, -10, -20, -20, -20, 20, 40, 0, 20, 0, -20);
        ListeEventSoirRandom[0].initialiserTableauPhrases("Non, j’ai besoin de dormir","Non, j’ai besoin de bosser","Oui, mais j’y vais en mode chill","Oui, et j’y vais à fond !");
        ListeEventSoirRandom[1] = new RandomEvent("Ta copine te trompe","Tu viens d’apprendre que ta copine t’a trompé pendant une soirée auquel tu n’étais pas invité… Il faut prendre une décision.","Copine", "chambre");
        ListeEventSoirRandom[1].initialiserTableauDeChoixRandom(-10, 10, -10, -20, -20, 10, 0, 20, 20, -20, -10, -10);
        ListeEventSoirRandom[1].initialiserTableauPhrases("J’ai pas de copine !","Je me venge direct","Je laisse couler, mais que cette fois…","Je la quitte et je tourne la page");
        
        ListeEventWeekend = new DailyEvent[1];
        ListeEventWeekend[0] = new DailyEvent("Week-end","Enfin le Week-end ! Idéal pour rattraper le temps perdu ! Sur quoi est-ce que je devrai me concentrer ?","X", "chambre");
        ListeEventWeekend[0].initialiserTableauDeChoixDaily(-10, -10, 30, 0, -20, 30, -10, 0, 30, -20, -10, 0);
        ListeEventWeekend[0].initialiserTableauPhrases("Bosser !","Voir ses potes","Prendre soin de moi","Faire un peu de tout");
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
    
    public RandomEvent recupererEventSoirRandom(int num) {
        return ListeEventSoirRandom[num];
    }
    
    public DailyEvent recupererWeekend(int num) {
        return ListeEventWeekend[num];
    }
}