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

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Camera implements Serializable{
	
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
   private String position;
   private String numeroDeSerie;
   private String numeroDeAsset;
   private Date dateDeMiseEnProduction;
   private Date dateD_Achat;
   private Date dateDeFinDeGarantie;
   private String description;
   
   	@ManyToOne
  	@JoinColumn(name="dvr_id")
   private Dvr dvr;
   	
    @Column(nullable=true)
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
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
    
    @Column(nullable=true)
	@ManyToMany(mappedBy="camera",cascade = CascadeType.ALL)
	private Collection<Groupe> groupe;
    
   @Column(nullable=true)
   @OneToMany(mappedBy="camera",cascade = CascadeType.REMOVE, orphanRemoval = true)
   @JsonIgnore
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public Date getDateD_Achat() {
		return dateD_Achat;
	}

	public void setDateD_Achat(Date dateD_Achat) {
		this.dateD_Achat = dateD_Achat;
	}

	public Date getDateDeFinDeGarantie() {
		return dateDeFinDeGarantie;
	}

	public void setDateDeFinDeGarantie(Date dateDeFinDeGarantie) {
		this.dateDeFinDeGarantie = dateDeFinDeGarantie;
	}

	public Dvr getDvr() {
		return dvr;
	}

	public void setDvr(Dvr dvr) {
		this.dvr = dvr;
	}

	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camera(String nom) {
		super();
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
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