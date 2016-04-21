package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

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
   private Hyperviseur[] hyperviseur;
   private LicenseOs licenseOs;
   private LogicielEtApplication[] logicielEtApplication;
   
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
	public Hyperviseur[] getHyperviseur() {
		return hyperviseur;
	}
	public void setHyperviseur(Hyperviseur[] hyperviseur) {
		this.hyperviseur = hyperviseur;
	}
	public LicenseOs getLicenseOs() {
		return licenseOs;
	}
	public void setLicenseOs(LicenseOs licenseOs) {
		this.licenseOs = licenseOs;
	}
	public LogicielEtApplication[] getLogicielEtApplication() {
		return logicielEtApplication;
	}
	public void setLogicielEtApplication(LogicielEtApplication[] logicielEtApplication) {
		this.logicielEtApplication = logicielEtApplication;
	}
	   
   
   	

}