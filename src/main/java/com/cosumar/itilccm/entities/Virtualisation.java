package com.cosumar.itilccm.entities;

import java.util.*;

public class Virtualisation {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private Date dateDeMiseEnProduction;
      private String description;
   
   /** @pdRoleInfo migr=no name=MachineVirtuelle assc=association27 mult=0..1 */
      private MachineVirtuelle machineVirtuelle;
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association30 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<VolumeLogique> volumelogique;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association32 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SolutionApplicative> solutionApplicative;
   
   
   
	
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
	
	public MachineVirtuelle getMachineVirtuelle() {
		return machineVirtuelle;
	}
	
	public void setMachineVirtuelle(MachineVirtuelle machineVirtuelle) {
		this.machineVirtuelle = machineVirtuelle;
	}

	public java.util.Collection<VolumeLogique> getVolumelogique() {
		return volumelogique;
	}

	public void setVolumelogique(java.util.Collection<VolumeLogique> volumelogique) {
		this.volumelogique = volumelogique;
	}

	public java.util.Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}

	public void setSolutionApplicative(java.util.Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
	
	
   
   
   
   

}