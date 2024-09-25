package Metier.MetierPOJO;

import java.util.Date;
import java.util.List;

public class Etape {
	
	private int id_etape;
	private int num_projet;
	private int duree;
	private Date date_depart;
	private List  <document> documents;
	private document livraison;

	//constructeur
	public Etape(int id_etape , int num_projet, int duree, Date date_depart,List <document> doc,int livraison) {
		super();
		this.id_etape = id_etape;
		this.num_projet = num_projet;
		this.duree = duree;
		this.date_depart = date_depart;
		this.documents=doc;
		
	}

	public Etape(int id_etape, int num_projet, int duree, Date date_depart, int livraison) {
		// TODO Auto-generated constructor stub
		this.id_etape = id_etape;
		this.num_projet = num_projet;
		this.duree = duree;
		this.date_depart = date_depart;
		
    }

    public int getId_etape() {
		return id_etape;
	}
	public void setId_etape(int id_etape) {
		this.id_etape = id_etape;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	
	public List<document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<document> documents) {
		this.documents = documents;
	}
	//add document to documents
	public void addDocumentToDocuments(document doc) {
		this.documents.add(doc);
	}
	
	

	//to string
	@Override
	public String toString() {
		return "Etape [id_etape=" + id_etape +", numero de projet"+ num_projet +", duree=" + duree + ", date_depart=" + date_depart + ", livraison="
				+ livraison + "]";
	}
	
}
