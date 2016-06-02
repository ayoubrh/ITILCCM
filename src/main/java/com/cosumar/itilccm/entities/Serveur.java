package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Serveur extends Infrastructure implements Serializable{
	
   private String cpu;
   private String ram;
   
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
 	@Column(nullable=true)
   private Collection<SwitchSan> switchSan;
   
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
  	@Column(nullable=true)
   private Collection<VolumeLogique> volumelogique;
   	
   	 @Column(nullable=true)
	 @OneToMany(mappedBy="serveur")
   	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Hyperviseur> hyperviseur;
	   
	 @ManyToOne
	 @JoinColumn(name="id_licenseOs")
	private LicenseOs licenseOs;
	   
	 @Column(nullable=true)
	 @OneToMany(mappedBy="serveur")
	 @LazyCollection(LazyCollectionOption.FALSE)
	private Collection<LogicielEtApplication> logicielEtApplication;
	 
	 @Column(nullable=true)
	 @ManyToMany(mappedBy="serveur",cascade = CascadeType.ALL)
	 private Collection<Groupe> groupe;
	
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
	public Collection<Groupe> getGroupe() {
		return groupe;
	}
	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	
	
	
		
	   

}