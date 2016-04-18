package com.cosumar.itilccm.entities;

import java.util.*;

public class Peripherique {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String numeroDeSerie;
      private String numeroAsset;
      private Date dateDeMiseEnProduction;
      private Date dateD_achat;
      private Date dateDeFinDeGarantie;
      private String decription;
   
   /** @pdRoleInfo migr=no name=Ordinateur assc=association39 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Ordinateur> ordinateur;
   
   
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
	
	public String getDecription() {
		return decription;
	}
	
	public void setDecription(String decription) {
		this.decription = decription;
	}
   
   

}