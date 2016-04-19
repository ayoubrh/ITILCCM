package com.cosumar.itilccm.entities;

import java.util.*;

public class Rack {
      private int id;
      private String nom;
      private String staut;
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
   
   /** @pdRoleInfo migr=no name=Chassis assc=association1 mult=0..1 */
      private Chassis chassis;
   /** @pdRoleInfo migr=no name=PduElectrique assc=association7 mult=0..1 */
      private PduElectrique pduElectrique;
   /** @pdRoleInfo migr=no name=Infrastructure assc=association2 mult=0..1 side=A */
      private Infrastructure infrastructure;
   
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
	public String getStaut() {
		return staut;
	}
	public void setStaut(String staut) {
		this.staut = staut;
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
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	public PduElectrique getPduElectrique() {
		return pduElectrique;
	}
	public void setPduElectrique(PduElectrique pduElectrique) {
		this.pduElectrique = pduElectrique;
	}
	public Infrastructure getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}
	   
   

}