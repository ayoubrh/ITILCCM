package com.cosumar.itilccm.entities;

import java.util.*;

public class Document {
   private int id;
   private String nom;
   private String statut;
   private String version;
   private String type;
   private String description;
   private String fichier;
   
   /** @pdRoleInfo migr=no name=Contrat assc=association60 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Contrat> contrat;
   
   
   

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
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFichier() {
		return fichier;
	}
	
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public java.util.Collection<Contrat> getContrat() {
		return contrat;
	}

	public void setContrat(java.util.Collection<Contrat> contrat) {
		this.contrat = contrat;
	}
	
	
	
   
   

}