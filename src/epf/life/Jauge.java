package epf.life;

/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
/**
 *
 * @author Utilisateur
 */
public class Jauge {

// ----------------------------- ATTRIBUTS ------------------------------------
    private float Valeur; //Valeur actuelle de la jauge

    private float ValeurMax = 100; //Valeur max de la jauge à ne pas dépasser

    private String Nom; //Nom de la jauge (Sante, Sociabilite, Education)

    private float Multiplicateur; //Difficulté choisie par le joueur

// ---------------------------- CONSTRUCTEUR -----------------------------------
    public Jauge(float valeur, String nom, float multiplicateur) {
        this.Valeur = valeur;
        this.Nom = nom;
        this.Multiplicateur = multiplicateur;

    }

// -------------------- METHODE RECUPERATION ATTRIBUTS -------------------------
    public float LireValeur() { //On récupère la valeur de la jauge
        return Valeur;
    }

    public String LireNom() { //On récupère le nom de la jauge
        return Nom;
    }

    public String LireMultiplicateur() { //On récupère la difficulté
        return Nom;
    }

// -------------------- METHODE INCREMENTATION -------------------------
    public void affecterValeur(int valeurAajouter) { //Ajout ou retrait d'une valeur de la jauge

        if (valeurAajouter < 0) { //On vérifie si la jauge va perdre des points ou en gagner
            
            //Si elle en perd, on applique le multiplicateur
            Valeur = Valeur + (Multiplicateur * ((float) valeurAajouter));
        } else {
            //Si elle en gagne, on ajoute simplement
            Valeur = Valeur + ((float) valeurAajouter);
        }

        if (Valeur > ValeurMax) { //On vérifie que la valeurMax n'est pas dépassée
            Valeur = ValeurMax; //Si c'est le cas, on affecte la valeur max. 
        }
    }

}
