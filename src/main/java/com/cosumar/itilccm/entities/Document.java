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
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Contrat> getContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContrat() {
      if (contrat == null)
         contrat = new java.util.HashSet<Contrat>();
      return contrat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContrat */
   public void setContrat(java.util.Collection<Contrat> newContrat) {
      removeAllContrat();
      for (java.util.Iterator iter = newContrat.iterator(); iter.hasNext();)
         addContrat((Contrat)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContrat */
   public void addContrat(Contrat newContrat) {
      if (newContrat == null)
         return;
      if (this.contrat == null)
         this.contrat = new java.util.HashSet<Contrat>();
      if (!this.contrat.contains(newContrat))
         this.contrat.add(newContrat);
   }
   
   /** @pdGenerated default remove
     * @param oldContrat */
   public void removeContrat(Contrat oldContrat) {
      if (oldContrat == null)
         return;
      if (this.contrat != null)
         if (this.contrat.contains(oldContrat))
            this.contrat.remove(oldContrat);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContrat() {
      if (contrat != null)
         contrat.clear();
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
   
   

}