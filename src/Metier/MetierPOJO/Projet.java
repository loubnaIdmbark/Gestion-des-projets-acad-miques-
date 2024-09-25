package Metier.MetierPOJO;

import java.util.Date;

public class Projet {
	
	private int num_projet;
	private String titre;
	private Date depart;
	private String typeProjet;
	private String lieu;
	private int Duree;
	private String etudiant;
	private String encadrant1;
	private String encadrant2;

	public Projet(int num_projet, String titre, Date depart, String typeProjet, String lieu, int duree,
			String etudiant,String encadrant1, String encadrant2) {
		super();
		this.num_projet = num_projet;
		this.titre = titre;
		this.depart = depart;
		this.typeProjet = typeProjet;
		this.lieu = lieu;
		Duree = duree;
		this.etudiant = etudiant;
		this.encadrant1 = encadrant1;
		this.encadrant2 = encadrant2;
	}

	public Projet() {
	}

	public int getNum_projet() {
		return num_projet;
	}
	public void setNum_projet(int num_projet) {
		this.num_projet = num_projet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDepart() {
		return depart;
	}
	public void setDepart(Date depart) {
		this.depart = depart;
	};
	public String getTypeProjet() {
		return typeProjet;
	}
	public void setTypeProjet(String typeProjet) {
		this.typeProjet = typeProjet;
	}
	public String getEncadrant1() {
		return encadrant1;
	}
	public void setEncadrant1(String encadrant1) {
		this.encadrant1 = encadrant1;
	}
	public String getEncadrant2() {
		return encadrant2;
	}
	public void setEncadrant2(String encadrant2) {
		this.encadrant2 = encadrant2;
	}
	public int getDuree() {
		return Duree;
	}
	public void setDuree(int duree) {
		Duree = duree;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(String etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "Projet [num_projet=" + num_projet + ", titre=" + titre + ", depart=" + depart + ", typeProjet="
				+ typeProjet + ", lieu=" + lieu + ", Duree=" + Duree + ", etudiant=" + etudiant + ", encadrant1="
				+ encadrant1 + ", encadrant2=" + encadrant2 + "]";
	}
	
	
}
