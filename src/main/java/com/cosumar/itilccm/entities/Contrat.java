package com.cosumar.itilccm.entities;

import java.util.*;

public class Contrat {
   private int id;
   private String nom;
   private String client;
   private String description;
   private Date dateDeDebut;
   private Date dateDeFin;
   private String monnaie;
   private String periodiciteDeFacturation;
   private String uniteDeCout;
   private String fournisseur;
   private String niveauDeService;
   private String statut;
   private String typeDeContrat;
   
   /** @pdRoleInfo migr=no name=Contact assc=association59 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<Contact> contact;
   /** @pdRoleInfo migr=no name=Document assc=association60 mult=0..* side=A */
   private Document[] document;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Contact> getContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContact */
   public void setContact(java.util.Collection<Contact> newContact) {
      removeAllContact();
      for (java.util.Iterator iter = newContact.iterator(); iter.hasNext();)
         addContact((Contact)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContact */
   public void addContact(Contact newContact) {
      if (newContact == null)
         return;
      if (this.contact == null)
         this.contact = new java.util.HashSet<Contact>();
      if (!this.contact.contains(newContact))
         this.contact.add(newContact);
   }
   
   /** @pdGenerated default remove
     * @param oldContact */
   public void removeContact(Contact oldContact) {
      if (oldContact == null)
         return;
      if (this.contact != null)
         if (this.contact.contains(oldContact))
            this.contact.remove(oldContact);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContact() {
      if (contact != null)
         contact.clear();
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
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateDeDebut() {
		return dateDeDebut;
	}
	
	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}
	
	public Date getDateDeFin() {
		return dateDeFin;
	}
	
	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}
	
	public String getMonnaie() {
		return monnaie;
	}
	
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	
	public String getPeriodiciteDeFacturation() {
		return periodiciteDeFacturation;
	}
	
	public void setPeriodiciteDeFacturation(String periodiciteDeFacturation) {
		this.periodiciteDeFacturation = periodiciteDeFacturation;
	}
	
	public String getUniteDeCout() {
		return uniteDeCout;
	}
	
	public void setUniteDeCout(String uniteDeCout) {
		this.uniteDeCout = uniteDeCout;
	}
	
	public String getFournisseur() {
		return fournisseur;
	}
	
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	public String getNiveauDeService() {
		return niveauDeService;
	}
	
	public void setNiveauDeService(String niveauDeService) {
		this.niveauDeService = niveauDeService;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getTypeDeContrat() {
		return typeDeContrat;
	}
	
	public void setTypeDeContrat(String typeDeContrat) {
		this.typeDeContrat = typeDeContrat;
	}
	
	public Document[] getDocument() {
		return document;
	}
	
	public void setDocument(Document[] document) {
		this.document = document;
	}
	   
   
   

}