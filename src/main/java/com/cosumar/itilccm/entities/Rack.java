package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Rack implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String staut;
   private String criticite;
   private String marque;
   private String modele;
   private String nbUnite;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   	@OneToMany(mappedBy="rack")
  	@Column(nullable = true)
   private Collection<Chassis> chassis;
  
   	@OneToMany(mappedBy="rack")
   	@Column(nullable = true)
   private Collection<PduElectrique> pduElectrique;
   
   	@OneToMany(mappedBy="rack")
   	@Column(nullable = true)
   private Collection<Infrastructure> infrastructure;

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
	
	public String getStaut() {
		return staut;
	}
	
	public void setStaut(String staut) {
		this.staut = staut;
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
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String getNbUnite() {
		return nbUnite;
	}
	
	public void setNbUnite(String nbUnite) {
		this.nbUnite = nbUnite;
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
	
	public Collection<Chassis> getChassis() {
		return chassis;
	}

	public void setChassis(Collection<Chassis> chassis) {
		this.chassis = chassis;
	}

		
/*
	public Collection<PduElectrique> getPduElectrique() {
		return pduElectrique;
	}

	public void setPduElectrique(Collection<PduElectrique> pduElectrique) {
		this.pduElectrique = pduElectrique;
	}
*/
	public Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}

	public Rack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rack(String nom) {
		super();
		this.nom = nom;
	}
	
		
	
	
	   
   	

}