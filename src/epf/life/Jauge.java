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
    
    
    private int Valeur; //Valeur actuelle de la jauge
    
    private int ValeurMax = 100; //Valeur max de la jauge à ne pas dépasser
    
    private String Nom; //Nom de la jauge (Vie, Sociabilite, Education)
    
    private int Multiplicateur; //Difficulté choisie par le joueur
    
    
// ---------------------------- CONSTRUCTEUR -----------------------------------
    
    
    
    Jauge(int valeur, String nom, int multiplicateur) {
        this.Valeur = valeur;
        this.Nom = nom;
        this.Multiplicateur = multiplicateur;
        
    }
    
// -------------------- METHODE RECUPERATION ATTRIBUTS -------------------------

    
    public int LireValeur() { //On récupère la valeur de la jauge
        return Valeur;
    }
    
    public String LireNom() { //On récupère le nom de la jauge
        return Nom;
    }
    
    public String LireMultiplicateur() { //On récupère la difficulté
        return Nom;
    }

// -------------------- METHODE ACTION -------------------------

    
    public void affecterValeur(int valeurAajouter) { //Ajout ou retrait d'une valeur de la jauge
        
        Valeur = Valeur+(Multiplicateur*valeurAajouter); //On ajoute la valeur à la jauge en fonction de la difficulté
        
        if(Valeur>ValeurMax) { //On vérifie que la valeurMax n'est pas dépassée
            Valeur = ValeurMax; //Si c'est le cas, on affecte la valeur max. 
        }
    }
    
    
    
    
    
    
    
    
    
    
}
