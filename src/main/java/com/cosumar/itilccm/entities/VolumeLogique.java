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
   public java.util.Collection<SystemeDeStockage> getSystemedestockage() {
      if (systemedestockage == null)
         systemedestockage = new java.util.HashSet<SystemeDeStockage>();
      return systemedestockage;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSystemedestockage() {
      if (systemedestockage == null)
         systemedestockage = new java.util.HashSet<SystemeDeStockage>();
      return systemedestockage.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSystemedestockage */
   public void setSystemedestockage(java.util.Collection<SystemeDeStockage> newSystemedestockage) {
      removeAllSystemedestockage();
      for (java.util.Iterator iter = newSystemedestockage.iterator(); iter.hasNext();)
         addSystemedestockage((SystemeDeStockage)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSystemeDeStockage */
   public void addSystemedestockage(SystemeDeStockage newSystemeDeStockage) {
      if (newSystemeDeStockage == null)
         return;
      if (this.systemedestockage == null)
         this.systemedestockage = new java.util.HashSet<SystemeDeStockage>();
      if (!this.systemedestockage.contains(newSystemeDeStockage))
      {
         this.systemedestockage.add(newSystemeDeStockage);
         newSystemeDeStockage.setVolumelogique(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSystemeDeStockage */
   public void removeSystemedestockage(SystemeDeStockage oldSystemeDeStockage) {
      if (oldSystemeDeStockage == null)
         return;
      if (this.systemedestockage != null)
         if (this.systemedestockage.contains(oldSystemeDeStockage))
         {
            this.systemedestockage.remove(oldSystemeDeStockage);
            oldSystemeDeStockage.setVolumelogique((VolumeLogique)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSystemedestockage() {
      if (systemedestockage != null)
      {
         SystemeDeStockage oldSystemeDeStockage;
         for (java.util.Iterator iter = getIteratorSystemedestockage(); iter.hasNext();)
         {
            oldSystemeDeStockage = (SystemeDeStockage)iter.next();
            iter.remove();
            oldSystemeDeStockage.setVolumelogique((VolumeLogique)null);
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
   
   
   

}