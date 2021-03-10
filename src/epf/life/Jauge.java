package epf.life;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilisateur
 */
public class Jauge {
   
    
// Attributs --------------------------------------
    
    
    private int Valeur;
    private int ValeurMax;
    private String Nom;
    
    
// --------------------------------------
    
    
    
    Jauge(int valeur, int valeurmax, String nom) {
        this.Valeur = valeur;
        this.ValeurMax = valeurmax;
        this.Nom = nom;
        
    }
    
    public int LireValeur() {
        return Valeur;
    }
    
    public int LireValeurMax() {
        return ValeurMax;
    }
    
    public String LireNom() {
        return Nom;
    }
    
    public void affecterValeur(int valeurAajouter) {
        Valeur += valeurAajouter;
        
        if(Valeur>100) {
            Valeur = 100;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
