package presentation.BackOffice;


public class ControlleurDepartement {
    private GetAllProf prof ;
    private GetAllEtdDepartement etd ;
     private getAllProfDepartement pr;
     private getAllDepartement dep;
     private pageModifDepart modf;
     private pageSuppDepart sup;
     private departement etd1 ;

    public void demmarrerApplicationVoirProfParDepar() {
        this.prof = new GetAllProf(this);
        this.prof.setVisible(true);
    }    
    public void afficherListe(){
        this.prof = new GetAllProf(this);
        this.prof.setVisible(true);
    }
    public void demmarrerApplication() {
         this.etd1 = new departement(this);
        this.etd1.setVisible(true);
    }
    public void demarrerApplicationVoirEtdDeparte(){
        this.etd = new GetAllEtdDepartement(this);
        this.etd.setVisible(true);
    }
    public void demarrerApplicationVoirProfDeparte(){
        this.pr = new getAllProfDepartement(this);
        this.pr.setVisible(true);
    }
    public void demarrerApplicationAllDepart(){
        this.dep = new getAllDepartement(this);
        this.dep.setVisible(true);
    }
    public void afficherPageModif(){
        this.modf = new pageModifDepart(this);
        this.modf.setVisible(true);
    }
    public void afficherPageSupp(){
        this.sup =new pageSuppDepart(this);
        this.sup.setVisible(true);
    }
}