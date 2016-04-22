package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Chassis implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String oriticite;
   private String marque;
   private String modele;
   private String nbUnite;
   private String numeroDeSerie;
   private String numeroDeAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   	@ManyToOne
 	@JoinColumn(name="chassis_id")
   private Rack rack;
   
   	@OneToMany(mappedBy="chassis")
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getOriticite() {
		return oriticite;
	}

	public void setOriticite(String oriticite) {
		this.oriticite = oriticite;
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

	public String getNumeroDeAsset() {
		return numeroDeAsset;
	}

	public void setNumeroDeAsset(String numeroDeAsset) {
		this.numeroDeAsset = numeroDeAsset;
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

	public Rack getRack() {
		return rack;
	}

	public void setRack(Rack rack) {
		this.rack = rack;
	}

	public Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}
   	
   	

}