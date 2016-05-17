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
public class Chassis implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
	
	@NotEmpty
	@Size(min=2,max=20)
	@Column(unique = true)
   private String nom;
   private String statut;
   private String criticite;
   private String marque;
   private String modele;
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   	@ManyToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name="chassis_id")
   private Rack rack;
   
   	@OneToMany(mappedBy="chassis")
   	@Column(nullable = true)
   private Collection<Infrastructure> infrastructure;
   	
	@OneToMany(mappedBy="chassis")
   	@Column(nullable = true)
   private Collection<EquipementReseau> equipementreseau;
   	
   	
   	@ManyToOne(cascade = CascadeType.ALL)
   	@JoinColumn(name="lieu_id")
   private Lieu lieu;
   	
   	@ManyToMany(cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Collection<Document> document;
   	
   	@ManyToMany(cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Collection<Contrat> contrat;
   	
   	@ManyToMany(cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Collection<Contact> contact;

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

	

	public String getCriticite() {
		return criticite;
	}

	public void setCriticite(String criticite) {
		this.criticite = criticite;
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

	public Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}

	public Chassis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chassis(String nom) {
		super();
		this.nom = nom;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> document) {
		this.document = document;
	}

	public Collection<Contrat> getContrat() {
		return contrat;
	}

	public void setContrat(Collection<Contrat> contrat) {
		this.contrat = contrat;
	}

	public Collection<Contact> getContact() {
		return contact;
	}

	public void setContact(Collection<Contact> contact) {
		this.contact = contact;
	}

	public Collection<EquipementReseau> getEquipementreseau() {
		return equipementreseau;
	}

	public void setEquipementreseau(Collection<EquipementReseau> equipementreseau) {
		this.equipementreseau = equipementreseau;
	}
   	
   	

}