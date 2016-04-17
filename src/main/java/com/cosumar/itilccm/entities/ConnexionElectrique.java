package com.cosumar.itilccm.entities;

import java.util.*;

public class ConnexionElectrique {
   private int id;
   private String nom;
   private String statut;
   private String criticite;
   private String marque;
   private String modele;
   private String nbUnite;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association8 mult=1..* side=A */
   private Infrastructure[] infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association9 mult=1..* side=A */
   private EquipementReseau[] equipementReseau;
   
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
	public String getNbUnite() {
		return nbUnite;
	}
	public void setNbUnite(String nbUnite) {
		this.nbUnite = nbUnite;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Infrastructure[] getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(Infrastructure[] infrastructure) {
		this.infrastructure = infrastructure;
	}
	public EquipementReseau[] getEquipementReseau() {
		return equipementReseau;
	}
	public void setEquipementReseau(EquipementReseau[] equipementReseau) {
		this.equipementReseau = equipementReseau;
	}

}