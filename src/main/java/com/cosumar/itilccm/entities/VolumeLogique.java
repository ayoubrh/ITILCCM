package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class VolumeLogique implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String lunId;
   private String description;
   private String systemeDeStockage;
   private String niveauRaid;
   private String taille;
   
   	@ManyToMany(mappedBy="volumelogique")
	@Column(nullable = true)
   private Collection<Serveur> serveur;
   	
   	@ManyToOne
   	@JoinColumn(name="systeme_stockage_id")
   private SystemeDeStockage systemedestockage;
   
   	 @Column(nullable=true)
	 @ManyToMany(mappedBy="volumelogique")
   	private Collection<MachineVirtuelle> machinevertuelle;
	   
	  @Column(nullable=true)
	  @ManyToMany(mappedBy="volumelogique")
	private Collection<Virtualisation> virtualisation;

   
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
	public java.util.Collection<Serveur> getServeur() {
		return serveur;
	}
	public void setServeur(java.util.Collection<Serveur> serveur) {
		this.serveur = serveur;
	}
	public SystemeDeStockage getSystemedestockage() {
		return systemedestockage;
	}
	public void setSystemedestockage(SystemeDeStockage systemedestockage) {
		this.systemedestockage = systemedestockage;
	}
	public Collection<MachineVirtuelle> getMachinevertuelle() {
		return machinevertuelle;
	}
	public void setMachinevertuelle(Collection<MachineVirtuelle> machinevertuelle) {
		this.machinevertuelle = machinevertuelle;
	}
	public Collection<Virtualisation> getVirtualisation() {
		return virtualisation;
	}
	public void setVirtualisation(Collection<Virtualisation> virtualisation) {
		this.virtualisation = virtualisation;
	}
	
		
   
   	
   
   

}