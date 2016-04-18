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
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Ordinateur> getOrdinateur() {
      if (ordinateur == null)
         ordinateur = new java.util.HashSet<Ordinateur>();
      return ordinateur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOrdinateur() {
      if (ordinateur == null)
         ordinateur = new java.util.HashSet<Ordinateur>();
      return ordinateur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOrdinateur */
   public void setOrdinateur(java.util.Collection<Ordinateur> newOrdinateur) {
      removeAllOrdinateur();
      for (java.util.Iterator iter = newOrdinateur.iterator(); iter.hasNext();)
         addOrdinateur((Ordinateur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOrdinateur */
   public void addOrdinateur(Ordinateur newOrdinateur) {
      if (newOrdinateur == null)
         return;
      if (this.ordinateur == null)
         this.ordinateur = new java.util.HashSet<Ordinateur>();
      if (!this.ordinateur.contains(newOrdinateur))
         this.ordinateur.add(newOrdinateur);
   }
   
   /** @pdGenerated default remove
     * @param oldOrdinateur */
   public void removeOrdinateur(Ordinateur oldOrdinateur) {
      if (oldOrdinateur == null)
         return;
      if (this.ordinateur != null)
         if (this.ordinateur.contains(oldOrdinateur))
            this.ordinateur.remove(oldOrdinateur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOrdinateur() {
      if (ordinateur != null)
         ordinateur.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
      if (solutionApplicative == null)
         solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      return solutionApplicative;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSolutionApplicative() {
      if (solutionApplicative == null)
         solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      return solutionApplicative.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSolutionApplicative */
   public void setSolutionApplicative(java.util.Collection<SolutionApplicative> newSolutionApplicative) {
      removeAllSolutionApplicative();
      for (java.util.Iterator iter = newSolutionApplicative.iterator(); iter.hasNext();)
         addSolutionApplicative((SolutionApplicative)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSolutionApplicative */
   public void addSolutionApplicative(SolutionApplicative newSolutionApplicative) {
      if (newSolutionApplicative == null)
         return;
      if (this.solutionApplicative == null)
         this.solutionApplicative = new java.util.HashSet<SolutionApplicative>();
      if (!this.solutionApplicative.contains(newSolutionApplicative))
         this.solutionApplicative.add(newSolutionApplicative);
   }
   
   /** @pdGenerated default remove
     * @param oldSolutionApplicative */
   public void removeSolutionApplicative(SolutionApplicative oldSolutionApplicative) {
      if (oldSolutionApplicative == null)
         return;
      if (this.solutionApplicative != null)
         if (this.solutionApplicative.contains(oldSolutionApplicative))
            this.solutionApplicative.remove(oldSolutionApplicative);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSolutionApplicative() {
      if (solutionApplicative != null)
         solutionApplicative.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Serveur> getServeur() {
      if (serveur == null)
         serveur = new java.util.HashSet<Serveur>();
      return serveur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorServeur() {
      if (serveur == null)
         serveur = new java.util.HashSet<Serveur>();
      return serveur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newServeur */
   public void setServeur(java.util.Collection<Serveur> newServeur) {
      removeAllServeur();
      for (java.util.Iterator iter = newServeur.iterator(); iter.hasNext();)
         addServeur((Serveur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newServeur */
   public void addServeur(Serveur newServeur) {
      if (newServeur == null)
         return;
      if (this.serveur == null)
         this.serveur = new java.util.HashSet<Serveur>();
      if (!this.serveur.contains(newServeur))
         this.serveur.add(newServeur);
   }
   
   /** @pdGenerated default remove
     * @param oldServeur */
   public void removeServeur(Serveur oldServeur) {
      if (oldServeur == null)
         return;
      if (this.serveur != null)
         if (this.serveur.contains(oldServeur))
            this.serveur.remove(oldServeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllServeur() {
      if (serveur != null)
         serveur.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<MachineVirtuelle> getMachineVirtuelle() {
      if (machineVirtuelle == null)
         machineVirtuelle = new java.util.HashSet<MachineVirtuelle>();
      return machineVirtuelle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMachineVirtuelle() {
      if (machineVirtuelle == null)
         machineVirtuelle = new java.util.HashSet<MachineVirtuelle>();
      return machineVirtuelle.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMachineVirtuelle */
   public void setMachineVirtuelle(java.util.Collection<MachineVirtuelle> newMachineVirtuelle) {
      removeAllMachineVirtuelle();
      for (java.util.Iterator iter = newMachineVirtuelle.iterator(); iter.hasNext();)
         addMachineVirtuelle((MachineVirtuelle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMachineVirtuelle */
   public void addMachineVirtuelle(MachineVirtuelle newMachineVirtuelle) {
      if (newMachineVirtuelle == null)
         return;
      if (this.machineVirtuelle == null)
         this.machineVirtuelle = new java.util.HashSet<MachineVirtuelle>();
      if (!this.machineVirtuelle.contains(newMachineVirtuelle))
         this.machineVirtuelle.add(newMachineVirtuelle);
   }
   
   /** @pdGenerated default remove
     * @param oldMachineVirtuelle */
   public void removeMachineVirtuelle(MachineVirtuelle oldMachineVirtuelle) {
      if (oldMachineVirtuelle == null)
         return;
      if (this.machineVirtuelle != null)
         if (this.machineVirtuelle.contains(oldMachineVirtuelle))
            this.machineVirtuelle.remove(oldMachineVirtuelle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMachineVirtuelle() {
      if (machineVirtuelle != null)
         machineVirtuelle.clear();
   }

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
	   
   
   

}