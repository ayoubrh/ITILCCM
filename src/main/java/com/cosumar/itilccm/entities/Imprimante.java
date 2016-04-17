package com.cosumar.itilccm.entities;

import java.util.*;

public class Imprimante {
   private int id;
   private String nom;
   private String statut;
   private String criticite;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   /** @pdRoleInfo migr=no name=User assc=association38 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<User> user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<User> getUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUser() {
      if (user == null)
         user = new java.util.HashSet<User>();
      return user.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUser */
   public void setUser(java.util.Collection<User> newUser) {
      removeAllUser();
      for (java.util.Iterator iter = newUser.iterator(); iter.hasNext();)
         addUser((User)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUser(User newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new java.util.HashSet<User>();
      if (!this.user.contains(newUser))
      {
         this.user.add(newUser);
         newUser.setImprimante(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUser(User oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
         {
            this.user.remove(oldUser);
            oldUser.setImprimante((Imprimante)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUser() {
      if (user != null)
      {
         User oldUser;
         for (java.util.Iterator iter = getIteratorUser(); iter.hasNext();)
         {
            oldUser = (User)iter.next();
            iter.remove();
            oldUser.setImprimante((Imprimante)null);
         }
      }
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
   
   

}