/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
package epf.life;

import java.awt.Graphics;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Utilisateur
 */
public class Images extends JLabel {

    RandomEvent EventRandom;
    DailyEvent EventDaily;
    String EvenementCourant;
    String NomPersonnage;
    String FondDaily;
    String FondRandom;

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

    //Constructeur pour un evenement daily et Random
    public Images(RandomEvent evenement) {
        FondRandom = evenement.LireFondAssocieRandom();
        NomPersonnage = evenement.lireNomPersonnageRandom();
        EvenementCourant = "Random";
    }

    public Images(DailyEvent evenement) {
        FondDaily = evenement.LireFondAssocieDaily();
        NomPersonnage = evenement.LireNomPersonnageDaily();
        EvenementCourant = "Daily";
    }

    @Override
    public void paintComponent(Graphics G) {//on crée la fonction paintComponent qui va permettre d'afficher la cellule
        super.paintComponent(G);

        switch (NomPersonnage) {
            case "Antoine":
                setIcon(img_Antoine);
                break;

            case "Barrandon":
                setIcon(img_Barrandon);
                break;

            case "Copine":
                setIcon(img_Copine);
                break;

            case "Jousset":
                setIcon(img_Jousset);
                break;

            case "Voleur":
                setIcon(img_Voleur);
                break;

            case "Winston":
                setIcon(img_Winston);
                break;

            case "X":
                setIcon(img_vide);
                break;

            default:
        }

        if (EvenementCourant == "Daily") {

            switch (FondDaily) {

                case "campus":
                    setIcon(img_Campus);
                    break;

                case "rue":
                    setIcon(img_Rue);
                    break;

                case "chambre":
                    setIcon(img_Appartement);
                    break;

                case "foyer":
                    setIcon(img_Foyer);
                    break;

                case "soiree":
                    setIcon(img_Soirée);
                    break;

            }
        } else if (EvenementCourant == "Random") {

            switch (FondRandom) {

                case "campus":
                    setIcon(img_Campus);
                    break;

                case "rue":
                    setIcon(img_Rue);
                    break;

                case "chambre":
                    setIcon(img_Appartement);
                    break;

                case "foyer":
                    setIcon(img_Foyer);
                    break;

                case "soiree":
                    setIcon(img_Soirée);
                    break;

            }
        }
    }

}
