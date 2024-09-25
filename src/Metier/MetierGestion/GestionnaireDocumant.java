package Metier.MetierGestion;
import java.sql.Date;
import java.util.ArrayList;

import Metier.MetierPOJO.document;
import persistance.DAOdocument;
public class GestionnaireDocumant {
    DAOdocument doc ;

    public GestionnaireDocumant(DAOdocument doc) {
        this.doc = doc;
    }
    public GestionnaireDocumant(){
        this.doc=new DAOdocument();
    }
    public boolean insertDocument(int id_document,int id_etape, Date date_depot,String text){
        return doc.insertDocument(id_document,id_etape,date_depot,text);
    }
    public boolean deleteDocument(int id_document){
        return doc.deleteDocument(id_document);
    }
    public boolean updateDocument(int id_document,int id_etape, Date date_depot,String text){
        return doc.updateDocument(id_document,id_etape,date_depot,text);
    }
    public ArrayList<document> getAllDocuments(){
        return doc.getAllDocuments();
    }
}
