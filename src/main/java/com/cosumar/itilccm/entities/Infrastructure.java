package com.cosumar.itilccm.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Infrastructure implements Serializable{
	
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
   	@LazyCollection(LazyCollectionOption.FALSE)
   private Collection<ConnexionElectrique> connexionElectrique;
   	
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
   private Collection<EquipementReseau> equipementReseau;
   	
   	@OneToMany(mappedBy="infrastructure",cascade = CascadeType.ALL)
   	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<IntefaceReseau> intefaceReseau;
   
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
   	@Column(nullable = true)
   private Collection<SolutionApplicative> solutionApplicative;
   	
   	@ManyToOne
   	@JoinColumn(name="lieu_id")
   private Lieu lieu;
   	
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
   private Collection<Document> document;
   	
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
   private Collection<Contrat> contrat;
   	
   	@ManyToMany
   	@LazyCollection(LazyCollectionOption.FALSE)
    @Column(nullable = true)
   private Collection<Contact> contact;
   	
   	@Column(nullable=true)
	@ManyToMany(mappedBy="infrastructure",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;
   	
   	@Column(nullable=true)
   	@OneToMany(mappedBy="infrastructure",cascade = CascadeType.REMOVE, orphanRemoval = true)
   	@LazyCollection(LazyCollectionOption.FALSE)
   	private Collection<TicketIncident> ticketsIncident;
   
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
	public Infrastructure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Infrastructure(String nom) {
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
	public Collection<Groupe> getGroupe() {
		return groupe;
	}
	public void setGroupe(Collection<Groupe> groupe) {
		this.groupe = groupe;
	}
	public Collection<TicketIncident> getTicketsIncident() {
		return ticketsIncident;
	}
	public void setTicketsIncident(Collection<TicketIncident> ticketsIncident) {
		this.ticketsIncident = ticketsIncident;
	}
	
		
	

}