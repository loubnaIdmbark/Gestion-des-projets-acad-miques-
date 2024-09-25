
package presentation.BackOffice;

import Metier.MetierGestion.GestionnaireLabo;
import Metier.MetierPOJO.Laboratoire;
import presentation.BackOffice.DoctorantLabo;
import presentation.BackOffice.ProfesseurLabo;




public class ControlleurLaboratoire {
    private Laboratoirefenetre labo;
    private GestionnaireLabo gestionLabo;
    private  SuppressionLaboratoire pageSup ;
    private ModificationLaboratoire pageMod;
    private ProfesseurLabo etudiant;
    private DoctorantLabo doct;
    
    
    
    public void demmarrerApplication() {
        this.labo = new Laboratoirefenetre(this);
        this.labo.setVisible(true);
      
}
    public void afficherPageSupp() {
        
        this.pageSup  = new SuppressionLaboratoire(this);
        this.pageSup.setVisible(true);
        
    }
    public void afficherPageMod(){
        this.pageMod = new ModificationLaboratoire(this);
        this.pageMod.setVisible(true);
        
    }

    public void demmarrerApplicationProf() {
        this.etudiant = new ProfesseurLabo(this);
        this.etudiant.setVisible(true);
    }    
    public void demmarrerApplicationDoc(){
        this.doct = new DoctorantLabo(this);
        this.doct.setVisible(true);
    }
    public void afficherListe(){
        this.etudiant = new ProfesseurLabo(this);
        this.etudiant.setVisible(true);
    }
    
    
}
