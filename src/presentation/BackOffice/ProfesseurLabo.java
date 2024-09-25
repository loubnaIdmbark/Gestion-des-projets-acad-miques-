
package presentation.BackOffice;

import Metier.MetierGestion.GestionnaireLabo;
import Metier.MetierGestion.GestionnaireProfesseur;
import Metier.MetierPOJO.Laboratoire;
import Metier.MetierPOJO.Professeur;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProfesseurLabo extends javax.swing.JFrame {
    GestionnaireLabo etdG = new GestionnaireLabo();
        Laboratoire etd = new Laboratoire();
        GestionnaireProfesseur pr = new GestionnaireProfesseur();
        DefaultTableModel model ;

    public ProfesseurLabo(ControlleurLaboratoire c) {

        initComponents();
        tableDoctorant();
        this.controlleurlabo = c;     }
    
          public void Table( JTable tableDepartement){
        tableDepartement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDepartement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "NOM", "PRENOM" 
            }
        ));
        jScrollPane1.setViewportView(tableProfesseur);}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProfesseur = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nomLabo = new javax.swing.JTextField();
        EntrerLabo = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/img/clipboard.png"))); // NOI18N
        jLabel1.setText("LISTE DOCTORANT / LABORATOIRE ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTE PROFESSEUR");

        tableProfesseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id ", "Nom", "Prenom"
            }
        ));
        jScrollPane1.setViewportView(tableProfesseur);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTRER LE NOM DE LABORATOIRE");

        nomLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomLaboActionPerformed(evt);
            }
        });

        EntrerLabo.setBackground(new java.awt.Color(255, 102, 102));
        EntrerLabo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        EntrerLabo.setText("ENTRER");
        EntrerLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrerLaboActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EntrerLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntrerLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(806, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomLaboActionPerformed

    private void EntrerLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrerLaboActionPerformed
        String nom_labo = nomLabo.getText();

        try {
            // Utiliser le nom du labo récupéré pour récupérer la liste des étudiants
            ArrayList<Professeur> etudiants = etdG.getAllProfesseur(nom_labo);

            // Créer un modèle de tableau pour la liste des étudiants récupérée
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("CNE");
            model.addColumn("Nom");
            model.addColumn("Prenom");
            for (Professeur etd : etudiants) {
                model.addRow(new Object[]{etd.getId_professeur(), etd.getNom(), etd.getPrenom()});
            }

            // Définir le modèle de tableau de la JTable pour afficher la liste des étudiants
            tableProfesseur.setModel(model);
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_EntrerLaboActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrerLabo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomLabo;
    private javax.swing.JTable tableProfesseur;
    // End of variables declaration//GEN-END:variables
    private ControlleurLaboratoire controlleurlabo;
    private void tableDoctorant() {
    ArrayList<Professeur> lis =pr.getAllProfesseur();
        model =(DefaultTableModel)tableProfesseur.getModel();
        Object[] ob = new Object[6];
        for (int i = 0 ; i<lis.size() ; i++){
            ob[0] = lis.get(i).getId_professeur();
            ob[1] = lis.get(i).getNom();
            ob[2] = lis.get(i).getPrenom();
           // ob[3] = lis.get(i).getgrade();

            model.addRow(ob);    }
    }

    private void Actualiser() {
        nomLabo.setText(null);
        
}}

