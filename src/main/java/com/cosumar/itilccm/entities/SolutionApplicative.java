package com.cosumar.itilccm.entities;

import java.util.*;

public class SolutionApplicative {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private Date dateDeMiseEnProduction;
      private String description;
   
   /** @pdRoleInfo migr=no name=Infrastructure assc=association22 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<Infrastructure> infrastructure;
   /** @pdRoleInfo migr=no name=EquipementReseau assc=association24 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<EquipementReseau> equipementReseau;
   /** @pdRoleInfo migr=no name=ProessusMetier assc=association18 mult=0..* side=A */
      private ProessusMetier[] proessusMetier;
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association31 mult=0..* side=A */
      private MachineVirtuelle[] machineVirtuelle;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association32 mult=0..* side=A */
      private Virtualisation[] virtualisation;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association49 mult=0..* side=A */
      private LogicielEtApplication[] logicielEtApplication;
   /** @pdRoleInfo migr=no name=ApplicationWeb assc=association54 mult=0..* side=A */
      private ApplicationWeb[] applicationWeb;
   /** @pdRoleInfo migr=no name=InstanceMiddleware assc=association55 mult=0..* side=A */
      private InstanceMiddleware[] instanceMiddleware;
   /** @pdRoleInfo migr=no name=InstanceDeBasseDeDonnes assc=association56 mult=0..* side=A */
      private InstanceDeBasseDeDonnes[] instanceDeBasseDeDonnes;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Infrastructure> getInfrastructure() {
      if (infrastructure == null)
         infrastructure = new java.util.HashSet<Infrastructure>();
      return infrastructure;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInfrastructure() {
      if (infrastructure == null)
         infrastructure = new java.util.HashSet<Infrastructure>();
      return infrastructure.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInfrastructure */
   public void setInfrastructure(java.util.Collection<Infrastructure> newInfrastructure) {
      removeAllInfrastructure();
      for (java.util.Iterator iter = newInfrastructure.iterator(); iter.hasNext();)
         addInfrastructure((Infrastructure)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInfrastructure */
   public void addInfrastructure(Infrastructure newInfrastructure) {
      if (newInfrastructure == null)
         return;
      if (this.infrastructure == null)
         this.infrastructure = new java.util.HashSet<Infrastructure>();
      if (!this.infrastructure.contains(newInfrastructure))
         this.infrastructure.add(newInfrastructure);
   }
   
   /** @pdGenerated default remove
     * @param oldInfrastructure */
   public void removeInfrastructure(Infrastructure oldInfrastructure) {
      if (oldInfrastructure == null)
         return;
      if (this.infrastructure != null)
         if (this.infrastructure.contains(oldInfrastructure))
            this.infrastructure.remove(oldInfrastructure);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInfrastructure() {
      if (infrastructure != null)
         infrastructure.clear();
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
	
	public ProessusMetier[] getProessusMetier() {
		return proessusMetier;
	}
	
	public void setProessusMetier(ProessusMetier[] proessusMetier) {
		this.proessusMetier = proessusMetier;
	}
	
	public MachineVirtuelle[] getMachineVirtuelle() {
		return machineVirtuelle;
	}
	
	public void setMachineVirtuelle(MachineVirtuelle[] machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}
	
	public Virtualisation[] getVirtualisation() {
		return virtualisation;
	}
	
	public void setVirtualisation(Virtualisation[] virtualisation) {
		this.virtualisation = virtualisation;
	}
	
	public LogicielEtApplication[] getLogicielEtApplication() {
		return logicielEtApplication;
	}
	
	public void setLogicielEtApplication(LogicielEtApplication[] logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}
	
	public ApplicationWeb[] getApplicationWeb() {
		return applicationWeb;
	}
	
	public void setApplicationWeb(ApplicationWeb[] applicationWeb) {
		this.applicationWeb = applicationWeb;
	}
	
	public InstanceMiddleware[] getInstanceMiddleware() {
		return instanceMiddleware;
	}
	
	public void setInstanceMiddleware(InstanceMiddleware[] instanceMiddleware) {
		this.instanceMiddleware = instanceMiddleware;
	}
	
	public InstanceDeBasseDeDonnes[] getInstanceDeBasseDeDonnes() {
		return instanceDeBasseDeDonnes;
	}
	
	public void setInstanceDeBasseDeDonnes(InstanceDeBasseDeDonnes[] instanceDeBasseDeDonnes) {
		this.instanceDeBasseDeDonnes = instanceDeBasseDeDonnes;
	}
	   
   
   

}