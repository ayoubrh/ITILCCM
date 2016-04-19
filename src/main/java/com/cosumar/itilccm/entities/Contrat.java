package com.cosumar.itilccm.entities;

import java.util.*;

public class Contrat {
   private int id;
   private String nom;
   private String client;
   private String description;
   private Date dateDeDebut;
   private Date dateDeFin;
   private String monnaie;
   private String periodiciteDeFacturation;
   private String uniteDeCout;
   private String fournisseur;
   private String niveauDeService;
   private String statut;
   private String typeDeContrat;
   
   /** @pdRoleInfo migr=no name=Contact assc=association59 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Contact> contact;
   /** @pdRoleInfo migr=no name=Document assc=association60 mult=0..* side=A */
   private Document[] document;
   
   
  

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateDeDebut() {
		return dateDeDebut;
	}
	
	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}
	
	public Date getDateDeFin() {
		return dateDeFin;
	}
	
	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}
	
	public String getMonnaie() {
		return monnaie;
	}
	
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	
	public String getPeriodiciteDeFacturation() {
		return periodiciteDeFacturation;
	}
	
	public void setPeriodiciteDeFacturation(String periodiciteDeFacturation) {
		this.periodiciteDeFacturation = periodiciteDeFacturation;
	}
	
	public String getUniteDeCout() {
		return uniteDeCout;
	}
	
	public void setUniteDeCout(String uniteDeCout) {
		this.uniteDeCout = uniteDeCout;
	}
	
	public String getFournisseur() {
		return fournisseur;
	}
	
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	public String getNiveauDeService() {
		return niveauDeService;
	}
	
	public void setNiveauDeService(String niveauDeService) {
		this.niveauDeService = niveauDeService;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getTypeDeContrat() {
		return typeDeContrat;
	}
	
	public void setTypeDeContrat(String typeDeContrat) {
		this.typeDeContrat = typeDeContrat;
	}
	
	public Document[] getDocument() {
		return document;
	}
	
	public void setDocument(Document[] document) {
		this.document = document;
	}
	
	
	
	   
   
   

}