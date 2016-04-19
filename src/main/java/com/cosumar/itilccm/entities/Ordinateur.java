package com.cosumar.itilccm.entities;

import java.util.*;

public class Ordinateur {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String marque;
      private String type;
      private String cpu;
      private String ram;
      private String numeroDeSerie;
      private String numeroAsset;
      private Date dateDeMiseEnProduction;
      private Date dateD_achat;
      private Date dateDeFinDeGarantie;
      private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association33 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<User> user;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association40 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association41 mult=0..1 */
      private IntefaceReseau intefaceReseau;
   /** @pdRoleInfo migr=no name=Peripherique assc=association39 mult=0..* side=A */
      private Peripherique[] peripherique;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association47 mult=0..* side=A */
      private LicenseOs[] licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association48 mult=0..* side=A */
      private LogicielEtApplication[] logicielEtApplication;
   
   
  

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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
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
	
	public IntefaceReseau getIntefaceReseau() {
		return intefaceReseau;
	}
	
	public void setIntefaceReseau(IntefaceReseau intefaceReseau) {
		this.intefaceReseau = intefaceReseau;
	}
	
	public Peripherique[] getPeripherique() {
		return peripherique;
	}
	
	public void setPeripherique(Peripherique[] peripherique) {
		this.peripherique = peripherique;
	}
	
	public LicenseOs[] getLicenseOs() {
		return licenseOs;
	}
	
	public void setLicenseOs(LicenseOs[] licenseOs) {
		this.licenseOs = licenseOs;
	}
	
	public LogicielEtApplication[] getLogicielEtApplication() {
		return logicielEtApplication;
	}
	
	public void setLogicielEtApplication(LogicielEtApplication[] logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}

	public java.util.Collection<User> getUser() {
		return user;
	}

	public void setUser(java.util.Collection<User> user) {
		this.user = user;
	}

	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}

	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	
	
   
   
   

}