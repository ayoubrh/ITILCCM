package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Serveur extends Infrastructure implements Serializable{
	
   private String familleOs;
   private String versionOs;
   private String cpu;
   private String ram;
   
   	@ManyToMany
 	@Column(nullable=true)
   private Collection<SwitchSan> switchSan;
   
   	@ManyToMany
  	@Column(nullable=true)
   private Collection<VolumeLogique> volumelogique;
   	
   	 @Column(nullable=true)
	 @OneToMany(mappedBy="serveur")
	private Collection<Hyperviseur> hyperviseur;
	   
	 @ManyToOne
	 @JoinColumn(name="id_licenseOs")
	private LicenseOs licenseOs;
	   
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="serveur")
	private Collection<LogicielEtApplication> logicielEtApplication;
   
	public String getFamilleOs() {
		return familleOs;
	}
	public void setFamilleOs(String familleOs) {
		this.familleOs = familleOs;
	}
	public String getVersionOs() {
		return versionOs;
	}
	public void setVersionOs(String versionOs) {
		this.versionOs = versionOs;
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
	
	public Collection<SwitchSan> getSwitchSan() {
		return switchSan;
	}
	public void setSwitchSan(Collection<SwitchSan> switchSan) {
		this.switchSan = switchSan;
	}
	
	public Collection<VolumeLogique> getVolumelogique() {
		return volumelogique;
	}
	public void setVolumelogique(Collection<VolumeLogique> volumelogique) {
		this.volumelogique = volumelogique;
	}
	public Collection<Hyperviseur> getHyperviseur() {
		return hyperviseur;
	}
	public void setHyperviseur(Collection<Hyperviseur> hyperviseur) {
		this.hyperviseur = hyperviseur;
	}
	public LicenseOs getLicenseOs() {
		return licenseOs;
	}
	public void setLicenseOs(LicenseOs licenseOs) {
		this.licenseOs = licenseOs;
	}
	public Collection<LogicielEtApplication> getLogicielEtApplication() {
		return logicielEtApplication;
	}
	public void setLogicielEtApplication(Collection<LogicielEtApplication> logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}
	public Serveur() {
		super();
	}
	public Serveur(String nom) {
		super(nom);
	}
	
	
	
		
	   

}