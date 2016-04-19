package com.cosumar.itilccm.entities;

import java.util.*;

public class MachineVirtuelle {
      private int id;
      private String nom;
      private String statut;
      private String criticite;
      private String ip;
      private String cpu;
      private String ram;
      private Date dateDeMiseEnProduction;
      private String description;
   
   /** @pdRoleInfo migr=no name=VolumeLogique assc=association28 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<VolumeLogique> volumelogique;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association29 mult=1..1 */
      private IntefaceReseau intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association31 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
      private java.util.Collection<SolutionApplicative> solutionApplicative;
   /** @pdRoleInfo migr=no name=Virtualisation assc=association27 mult=0..* side=A */
      private Virtualisation[] virtualisation;
   /** @pdRoleInfo migr=no name=LicenseOs assc=association51 mult=0..* side=A */
      private LicenseOs[] licenseOs;
   /** @pdRoleInfo migr=no name=LogicielEtApplication assc=association53 mult=0..* side=A */
      private LogicielEtApplication[] logicielEtApplication;
   
   
   

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
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
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
	
	public IntefaceReseau getIntefaceReseau() {
		return intefaceReseau;
	}
	
	public void setIntefaceReseau(IntefaceReseau intefaceReseau) {
		this.intefaceReseau = intefaceReseau;
	}
	
	public Virtualisation[] getVirtualisation() {
		return virtualisation;
	}
	
	public void setVirtualisation(Virtualisation[] virtualisation) {
		this.virtualisation = virtualisation;
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