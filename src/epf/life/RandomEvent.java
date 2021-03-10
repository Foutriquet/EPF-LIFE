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
