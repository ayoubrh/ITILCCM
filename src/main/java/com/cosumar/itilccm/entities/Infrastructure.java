package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Infrastructure implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private String marque;
   private String modele;
   
   	@Column(nullable=true)
   	@Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String nbUnite;
   
   	@Pattern(regexp="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",message="Entrez une Adress IP")
	@Column(nullable = true)
   private String ip;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
  
   	@ManyToOne
  	@JoinColumn(name="rack_id")
   private Rack rack;
   
   	@ManyToOne
  	@JoinColumn(name="chassis_id")
   private Chassis chassis;
   	
   	@ManyToMany
   private Collection<ConnexionElectrique> connexionElectrique;
   	
   	@ManyToMany
    @Column(nullable = true)
   private Collection<EquipementReseau> equipementReseau;
   	
   	@OneToMany(mappedBy="infrastructure")
   	@Column(nullable = true)
   private Collection<IntefaceReseau> intefaceReseau;
   
   	@ManyToMany
   	@Column(nullable = true)
   private Collection<SolutionApplicative> solutionApplicative;
   
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
	
	public Rack getRack() {
		return rack;
	}
	public void setRack(Rack rack) {
		this.rack = rack;
	}
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	
	public java.util.Collection<ConnexionElectrique> getConnexionElectrique() {
		return connexionElectrique;
	}
	public void setConnexionElectrique(java.util.Collection<ConnexionElectrique> connexionElectrique) {
		this.connexionElectrique = connexionElectrique;
	}
	
	public java.util.Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}
	public void setEquipementReseau(java.util.Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}
	
	public Collection<IntefaceReseau> getIntefaceReseau() {
		return intefaceReseau;
	}
	public void setIntefaceReseau(Collection<IntefaceReseau> intefaceReseau) {
		this.intefaceReseau = intefaceReseau;
	}
	public Collection<SolutionApplicative> getSolutionApplicative() {
		return solutionApplicative;
	}
	public void setSolutionApplicative(Collection<SolutionApplicative> solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
		
	

}