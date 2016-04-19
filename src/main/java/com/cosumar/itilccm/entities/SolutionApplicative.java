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

	public java.util.Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(java.util.Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}

	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}

	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	
	
	   
   
   

}