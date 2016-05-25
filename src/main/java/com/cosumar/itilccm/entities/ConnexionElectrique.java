package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_ConnexionElectrique")
public class ConnexionElectrique implements Serializable{
	
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
   
  /* 	@Column(nullable=true)
  	@Pattern(regexp="[0-9]+",message="Doit contenir que des nombres")
   private String nbUnite;*/
   private String numeroDeSerie;
   private String numeroAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   	@ManyToMany(mappedBy="connexionElectrique")
   	@LazyCollection(LazyCollectionOption.FALSE)
  	@Column(nullable = true)
   private Collection<Infrastructure> infrastructure;
   
   	@ManyToMany(mappedBy="connexionElectrique")
   	@LazyCollection(LazyCollectionOption.FALSE)
  	@Column(nullable = true)
   private Collection<EquipementReseau> equipementReseau;
   	
   @Column(nullable=true)
   @ManyToMany
   private Collection<Contact> contacts;
   
   @Column(nullable=true)
   @ManyToMany
   @LazyCollection(LazyCollectionOption.FALSE)
   private Collection<Contrat> contrats;
   
   @Column(nullable=true)
   @ManyToMany
   @LazyCollection(LazyCollectionOption.FALSE)
   private Collection<Document> documents;
   	
   	@ManyToOne
   	@JoinColumn(name="id_lieu")
   private Lieu lieu;
   	

	public ConnexionElectrique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConnexionElectrique(String nom, String statut, String criticite, String marque, String modele,
			String nbUnite, String numeroDeSerie, String numeroAsset, Date dateDeMiseEnProduction, Date dateD_achat,
			Date dateDeFinDeGarantie, String description) {
		super();
		this.nom = nom;
		this.statut = statut;
		this.criticite = criticite;
		this.marque = marque;
		this.modele = modele;
		//this.nbUnite = nbUnite;
		this.numeroDeSerie = numeroDeSerie;
		this.numeroAsset = numeroAsset;
		this.dateDeMiseEnProduction = dateDeMiseEnProduction;
		this.dateD_achat = dateD_achat;
		this.dateDeFinDeGarantie = dateDeFinDeGarantie;
		this.description = description;
	}

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

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
/*
	public String getNbUnite() {
		return nbUnite;
	}

	public void setNbUnite(String nbUnite) {
		this.nbUnite = nbUnite;
	}
*/
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

	public Collection<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Collection<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}

	public Collection<EquipementReseau> getEquipementReseau() {
		return equipementReseau;
	}

	public void setEquipementReseau(Collection<EquipementReseau> equipementReseau) {
		this.equipementReseau = equipementReseau;
	}

	public ConnexionElectrique(String nom) {
		super();
		this.nom = nom;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Collection<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}

	public Collection<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}

	public Collection<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}
   	
   	

}