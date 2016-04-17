package com.cosumar.itilccm.entities;

import java.util.*;

public class Infrastructure {
   private int id;
   private String nom;
   private String statut;
   private String criticite;
   private String marque;
   private String modele;
   private String nbUnite;
   private String ip;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   /** @pdRoleInfo migr=no name=Rack assc=association2 mult=0..* */
   private Rack[] rack;
   /** @pdRoleInfo migr=no name=Chassis assc=association3 mult=0..* */
   private Chassis[] chassis;
   /** @pdRoleInfo migr=no name=ConnexionElectrique assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<ConnexionElectrique> connexionElectrique;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association21 mult=0..1 side=A */
   private IntefaceReseau intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association22 mult=0..* side=A */
   private SolutionApplicative[] solutionApplicative;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ConnexionElectrique> getConnexionElectrique() {
      if (connexionElectrique == null)
         connexionElectrique = new java.util.HashSet<ConnexionElectrique>();
      return connexionElectrique;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConnexionElectrique() {
      if (connexionElectrique == null)
         connexionElectrique = new java.util.HashSet<ConnexionElectrique>();
      return connexionElectrique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConnexionElectrique */
   public void setConnexionElectrique(java.util.Collection<ConnexionElectrique> newConnexionElectrique) {
      removeAllConnexionElectrique();
      for (java.util.Iterator iter = newConnexionElectrique.iterator(); iter.hasNext();)
         addConnexionElectrique((ConnexionElectrique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newConnexionElectrique */
   public void addConnexionElectrique(ConnexionElectrique newConnexionElectrique) {
      if (newConnexionElectrique == null)
         return;
      if (this.connexionElectrique == null)
         this.connexionElectrique = new java.util.HashSet<ConnexionElectrique>();
      if (!this.connexionElectrique.contains(newConnexionElectrique))
         this.connexionElectrique.add(newConnexionElectrique);
   }
   
   /** @pdGenerated default remove
     * @param oldConnexionElectrique */
   public void removeConnexionElectrique(ConnexionElectrique oldConnexionElectrique) {
      if (oldConnexionElectrique == null)
         return;
      if (this.connexionElectrique != null)
         if (this.connexionElectrique.contains(oldConnexionElectrique))
            this.connexionElectrique.remove(oldConnexionElectrique);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConnexionElectrique() {
      if (connexionElectrique != null)
         connexionElectrique.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<EquipementReseau> getEquipementReseau() {
      if (equipementReseau == null)
         equipementReseau = new java.util.HashSet<EquipementReseau>();
      return equipementReseau;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEquipementReseau() {
      if (equipementReseau == null)
         equipementReseau = new java.util.HashSet<EquipementReseau>();
      return equipementReseau.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEquipementReseau */
   public void setEquipementReseau(java.util.Collection<EquipementReseau> newEquipementReseau) {
      removeAllEquipementReseau();
      for (java.util.Iterator iter = newEquipementReseau.iterator(); iter.hasNext();)
         addEquipementReseau((EquipementReseau)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEquipementReseau */
   public void addEquipementReseau(EquipementReseau newEquipementReseau) {
      if (newEquipementReseau == null)
         return;
      if (this.equipementReseau == null)
         this.equipementReseau = new java.util.HashSet<EquipementReseau>();
      if (!this.equipementReseau.contains(newEquipementReseau))
         this.equipementReseau.add(newEquipementReseau);
   }
   
   /** @pdGenerated default remove
     * @param oldEquipementReseau */
   public void removeEquipementReseau(EquipementReseau oldEquipementReseau) {
      if (oldEquipementReseau == null)
         return;
      if (this.equipementReseau != null)
         if (this.equipementReseau.contains(oldEquipementReseau))
            this.equipementReseau.remove(oldEquipementReseau);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEquipementReseau() {
      if (equipementReseau != null)
         equipementReseau.clear();
   }
   /** @pdGenerated default parent getter */
   public IntefaceReseau getIntefaceReseau() {
      return intefaceReseau;
   }
   
   /** @pdGenerated default parent setter
     * @param newIntefaceReseau */
   public void setIntefaceReseau(IntefaceReseau newIntefaceReseau) {
      if (this.intefaceReseau == null || !this.intefaceReseau.equals(newIntefaceReseau))
      {
         if (this.intefaceReseau != null)
         {
            IntefaceReseau oldIntefaceReseau = this.intefaceReseau;
            this.intefaceReseau = null;
            oldIntefaceReseau.removeInfrastructure(this);
         }
         if (newIntefaceReseau != null)
         {
            this.intefaceReseau = newIntefaceReseau;
            this.intefaceReseau.addInfrastructure(this);
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
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
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
	
	public Rack[] getRack() {
		return rack;
	}
	
	public void setRack(Rack[] rack) {
		this.rack = rack;
	}
	
	public Chassis[] getChassis() {
		return chassis;
	}
	
	public void setChassis(Chassis[] chassis) {
		this.chassis = chassis;
	}
	
	public SolutionApplicative[] getSolutionApplicative() {
		return solutionApplicative;
	}
	
	public void setSolutionApplicative(SolutionApplicative[] solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	   
   
   

}