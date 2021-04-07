/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
package epf.life;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Utilisateur
 */
public class Images extends JLabel{
    
    ImageIcon img_Antoine = new javax.swing.ImageIcon(getClass().getResource("/images/Antoine.jpg"));
    ImageIcon img_Barrandon = new javax.swing.ImageIcon(getClass().getResource("/images/Barrandon.jpg"));
    ImageIcon img_Campus = new javax.swing.ImageIcon(getClass().getResource("/images/Campus.jpg"));
    ImageIcon img_Copine = new javax.swing.ImageIcon(getClass().getResource("/images/Copine.jpg"));
    ImageIcon img_Jousset = new javax.swing.ImageIcon(getClass().getResource("/images/Jousset.jpg"));
    ImageIcon img_Rue = new javax.swing.ImageIcon(getClass().getResource("/images/Rue.jpg"));
    ImageIcon img_Voleur = new javax.swing.ImageIcon(getClass().getResource("/images/Voleur.jpg"));
    ImageIcon img_Winston = new javax.swing.ImageIcon(getClass().getResource("/images/Winston.jpg"));
    ImageIcon img_Appartement = new javax.swing.ImageIcon(getClass().getResource("/images/appartement étudiant.jpg"));
    ImageIcon img_Foyer = new javax.swing.ImageIcon(getClass().getResource("/images/foyer.jpg"));
    ImageIcon img_Jauge = new javax.swing.ImageIcon(getClass().getResource("/images/jauge.jpg"));
    ImageIcon img_Soirée = new javax.swing.ImageIcon(getClass().getResource("/images/soirée.jpg"));
    
    String Nom;
    
    public Images(String nom) {
        Nom = nom;
    }
    
    public void modifierImage(String nom) {
        Nom=nom;
    }
    
    @Override
    public void paintComponent(Graphics G) {//on crée la fonction paintComponent qui va permettre d'afficher la cellule
        super.paintComponent(G);

        switch(Nom) {
            case "Antoine":
                setIcon(img_Antoine);
                break;
            case "Barrandon":
                setIcon(img_Barrandon);
            case "Campus":
                setIcon(img_Campus);
            case "Copine":
                setIcon(img_Copine);
            case "Jousset":
                setIcon(img_Jousset);
            case "Rue":
                setIcon(img_Rue);
            case "Voleur":
                    setIcon(img_Voleur);
            case "Winstone":
                setIcon(img_Winston);
            case "Appartement":
                setIcon(img_Appartement);
            case "Foyer":
                setIcon(img_Foyer);
            case "Jauge":
                setIcon(img_Jauge);
            case "Soirée":
                setIcon(img_Soirée);
            default:
        }
    }
}
