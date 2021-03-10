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
    
    private String Nom;
    private String Description;
    private int TableauDeChoix[][];
    private String NomPersonnage;
    
    public RandomEvent(String nom,String description, String nompersonnage) {
        Nom=nom;
        Description=description;
        TableauDeChoix = new int[3][4];
        NomPersonnage = nompersonnage;
    }
    
    public void initialiserTableauDeChoix(int jv1, int jv2, int jv3,int jv4, int js1, int js2, int js3, int js4, int je1, int je2, int je3, int je4) {
        TableauDeChoix[1][1]=jv1;
        TableauDeChoix[1][2]=jv2;
        TableauDeChoix[1][3]=jv3;
        TableauDeChoix[1][4]=jv4;
        TableauDeChoix[2][1]=js1;
        TableauDeChoix[2][2]=js2;
        TableauDeChoix[2][3]=js3;
        TableauDeChoix[2][4]=js4;
        TableauDeChoix[3][1]=je1;
        TableauDeChoix[3][2]=je2;
        TableauDeChoix[3][3]=je3;
        TableauDeChoix[3][4]=je4;
    }
    
    public String lireNom() {
        return Nom;
    }
    
    public String lireDescription() {
        return Description;
    }
    
    public int lireTableauDeChoix(int i, int j) {
        return TableauDeChoix[i][j];
    }
    
    public String lireNomPersonnage() {
        return NomPersonnage;
    }
}
