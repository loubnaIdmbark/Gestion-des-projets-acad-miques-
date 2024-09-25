package Metier.MetierPOJO;

import java.util.Date;

public class document {
	
	private int id_document;
	private int id_etape;
	private Date date_depot;
	private String text;

	//constructeur
	public document(int id_doc,int id, Date date_depot,String text) {
		super();
		this.id_document=id_doc;
		this.id_etape=id;
		this.date_depot = date_depot;
		this.text=text;
	}

	//getters and setters
	public int getId_document() {
		return id_document;
	}
	public void setId_document(int id_document) {
		this.id_document = id_document;
	}
	public int getId_etape() {
		return id_etape;
	}
	public void setId_etape(int id_etape) {
		this.id_etape = id_etape;
	}
	public Date getDate_depot() {
		return date_depot;
	}
	public void setDate_depot(Date date_depot) {
		this.date_depot = date_depot;
	}
	
	//to string
	@Override
	public String toString() {
		return "document [ID=" + id_document +"id de l'etape="+ id_etape + ", date_depot=" + date_depot + "Contenu= " + text + "]";
	}
	
}
