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
         newUser.setOrdinateur(this);      
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
            oldUser.setOrdinateur((Ordinateur)null);
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
            oldUser.setOrdinateur((Ordinateur)null);
         }
      }
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
   
   
   

}