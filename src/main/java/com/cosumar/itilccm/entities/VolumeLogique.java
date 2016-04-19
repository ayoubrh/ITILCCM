package com.cosumar.itilccm.entities;

import java.util.*;

public class VolumeLogique {
      private int id;
      private String nom;
      private String lunId;
      private String description;
      private String systemeDeStockage;
      private String niveauRaid;
      private String taille;
   
   /** @pdRoleInfo migr=no name=Serveur assc=association19 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Serveur> serveur;
   /** @pdRoleInfo migr=no name=SystemeDeStockage assc=association20 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SystemeDeStockage> systemedestockage;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association28 mult=0..* side=A */
      private MachineVirtuelle[] machinevertuelle;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association30 mult=0..* side=A */
      private Virtualisation[] virtualisation;
   
   
   

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
	
	public String getLunId() {
		return lunId;
	}
	
	public void setLunId(String lunId) {
		this.lunId = lunId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSystemeDeStockage() {
		return systemeDeStockage;
	}
	
	public void setSystemeDeStockage(String systemeDeStockage) {
		this.systemeDeStockage = systemeDeStockage;
	}
	
	public String getNiveauRaid() {
		return niveauRaid;
	}
	
	public void setNiveauRaid(String niveauRaid) {
		this.niveauRaid = niveauRaid;
	}
	
	public String getTaille() {
		return taille;
	}
	
	public void setTaille(String taille) {
		this.taille = taille;
	}
	
	public MachineVirtuelle[] getMachinevertuelle() {
		return machinevertuelle;
	}
	
	public void setMachinevertuelle(MachineVirtuelle[] machinevertuelle) {
		this.machinevertuelle = machinevertuelle;
	}
	
	public Virtualisation[] getVirtualisation() {
		return virtualisation;
	}
	
	public void setVirtualisation(Virtualisation[] virtualisation) {
		this.virtualisation = virtualisation;
	}

	public java.util.Collection<Serveur> getServeur() {
		return serveur;
	}

	public void setServeur(java.util.Collection<Serveur> serveur) {
		this.serveur = serveur;
	}

	public java.util.Collection<SystemeDeStockage> getSystemedestockage() {
		return systemedestockage;
	}

	public void setSystemedestockage(java.util.Collection<SystemeDeStockage> systemedestockage) {
		this.systemedestockage = systemedestockage;
	}
	
	
	
	
   
   
   

}