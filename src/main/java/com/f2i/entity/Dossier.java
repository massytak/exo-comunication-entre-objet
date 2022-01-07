package com.f2i.entity;

public class Dossier {
	private int numDossier;
	private String nomEleve;
	private String prenomEleve;
	private String Status;
	
	//***************************************************//
	public Dossier(int numDossier, String nomEleve, String prenomEleve, String status) {
		super();
		this.numDossier = numDossier;
		this.nomEleve = nomEleve;
		this.prenomEleve = prenomEleve;
		Status = status;
	}
	public Dossier() {
		super();
	}
	//***********************************************//
	public int getNumDossier() {
		return numDossier;
	}
	public void setNumDossier(int numDossier) {
		this.numDossier = numDossier;
	}
	public String getNomEleve() {
		return nomEleve;
	}
	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}
	public String getPrenomEleve() {
		return prenomEleve;
	}
	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	//**********************************************************************//
	@Override
	public String toString() {
		return "Dossier [numDossier=" + numDossier + ", nomEleve=" + nomEleve + ", prenomEleve=" + prenomEleve
				+ ", Status=" + Status + "]";
	}
	

}
