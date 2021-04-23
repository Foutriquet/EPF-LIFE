/*
 * Projet Programmation - EPF LIFE
 * A.SYLARD / N.TROUILLET / M.PHELIP / M.GOMBAULT
 * Classe Jauge
 */
package epf.life;

import javax.swing.ImageIcon;

/**
 *
 * @author Utilisateur
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDeJeu
     */
    private Jauge jaugeSante, jaugeSociabilite, jaugeEducation;
    private ListeEvent listeEvent;
    

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


        ModifierAffichageJauge();
        

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
        switch(moment) {
            case 0:
                DescriptionEvent.setText(listeEvent.recupererEventMatin(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventMatin(numeroEvenement).LireNomDaily());
                DescriptionChoix1.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(0));
                DescriptionChoix2.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(1));
                DescriptionChoix3.setText(listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(2));
                
                if (listeEvent.recupererEventMatin(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
                
            case 1:
                DescriptionEvent.setText(listeEvent.recupererEventMidi(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventMidi(numeroEvenement).LireNomDaily());
                DescriptionChoix1.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(0));
                DescriptionChoix2.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(1));
                DescriptionChoix3.setText(listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(2));
                
                if (listeEvent.recupererEventMidi(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            case 2:
                DescriptionEvent.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireNomDaily());
                DescriptionChoix1.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(0));
                DescriptionChoix2.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(1));
                DescriptionChoix3.setText(listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(2));
                
                if (listeEvent.recupererEventApresMidi(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            case 3:
                DescriptionEvent.setText(listeEvent.recupererEventSoir(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererEventSoir(numeroEvenement).LireNomDaily());
                DescriptionChoix1.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(0));
                DescriptionChoix2.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(1));
                DescriptionChoix3.setText(listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(2));
                
                if (listeEvent.recupererEventSoir(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            case 4:
                DescriptionEvent.setText(listeEvent.recupererWeekend(numeroEvenement).LireDescriptionDaily());
                NomEvent.setText(listeEvent.recupererWeekend(numeroEvenement).LireNomDaily());
                DescriptionChoix1.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(0));
                DescriptionChoix2.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(1));
                DescriptionChoix3.setText(listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(2));
                
                if (listeEvent.recupererWeekend(numeroEvenement).LireTableauDePhraseDaily(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            default:
        }
        
    }
    
    public void ModifierTexteEvenementRandom(int numeroEvenement, int moment) {
        switch(moment) {
            case 0:
                DescriptionEvent.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).lireNomRandom());
                DescriptionChoix1.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                DescriptionChoix2.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                DescriptionChoix3.setText(listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(2));
                
                if (listeEvent.recupererEventMatinRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
                
            case 1:
                DescriptionEvent.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).lireNomRandom());
                DescriptionChoix1.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                DescriptionChoix2.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                DescriptionChoix3.setText(listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(2));
                
                if (listeEvent.recupererEventMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            case 2:
                DescriptionEvent.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).lireNomRandom());
                DescriptionChoix1.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                DescriptionChoix2.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                DescriptionChoix3.setText(listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(2));
                
                if (listeEvent.recupererEventApresMidiRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            case 3:
                DescriptionEvent.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).lireDescriptionRandom());
                NomEvent.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).lireNomRandom());
                DescriptionChoix1.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(0));
                DescriptionChoix2.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(1));
                DescriptionChoix3.setText(listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(2));
                
                if (listeEvent.recupererEventSoirRandom(numeroEvenement).LireTableauDePhraseRandom(3) == "null") {
                    
                DescriptionChoix4.setText("");
                }
                
                break;
            default:
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

        debut = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        diff_facile = new javax.swing.JButton();
        diff_moyen = new javax.swing.JButton();
        diff_moyen1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
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
        JaugeEducationValeur = new javax.swing.JLabel();
        JaugeSociabiliteValeur = new javax.swing.JLabel();
        JaugeSanteValeur = new javax.swing.JLabel();
        Jauges = new javax.swing.JLabel();
        Personnage = new javax.swing.JLabel();
        Evenement = new javax.swing.JPanel();
        NomEvent = new javax.swing.JLabel();
        DescriptionEvent = new javax.swing.JLabel();
        DescriptionChoix1 = new javax.swing.JLabel();
        DescriptionChoix2 = new javax.swing.JLabel();
        DescriptionChoix3 = new javax.swing.JLabel();
        DescriptionChoix4 = new javax.swing.JLabel();
        Choix1 = new javax.swing.JButton();
        Choix2 = new javax.swing.JButton();
        Choix3 = new javax.swing.JButton();
        Choix4 = new javax.swing.JButton();
        ImageDeFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(868, Short.MAX_VALUE))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(556, 556, 556)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(503, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(514, 514, 514)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(516, 516, 516)
                    .addComponent(diff_moyen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(474, Short.MAX_VALUE)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
                    .addContainerGap(907, Short.MAX_VALUE)
                    .addComponent(diff_moyen1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
            .addGroup(debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(debutLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel13)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        debutLayout.setVerticalGroup(
            debutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debutLayout.createSequentialGroup()
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

        getContentPane().add(debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 1290, 790));

        Regles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("~ Règles du Jeu ~");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setText("Bienvenue sur EPF Life");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel3.setText("Un jeu de Gestion, où le but est de survivre 1 semestre");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel4.setText("- Faîtes des choix au cours de la journée, à travers des");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel5.setText("évènements quotidiens et aléatoires");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel6.setText("- Veillez à garder vos trois jauges équilibrées. Si l'une ");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel7.setText("tombe à 0, c'est game over");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel8.setText("- Survivez 1 semestre, et c'est gagné :)");

        bouton_demarrer.setBackground(new java.awt.Color(204, 255, 204));
        bouton_demarrer.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        bouton_demarrer.setText("Ok, j'ai compris ! Commençons ! ");
        bouton_demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_demarrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReglesLayout = new javax.swing.GroupLayout(Regles);
        Regles.setLayout(ReglesLayout);
        ReglesLayout.setHorizontalGroup(
            ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReglesLayout.createSequentialGroup()
                .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReglesLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReglesLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(bouton_demarrer, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(235, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );
        ReglesLayout.setVerticalGroup(
            ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReglesLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(bouton_demarrer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(478, Short.MAX_VALUE)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReglesLayout.createSequentialGroup()
                    .addContainerGap(243, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(329, 329, 329)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(286, 286, 286)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(306, Short.MAX_VALUE)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(334, 334, 334)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
            .addGroup(ReglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReglesLayout.createSequentialGroup()
                    .addGap(421, 421, 421)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        getContentPane().add(Regles, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 860, 640));

        JaugeEducationValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeEducationValeur.setText("100/100");
        getContentPane().add(JaugeEducationValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 50));

        JaugeSociabiliteValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeSociabiliteValeur.setText("100/100");
        getContentPane().add(JaugeSociabiliteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 140, 50));

        JaugeSanteValeur.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JaugeSanteValeur.setText("100/100");
        getContentPane().add(JaugeSanteValeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 80, 150, 50));

        Jauges.setBackground(new java.awt.Color(255, 255, 255));
        Jauges.setForeground(new java.awt.Color(255, 255, 255));
        Jauges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jauge.jpg"))); // NOI18N
        Jauges.setText("jLabel2");
        Jauges.setPreferredSize(new java.awt.Dimension(1390, 192));
        getContentPane().add(Jauges, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1390, 192));

        Personnage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Antoine.png"))); // NOI18N
        Personnage.setText("jLabel1");
        getContentPane().add(Personnage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 250, 500, 700));

        Evenement.setBackground(new java.awt.Color(255, 255, 255));

        NomEvent.setBackground(new java.awt.Color(0, 0, 0));
        NomEvent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NomEvent.setText("Titre Event");

        DescriptionEvent.setBackground(new java.awt.Color(0, 0, 0));
        DescriptionEvent.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DescriptionEvent.setText("Description Event");

        DescriptionChoix1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        DescriptionChoix1.setText("DescriptionChoix1");

        DescriptionChoix2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        DescriptionChoix2.setText("DescriptionChoix2");

        DescriptionChoix3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        DescriptionChoix3.setText("DescriptionChoix3");

        DescriptionChoix4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        DescriptionChoix4.setText("DescriptionChoix4");

        Choix1.setText("Choix1");
        Choix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix1ActionPerformed(evt);
            }
        });

        Choix2.setText("Choix2");
        Choix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix2ActionPerformed(evt);
            }
        });

        Choix3.setText("Choix3");
        Choix3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choix3ActionPerformed(evt);
            }
        });

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
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(73, Short.MAX_VALUE)
                    .addComponent(DescriptionChoix1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(692, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(DescriptionChoix2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addGap(663, 663, 663)
                    .addComponent(DescriptionChoix3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EvenementLayout.createSequentialGroup()
                    .addGap(665, 665, 665)
                    .addComponent(DescriptionChoix4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
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
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(311, Short.MAX_VALUE)
                    .addComponent(DescriptionChoix1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(174, Short.MAX_VALUE)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(449, Short.MAX_VALUE)
                    .addComponent(DescriptionChoix2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(DescriptionChoix3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(175, 175, 175)))
            .addGroup(EvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvenementLayout.createSequentialGroup()
                    .addContainerGap(449, Short.MAX_VALUE)
                    .addComponent(DescriptionChoix4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
        );

        getContentPane().add(Evenement, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 1190, 560));

        ImageDeFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Campus.jpg"))); // NOI18N
        getContentPane().add(ImageDeFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Choix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Choix1ActionPerformed

    private void Choix2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Choix2ActionPerformed

    private void Choix3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Choix3ActionPerformed

    private void Choix4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choix4ActionPerformed
        // TODO add your handling code here:
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

        float multiplicateur = (float) 1;
        jaugeSante = new Jauge(70, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(70, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(70, "Education", multiplicateur);

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

        float multiplicateur = (float) 1.25;
        jaugeSante = new Jauge(60, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(60, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(60, "Education", multiplicateur);

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

        float multiplicateur = (float) 1.5;
        jaugeSante = new Jauge(50, "Sante", multiplicateur);
        jaugeSociabilite = new Jauge(50, "Sociabilite", multiplicateur);
        jaugeEducation = new Jauge(50, "Education", multiplicateur);

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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel DescriptionChoix1;
    private javax.swing.JLabel DescriptionChoix2;
    private javax.swing.JLabel DescriptionChoix3;
    private javax.swing.JLabel DescriptionChoix4;
    private javax.swing.JLabel DescriptionEvent;
    private javax.swing.JPanel Evenement;
    private javax.swing.JLabel ImageDeFond;
    private javax.swing.JLabel JaugeEducationValeur;
    private javax.swing.JLabel JaugeSanteValeur;
    private javax.swing.JLabel JaugeSociabiliteValeur;
    private javax.swing.JLabel Jauges;
    private javax.swing.JLabel NomEvent;
    private javax.swing.JLabel Personnage;
    private javax.swing.JPanel Regles;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
