package Metier.MetierGestion;
import java.sql.Date;
import java.util.ArrayList;

import Metier.MetierPOJO.Etape;
import persistance.DAOEtape;
public class GestionnaireEtape {
    DAOEtape etape ;

    public GestionnaireEtape(DAOEtape etape) {
        this.etape = etape;
    }
    public GestionnaireEtape(){
        this.etape =new DAOEtape();
    }
    public boolean insertEtape(int id_etape, int num_projet, int duree, Date date_depart, 
    int id_livraison) {
        return etape.insertEtape(id_etape, num_projet, duree, date_depart, id_livraison);

    }
    public boolean deleteEtape(int id_etape){
        return etape.deleteEtape(id_etape);
    }
    public boolean updateEtape(int id_etape, int num_projet, int duree, Date date_depart, 
    int id_livraison){
        return etape.updateEtape(id_etape, num_projet, duree, date_depart, id_livraison);
    }
    public ArrayList<Etape> getAllEtape() {
      return etape.getAllEtape();   
    }
    
}
