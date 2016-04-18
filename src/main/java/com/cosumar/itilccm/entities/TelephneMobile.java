package com.cosumar.itilccm.entities;

import java.util.*;

public class TelephneMobile {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String marque;
      private String modele;
      private String imei;
      private String numeroDeSerie;
      private String numeroAsset;
      private Date dateDeMiseEnProduction;
      private Date dateD_achat;
      private Date dateDeFinGarantie;
      private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association34 mult=0..1 */
      private User user;

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
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
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
	
	public Date getDateDeFinGarantie() {
		return dateDeFinGarantie;
	}
	
	public void setDateDeFinGarantie(Date dateDeFinGarantie) {
		this.dateDeFinGarantie = dateDeFinGarantie;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	   
   
   

}