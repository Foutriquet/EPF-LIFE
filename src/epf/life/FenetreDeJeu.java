/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
package epf.life;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Utilisateur
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDeJeu
     */
    private Jauge jaugeSante, jaugeSociabilite, jaugeEducation;
    private ListeEvent listeEvent = new ListeEvent();
    private boolean condition = false;
    private int choix;
    private int jour = 0;
    private int WE = 0;
    private int moment = 0;
    private int EventCourant;
    private boolean RoD;
    private int momentCourant;
    private boolean deuxevent = false;
    private int EventCourant2;
    private boolean RoD2;
    private int momentCourant2;
    ImageIcon img_Antoine = new javax.swing.ImageIcon(getClass().getResource("/images/Antoine.png"));
    ImageIcon img_Barrandon = new javax.swing.ImageIcon(getClass().getResource("/images/Barrandon.png"));
    ImageIcon img_Campus = new javax.swing.ImageIcon(getClass().getResource("/images/Campus.jpg"));
    ImageIcon img_Copine = new javax.swing.ImageIcon(getClass().getResource("/images/Copine.png"));
    ImageIcon img_Jousset = new javax.swing.ImageIcon(getClass().getResource("/images/Jousset.png"));
    ImageIcon img_Rue = new javax.swing.ImageIcon(getClass().getResource("/images/Rue.jpg"));
    ImageIcon img_Voleur = new javax.swing.ImageIcon(getClass().getResource("/images/Voleur.png"));
    ImageIcon img_Winston = new javax.swing.ImageIcon(getClass().getResource("/images/Winston.png"));
    ImageIcon img_Appartement = new javax.swing.ImageIcon(getClass().getResource("/images/appartement étudiant.jpg"));
    ImageIcon img_Foyer = new javax.swing.ImageIcon(getClass().getResource("/images/foyer.jpg"));
    ImageIcon img_Jauge = new javax.swing.ImageIcon(getClass().getResource("/images/jauge.jpg"));
    ImageIcon img_Soirée = new javax.swing.ImageIcon(getClass().getResource("/images/soirée.jpg"));
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/vide.png"));

    public FenetreDeJeu() {

        initComponents();

        //Affichage d'ambiance
        Regles.setVisible(true);
        JaugeEducationValeur.setVisible(false);
        JaugeSociabiliteValeur.setVisible(false);
        JaugeSanteValeur.setVisible(false);
        Jauges.setVisible(false);
        Personnage.setVisible(false);
        Evenement.setVisible(false);
        debut.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        Défaite.setVisible(false);
        Victoire.setVisible(false);

    }

    public void Jouer() {

        if (WE == 5) {
            moment = 4;
            ModifierTexteEvenementDaily(0, moment);
            RoD = false;
            momentCourant = 4;
            EventCourant = 0;
            WE = 0;
            jour += 2;
            moment = -1;
        } else {

            if (moment == 0) {
                //afficher fond appart

                //Calcul aléatoire
                Random random = new Random();

                if (random.nextInt(100) < 30) {
                    int choixdeevent = random.nextInt(2);
                    ModifierTexteEvenementRandom(choixdeevent, moment);
                    RoD = true;
                    momentCourant = 0;
                    EventCourant = choixdeevent;
                } else {
                    ModifierTexteEvenementDaily(0, moment);
                    RoD = false;
                    momentCourant = 0;
                    EventCourant = 0;
                }
            }

            //Fin moment 0
            // jour modulo 5 = 0
            //Fin matin
            if (moment == 1) {
                //afficher fond appart

                //Calcul aléatoire
                Random random = new Random();

                if (random.nextInt(100) < 30) {
                    int choixdeevent = random.nextInt(2);

                    ModifierTexteEvenementRandom(choixdeevent, moment);
                    RoD = true;
                    momentCourant = 1;
                    EventCourant = choixdeevent;
                } else {
                    ModifierTexteEvenementDaily(0, moment);
                    RoD = false;
                    momentCourant = 1;
                    EventCourant = 0;

                }
            }

            if (moment == 2) {
                //afficher fond appart

                //Calcul aléatoire
                Random random = new Random();

                if (random.nextInt(100) < 30) {
                    int choixdeevent = random.nextInt(3);

                    ModifierTexteEvenementRandom(choixdeevent, moment);
                    RoD = true;
                    momentCourant = 2;
                    EventCourant = choixdeevent;
                } else {
                    ModifierTexteEvenementDaily(0, moment);
                    RoD = false;
                    momentCourant = 2;
                    EventCourant = 0;
                }
            }
            if (moment == 3) {
                //afficher fond appart

                //Calcul aléatoire
                Random random = new Random();

                if (random.nextInt(100) < 30) {
                    int choixdeevent = random.nextInt(2);
                    if (choixdeevent == 0) {
                        ModifierTexteEvenementRandom(choixdeevent, moment);
                        RoD = true;
                        momentCourant = 3;
                        EventCourant = choixdeevent;
                    }

                } else {
                    ModifierTexteEvenementDaily(0, moment);
                    RoD = false;
                    momentCourant = 3;
                    EventCourant = 0;
                }
            }
        }

        moment++;

        if (moment == 4) {
            moment = 0;
            jour++;
            WE++;
        }

    }

    
    
    public void AjouterImages(boolean DR, int momentjournée, int eventcourant) {
        String NomPersonnage = null;
        String FondAssocie = null;

        if (DR == false) {
            switch (momentjournée) {
                case 0:

                    NomPersonnage = listeEvent.recupererEventMatin(eventcourant).LireNomPersonnageDaily();
                    FondAssocie = listeEvent.recupererEventMatin(eventcourant).LireFondAssocieDaily();
                    break;

                case 1:

                    NomPersonnage = listeEvent.recupererEventMidi(eventcourant).LireNomPersonnageDaily();
                    FondAssocie = listeEvent.recupererEventMidi(eventcourant).LireFondAssocieDaily();
                    break;

                case 2:
                    NomPersonnage = listeEvent.recupererEventApresMidi(eventcourant).LireNomPersonnageDaily();
                    FondAssocie = listeEvent.recupererEventApresMidi(eventcourant).LireFondAssocieDaily();
                    break;

                case 3:
                    NomPersonnage = listeEvent.recupererEventSoir(eventcourant).LireNomPersonnageDaily();
                    FondAssocie = listeEvent.recupererEventSoir(eventcourant).LireFondAssocieDaily();
                    break;
                
                    case 4:
                    NomPersonnage = listeEvent.recupererWeekend(eventcourant).LireNomPersonnageDaily();
                    FondAssocie = listeEvent.recupererWeekend(eventcourant).LireFondAssocieDaily();
                    break;

            }
        } else if (DR == true) {
            switch (momentjournée) {
                case 0:

                    NomPersonnage = listeEvent.recupererEventMatinRandom(eventcourant).lireNomPersonnageRandom();
                    FondAssocie = listeEvent.recupererEventMatinRandom(eventcourant).LireFondAssocieRandom();
                    break;

                case 1:

                    NomPersonnage = listeEvent.recupererEventMidiRandom(eventcourant).lireNomPersonnageRandom();
                    FondAssocie = listeEvent.recupererEventMidiRandom(eventcourant).LireFondAssocieRandom();
                    break;

                case 2:
                    NomPersonnage = listeEvent.recupererEventApresMidiRandom(eventcourant).lireNomPersonnageRandom();
                    FondAssocie = listeEvent.recupererEventApresMidiRandom(eventcourant).LireFondAssocieRandom();
                    break;

                case 3:
                    NomPersonnage = listeEvent.recupererEventSoirRandom(eventcourant).lireNomPersonnageRandom();
                    FondAssocie = listeEvent.recupererEventSoirRandom(eventcourant).LireFondAssocieRandom();
                    break;
            }
        }

        switch (NomPersonnage) {
            case "Antoine":
                Personnage.setIcon(img_Antoine);
                break;

            case "Barrandon":
                Personnage.setIcon(img_Barrandon);
                break;

            case "Copine":
                Personnage.setIcon(img_Copine);
                break;

            case "Jousset":
                Personnage.setIcon(img_Jousset);
                break;

            case "Voleur":
                Personnage.setIcon(img_Voleur);
                break;

            case "Winston":
                Personnage.setIcon(img_Winston);
                break;

            case "X":
                Personnage.setIcon(img_vide);
                break;

            default:
        }
        if (DR == false) {

            switch (FondAssocie) {

                case "campus":
                    ImageDeFond.setIcon(img_Campus);
                    break;

                case "rue":
                    ImageDeFond.setIcon(img_Rue);
                    break;

                case "chambre":
                    ImageDeFond.setIcon(img_Appartement);
                    break;

                case "foyer":
                    ImageDeFond.setIcon(img_Foyer);
                    break;

                case "soiree":
                    ImageDeFond.setIcon(img_Soirée);
                    break;

            }
        } else if (DR == true) {

            switch (FondAssocie) {

                case "campus":
                    ImageDeFond.setIcon(img_Campus);
                    break;

                case "rue":
                    ImageDeFond.setIcon(img_Rue);
                    break;

                case "chambre":
                    ImageDeFond.setIcon(img_Appartement);
                    break;

                case "foyer":
                    ImageDeFond.setIcon(img_Foyer);
                    break;

                case "soiree":
                    ImageDeFond.setIcon(img_Soirée);
                    break;

            }
        }

    }

    public void AjouterValeurJauges(int jaugevie, int jaugesociabilite, int jaugeeducation) {
        jaugeSante.affecterValeur(jaugevie);
        jaugeSociabilite.affecterValeur(jaugesociabilite);
        jaugeEducation.affecterValeur(jaugeeducation);

    }

    public void ModifierAffichageJauge() {
        JaugeEducationValeur.setText(jaugeEducation.LireValeur() + "/100");
        JaugeSanteValeur.setText(jaugeSante.LireValeur() + "/100");
        JaugeSociabiliteValeur.setText(jaugeSociabilite.LireValeur() + "/100");
    }

    public void ModifierTexteEvenementDaily(int numeroEvenement, int moment) {
        switch (moment) {
            case 0:
                DescriptionEvent.setText(listeEvent.recupererEventMatin(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventMatin(numeroEvenement).LireNomDaily());
                Choix1.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(0));
                Choix2.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(1));
                Choix3.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(2));

                if (listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(3));
                    Choix4.setEnabled(true);
                }

                break;

            case 1:
                DescriptionEvent.setText(listeEvent.recupererEventMidi(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventMidi(numeroEvenement).LireNomDaily());
                Choix1.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(0));
                Choix2.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(1));
                Choix3.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(2));

                if (listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(3));
                    Choix4.setEnabled(true);
                }

                break;
            case 2:
                DescriptionEvent.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireNomDaily());
                Choix1.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(0));
                Choix2.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(1));
                Choix3.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(2));

                if (listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(3));
                    Choix4.setEnabled(true);
                }

                break;
            case 3:
                DescriptionEvent.setText(listeEvent.recupererEventSoir(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventSoir(numeroEvenement).LireNomDaily());
                Choix1.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(0));
                Choix2.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(1));
                Choix3.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(2));

                if (listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(3));
                    Choix4.setEnabled(true);
                }

                break;
            case 4:
                DescriptionEvent.setText(listeEvent.recupererWeekend(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererWeekend(numeroEvenement).LireNomDaily());
                Choix1.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(0));
                Choix2.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(1));
                Choix3.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(2));

                if (listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(3));
                    Choix4.setEnabled(true);
                }

                break;
            default:
        }

    }

    public void ModifierTexteEvenementRandom(int numeroEvenement, int moment) {
        switch (moment) {
            case 0:
                DescriptionEvent.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).lireNomRandom());
                Choix1.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                Choix2.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                Choix3.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(2));

                if (listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(3));
                    Choix4.setEnabled(true);
                }

                break;

            case 1:
                DescriptionEvent.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).lireNomRandom());
                Choix1.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                Choix2.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                Choix3.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(2));

                if (listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3));
                    Choix4.setEnabled(true);
                }

                break;
            case 2:
                DescriptionEvent.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).lireNomRandom());
                Choix1.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                Choix2.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                Choix3.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(2));

                if (listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3));
                    Choix4.setEnabled(true);
                }

                break;
            case 3:
                DescriptionEvent.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).lireNomRandom());
                Choix1.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                Choix2.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                Choix3.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(2));

                if (listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {

                    Choix4.setText("");
                    Choix4.setEnabled(false);
                } else {
                    Choix4.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(3));
                    Choix4.setEnabled(true);
                }

                break;
            default:
        }

    }

    public void affectationvaleurjauge(boolean DR, int momentjournée, int eventcourant) {
        int jaugevie;
        int jaugesociabilite;
        int jaugeeducation;
        if (DR == false) {
            switch (momentjournée) {
                case 0:
                    jaugevie = listeEvent.recupererEventMatin(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererEventMatin(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererEventMatin(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 1:
                    jaugevie = listeEvent.recupererEventMidi(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererEventMidi(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererEventMidi(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 2:
                    jaugevie = listeEvent.recupererEventApresMidi(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererEventApresMidi(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererEventApresMidi(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 3:
                    jaugevie = listeEvent.recupererEventSoir(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererEventSoir(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererEventSoir(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 4:
                    jaugevie = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
            }
        } else {
            switch (momentjournée) {
                case 0:
                    jaugevie = listeEvent.recupererEventMatinRandom(eventcourant).lireTableauDeChoixRandom(0, choix);
                    jaugesociabilite = listeEvent.recupererEventMatinRandom(eventcourant).lireTableauDeChoixRandom(1, choix);
                    jaugeeducation = listeEvent.recupererEventMatinRandom(eventcourant).lireTableauDeChoixRandom(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 1:
                    jaugevie = listeEvent.recupererEventMidiRandom(eventcourant).lireTableauDeChoixRandom(0, choix);
                    jaugesociabilite = listeEvent.recupererEventMidiRandom(eventcourant).lireTableauDeChoixRandom(1, choix);
                    jaugeeducation = listeEvent.recupererEventMidiRandom(eventcourant).lireTableauDeChoixRandom(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 2:
                    jaugevie = listeEvent.recupererEventApresMidiRandom(eventcourant).lireTableauDeChoixRandom(0, choix);
                    jaugesociabilite = listeEvent.recupererEventApresMidiRandom(eventcourant).lireTableauDeChoixRandom(1, choix);
                    jaugeeducation = listeEvent.recupererEventApresMidiRandom(eventcourant).lireTableauDeChoixRandom(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 3:
                    jaugevie = listeEvent.recupererEventSoirRandom(eventcourant).lireTableauDeChoixRandom(0, choix);
                    jaugesociabilite = listeEvent.recupererEventSoirRandom(eventcourant).lireTableauDeChoixRandom(1, choix);
                    jaugeeducation = listeEvent.recupererEventSoirRandom(eventcourant).lireTableauDeChoixRandom(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
                case 4:
                    jaugevie = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(0, choix);
                    jaugesociabilite = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(1, choix);
                    jaugeeducation = listeEvent.recupererWeekend(eventcourant).LireTableauDeChoixDaily(2, choix);
                    AjouterValeurJauges(jaugevie, jaugesociabilite, jaugeeducation);
                    break;
            }
        }
    }

    public void verifierdefaite() {
        if (jaugeSante.LireValeur() <= 0 || jaugeSociabilite.LireValeur() <= 0 || jaugeEducation.LireValeur() <= 0) {
            JaugeEducationValeur.setVisible(false);
            JaugeSociabiliteValeur.setVisible(false);
            JaugeSanteValeur.setVisible(false);
            Jauges.setVisible(false);
            Personnage.setVisible(false);
            Evenement.setVisible(false);
            debut.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            Défaite.setVisible(true);
        }
    }

    public void verifiervictoire() {
        if (jour == 152) {
            JaugeEducationValeur.setVisible(false);
            JaugeSociabiliteValeur.setVisible(false);
            JaugeSanteValeur.setVisible(false);
            Jauges.setVisible(false);
            Personnage.setVisible(false);
            Evenement.setVisible(false);
            debut.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            Victoire.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bouton_demarrer = new javax.swing.JButton();
        Victoire = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Défaite = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        debut = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        diff_facile = new javax.swing.JButton();
        diff_moyen = new javax.swing.JButton();
        diff_moyen1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JaugeEducationValeur = new javax.swing.JLabel();
        JaugeSociabiliteValeur = new javax.swing.JLabel();
        JaugeSanteValeur = new javax.swing.JLabel();
        Jauges = new javax.swing.JLabel();
        Personnage = new javax.swing.JLabel();
        Evenement = new javax.swing.JPanel();
        NomEvent = new javax.swing.JLabel();
        DescriptionEvent = new javax.swing.JLabel();
        Choix1 = new javax.swing.JButton();
        Choix2 = new javax.swing.JButton();
        Choix3 = new javax.swing.JButton();
        Choix4 = new javax.swing.JButton();
        ImageDeFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regles.setBackground(new java.awt.Color(255, 255, 255));
        Regles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("~ Règles du Jeu ~");
        Regles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 285, 50));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setText("Bienvenue sur EPF Life");
        Regles.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 11, 426, 63));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel3.setText("Un jeu de Gestion, où le but est de survivre 1 semestre");
        Regles.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 85, 802, 57));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel4.setText("- Faîtes des choix au cours de la journée, à travers des");
        Regles.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 813, 68));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel5.setText("évènements quotidiens et aléatoires");
        Regles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 823, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel6.setText("- Veillez à garder vos trois jauges équilibrées. Si l'une ");
        Regles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 252, 824, 68));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel7.setText("tombe à 0, c'est game over");
        Regles.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 814, 40));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel8.setText("- Survivez 1 semestre, et c'est gagné :)");
        Regles.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 825, 79));

        bouton_demarrer.setBackground(new java.awt.Color(204, 255, 204));
        bouton_demarrer.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        bouton_demarrer.setText("Ok, j'ai compris ! Commençons ! ");
        bouton_demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_demarrerActionPerformed(evt);
            }
        });
        Regles.add(bouton_demarrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 535, 95));

        getContentPane().add(Regles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 680));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel17.setText("Tu es parvenu à survivre jusqu'au bout");

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel18.setText("Bienvenue en 3e année :)");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel19.setText("~ Merci d'avoir joué ~");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel20.setText("Bravo ! Le semestre est terminé !");

        javax.swing.GroupLayout VictoireLayout = new javax.swing.GroupLayout(Victoire);
        Victoire.setLayout(VictoireLayout);
        VictoireLayout.setHorizontalGroup(
            VictoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VictoireLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(VictoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VictoireLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(VictoireLayout.createSequentialGroup()
                        .addGroup(VictoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1144, Short.MAX_VALUE))))
        );
        VictoireLayout.setVerticalGroup(
            VictoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VictoireLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(Victoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel21.setText("Tu n'as pas survécu au semestre... ");

        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel22.setText("Tu peux retenter ta chance au prochain !");

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel23.setText("~ Merci d'avoir joué ~");

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel24.setText("Mince ! Une de tes jauges est arrivée à 0. ");

        javax.swing.GroupLayout DéfaiteLayout = new javax.swing.GroupLayout(Défaite);
        Défaite.setLayout(DéfaiteLayout);
        DéfaiteLayout.setHorizontalGroup(
            DéfaiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DéfaiteLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(DéfaiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DéfaiteLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DéfaiteLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DéfaiteLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))))
            .addGroup(DéfaiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DéfaiteLayout.createSequentialGroup()
                    .addContainerGap(154, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(134, 134, 134)))
        );
        DéfaiteLayout.setVerticalGroup(
            DéfaiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DéfaiteLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(DéfaiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DéfaiteLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        getContentPane().add(Défaite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        debut.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel9.setText("Situation...");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel10.setText("Tu es un(e) élève de l'EPF. Tu commences ta 2e année avec beaucoup de motivation");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel11.setText("Mais l'année va être difficile. Il ne va pas falloir relâcher tes efforts !");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel12.setText("Commençons par choisir un niveau de difficulté...");

        diff_facile.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        diff_facile.setText("Facile");
        diff_facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diff_facileActionPerformed(evt);
            }
        });

        diff_moyen.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        diff_moyen.setText("Moyen");
        diff_moyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diff_moyenActionPerformed(evt);
            }
        });

        diff_moyen1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        diff_moyen1.setText("Difficile");
        diff_moyen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diff_moyen1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel13.setText("C'est le début de l'Aventure. Tu t'apprêtes à te réveiller, c'est le jour de la rentrée. ");

        javax.swing.GroupLayout debutLayout = new javax.swing.GroupLayout(debut);
        debut.setLayout(debutLayout);
        debutLayout.setHorizontalGroup(
            debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debutLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(diff_facile, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(908, Short.MAX_VALUE))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(556, 556, 556)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(543, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(92, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(514, 514, 514)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(516, 516, 516)
                    .addComponent(diff_moyen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(514, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(947, Short.MAX_VALUE)
                    .addComponent(diff_moyen1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel13)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
        debutLayout.setVerticalGroup(
            debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debutLayout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(diff_facile, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(680, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(566, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(514, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(356, 356, 356)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(433, Short.MAX_VALUE)
                    .addComponent(diff_moyen, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(300, 300, 300)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(433, Short.MAX_VALUE)
                    .addComponent(diff_moyen1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(301, 301, 301)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(275, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(463, 463, 463)))
        );

        getContentPane().add(debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 1330, 790));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel14.setText("Santé");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel15.setText("Education");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel16.setText("Sociabilite");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 210, -1));

        JaugeEducationValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeEducationValeur.setText("100/100");
        getContentPane().add(JaugeEducationValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 50));

        JaugeSociabiliteValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeSociabiliteValeur.setText("100/100");
        getContentPane().add(JaugeSociabiliteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 190, 50));

        JaugeSanteValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeSanteValeur.setText("100/100");
        getContentPane().add(JaugeSanteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 180, 50));

        Jauges.setBackground(new java.awt.Color(255, 255, 255));
        Jauges.setForeground(new java.awt.Color(255, 255, 255));
        Jauges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jauge.jpg"))); // NOI18N
        Jauges.setText("jLabel2");
        Jauges.setPreferredSize(new java.awt.Dimension(1390, 192));
        getContentPane().add(Jauges, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1390, 192));

        Personnage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Antoine.png"))); // NOI18N
        Personnage.setText(" ");
        getContentPane().add(Personnage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 250, 500, 700));

        Evenement.setBackground(new java.awt.Color(255, 255, 255));

        NomEvent.setBackground(new java.awt.Color(0, 0, 0));
        NomEvent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NomEvent.setText("Titre Event");

        DescriptionEvent.setBackground(new java.awt.Color(0, 0, 0));
        DescriptionEvent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DescriptionEvent.setText("Description Event");

        Choix1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Choix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix1ActionPerformed(evt);
            }
        });

        Choix2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Choix2.setText("Choix2");
        Choix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix2ActionPerformed(evt);
            }
        });

        Choix3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Choix3.setText("Choix3");
        Choix3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix3ActionPerformed(evt);
            }
        });

        Choix4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Choix4.setText("Choix4");
        Choix4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EvenementLayout = new javax.swing.GroupLayout(Evenement);
        Evenement.setLayout(EvenementLayout);
        EvenementLayout.setHorizontalGroup(
            EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(NomEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(DescriptionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(Choix1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(660, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(Choix2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(659, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addGap(626, 626, 626)
                    .addComponent(Choix3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(627, Short.MAX_VALUE)
                    .addComponent(Choix4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71)))
        );
        EvenementLayout.setVerticalGroup(
            EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(NomEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(471, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(DescriptionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(286, Short.MAX_VALUE)
                    .addComponent(Choix1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(151, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(426, Short.MAX_VALUE)
                    .addComponent(Choix2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(286, Short.MAX_VALUE)
                    .addComponent(Choix3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(151, 151, 151)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(426, Short.MAX_VALUE)
                    .addComponent(Choix4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(Evenement, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 1190, 560));

        ImageDeFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campus.jpg"))); // NOI18N
        getContentPane().add(ImageDeFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Choix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix1ActionPerformed
        // TODO add your handling code here:
        choix = 0;
        affectationvaleurjauge(RoD, momentCourant, EventCourant);

        verifierdefaite();
        verifiervictoire();
        ModifierAffichageJauge();

        Jouer();
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_Choix1ActionPerformed

    private void Choix2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix2ActionPerformed
        // TODO add your handling code here:
        choix = 1;
        affectationvaleurjauge(RoD, momentCourant, EventCourant);

        verifierdefaite();
        verifiervictoire();
        ModifierAffichageJauge();

        Jouer();
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_Choix2ActionPerformed

    private void Choix3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix3ActionPerformed
        // TODO add your handling code here:
        choix = 2;
        affectationvaleurjauge(RoD, momentCourant, EventCourant);

        verifierdefaite();
        verifiervictoire();
        ModifierAffichageJauge();

        Jouer();
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_Choix3ActionPerformed

    private void Choix4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix4ActionPerformed
        // TODO add your handling code here:
        choix = 3;
        affectationvaleurjauge(RoD, momentCourant, EventCourant);

        verifierdefaite();
        verifiervictoire();
        
        ModifierAffichageJauge();

        Jouer();
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_Choix4ActionPerformed

    private void bouton_demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_demarrerActionPerformed
        // Affichage d'ambiance   

        Regles.setVisible(false);
        debut.setVisible(true);


    }//GEN-LAST:event_bouton_demarrerActionPerformed

    private void diff_facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diff_facileActionPerformed
        // TODO add your handling code here:

        debut.setVisible(false);
        JaugeEducationValeur.setVisible(true);
        JaugeSociabiliteValeur.setVisible(true);
        JaugeSanteValeur.setVisible(true);
        Jauges.setVisible(true);
        Personnage.setVisible(true);
        Evenement.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);

        float multiplicateur = (float) 1;
        jaugeSante = new Jauge(70, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(70, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(70, "Education", multiplicateur);
        ModifierAffichageJauge();

        //Daily
        ModifierTexteEvenementDaily(0, moment);
        RoD = false;
        moment = 1;
        EventCourant = 0;
        momentCourant = 0;
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_diff_facileActionPerformed

    private void diff_moyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diff_moyenActionPerformed
        // TODO add your handling code here:

        debut.setVisible(false);
        JaugeEducationValeur.setVisible(true);
        JaugeSociabiliteValeur.setVisible(true);
        JaugeSanteValeur.setVisible(true);
        Jauges.setVisible(true);
        Personnage.setVisible(true);
        Evenement.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);

        float multiplicateur = (float) 1.25;
        jaugeSante = new Jauge(60, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(60, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(60, "Education", multiplicateur);
        ModifierAffichageJauge();
        //Daily
        ModifierTexteEvenementDaily(0, moment);
        RoD = false;
        moment = 1;
        EventCourant = 0;
        momentCourant = 0;
        AjouterImages(RoD, momentCourant, EventCourant);
    }//GEN-LAST:event_diff_moyenActionPerformed

    private void diff_moyen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diff_moyen1ActionPerformed
        // TODO add your handling code here:

        debut.setVisible(false);
        JaugeEducationValeur.setVisible(true);
        JaugeSociabiliteValeur.setVisible(true);
        JaugeSanteValeur.setVisible(true);
        Jauges.setVisible(true);
        Personnage.setVisible(true);
        Evenement.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);

        float multiplicateur = (float) 1.5;
        jaugeSante = new Jauge(50, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(50, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(50, "Education", multiplicateur);
        ModifierAffichageJauge();

        //Daily
        ModifierTexteEvenementDaily(0, moment);
        RoD = false;
        moment = 1;
        EventCourant = 0;
        momentCourant = 0;
        AjouterImages(RoD, momentCourant, EventCourant);

    }//GEN-LAST:event_diff_moyen1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Choix1;
    private javax.swing.JButton Choix2;
    private javax.swing.JButton Choix3;
    private javax.swing.JButton Choix4;
    private javax.swing.JLabel DescriptionEvent;
    private javax.swing.JPanel Défaite;
    private javax.swing.JPanel Evenement;
    private javax.swing.JLabel ImageDeFond;
    private javax.swing.JLabel JaugeEducationValeur;
    private javax.swing.JLabel JaugeSanteValeur;
    private javax.swing.JLabel JaugeSociabiliteValeur;
    private javax.swing.JLabel Jauges;
    private javax.swing.JLabel NomEvent;
    private javax.swing.JLabel Personnage;
    private javax.swing.JPanel Regles;
    private javax.swing.JPanel Victoire;
    private javax.swing.JButton bouton_demarrer;
    private javax.swing.JPanel debut;
    private javax.swing.JButton diff_facile;
    private javax.swing.JButton diff_moyen;
    private javax.swing.JButton diff_moyen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void setIcon(ImageIcon img_Antoine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
