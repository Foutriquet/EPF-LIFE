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
public class RandomEvent {

       
    
// ----------------------------- ATTRIBUTS ------------------------------------
    
    
    private String Nom; //Nom de l'event - sa référence
    
    private String Description; //Description de l'event
    
    private int TableauDeChoix[][]; //Tableau des valeurs à ajouter/enlever en fonction de la jauge
    
    private String NomPersonnage; //Nom des personnages liés à l'Event
           
    
// ---------------------------- CONSTRUCTEUR -----------------------------------
    
    
    
    public RandomEvent(String nom,String description, String nompersonnage) {
        Nom=nom;
        Description=description;
        TableauDeChoix = new int[3][4];
        NomPersonnage = nompersonnage;
    }
    
    
// -------------------- METHODE ACTION -------------------------

    
    public void initialiserTableauDeChoixRandom(int jv1, int jv2, int jv3,int jv4, int js1, int js2, int js3, int js4, int je1, int je2, int je3, int je4) {
        
        //Remplissage du tableau par les valeurs correspondantes 
        
        TableauDeChoix[0][0]=jv1;
        TableauDeChoix[0][1]=jv2;
        TableauDeChoix[0][2]=jv3;
        TableauDeChoix[0][3]=jv4;
        TableauDeChoix[1][0]=js1;
        TableauDeChoix[1][1]=js2;
        TableauDeChoix[1][2]=js3;
        TableauDeChoix[1][3]=js4;
        TableauDeChoix[2][0]=je1;
        TableauDeChoix[2][1]=je2;
        TableauDeChoix[2][2]=je3;
        TableauDeChoix[2][3]=je4;
    }
        
    
// -------------------- METHODE RECUPERATION ATTRIBUTS -------------------------

    
    public String lireNomRandom() { //On récupère le nom de l'Event
        return Nom;
    }
    
    public String lireDescriptionRandom() { //On récupère sa description
        return Description;
    }
    
    public int lireTableauDeChoixRandom(int i, int j) { //On récupère le tableau des valeurs
        return TableauDeChoix[i][j];
    }
    
    public String lireNomPersonnageRandom() { //On récupère le nom du personnage lié
        return NomPersonnage;
    }
}
