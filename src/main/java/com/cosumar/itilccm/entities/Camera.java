package com.cosumar.itilccm.entities;

import java.util.*;

public class Camera {
   private int id;
   private String nom;
   private String status;
   private String critcite;
   private String marque;
   private String modele;
   private String position;
   private String numeroDeSerie;
   private String numeroDeAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_Achat;
   private Date dateDeFinDeGarantie;
   
   /** @pdRoleInfo migr=no name=Dvr assc=association15 mult=0..* side=A */
   public Dvr[] dvr;

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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCritcite() {
		return critcite;
	}
	
	public void setCritcite(String critcite) {
		this.critcite = critcite;
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
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	public String getNumeroDeAsset() {
		return numeroDeAsset;
	}
	
	public void setNumeroDeAsset(String numeroDeAsset) {
		this.numeroDeAsset = numeroDeAsset;
	}
	
	public Date getDateDeMiseEnProduction() {
		return dateDeMiseEnProduction;
	}
	
	public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
	}
	
	public Date getDateD_Achat() {
		return dateD_Achat;
	}
	
	public void setDateD_Achat(Date dateD_Achat) {
		this.dateD_Achat = dateD_Achat;
	}
	
	public Date getDateDeFinDeGarantie() {
		return dateDeFinDeGarantie;
	}
	
	public void setDateDeFinDeGarantie(Date dateDeFinDeGarantie) {
		this.dateDeFinDeGarantie = dateDeFinDeGarantie;
	}
	
	public Dvr[] getDvr() {
		return dvr;
	}
	
	public void setDvr(Dvr[] dvr) {
		this.dvr = dvr;
	}
   
   
   

}