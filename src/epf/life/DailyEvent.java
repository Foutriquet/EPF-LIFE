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
public class DailyEvent {

// ----------------------------- ATTRIBUTS ------------------------------------
    private String Nom; //Nom de l'event - sa référence

    private String Description; //Description de l'event

    private int TableauDeChoix[][]; //Tableau des valeurs à ajouter/enlever en fonction de la jauge

    private String NomPersonnage; //Nom des personnages liés à l'Event

    private String TableauPhrases[];

    private String FondAssocie;

// ---------------------------- CONSTRUCTEUR -----------------------------------
    DailyEvent(String nom, String description, String nompersonnage, String fond) {
//Ce constructeur permet la création d'un évènement avec toutes les descriptions écrites
        this.Nom = nom;
        this.Description = description;
        this.NomPersonnage = nompersonnage;
        this.TableauDeChoix = new int[3][4];
        this.TableauPhrases = new String[4];
        this.FondAssocie = fond;
    }

// -------------------- METHODE RECUPERATION ATTRIBUTS -------------------------
    public String LireNomDaily() { //On récupère le nom de l'Event
        return Nom;
    }

    public String LireDescriptionDaily() { //On récupère sa description
        return Description;
    }

    public String LireNomPersonnageDaily() { //On récupère le nom du personnage lié
        return NomPersonnage;
    }

    public int LireTableauDeChoixDaily(int jauge, int numeroDuChoix) { //On récupère le tableau des valeurs
        return TableauDeChoix[jauge][numeroDuChoix];
    }

    public String LireTableauDePhraseDaily(int choix) { //On récupère le tableau des valeurs
        return TableauPhrases[choix];
    }

    public String LireFondAssocieDaily() { //On récupère le nom du personnage lié
        return FondAssocie;
    }

// -------------------- METHODE ACTION -------------------------
    public void initialiserTableauDeChoixDaily(int jv1, int jv2, int jv3, int jv4, int js1, int js2, int js3, int js4, int je1, int je2, int je3, int je4) {

        //Remplissage du tableau par les valeurs correspondantes de chaque choix (choix par jauge)
        TableauDeChoix[0][0] = jv1;
        TableauDeChoix[0][1] = jv2;
        TableauDeChoix[0][2] = jv3;
        TableauDeChoix[0][3] = jv4;
        TableauDeChoix[1][0] = js1;
        TableauDeChoix[1][1] = js2;
        TableauDeChoix[1][2] = js3;
        TableauDeChoix[1][3] = js4;
        TableauDeChoix[2][0] = je1;
        TableauDeChoix[2][1] = je2;
        TableauDeChoix[2][2] = je3;
        TableauDeChoix[2][3] = je4;
    }

    public void initialiserTableauPhrases(String p1, String p2, String p3, String p4) {
        //Association des description des choix

        TableauPhrases[0] = p1;
        TableauPhrases[1] = p2;
        TableauPhrases[2] = p3;
        TableauPhrases[3] = p4;
    }
}
