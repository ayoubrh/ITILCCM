package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Ordinateur implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
   private String nom;
   private String statut;
   private String criticite;
   private String marque;
   private String modele;
   	
   	@NotEmpty
	@Size(min=2,max=20)
   private String type;
   private String cpu;
   private String ram;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   
   	@ManyToOne
   	@JoinColumn(name="user_id")
   private User user;
   	
   @ManyToMany(cascade = CascadeType.ALL)
   @Column(nullable = true)
   private Collection<EquipementReseau> equipementReseau;
   
   	@OneToMany(mappedBy="ordinateur",cascade = CascadeType.ALL)
   	@Column(nullable=true)
   private Collection<IntefaceReseau> intefaceReseau;
   	
   	@OneToMany(mappedBy="ordinateur",cascade = CascadeType.ALL)
   private Collection<Peripherique> peripherique;
   	
	 @ManyToOne
	 @JoinColumn(name="id_licenseOs")
   	private LicenseOs licenseOs;
	   
	 @Column(nullable=true)
	 @ManyToMany(cascade = CascadeType.ALL)
	private Collection<LogicielEtApplication> logicielEtApplication;

   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}
	
	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	public Collection<Peripherique> getPeripherique() {
		return peripherique;
	}
	public void setPeripherique(Collection<Peripherique> peripherique) {
		this.peripherique = peripherique;
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
	public Collection<IntefaceReseau> getIntefaceReseau() {
		return intefaceReseau;
	}
	public void setIntefaceReseau(Collection<IntefaceReseau> intefaceReseau) {
		this.intefaceReseau = intefaceReseau;
	}
	
	
	public Ordinateur() {
		super();
	}
	public Ordinateur(String nom, String type) {
		super();
		this.nom = nom;
		this.type = type;
	}
	public Ordinateur(String nom, String type, User user) {
		super();
		this.nom = nom;
		this.type = type;
		this.user = user;
	}
	
	
	
	
	   
   
   

}