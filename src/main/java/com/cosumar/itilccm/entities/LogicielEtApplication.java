package com.cosumar.itilccm.entities;

import java.util.*;

public class LogicielEtApplication {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String cheminD_installation;
      private Date dateDeMiseEnProduction;
      private String description;
   
   /** @pdRoleInfo migr=no name=Ordinateur assc=association48 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Ordinateur> ordinateur;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association49 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=Serveur assc=association52 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association53 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<MachineVirtuelle> machineVirtuelle;
   /** @pdRoleInfo migr=no name=LicenseLogiciel assc=association45 mult=0..* side=A */
      private LicenseLogiciel[] licenseLogiciel;
   
   
   

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
	
	public String getCheminD_installation() {
		return cheminD_installation;
	}
	
	public void setCheminD_installation(String cheminD_installation) {
		this.cheminD_installation = cheminD_installation;
	}
	
	public Date getDateDeMiseEnProduction() {
		return dateDeMiseEnProduction;
	}
	
	public void setDateDeMiseEnProduction(Date dateDeMiseEnProduction) {
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LicenseLogiciel[] getLicenseLogiciel() {
		return licenseLogiciel;
	}
	
	public void setLicenseLogiciel(LicenseLogiciel[] licenseLogiciel) {
		this.licenseLogiciel = licenseLogiciel;
	}

	public java.util.Collection<Ordinateur> getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(java.util.Collection<Ordinateur> ordinateur) {
		this.ordinateur = ordinateur;
	}

	public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}

	public java.util.Collection<Serveur> getServeur() {
		return serveur;
	}

	public void setServeur(java.util.Collection<Serveur> serveur) {
		this.serveur = serveur;
	}

	public java.util.Collection<MachineVirtuelle> getMachineVirtuelle() {
		return machineVirtuelle;
	}

	public void setMachineVirtuelle(java.util.Collection<MachineVirtuelle> machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}
	
	
	
	   
   
   

}