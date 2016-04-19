package com.cosumar.itilccm.entities;

import java.util.*;

public class Peripherique {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String numeroDeSerie;
      private String numeroAsset;
      private Date dateDeMiseEnProduction;
      private Date dateD_achat;
      private Date dateDeFinDeGarantie;
      private String decription;
   
   /** @pdRoleInfo migr=no name=Ordinateur assc=association39 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Ordinateur> ordinateur;
   
   
   

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
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getCriticite() {
		return criticite;
	}
	
	public void setCriticite(String criticite) {
		this.criticite = criticite;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	public String getNumeroAsset() {
		return numeroAsset;
	}
	
	public void setNumeroAsset(String numeroAsset) {
		this.numeroAsset = numeroAsset;
	}
	
	public Date getDateDeMiseEnProduction() {
		return dateDeMiseEnProduction;
	}
	
	public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
	}
	
	public Date getDateD_achat() {
		return dateD_achat;
	}
	
	public void setDateD_achat(Date dateD_achat) {
		this.dateD_achat = dateD_achat;
	}
	
	public Date getDateDeFinDeGarantie() {
		return dateDeFinDeGarantie;
	}
	
	public void setDateDeFinDeGarantie(Date dateDeFinDeGarantie) {
		this.dateDeFinDeGarantie = dateDeFinDeGarantie;
	}
	
	public String getDecription() {
		return decription;
	}
	
	public void setDecription(String decription) {
		this.decription = decription;
	}

	public java.util.Collection<Ordinateur> getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(java.util.Collection<Ordinateur> ordinateur) {
		this.ordinateur = ordinateur;
	}
	
	
	
	
   
   

}