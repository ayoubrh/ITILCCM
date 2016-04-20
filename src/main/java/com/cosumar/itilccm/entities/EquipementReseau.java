package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class EquipementReseau implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private String type;
   private String marque;
   private String modele;
   private String versionIso;
   
   	@Pattern(regexp="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$",message="Entrez une Adress IP")
	@Column(nullable = true)
   private String ip;
   private String ram;
   
    @Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
	@Column(nullable = true)
   private String nbUnite;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_ahat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   /** @pdRoleInfo migr=no name=ConnexionElectrique assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<ConnexionElectrique> connexionElectrique;
   /** @pdRoleInfo migr=no name=Infrastructure assc=association14 mult=0..* side=A */
   private Infrastructure[] infrastructure;
   /** @pdRoleInfo migr=no name=IntefaceReseau assc=association23 mult=0..* side=A */
   private IntefaceReseau[] intefaceReseau;
   /** @pdRoleInfo migr=no name=SolutionApplicative assc=association24 mult=0..* side=A */
   private SolutionApplicative[] solutionApplicative;

   	@ManyToMany(mappedBy="equipementReseau")
   	@Column(nullable = true)
   private Collection<Ordinateur> ordinateur;

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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
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
	
	public String getVersionIso() {
		return versionIso;
	}
	
	public void setVersionIso(String versionIso) {
		this.versionIso = versionIso;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
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
	
	public Date getDateD_ahat() {
		return dateD_ahat;
	}
	
	public void setDateD_ahat(Date dateD_ahat) {
		this.dateD_ahat = dateD_ahat;
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
	
	public java.util.Collection<ConnexionElectrique> getConnexionElectrique() {
		return connexionElectrique;
	}
	
	public void setConnexionElectrique(java.util.Collection<ConnexionElectrique> connexionElectrique) {
		this.connexionElectrique = connexionElectrique;
	}
	
	public Infrastructure[] getInfrastructure() {
		return infrastructure;
	}
	
	public void setInfrastructure(Infrastructure[] infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	public IntefaceReseau[] getIntefaceReseau() {
		return intefaceReseau;
	}
	
	public void setIntefaceReseau(IntefaceReseau[] intefaceReseau) {
		this.intefaceReseau = intefaceReseau;
	}
	
	public SolutionApplicative[] getSolutionApplicative() {
		return solutionApplicative;
	}
	
	public void setSolutionApplicative(SolutionApplicative[] solutionApplicative) {
		this.solutionApplicative = solutionApplicative;
	}
	
	public Collection<Ordinateur> getOrdinateur() {
		return ordinateur;
	}
	
	public void setOrdinateur(Collection<Ordinateur> ordinateur) {
		this.ordinateur = ordinateur;
	}
   
   
   
   
   

}